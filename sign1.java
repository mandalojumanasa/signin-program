package com.signin;

public class sign1 {
private String name;
private long mobile_no;
private String gender;
private String password;
private String dob;
private int age;
private String gmail;
private String alternate_gmail;
private long alternate_mobileno;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getMobile_no() {
	return mobile_no;
}
public void setMobile_no(long mobile_no) {
	this.mobile_no = mobile_no;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGmail() {
	return gmail;
}
public void setGmail(String gmail) {
	this.gmail = gmail;
}
public String getAlternate_gmail() {
	return alternate_gmail;
}
public void setAlternate_gmail(String alternate_gmail) {
	this.alternate_gmail = alternate_gmail;
}
public long getAlternate_mobileno() {
	return alternate_mobileno;
}
public void setAlternate_mobileno(long alternate_mobileno) {
	this.alternate_mobileno = alternate_mobileno;
}
public  void dispdetails(){
	System.out.println("your name             :"+getName());
	System.out.println("your mobile_no        :"+getMobile_no());
//	System.out.println("your gender           :"+getGender());
	System.out.println("your password         :"+getPassword());
	System.out.println("your dob              :"+getDob());
	System.out.println("your gamil            :"+getGmail());
	System.out.println("your alternate_gamil  :"+getAlternate_gmail());
	System.out.println("your alternate_mobileno:"+getAlternate_mobileno());
	
}

}
