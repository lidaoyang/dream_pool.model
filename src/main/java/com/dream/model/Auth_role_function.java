package com.dream.model;

import com.dream.pub.MyModel;

public class Auth_role_function implements java.io.Serializable,MyModel{
  private static final long serialVersionUID=1L;
  private String id;
  private String role_id;
  private String function_id;
  private String status;
  private String create_time;
  private String update_time;
  private String edit_type;

  public String getId(){
      return id;
  }

  public void setId(String id) {
      this.id =id;
  }

  public String getRole_id(){
      return role_id;
  }

  public void setRole_id(String role_id) {
      this.role_id =role_id;
  }

  public String getFunction_id(){
      return function_id;
  }

  public void setFunction_id(String function_id) {
      this.function_id =function_id;
  }

  public String getStatus(){
      return status;
  }

  public void setStatus(String status) {
      this.status =status;
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
  public Auth_role_function(){
  }
  public String getMapperSpace(){
      return "com.dream.mapper.Auth_role_functionMapper";
  }
  public Auth_role_function(String id,String role_id,String function_id,String status,String create_time,String update_time){
      this.id=id;
      this.role_id=role_id;
      this.function_id=function_id;
      this.status=status;
      this.create_time=create_time;
      this.update_time=update_time;
  }
}