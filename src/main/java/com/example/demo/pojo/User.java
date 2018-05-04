package com.example.demo.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Administrator
 *	用户表
 */
@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userId;//用户编号
	private String uName;//用户名
	private String userName;//姓名
	private String userEmail;//邮箱
	private String userPhone;//电话
	@ManyToOne
	@JoinColumn(name="deptId")
	private Department dept;//所属部门
	@ManyToOne
	@JoinColumn(name="hostId")
	private	Host host;//所属主办
	@ManyToOne
	@JoinColumn(name="roleId")
	private Role role;//所属角色
	private Date lastTime;
	private Integer userStatus;//用户状态	0：正常	1：已删除
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Host getHost() {
		return host;
	}
	public void setHost(Host host) {
		this.host = host;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Date getLastTime() {
		return lastTime;
	}
	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}
	public Integer getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", uName=" + uName + ", userName=" + userName + ", userEmail=" + userEmail
				+ ", userPhone=" + userPhone + ", dept=" + dept + ", host=" + host + ", role=" + role + ", lastTime="
				+ lastTime + ", userStatus=" + userStatus + "]";
	}
	
	
}
