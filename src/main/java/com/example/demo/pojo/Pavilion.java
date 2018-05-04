package com.example.demo.pojo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * @author Administrator
 *	展馆表
 */
@Entity
public class Pavilion {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pavilionId;//展馆编号
	private String pavilionName;//展馆名称
	private String pavilionAddress;//展馆地址
	private String pavilionArea;//展馆面积
	private String pavilionSite;//展馆网站
	@OneToMany
	@JoinColumn(name="pavilionId")
	private List<ExhibitionHall> exHall;//展馆下展厅
	@OneToMany
	@JoinColumn(name="pavilionId")
	private List<MeetingRoom> meetRoom;//展馆下会议室
	public Integer getPavilionId() {
		return pavilionId;
	}
	public void setPavilionId(Integer pavilionId) {
		this.pavilionId = pavilionId;
	}
	public String getPavilionName() {
		return pavilionName;
	}
	public void setPavilionName(String pavilionName) {
		this.pavilionName = pavilionName;
	}
	public String getPavilionAddress() {
		return pavilionAddress;
	}
	public void setPavilionAddress(String pavilionAddress) {
		this.pavilionAddress = pavilionAddress;
	}
	public String getPavilionArea() {
		return pavilionArea;
	}
	public void setPavilionArea(String pavilionArea) {
		this.pavilionArea = pavilionArea;
	}
	public String getPavilionSite() {
		return pavilionSite;
	}
	public void setPavilionSite(String pavilionSite) {
		this.pavilionSite = pavilionSite;
	}
	public List<ExhibitionHall> getExHall() {
		return exHall;
	}
	public void setExHall(List<ExhibitionHall> exHall) {
		this.exHall = exHall;
	}
	public List<MeetingRoom> getMeetRoom() {
		return meetRoom;
	}
	public void setMeetRoom(List<MeetingRoom> meetRoom) {
		this.meetRoom = meetRoom;
	}
	@Override
	public String toString() {
		return "Pavilion [pavilionId=" + pavilionId + ", pavilionName=" + pavilionName + ", pavilionAddress="
				+ pavilionAddress + ", pavilionArea=" + pavilionArea + ", pavilionSite=" + pavilionSite + ", exHall="
				+ exHall + ", meetRoom=" + meetRoom + "]";
	}
	
	
}
