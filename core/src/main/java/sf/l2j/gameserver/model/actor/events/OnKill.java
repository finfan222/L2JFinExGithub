/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sf.l2j.gameserver.model.actor.events;

import lombok.Data;
import sf.l2j.gameserver.model.actor.Creature;

/**
 *
 * @author FinFan
 */
@Data
public class OnKill {

	private final Creature killer, victim;
}