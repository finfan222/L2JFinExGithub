package ru.finex.gs.persistence.component;

import ru.finex.gs.model.entity.ClanEntity;
import ru.finex.gs.service.persistence.PersistenceService;

import java.util.Collections;
import javax.inject.Singleton;

/**
 * @author m0nster.mind
 */
@Singleton
public class ClanPersistenceService implements PersistenceService<ClanEntity> {

    @Override
    public ClanEntity persist(ClanEntity entity) {
        return entity;
    }

    @Override
    public ClanEntity restore(int gameObjectPersistenceId) {
        return ClanEntity.builder()
            .persistenceId(0)
            .crestId(0)
            .crest(new byte[0])
            .largeCrestId(0)
            .largeCrest(new byte[0])
            .members(Collections.emptyList())
            .build();
    }

}
