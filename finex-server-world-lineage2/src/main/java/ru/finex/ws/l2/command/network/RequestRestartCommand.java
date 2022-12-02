package ru.finex.ws.l2.command.network;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import ru.finex.core.command.AbstractNetworkCommand;
import ru.finex.core.component.ComponentService;
import ru.finex.ws.l2.component.base.CoordinateComponent;
import ru.finex.ws.l2.component.player.CollisionComponent;
import ru.finex.ws.l2.network.OutcomePacketBuilderService;
import ru.finex.ws.l2.network.model.dto.MoveBackwardToLocationDto;
import ru.finex.ws.l2.network.model.dto.RequestRestartDto;
import ru.finex.ws.l2.network.model.dto.RestartResponseDto;
import ru.finex.ws.l2.network.session.GameClient;
import ru.finex.ws.l2.network.session.GameClientState;

import javax.inject.Inject;

@ToString(onlyExplicitlyIncluded = true)
@RequiredArgsConstructor(onConstructor_ = {@Inject})
public class RequestRestartCommand extends AbstractNetworkCommand {

	@ToString.Include
	private final RequestRestartDto dto;
	private final GameClient session;
	private final OutcomePacketBuilderService outcomePacketBuilderService;

	@Override
	public void executeCommand() {
		session.setState(GameClientState.AUTHED);
		session.sendPacket(dto);
		session.sendPacket(RestartResponseDto.TRUE); //fixme: false must be if we can't restart (we in battle/flying, etc...)
		session.sendPacket(outcomePacketBuilderService.charSelectInfo(session.getLogin(), session.getData().getSessionId()));
	}
}