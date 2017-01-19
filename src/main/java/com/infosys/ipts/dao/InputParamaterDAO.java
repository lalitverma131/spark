package com.infosys.ipts.dao;

import com.infosys.ipts.entity.InputParameters;

public interface InputParamaterDAO {
	public int add(InputParameters inputParameters);

	public void delete(InputParameters inputParameters);

	public void update(InputParameters inputParameters);

	public InputParameters get(int paramId);
}
