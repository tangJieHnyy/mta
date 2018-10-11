/**
 * 
 */
package com.mta.dto;

import java.io.Serializable;

/**
 * @author Zhangxiaojie
 *
 */
public class RequestJsonHead implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4724442180900072589L;
	
	private String aid;
    private String ver;
    private String ln;
	private String mod;
    private String de;
    private int sync;
	private long uuid;
    private String chcode;
    private int cmd;
    
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getVer() {
		return ver;
	}
	public void setVer(String ver) {
		this.ver = ver;
	}
	public String getLn() {
		return ln;
	}
	public void setLn(String ln) {
		this.ln = ln;
	}
	public String getMod() {
		return mod;
	}
	public void setMod(String mod) {
		this.mod = mod;
	}
	public String getDe() {
		return de;
	}
	public void setDe(String de) {
		this.de = de;
	}
	
	public String getChcode() {
		return chcode;
	}
	public void setChcode(String chcode) {
		this.chcode = chcode;
	}
	public int getSync() {
		return sync;
	}
	public void setSync(int sync) {
		this.sync = sync;
	}
	public long getUuid() {
		return uuid;
	}
	public void setUuid(long uuid) {
		this.uuid = uuid;
	}
	public int getCmd() {
		return cmd;
	}
	public void setCmd(int cmd) {
		this.cmd = cmd;
	}
	
    
}
