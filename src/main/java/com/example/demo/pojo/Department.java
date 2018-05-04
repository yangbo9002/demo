package com.example.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Administrator
 *	主办部门管理
 */
@Entity
public class Department {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer deptId;//部门编号
	private String deptName;//部门名称
	private String deptInfo;//部门描述
	private Integer deptStatus;//部门状态	0：正常	1：已删除
	
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptInfo() {
		return deptInfo;
	}
	public void setDeptInfo(String deptInfo) {
		this.deptInfo = deptInfo;
	}
	public Integer getDeptStatus() {
		return deptStatus;
	}
	public void setDeptStatus(Integer deptStatus) {
		this.deptStatus = deptStatus;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptInfo=" + deptInfo + ", deptStatus="
				+ deptStatus + "]";
	}
	
	
}
