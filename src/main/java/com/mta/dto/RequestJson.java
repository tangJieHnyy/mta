/**
 * 
 */
package com.mta.dto;

import java.io.Serializable;
import java.util.Map;

/**
 * @author Zhangxiaojie
 *
 */
public class RequestJson implements Serializable{

	private static final long serialVersionUID = 1L;

	private RequestJsonHead head;
	
	private Map<String, Object> con;

	public RequestJsonHead getHead() {
		return head;
	}

	public void setHead(RequestJsonHead head) {
		this.head = head;
	}

	public Map<String, Object> getCon() {
		return con;
	}

	public void setCon(Map<String, Object> con) {
		this.con = con;
	}

}
