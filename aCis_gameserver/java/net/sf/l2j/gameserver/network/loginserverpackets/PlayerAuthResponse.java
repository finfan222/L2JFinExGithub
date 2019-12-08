package net.sf.l2j.gameserver.network.loginserverpackets;

import org.slf4j.LoggerFactory;

public class PlayerAuthResponse extends LoginServerBasePacket
{
	private final String _account;
	private final boolean _authed;
	
	public PlayerAuthResponse(byte[] decrypt)
	{
		super(decrypt);
		
		_account = readS();
		_authed = readC() != 0;
	}
	
	public String getAccount()
	{
		return _account;
	}
	
	public boolean isAuthed()
	{
		return _authed;
	}
}