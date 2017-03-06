package com.dream.model;

import com.dream.pub.MyModel;

public class Auth_user_role implements java.io.Serializable,MyModel{
  private static final long serialVersionUID=1L;
  private String id;
  private String user_id;
  private String role_id;
  private String create_time;
  private String update_time;
  private String edit_type;

  public String getId(){
      return id;
  }

  public void setId(String id) {
      this.id =id;
  }

  public String getUser_id(){
      return user_id;
  }

  public void setUser_id(String user_id) {
      this.user_id =user_id;
  }

  public String getRole_id(){
      return role_id;
  }

  public void setRole_id(String role_id) {
      this.role_id =role_id;
  }

  public String getCreate_time(){
      return create_time;
  }

  public void setCreate_time(String create_time) {
      this.create_time =create_time;
  }

  public String getUpdate_time(){
      return update_time;
  }

  public void setUpdate_time(String update_time) {
      this.update_time =update_time;
  }

  public String getEdit_type() {
      return edit_type;
  }

  public void setEdit_type(String edit_type) {
      this.edit_type = edit_type;
  }
  public Auth_user_role(){
  }
  public String getMapperSpace(){
      return "com.dream.mapper.Auth_user_roleMapper";
  }
  public Auth_user_role(String id,String user_id,String role_id,String create_time,String update_time){
      this.id=id;
      this.user_id=user_id;
      this.role_id=role_id;
      this.create_time=create_time;
      this.update_time=update_time;
  }
}