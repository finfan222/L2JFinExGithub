package sf.l2j.gameserver.network.clientpackets;

import sf.l2j.gameserver.model.World;
import sf.l2j.gameserver.model.actor.Player;
import sf.l2j.gameserver.network.serverpackets.ExMPCCShowPartyMemberInfo;

/**
 * Format:(ch) d
 *
 * @author chris_00
 */
public final class RequestExMPCCShowPartyMembersInfo extends L2GameClientPacket {

	private int _partyLeaderId;

	@Override
	protected void readImpl() {
		_partyLeaderId = readD();
	}

	@Override
	protected void runImpl() {
		Player activeChar = getClient().getActiveChar();
		if (activeChar == null) {
			return;
		}

		Player player = World.getInstance().getPlayer(_partyLeaderId);
		if (player != null && player.isInParty()) {
			activeChar.sendPacket(new ExMPCCShowPartyMemberInfo(player.getParty()));
		}
	}
}