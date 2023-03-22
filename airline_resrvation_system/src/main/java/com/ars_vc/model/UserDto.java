package com.ars_vc.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
private int id;
private String userName;
private String passwoord;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPasswoord() {
	return passwoord;
}
public void setPasswoord(String passwoord) {
	this.passwoord = passwoord;
}


}
