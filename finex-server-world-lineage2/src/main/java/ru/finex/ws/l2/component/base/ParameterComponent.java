package ru.finex.ws.l2.component.base;

import lombok.Getter;
import ru.finex.core.persistence.PersistenceField;
import ru.finex.ws.l2.model.entity.ParameterEntity;
import ru.finex.ws.l2.persistence.PlayerPersistenceService;
import ru.finex.ws.model.component.AbstractComponent;

/**
 * @author finfan
 */
public class ParameterComponent extends AbstractComponent {
	@Getter
	@PersistenceField(PlayerPersistenceService.class)
	private ParameterEntity entity;
}
