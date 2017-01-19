package com.infosys.ipts.utility;

import java.util.Map;

public class Value<V> {

	private Map<String, V> value;

	public Map<String, V> getValue() {
		return value;
	}

	public void setValue(Map<String, V> value) {
		this.value = value;
	}

}
