package com.jshop.entity;

import java.util.Date;

/**
 * PageEditareaT entity. @author MyEclipse Persistence Tools
 */

public class PageEditareaT implements java.io.Serializable {

	// Fields    

	private String pageeditareaid;
	private String goodscategoryid;
	private String name;
	private String sign;
	private String htmlpath;
	private String editareatitle;
	private String editareavalue;
	private Integer editflag;
	private String state;
	private String snid;
	private String creatorid;
	private Date createtime;

	// Constructors

	/** default constructor */
	public PageEditareaT() {
	}

	/** minimal constructor */
	public PageEditareaT(String pageeditareaid, String name, String sign, String editareatitle) {
		this.pageeditareaid = pageeditareaid;
		this.name = name;
		this.sign = sign;
		this.editareatitle = editareatitle;
	}

	/** full constructor */
	public PageEditareaT(String pageeditareaid, String goodscategoryid, String name, String sign, String htmlpath, String editareatitle, String editareavalue, Integer editflag, String state, String snid, String creatorid, Date createtime) {
		this.pageeditareaid = pageeditareaid;
		this.goodscategoryid = goodscategoryid;
		this.name = name;
		this.sign = sign;
		this.htmlpath = htmlpath;
		this.editareatitle = editareatitle;
		this.editareavalue = editareavalue;
		this.editflag = editflag;
		this.state = state;
		this.snid = snid;
		this.creatorid = creatorid;
		this.createtime = createtime;
	}

	// Property accessors

	public String getPageeditareaid() {
		return this.pageeditareaid;
	}

	public void setPageeditareaid(String pageeditareaid) {
		this.pageeditareaid = pageeditareaid;
	}

	public String getGoodscategoryid() {
		return this.goodscategoryid;
	}

	public void setGoodscategoryid(String goodscategoryid) {
		this.goodscategoryid = goodscategoryid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getHtmlpath() {
		return this.htmlpath;
	}

	public void setHtmlpath(String htmlpath) {
		this.htmlpath = htmlpath;
	}

	public String getEditareatitle() {
		return this.editareatitle;
	}

	public void setEditareatitle(String editareatitle) {
		this.editareatitle = editareatitle;
	}

	public String getEditareavalue() {
		return this.editareavalue;
	}

	public void setEditareavalue(String editareavalue) {
		this.editareavalue = editareavalue;
	}

	public Integer getEditflag() {
		return this.editflag;
	}

	public void setEditflag(Integer editflag) {
		this.editflag = editflag;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSnid() {
		return this.snid;
	}

	public void setSnid(String snid) {
		this.snid = snid;
	}

	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}