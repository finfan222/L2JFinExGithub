package ru.finex.ws.l2.command.network;

import lombok.RequiredArgsConstructor;
import ru.finex.core.model.GameObject;
import ru.finex.gs.service.GameObjectService;
import ru.finex.ws.l2.network.AbstractNetworkCommand;
import ru.finex.ws.l2.network.OutcomePacketBuilderService;
import ru.finex.ws.l2.network.model.GameClientState;
import ru.finex.ws.l2.network.model.L2GameClient;
import ru.finex.ws.l2.network.model.dto.SelectedAvatarDto;

import javax.inject.Inject;

/**
 * @author m0nster.mind
 */
@RequiredArgsConstructor
public class GameStartCommand extends AbstractNetworkCommand {

    private final SelectedAvatarDto dto;

    @Inject private GameObjectService gameObjectService;
    @Inject private OutcomePacketBuilderService packetBuilderService;

    @Override
    public void executeCommand() {
        L2GameClient client = (L2GameClient) getClient();

        GameObject player = gameObjectService.createPlayer(client, 1);
        client.setGameObject(player);

        client.setState(GameClientState.IN_GAME);
        client.sendPacket(packetBuilderService.characterSelected(player));
    }
}