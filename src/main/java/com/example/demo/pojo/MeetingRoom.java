package com.example.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Administrator
 *	会议室表
 */
@Entity
public class MeetingRoom {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer meetRoomId;//会议室编号
	private String meetRoomName;//会议室名称
	private String meetRoomArea;//会议室面积
	public Integer getMeetRoomId() {
		return meetRoomId;
	}
	public void setMeetRoomId(Integer meetRoomId) {
		this.meetRoomId = meetRoomId;
	}
	public String getMeetRoomName() {
		return meetRoomName;
	}
	public void setMeetRoomName(String meetRoomName) {
		this.meetRoomName = meetRoomName;
	}
	public String getMeetRoomArea() {
		return meetRoomArea;
	}
	public void setMeetRoomArea(String meetRoomArea) {
		this.meetRoomArea = meetRoomArea;
	}
	@Override
	public String toString() {
		return "MeetingRoom [meetRoomId=" + meetRoomId + ", meetRoomName=" + meetRoomName + ", meetRoomArea="
				+ meetRoomArea + "]";
	}
	
	
}
