package com.qinyejun.apppaydemo.model;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class PrePayModel {

	@SerializedName("appid")
	@Expose
	private String appid;
	@SerializedName("noncestr")
	@Expose
	private String noncestr;
	@SerializedName("package")
	@Expose
	private String _package;
	@SerializedName("partnerid")
	@Expose
	private String partnerid;
	@SerializedName("prepayid")
	@Expose
	private String prepayid;
	@SerializedName("sign")
	@Expose
	private String sign;
	@SerializedName("timestamp")
	@Expose
	private String timestamp;
	@SerializedName("success")
	@Expose
	private Boolean success;

	/**
	 * 
	 * @return The appid
	 */
	public String getAppid() {
		return appid;
	}

	/**
	 * 
	 * @param appid
	 *            The appid
	 */
	public void setAppid(String appid) {
		this.appid = appid;
	}

	/**
	 * 
	 * @return The noncestr
	 */
	public String getNoncestr() {
		return noncestr;
	}

	/**
	 * 
	 * @param noncestr
	 *            The noncestr
	 */
	public void setNoncestr(String noncestr) {
		this.noncestr = noncestr;
	}

	/**
	 * 
	 * @return The _package
	 */
	public String getPackage() {
		return _package;
	}

	/**
	 * 
	 * @param _package
	 *            The package
	 */
	public void setPackage(String _package) {
		this._package = _package;
	}

	/**
	 * 
	 * @return The partnerid
	 */
	public String getPartnerid() {
		return partnerid;
	}

	/**
	 * 
	 * @param partnerid
	 *            The partnerid
	 */
	public void setPartnerid(String partnerid) {
		this.partnerid = partnerid;
	}

	/**
	 * 
	 * @return The prepayid
	 */
	public String getPrepayid() {
		return prepayid;
	}

	/**
	 * 
	 * @param prepayid
	 *            The prepayid
	 */
	public void setPrepayid(String prepayid) {
		this.prepayid = prepayid;
	}

	/**
	 * 
	 * @return The sign
	 */
	public String getSign() {
		return sign;
	}

	/**
	 * 
	 * @param sign
	 *            The sign
	 */
	public void setSign(String sign) {
		this.sign = sign;
	}

	/**
	 * 
	 * @return The timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * 
	 * @param timestamp
	 *            The timestamp
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * 
	 * @return The success
	 */
	public Boolean getSuccess() {
		return success;
	}

	/**
	 * 
	 * @param success
	 *            The success
	 */
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}