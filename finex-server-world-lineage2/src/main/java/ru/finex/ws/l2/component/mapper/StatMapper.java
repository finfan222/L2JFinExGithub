package ru.finex.ws.l2.component.mapper;

import ru.finex.core.prototype.ComponentPrototypeMapper;
import ru.finex.ws.l2.component.base.StatComponent;
import ru.finex.ws.l2.component.prototype.StatPrototype;

/**
 * @author m0nster.mind
 */
public class StatMapper implements ComponentPrototypeMapper<StatPrototype, StatComponent> {

    @Override
    public StatComponent map(StatPrototype prototype) {
        var component = new StatComponent();
        var entity = component.getEntity();
        entity.setPAtk(prototype.getPAtk());
        entity.setMAtk(prototype.getMAtk());
        entity.setPDef(prototype.getPDef());
        entity.setMDef(prototype.getMDef());
        entity.setCriticalRate(prototype.getCriticalRate());
        entity.setMagicCriticalRate(prototype.getMagicCriticalRate());
        return component;
    }

}