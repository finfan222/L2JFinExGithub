package ru.finex.ws.l2.command.network;

import lombok.RequiredArgsConstructor;
import ru.finex.core.events.EventBus;
import ru.finex.core.model.GameObject;
import ru.finex.ws.l2.model.event.PlayerEnterWorld;
import ru.finex.ws.l2.network.AbstractNetworkCommand;
import ru.finex.ws.l2.network.OutcomePacketBuilderService;
import ru.finex.ws.l2.network.model.L2GameClient;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author m0nster.mind
 */
@RequiredArgsConstructor
public class EnterWorldCommand extends AbstractNetworkCommand {

    @Inject
    @Named("Network")
    private EventBus eventBus;

    @Inject
    private OutcomePacketBuilderService packetBuilderService;

    @Override
    public void executeCommand() {
        L2GameClient client = (L2GameClient) getClient();
        GameObject gameObject = client.getGameObject();

        eventBus.notify(new PlayerEnterWorld(gameObject));
        client.sendPacket(packetBuilderService.userInfo(gameObject));
    }
}