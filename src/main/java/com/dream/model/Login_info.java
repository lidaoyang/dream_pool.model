package com.dream.model;

import com.dream.pub.MyModel;

public class Login_info implements java.io.Serializable,MyModel{
  private static final long serialVersionUID=1L;
  private String id;
  private String user_id;
  private String type;
  private String create_time;
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

  public String getType(){
      return type;
  }

  public void setType(String type) {
      this.type =type;
  }

  public String getCreate_time(){
      return create_time;
  }

  public void setCreate_time(String create_time) {
      this.create_time =create_time;
  }

  public String getEdit_type() {
      return edit_type;
  }

  public void setEdit_type(String edit_type) {
      this.edit_type = edit_type;
  }
  public Login_info(){
  }
  public String getMapperSpace(){
      return "com.dream.mapper.Login_infoMapper";
  }
  public Login_info(String id,String user_id,String type,String create_time){
      this.id=id;
      this.user_id=user_id;
      this.type=type;
      this.create_time=create_time;
  }
}