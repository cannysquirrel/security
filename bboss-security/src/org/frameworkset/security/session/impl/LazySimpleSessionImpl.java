package org.frameworkset.security.session.impl;

import java.util.HashMap;

public class LazySimpleSessionImpl extends SimpleSessionImpl {

	public LazySimpleSessionImpl(boolean storeReadAttributes) {
		super();
		this.modifyattributes = new HashMap<String,ModifyValue>();
		this.islazy = true;
		this.storeReadAttributes = storeReadAttributes;
	}

}
