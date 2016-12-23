package com.twitter.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.twitter.pages.TopNavigation;
import com.twitter.utils.DbManager;
import com.twitter.utils.ExcelReader;



public class Page {
	
	
/*	public static WebDriver driver;
	public static TopNavigation topNav;
	
	public Page(){
		
		if(driver == null){
		driver=new FirefoxDriver();
		driver.get("https://twitter.com/");
		driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
		topNav=new TopNavigation();
		}
	}*/


	public static WebDriver driver;
	public static TopNavigation topNav;
	public static Logger log=Logger.getLogger("devpinoyLogger");
	public static Properties OR;
	public static Properties Config;
	public static ExcelReader excel=null;

	//public static ExcelReader excel=new ExcelReader(System.getProperty("user.dir")+"\\src\\com\\twitter\\properties\\testdata.xlsx");
	
// findElement = driver.findElement(By.xpath(OR.getProperty()
	public static WebElement findElement(String xpath){
		try{
		return driver.findElement(By.xpath(OR.getProperty(xpath)));
		}catch(Throwable t)
		{
			//Capturing Screenshot
			return null;
		}
		
		}
	
	
	
	@BeforeSuite
	public static void setUp() throws IOException, ClassNotFoundException, SQLException{
		
		if(driver==null){
			OR = new Properties();
		
			//System.getProperty("user.dir")+ "\\src\\dd_properties\\OR.Properties"
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\twitter\\properties\\OR.properties");
			OR.load(fis);
			log.debug("Loading Properties File");
			
			Config= new Properties();
			
			 fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\twitter\\properties\\Config.properties");
				Config.load(fis);
			
			if(Config.getProperty("browser").equals("Firefox")){
				
				driver=new FirefoxDriver();
			}else if(Config.getProperty("browser").equals("Chrome")){
				
				System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");				
				driver=new ChromeDriver();
				}else if(Config.getProperty("browser").equals("ie")){
					
					System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
					driver=new InternetExplorerDriver();
					}
			
			driver.get(Config.getProperty("testsiteurl"));
			driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
			topNav=new TopNavigation();
			DbManager.setMysqlDbConnection();
			

	
		}
		
		
	}
	
	@DataProvider
	public static Object[][] getData(String sheetName)
	{
		
	if(excel==null){
		excel=new ExcelReader(System.getProperty("user.dir")+"\\src\\com\\twitter\\properties\\testdata.xlsx");
	}
			
		
		
		int rows= excel.getRowCount(sheetName);
		int cols=excel.getColumnCount(sheetName);
		
		Object[][] data=new Object[rows-1][cols];
		
		for(int rowNum=2; rowNum<=rows; rowNum++)
		{ //2
			
			for(int colNum=0; colNum<cols; colNum++)
			{
				
				data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum);
			}
					
		}
		return data;
		
	}
	


	@AfterSuite
	public static void tearDown(){
		//driver.quit();
	}
	
	
}
