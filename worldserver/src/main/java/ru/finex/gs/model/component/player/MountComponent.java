package ru.finex.gs.model.component.player;

import lombok.Data;
import ru.finex.gs.model.component.AbstractComponent;

/**
 * @author m0nster.mind
 */
@Data
public class MountComponent extends AbstractComponent {

    private int mountId;

    public int getMountType() {
        // FIXME m0nster.mind: 1 on strider 2 on wyvern 0 no mount
        return 0;
    }

}