package com.simpla.iot.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_access", catalog = "simpla_db")
public class UserAccess implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userAccessId;
	private UserDetails userDetails;
	private int accessId;
	private String type;
	private String flag;

	public UserAccess() {
	}

	public UserAccess(int userAccessId, int accessId, String type, String flag) {
		this.userAccessId = userAccessId;
		this.accessId = accessId;
		this.type = type;
		this.flag = flag;
	}

	public UserAccess(int userAccessId, UserDetails userDetails, int accessId, String type, String flag) {
		this.userAccessId = userAccessId;
		this.userDetails = userDetails;
		this.accessId = accessId;
		this.type = type;
		this.flag = flag;
	}

	@Id

	@Column(name = "user_access_id", unique = true, nullable = false)
	public int getUserAccessId() {
		return this.userAccessId;
	}

	public void setUserAccessId(int userAccessId) {
		this.userAccessId = userAccessId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public UserDetails getUserDetails() {
		return this.userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	@Column(name = "access_id", nullable = false)
	public int getAccessId() {
		return this.accessId;
	}

	public void setAccessId(int accessId) {
		this.accessId = accessId;
	}

	@Column(name = "type", nullable = false, length = 10)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "flag", nullable = false, length = 45)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

}
