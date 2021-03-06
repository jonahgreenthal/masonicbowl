package com.masonic.application;

import com.masonic.persistence.PacketUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link PacketFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Packet extends PacketUserFacing {
	default String getNameWithPacketSet() {
		return getPacketSet().getName() + ' ' + getName();
	}
	
	default String getNameWithPacketSetShortName() {
		return getPacketSet().getShortName() + ' ' + getName();
	}
}
