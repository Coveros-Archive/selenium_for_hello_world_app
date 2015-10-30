package com.coveros.hello_world_selenium;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class SeleniumMain {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		WebDriver driver = new RemoteWebDriver(new URL("http://ec2-52-23-194-123.compute-1.amazonaws.com:4444/wd/hub"), capability);
		
		// And now use this to visit Google
        driver.get("http://ec2-54-172-12-1.compute-1.amazonaws.com:8080/hello-world-1.0.2/");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.tagName("h2"));
        String result = element.getText();
        if (result.contains("Hello World! The even number is:")){
        	System.out.println("It's working!");
        	System.out.println(result);
        }else{
        	System.out.println("It's not working!");
        	System.out.println(result);
        }
	
	}

}
