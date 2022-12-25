package ru.finex.ws.l2.component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import ru.finex.core.persistence.PersistenceField;
import ru.finex.ws.l2.model.entity.ClanComponentEntity;
import ru.finex.ws.model.component.AbstractComponent;

/**
 * @author m0nster.mind
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClanComponent extends AbstractComponent {

    @Setter(AccessLevel.NONE)
    @PersistenceField
    private ClanComponentEntity entity = new ClanComponentEntity();

}