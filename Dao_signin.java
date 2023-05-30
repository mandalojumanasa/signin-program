package com.signin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao_signin extends validation_signin {
public static final long mblno = 0;

public static void main(String[] args) {
	boolean q=true;
	validation_signin s1=new validation_signin();
	sign1 s=new sign1();
	System.out.println("1.enter the name 2.enter the mobile_no 3.enter the gender 4.enter the password 5.enter the Dob 6.enter the age 7.enter the gmail 8.enter the Alt_gmail 9.enter the Alt_mblno");
	while (q) {
		String f=sc.next();
		switch (f) {
		case "1":
			System.out.println("enter the name");
			s1.validateName(sc.next()); 
			String name12= s.getName();
			System.out.println("2.for mobile_no 3.for gender 4.for password 5.for Dob 6.for age 7.for gmail 8.for Alt_gamil 9.for Alt_mblno");
			break;
		case "2":
			System.out.println("enter the mobile_no");
			s1.validateMobile_no(sc.nextLong()); 
			long mblno1= s.getMobile_no();
			System.out.println("3.for gender 4.for password 5.for Dob 6.for age 7.for gmail 8.for Alt_gmail 9.for Alt_mblno");
			break;
		case "3":
//			System.out.println("choose the gender");
//			System.out.println("select the gender");
//			System.out.println("click a.for MALE");
//			System.out.println("click b.for FEMALE");
//			System.out.println("click c.for OTHERS");
			System.out.println("enter the gender");
			s1.validateGender(sc.next()); 
			//String gender1= s.getGender();
			System.out.println("4.for password 5.for Dob 6.for age 7.for gmail 8.for Alt_gmail 9.for Alt_mblno");
			break;
		case "4":
			System.out.println("enter the password");
			s1.validatePassword(sc.next()); 
			String password1= s.getPassword();
			System.out.println("5.for Dob 6.for age 7.for gamil 8.for Alt_gmail 9.for Alt_mblno");
			break;
		case "5":
			System.out.println("enter the Dob");
			s1.validateDob(sc.next()); 
			String dob1= s.getDob();
			System.out.println("6.for age 7.for gmail 8.for Alt_gmail 9.for Alt_mblno");
			break;
		case "6":
			System.out.println("enter the Age");
			s1.validateAge(sc.nextInt()); 
			int age1= s.getAge();
			System.out.println("7.for gmail 8.for Alt_gmail 9.for Alt_mblno");
			break;
		case "7":
			System.out.println("enter the gmail");
			s1.validateGmail(sc.next()); 
			String gmail1= s.getGmail();
			System.out.println("8.for Alt_gmail 9.for Alt_mblno");
			break;
		case "8":
			System.out.println("enter the Alt_gmail");
			s1.validateAlternate_gmail(sc.next()); 
			String alt_gmail1= s.getAlternate_gmail();
			System.out.println("9.for Alt_mblno");
			break;
		case "9":
			System.out.println("enter the Alt_mblno");
			s1.validateAlternate_mobileno(sc.nextLong()); 
			long alt_mblno1= s.getAlternate_mobileno();
			q=false;
		default:
			System.out.println("choose correct one");
		}
	}
	Connection con=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signin1", "root", "root");
		PreparedStatement p=con.prepareStatement("insert into datastorage values (?,?,?,?,?,?,?,?,?)");
//		String name=s.getName();
//		long mblno=s.getMobile_no();
//		String gender=s.getGender();
//		String paswrd=s.getPassword();
//		String dob=s.getPassword();
//		int age=s.getAge();
//		String gmail=s.getGmail();
//		String alt_gmail=s.getAlternate_gmail();
//		long alt_mblno=s.getAlternate_mobileno();
		p.setLong(1,sign1.getMobile_no());
		p.setString(2,sign1.getName());
		p.setString(3, sign1.getGender());
		p.setString(4,sign1.getPassword());
		p.setString(5,sign1.getDob());
		p.setInt(6, sign1.getAge());
		p.setString(7,sign1.getGmail());
		p.setString(8,sign1.getAlternate_gmail());
		p.setLong(9, sign1.getAlternate_mobileno());
		p.executeUpdate();
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if (con!=null) {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println("Row inserted succesfully");
}
}
