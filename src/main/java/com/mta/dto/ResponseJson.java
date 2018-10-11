/**
 * 
 */
package com.mta.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;

import com.mta.constants.ErrorMessage;
/**
 *
 */
public class ResponseJson implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8264150831402609392L;

	private ResponseJsonHead head;

	private Map<String, Object> body;

	public ResponseJsonHead getHead() {
		return head;
	}

	public void setHead(ResponseJsonHead head) {
		this.head = head;
	}

	public Map<String, Object> getBody() {
		return body;
	}

	public void setBody(Map<String, Object> body) {
		this.body = body;
	}

	public ResponseJson() {
		super();
	}

	public ResponseJson(ResponseJsonHead head, Map<String, Object> body) {
		super();
		this.head = head;
		this.body = body;
	}

	public ResponseJson(HttpStatus httpStatus, int cmd, String msg) {
		ResponseJsonHead head = new ResponseJsonHead();
		head.setCmd(cmd);
		head.setHttpStatus(httpStatus.value());
		head.setMsg(msg);
		this.head = head;
		this.body = new HashMap<String, Object>();
	}

	public ResponseJson(HttpStatus httpStatus, int cmd, String msg, Map<String, Object> body) {
		ResponseJsonHead head = new ResponseJsonHead();
		head.setCmd(cmd);
		head.setHttpStatus(httpStatus.value());
		head.setMsg(msg);
		this.head = head;
		if (body != null && body.size() > 0) {
			this.body = body;
		} else {
			this.body = new HashMap<String, Object>();
		}
	}


  public ResponseJson(HttpStatus httpStatus,ErrorMessage errorMessage) {
     ResponseJsonHead head = new ResponseJsonHead();
     head.setCmd(errorMessage.getCmd());
     head.setHttpStatus(httpStatus.value());
     head.setMsg(errorMessage.getMessage());
     this.head = head;
     this.body = new HashMap<String, Object>();
   }
  
	public ResponseJson getResponseJson(HttpStatus httpStatus, int cmd, String msg, Map<String, Object> body) {
		// 返回包头
		ResponseJsonHead responseJsonHead = new ResponseJsonHead();
		responseJsonHead.setHttpStatus(httpStatus.hashCode());
		responseJsonHead.setCmd(cmd);
		responseJsonHead.setMsg(msg);
		this.setHead(responseJsonHead);// 设置包头
		if(HttpStatus.OK.equals(httpStatus))
		// 返回体
		this.setBody(body);
		return this;
	}
	
	public ResponseJson getResponseJson(int st, int cmd, String msg, Map<String, Object> body) {
		// 返回包头
		ResponseJsonHead responseJsonHead = new ResponseJsonHead();
		responseJsonHead.setHttpStatus(st);
		responseJsonHead.setCmd(cmd);
		responseJsonHead.setMsg(msg);
		this.setHead(responseJsonHead);// 设置包头
			// 返回体
			this.setBody(body);
		return this;
	}

}
