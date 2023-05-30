package com.signin;
import java.util.*;
 class validation_signin implements Tovalidate{
	static Scanner sc=new Scanner(System.in);
	static sign1 sign1 = new sign1();
	@Override
	public void validateName(String name) {
		if (name.length()>=3) {
			String name1="";
			for (int i = 0; i < name.length(); i++) {
				char ch=name.charAt(i);
				if (ch>=65&&ch<=90||ch>=97&&ch<=122) {
					name1=name1+ch;
				}
			}
			if (name.equals(name1)) {
				sign1.setName(name);
			}
			else {
				 System.out.println("The name should contain only alphabets");
		         System.out.println("enter the valid name");
		         String vName=sc.nextLine();
		         validateName(vName);
			}
		}
		else
		{
			System.out.println("the name should be atleast three letters ");
			System.out.println("enter the valid name");
			String vName=sc.nextLine();
			validateName(vName);
		}
	}
	@Override
	public void validateMobile_no(long mblno) {
		String num =mblno+"";
		for(int i=0;i<num.length();i++)
		{
		if (num.charAt(0)=='9'||num.charAt(0)=='8'||num.charAt(0)=='7'||num.charAt(0)=='6'&&num.length()==10) {
			
			sign1.setMobile_no(mblno);
		}
		else
		 {
			 System.err.println("enter the valid phone num.. The num should start from 9 or 8 or 7 or 6 and it Should be 10 characters");
			 System.err.println("enter the valid num");
			 long vNum=sc.nextLong();
			 validateMobile_no(vNum);
		 }
	}
		
	}
	@Override
	public void validateGender(String gender) {
		if (gender.equalsIgnoreCase("male")||gender.equalsIgnoreCase("female")||gender.equalsIgnoreCase("others")) {
			sign1.setGender(gender);
			
		}
		else
		{
			System.out.println("please enter the correct gender");
			String vgender=sc.next();
			validateGender(vgender);
		}
	}
		
	
	@Override
	public void validateGmail(String gmail) {
		String s="@gmail.com";
		int count=0;
		for (int i = 0; i<s.length(); i++) {
			if(gmail.charAt(i)=='@')
			{
				count++;
			}
		}
		if(count==1&&gmail.startsWith(s)==false&&gmail.endsWith(s)==true)
		{
			sign1.setGmail(gmail);
		}
		else
		{
			System.out.println("please enter the valid gmail address");
			String vgm=sc.next();
			validateGmail(vgm);
		}
	}
	@Override
	public void validatePassword(String password) {
		int symbl=0,upper=0,lower=0,num=0;
		for(int i=0;i<password.length();i++)
		{
			char ch=password.charAt(i);
			if(ch>=97&&ch<=122)
			{
				lower++;
			}
			if(ch>=65&&ch<=90)
			{
				upper++;
			}
			if(ch>=48&&ch<=57)
			{
				num++;
			}
			else
			{
				symbl++;
			}
		}
		if(symbl>=1&&upper>=1&&lower>=1&&num>=1&&password.length()==8)
		{
			sign1.setPassword(password);
		}
		else
		{
			System.out.println("the password should contain"
					+ " atleast 1 special char 1 Uppercase 1 lowercase 1 digit and password length should be 8");
			System.out.println("enter the valid password");
			String vPswd=sc.next();
			validatePassword(vPswd);
		}
	}
	@Override
	public void validateDob(String dob) {
		String dmy[]=dob.split("/");
		try
		{
			int date=Integer.parseInt(dmy[0]);
			int month=Integer.parseInt(dmy[1]);
			int year=Integer.parseInt(dmy[2]);
			boolean d=(date>=1&&date<=31)?true:false;
			boolean m=(month>=1&&month<=12)?true:false;
			boolean y=(year>=1980&year<=2006)?true:false;
			if(d&&m&&y)
			{
				sign1.setDob(dob);
			}
			else
			{
				System.out.println("please enter valid date details");
			}
		}
		catch (NumberFormatException e) 
		{
			System.out.println("the dob should not contain any characters only nums\nEnter the valid date ");
			String vdob=sc.next();
			validateDob(vdob);
		}
	}
	@Override
	public void validateAge(int age) {
		if(age>=18&&age<=60)
		{
			sign1.setAge(age);
		}
		else
		{
			System.out.println("age should be between 18 to 60");
			System.out.println("enter the valid details");
			int vAge=sc.nextInt();
			validateAge(vAge);
		}
	}
	@Override
	public void validateAlternate_mobileno(long altmobileno) {
		String num = altmobileno+"";
		if (num.charAt(0)=='9'||num.charAt(0)=='8'||num.charAt(0)=='7'||num.charAt(0)=='6'&&num.length()==10) {
			sign1.setAlternate_mobileno(altmobileno);
		}
		else
		 {
			 System.out.println("enter the valid phone num.. The num should start from 9 or 8 or 7 or 6");
			 System.out.println("enter the valid num");
			 long vNum=sc.nextLong();
			 validateAlternate_mobileno(vNum);
		 }		
	}

	@Override
	public void validateAlternate_gmail(String altgmail) {
		String s="@gmail.com";
		int count=0;
		for(int i=0;i<altgmail.length();i++)
		{
			if(altgmail.charAt(i)=='@')
			{
				count++;
			}
		}
		if(count==1&&altgmail.startsWith(s)==false&&altgmail.endsWith(s)==true)
		{
			if(altgmail.equals(sign1.getGmail()))
			{
				System.out.println("the altgmail and gmail should not be same\nPlease enter the another gmail");
				String atlGma=sc.next();
				validateAlternate_gmail(atlGma);
			}
			else
			{
				sign1.setAlternate_gmail(altgmail);
			}
		}
		else
		{
			System.out.println("please enter the valid gmail address");
			String vgm=sc.next();
			validateAlternate_gmail(vgm);
		}
		
	}

	
	
}
