/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sf.l2j.gameserver.skills.effects;

import sf.l2j.gameserver.skills.Effect;
import sf.l2j.gameserver.skills.EffectTemplate;
import sf.l2j.gameserver.skills.Env;

/**
 *
 * @author finfan
 */
@Effect("Provoke")
public class EffectProvoke extends EffectTargetMe {

	public EffectProvoke(Env env, EffectTemplate template) {
		super(env, template);
	}

	@Override
	public boolean onStart() {
		getEffected().setOutOfControl(true);
		return super.onStart();
	}

	@Override
	public void onExit() {
		getEffected().setOutOfControl(false);
	}
}