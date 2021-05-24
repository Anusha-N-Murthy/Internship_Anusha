package com.abc.seleniuntest;


import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) 
	{
		
		//Step 1 : launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//Step 2 : navigate to gmail application
		driver.get("https://www.gmail.com");
		
		//Step 3 : get the title of gmail application
		String title = driver.getTitle();
		
		//Step 4 : print the title of gmail application
		System.out.println(title);
	}
}
