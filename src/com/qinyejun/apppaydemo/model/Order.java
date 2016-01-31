package com.qinyejun.apppaydemo.model;

//import javax.annotation.Generated;
import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class Order implements Serializable{

	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("title")
	@Expose
	private String title;
	@SerializedName("orderType")
	@Expose
	private String orderType;
	@SerializedName("content")
	@Expose
	private String content;
	@SerializedName("url")
	@Expose
	private String url;
	@SerializedName("createdAt")
	@Expose
	private String createdAt;
	@SerializedName("state")
	@Expose
	private String state;
	@SerializedName("contact")
	@Expose
	private String contact;
	@SerializedName("price")
	@Expose
	private Double price;
	@SerializedName("paid")
	@Expose
	private Boolean paid;
	@SerializedName("refID")
	@Expose
	private String refID;

	/**
	 * 
	 * @return The id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 
	 * @return The title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 
	 * @param title
	 *            The title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * 
	 * @return The title
	 */
	public String getOrderType() {
		return orderType;
	}

	/**
	 * 
	 * @param title
	 *            The title
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	/**
	 * 
	 * @return The content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * 
	 * @param content
	 *            The content
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * 
	 * @return The url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 
	 * @param url
	 *            The url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 
	 * @return The createdAt
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * 
	 * @param createdAt
	 *            The createdAt
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * 
	 * @return The state
	 */
	public String getState() {
		return state;
	}

	/**
	 * 
	 * @param state
	 *            The state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 
	 * @return The contact
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * 
	 * @param contact
	 *            The contact
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * 
	 * @return The price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * 
	 * @param price
	 *            The price
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * 
	 * @return The paid
	 */
	public Boolean getPaid() {
		return paid;
	}

	/**
	 * 
	 * @param paid
	 *            The paid
	 */
	public void setPaid(Boolean paid) {
		this.paid = paid;
	}
	
	/**
	 * 
	 * @return The id
	 */
	public String getRefId() {
		return refID;
	}

	/**
	 * 
	 * @param id
	 *            The id
	 */
	public void setRefId(String refID) {
		this.refID = refID;
	}

}