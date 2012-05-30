package com.example.test.feature.internal;

import com.example.test.api.Thing;

public class FeatureThing implements Thing {

	@Override
	public String getName() {
		return "Bug";
	}

}