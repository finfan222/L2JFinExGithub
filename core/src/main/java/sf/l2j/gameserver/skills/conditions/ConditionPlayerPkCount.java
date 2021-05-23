package sf.l2j.gameserver.skills.conditions;


import sf.l2j.gameserver.skills.Env;

/**
 * The Class ConditionPlayerPkCount.
 */
public class ConditionPlayerPkCount extends Condition {

	private int pk;

	/**
	 * Instantiates a new condition player pk count.
	 *
	 * @param pk the pk
	 */
	public ConditionPlayerPkCount(int pk) {
		this.pk = pk;
	}

	@Override
	public boolean testImpl(Env env) {
		if (env.getPlayer() == null) {
			return false;
		}

		return env.getPlayer().getPkKills() <= pk;
	}
}