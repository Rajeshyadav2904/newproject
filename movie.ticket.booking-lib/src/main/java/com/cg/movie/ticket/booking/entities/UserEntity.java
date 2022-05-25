package com.cg.movie.ticket.booking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Users")
public class UserEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int userid;

@Column(name="username",length=25)
private String userame;
@Column(name="password",length=25)
private String password;

@Column(name="email",length=25)
private String email;
@Column(name="mobilenumber",length=25)
private double mobilenumber;

@Column(name="role",length=25)
private String role;

public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUserame() {
	return userame;
}
public void setUserame(String userame) {
	this.userame = userame;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public double getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(double mobilenumber) {
	this.mobilenumber = mobilenumber;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
	
}
