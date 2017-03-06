package com.dream.model;

import com.dream.pub.MyModel;

public class Auth_function implements java.io.Serializable, MyModel {
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String parent_id; 
	private String url;
	private String serial_num;
	private String is_navigation;
	private String type;
	private String create_time;
	private String update_time;
	private String edit_type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParent_id() {
		return parent_id;
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSerial_num() {
		return serial_num;
	}

	public void setSerial_num(String serial_num) {
		this.serial_num = serial_num;
	}

	public String getIs_navigation() {
		return is_navigation;
	}

	public void setIs_navigation(String is_navigation) {
		this.is_navigation = is_navigation;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}

	public String getEdit_type() {
		return edit_type;
	}

	public void setEdit_type(String edit_type) {
		this.edit_type = edit_type;
	}

	public Auth_function() {
	}

	public String getMapperSpace() {
		return "com.dream.mapper.Auth_functionMapper";
	}

	public Auth_function(String id, String name, String parent_id, String url,
			String serial_num, String is_navigation, String type,
			String create_time, String update_time, String edit_type) {
		super();
		this.id = id;
		this.name = name;
		this.parent_id = parent_id;
		this.url = url;
		this.serial_num = serial_num;
		this.is_navigation = is_navigation;
		this.type = type;
		this.create_time = create_time;
		this.update_time = update_time;
		this.edit_type = edit_type;
	}

}