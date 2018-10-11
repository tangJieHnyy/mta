/**
 * 
 */
package com.mta.dto;

import java.io.Serializable;

/**
 * @author Zhangxiaojie
 *
 */
public class ResponseJsonHead implements Serializable {

  /**
	 * 
	 */
  private static final long serialVersionUID = 6182475286121010843L;

  private int cmd;

  private int httpStatus;

  private String msg;

  private String errorCode;

  public int getCmd() {
    return cmd;
  }

  public void setCmd(int cmd) {
    this.cmd = cmd;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public int getHttpStatus() {
    return httpStatus;
  }

  public void setHttpStatus(int httpStatus) {
    this.httpStatus = httpStatus;
  }

  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ResponseJsonHead(int cmd, String errorCode, String msg, int httpStatus) {
    super();
    this.cmd = cmd;
    this.errorCode = errorCode;
    this.msg = msg;
    this.httpStatus = httpStatus;
  }

  public ResponseJsonHead() {
    super();
  }
}
