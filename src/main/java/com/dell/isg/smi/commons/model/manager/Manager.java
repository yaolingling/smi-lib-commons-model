/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.manager;

import java.util.List;

public class Manager {
	
	public Manager() {
		super();
	}

	protected List<IdracCardString> stringViewList;

	public List<IdracCardString> getStringViewList() {
		return stringViewList;
	}

	public void setStringViewList(List<IdracCardString> stringViews) {
		this.stringViewList = stringViews;
	}
	
	
}
