package com.giovanni.contest_test;

import java.io.Serializable;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class MasterParameter implements Serializable {

	static final long serialVersionUID = 1L;

	private String paramCode;
	private String paramName;
	private String paramType;

	public MasterParameter() {
	}

	public String getParamCode() {
		return paramCode;
	}

	public void setParamCode(String paramCode) {
		this.paramCode = paramCode;
	}

	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public String getParamType() {
		return paramType;
	}

	public void setParamType(String paramType) {
		this.paramType = paramType;
	}

}