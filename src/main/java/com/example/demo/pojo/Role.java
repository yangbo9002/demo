package com.example.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Administrator
 *	角色表
 */
@Entity
public class Role {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer roleId;//角色编号
	private String roleName;//角色名称
	private String roleInfo;//角色描述
	private Integer roleStatus;//角色状态 	0：正常	1：已删除
	
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleInfo() {
		return roleInfo;
	}
	public void setRoleInfo(String roleInfo) {
		this.roleInfo = roleInfo;
	}
	public Integer getRoleStatus() {
		return roleStatus;
	}
	public void setRoleStatus(Integer roleStatus) {
		this.roleStatus = roleStatus;
	}
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", roleInfo=" + roleInfo + ", roleStatus="
				+ roleStatus + "]";
	}
	
	
	
	
}
