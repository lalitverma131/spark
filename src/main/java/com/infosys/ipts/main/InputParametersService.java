package com.infosys.ipts.main;

import com.infosys.ipts.entity.InputParameters;

public interface InputParametersService {
	public int add(InputParameters inputParameters);

	public void delete(int paramId);

	public void update(InputParameters inputParameters);

	public InputParameters get(int paramId);
}
