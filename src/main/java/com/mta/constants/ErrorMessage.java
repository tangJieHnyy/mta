package com.mta.constants;

import java.util.HashMap;
import java.util.Map;

public enum ErrorMessage {
	/**
	 * 
	 */
	SERVICE_NOT_AVAILABLE("-99", "服务调用失败"),
	/**
	 * 
	 */
	LOGIN_INCORRECT_PARAMETER("-98", "参数不正确"),

	/**
	 * 
	 */
	GET_METADATA_NULL_ERROR("E00001", "Meta信息为空"),

	GET_METADATA_ERROR("E00002", "获取Meta结构异常"),
	
	MERGEKEY_NOT_FOUND("E00003","excel中未找到合并键值"),
	
	DUPLICATE_META_BY_DIS("E00004","Displayname匹配多个meta"),

	/**
	 * 
	 */
	INCORRECT_PARAMETER("-100", "参数错误");
	private String code;
	private String message;
	private int cmd;
	private final static Map<String, ErrorMessage> nameMap = new HashMap<String, ErrorMessage>();
	private final static Map<String, ErrorMessage> codeMap = new HashMap<String, ErrorMessage>();

	static {
		for (ErrorMessage errorMessage : ErrorMessage.values()) {
			codeMap.put(errorMessage.getCode(), errorMessage);
			nameMap.put(errorMessage.getMessage(), errorMessage);
		}
	}

	ErrorMessage(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCmd() {
		return cmd;
	}

	public void setCmd(int cmd) {
		this.cmd = cmd;
	}

	public static ErrorMessage getFromName(String name) {
		return nameMap.get(name);
	}

	public static ErrorMessage getFromCode(String code) {
		return codeMap.get(code);
	}

}
