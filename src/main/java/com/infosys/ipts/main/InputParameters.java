package com.infosys.ipts.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inputparameters")
public class InputParameters {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "param_id")
	private int paramId;

	@Column(name = "param_name")
	private String paramName;

	@Column(name = "param_description")
	private String paramDescription;

	public int getParamId() {
		return paramId;
	}

	public void setParamId(int paramId) {
		this.paramId = paramId;
	}

	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public String getParamDescription() {
		return paramDescription;
	}

	public void setParamDescription(String paramDescription) {
		this.paramDescription = paramDescription;
	}

	@Override
	public String toString() {
		return "InputParameters [paramId=" + paramId + ", paramName=" + paramName + ", paramDescription="
				+ paramDescription + "]";
	}

}
