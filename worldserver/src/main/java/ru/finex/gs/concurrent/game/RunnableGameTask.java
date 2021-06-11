package ru.finex.gs.concurrent.game;

import lombok.Getter;
import ru.finex.core.concurrent.RunnableServerTask;
import ru.finex.gs.model.Client;
import ru.finex.gs.model.GameObject;

/**
 * Игровая задача.
 *
 * @author m0nster.mind
 */
public class RunnableGameTask extends RunnableServerTask implements GameTask {

    @Getter
    private final Client client;

    @Getter
    private final GameObject gameObject;

    /**
     * Создать игровую задачу.
     * @param runnable задача
     * @param client клиент, который выполняет данную задачу
     */
    public RunnableGameTask(Runnable runnable, Client client) {
        this(runnable, client, null);
    }

    /**
     * Создать игровую задачу.
     * @param runnable задача
     * @param client клиент, который выполняет данную задачу
     * @param gameObject игрок, который выполняет данную задачу (can be null)
     */
    public RunnableGameTask(Runnable runnable, Client client, GameObject gameObject) {
        super(runnable);
        this.client = client;
        if (gameObject == null) {
            this.gameObject = client.getGameObject();
        } else {
            this.gameObject = gameObject;
        }
    }

}