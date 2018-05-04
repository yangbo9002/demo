package com.example.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Administrator
 *	主办表
 */
@Entity
public class Host {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer hostId;//主办编号
	private String hostName;//主办名称
	private String hostAddress;//主办所属地址
	private String hostPhone;//主办电话
	private String contactUser;//联系人
	private Integer status;//状态		0：正常	1：已删除
	public Integer getHostId() {
		return hostId;
	}
	public void setHostId(Integer hostId) {
		this.hostId = hostId;
	}
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public String getHostAddress() {
		return hostAddress;
	}
	public void setHostAddress(String hostAddress) {
		this.hostAddress = hostAddress;
	}
	public String getHostPhone() {
		return hostPhone;
	}
	public void setHostPhone(String hostPhone) {
		this.hostPhone = hostPhone;
	}
	public String getContactUser() {
		return contactUser;
	}
	public void setContactUser(String contactUser) {
		this.contactUser = contactUser;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Host [hostId=" + hostId + ", hostName=" + hostName + ", hostAddress=" + hostAddress + ", hostPhone="
				+ hostPhone + ", contactUser=" + contactUser + ", status=" + status + "]";
	}
	
	
}
