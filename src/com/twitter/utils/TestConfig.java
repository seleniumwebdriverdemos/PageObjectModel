package com.twitter.utils;


public class TestConfig{


	// Email Sending 
	public static String server="smtp.gmail.com";
	public static String from = "kapilan.ks18@gmail.com";
	public static String password = "******";
	public static String[] to ={"seleniumwebdriver.demos@gmail.com","kapilan.ks18@gmail.com"};
	public static String subject = "TestEmailSending";
	
	public static String messageBody ="TestEmail";
	public static String attachmentPath="C:\\Selenium\\screenshot\\abc.png";
	public static String attachmentName="reports";
	
	
	
	//SQL DATABASE DETAILS	
	public static String driver="net.sourceforge.jtds.jdbc.Driver"; 
	public static String dbConnectionUrl="jdbc:jtds:sqlserver://192.101.44.22;DatabaseName=monitor_eval"; 
	public static String dbUserName="sa"; 
	public static String dbPassword="$ql$!!1"; 
	
	
	//MYSQL DATABASE DETAILS
	public static String mysqldriver="com.mysql.jdbc.Driver";
	public static String mysqluserName = "root";
	public static String mysqlpassword = "selenium";
	public static String mysqlurl = "jdbc:mysql://localhost:3306/seleniumwebdriver";
	
	
	
	
	
	
	
	
	
}
