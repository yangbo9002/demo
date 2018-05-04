package com.example.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Administrator
 *	项目表
 */
@Entity
public class Item {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer itemId;//项目编号
	private String itemName;//项目名称
	private String itemInfo;//项目描述
	private Integer itemStatus;//项目状态	0：正常	1：已删除
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemInfo() {
		return itemInfo;
	}
	public void setItemInfo(String itemInfo) {
		this.itemInfo = itemInfo;
	}
	public Integer getItemStatus() {
		return itemStatus;
	}
	public void setItemStatus(Integer itemStatus) {
		this.itemStatus = itemStatus;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemInfo=" + itemInfo + ", itemStatus="
				+ itemStatus + "]";
	}
	
	
}
