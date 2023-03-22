package com.ars_vc.model;

import lombok.Getter;

import lombok.Setter;

@Getter
@Setter

public class AdminDto extends UserDto {
private String aName;
private String email;
public String getaName() {
	return aName;
}
public void setaName(String aName) {
	this.aName = aName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


}
