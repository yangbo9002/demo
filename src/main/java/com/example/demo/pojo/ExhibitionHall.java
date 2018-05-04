package com.example.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Administrator
 *	展厅表
 */
@Entity
public class ExhibitionHall {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer exHallId;//展厅编号
	private String exHallName;//展厅名称
	private String exHallArea;//展厅面积
	public Integer getExHallId() {
		return exHallId;
	}
	public void setExHallId(Integer exHallId) {
		this.exHallId = exHallId;
	}
	public String getExHallName() {
		return exHallName;
	}
	public void setExHallName(String exHallName) {
		this.exHallName = exHallName;
	}
	public String getExHallArea() {
		return exHallArea;
	}
	public void setExHallArea(String exHallArea) {
		this.exHallArea = exHallArea;
	}
	@Override
	public String toString() {
		return "ExhibitionHall [exHallId=" + exHallId + ", exHallName=" + exHallName + ", exHallArea=" + exHallArea
				+ "]";
	}
	
	
}
