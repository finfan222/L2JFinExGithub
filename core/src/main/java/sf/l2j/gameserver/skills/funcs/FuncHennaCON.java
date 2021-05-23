package sf.l2j.gameserver.skills.funcs;

import sf.finex.model.dye.DyeComponent;
import sf.l2j.gameserver.skills.Env;
import sf.l2j.gameserver.skills.Stats;
import sf.l2j.gameserver.skills.basefuncs.Func;

public class FuncHennaCON extends Func {

	static final FuncHennaCON _fh_instance = new FuncHennaCON();

	public static Func getInstance() {
		return _fh_instance;
	}

	private FuncHennaCON() {
		super(Stats.CON, 0x10, null, null);
	}

	@Override
	public void calc(Env env) {
		final DyeComponent dye = env.getPlayer().getComponent(DyeComponent.class);
		if (dye != null) {
			env.addValue(dye.getDyeCON());
		}
	}
}