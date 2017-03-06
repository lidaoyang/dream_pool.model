package com.dream.model;

import com.dream.pub.MyModel;

public class Auth_user implements java.io.Serializable,MyModel{
  private static final long serialVersionUID=1L;
  private String id;
  private String name;
  private String pwd;
  private String login_time;
  private String logout_time;
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

  public String getPwd(){
      return pwd;
  }

  public void setPwd(String pwd) {
      this.pwd =pwd;
  }

  public String getLogin_time(){
      return login_time;
  }

  public void setLogin_time(String login_time) {
      this.login_time =login_time;
  }

  public String getLogout_time(){
      return logout_time;
  }

  public void setLogout_time(String logout_time) {
      this.logout_time =logout_time;
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
  public Auth_user(){
  }
  public String getMapperSpace(){
      return "com.dream.mapper.Auth_userMapper";
  }
  public Auth_user(String id,String name,String pwd,String login_time,String logout_time,String create_time,String update_time){
      this.id=id;
      this.name=name;
      this.pwd=pwd;
      this.login_time=login_time;
      this.logout_time=logout_time;
      this.create_time=create_time;
      this.update_time=update_time;
  }
}