package sf.l2j.gameserver.skills.effects;

import sf.l2j.gameserver.skills.Effect;
import sf.l2j.gameserver.skills.EffectTemplate;
import sf.l2j.gameserver.skills.Env;
import sf.l2j.gameserver.skills.L2Effect;
import sf.l2j.gameserver.templates.skills.EEffectFlag;
import sf.l2j.gameserver.templates.skills.L2EffectType;

/**
 * @author mkizub
 */
@Effect("Stun")
public class EffectStun extends L2Effect {

	public EffectStun(Env env, EffectTemplate template) {
		super(env, template);
	}

	@Override
	public L2EffectType getEffectType() {
		return L2EffectType.STUN;
	}

	@Override
	public boolean onStart() {
		getEffected().startStunning();
		return true;
	}

	@Override
	public void onExit() {
		getEffected().stopStunning(false);
	}

	@Override
	public boolean onActionTime() {
		return false;
	}

	@Override
	public boolean onSameEffect(L2Effect effect) {
		return false;
	}

	@Override
	public int getEffectFlags() {
		return EEffectFlag.STUNNED.getMask();
	}
}