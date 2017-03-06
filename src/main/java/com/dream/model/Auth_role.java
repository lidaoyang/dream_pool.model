package com.dream.model;

import com.dream.pub.MyModel;

public class Auth_role implements java.io.Serializable,MyModel{
  private static final long serialVersionUID=1L;
  private String id;
  private String name;
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

  public String getName(){
      return name;
  }

  public void setName(String name) {
      this.name =name;
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
  public Auth_role(){
  }
  public String getMapperSpace(){
      return "com.dream.mapper.Auth_roleMapper";
  }
  public Auth_role(String id,String name,String status,String create_time,String update_time){
      this.id=id;
      this.name=name;
      this.status=status;
      this.create_time=create_time;
      this.update_time=update_time;
  }
}