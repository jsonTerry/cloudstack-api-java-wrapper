package com.fit2cloud.cloudstack.wsclient.model.request.vpc;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class ListStaticRoutesRequest extends Request {
	private String account;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	private String domainid;
	public String getDomainid() {
		return domainid;
	}
	public void setDomainid(String domainid) {
		this.domainid = domainid;
	}
	private String gatewayid;
	public String getGatewayid() {
		return gatewayid;
	}
	public void setGatewayid(String gatewayid) {
		this.gatewayid = gatewayid;
	}
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String isrecursive;
	public String getIsrecursive() {
		return isrecursive;
	}
	public void setIsrecursive(String isrecursive) {
		this.isrecursive = isrecursive;
	}
	private String keyword;
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	private String listall;
	public String getListall() {
		return listall;
	}
	public void setListall(String listall) {
		this.listall = listall;
	}
	private String page;
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	private String pagesize;
	public String getPagesize() {
		return pagesize;
	}
	public void setPagesize(String pagesize) {
		this.pagesize = pagesize;
	}
	private String projectid;
	public String getProjectid() {
		return projectid;
	}
	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}
	private String tags;
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	private String vpcid;
	public String getVpcid() {
		return vpcid;
	}
	public void setVpcid(String vpcid) {
		this.vpcid = vpcid;
	}

}
