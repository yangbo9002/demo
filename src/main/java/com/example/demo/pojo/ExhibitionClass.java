package com.example.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ExhibitionClass {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer exClassId;//展会类别编号
	private String exClassName;//展会类别名称
	private String exClassRemarks;//展会类别备注
	@ManyToOne
	@JoinColumn(name="parentId")
	private ExhibitionClass exClass;//展会类别上级分类
	public Integer getExClassId() {
		return exClassId;
	}
	public void setExClassId(Integer exClassId) {
		this.exClassId = exClassId;
	}
	public String getExClassName() {
		return exClassName;
	}
	public void setExClassName(String exClassName) {
		this.exClassName = exClassName;
	}
	public String getExClassRemarks() {
		return exClassRemarks;
	}
	public void setExClassRemarks(String exClassRemarks) {
		this.exClassRemarks = exClassRemarks;
	}
	public ExhibitionClass getExClass() {
		return exClass;
	}
	public void setExClass(ExhibitionClass exClass) {
		this.exClass = exClass;
	}
	@Override
	public String toString() {
		return "ExhibitionClass [exClassId=" + exClassId + ", exClassName=" + exClassName + ", exClassRemarks="
				+ exClassRemarks + ", exClass=" + exClass + "]";
	}
	
	
}
