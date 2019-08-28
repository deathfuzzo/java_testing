package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class ApplicationManager {
  WebDriver driver;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;
  private SessionHelper sessionHelper;
  public Map<String, Object> vars;
    JavascriptExecutor js;

    public void init() {
      driver = new FirefoxDriver();
      js = (JavascriptExecutor) driver;
      vars = new HashMap<String, Object>();
      driver.get("http://localhost/addressbook/");
      groupHelper = new GroupHelper(driver);
      navigationHelper = new NavigationHelper(driver);
      sessionHelper = new SessionHelper(driver);
      sessionHelper.login("admin", "secret");
    }



  public void stop() {
      driver.quit();
    }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
