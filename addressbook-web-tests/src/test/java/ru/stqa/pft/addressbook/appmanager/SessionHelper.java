package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper {
  WebDriver driver;
  public SessionHelper (WebDriver driver) {
    this.driver = driver;
  }
  public void login(String username, String password) {
    driver.findElement(By.name("user")).sendKeys(username);
    driver.findElement(By.name("pass")).sendKeys(password);
    driver.findElement(By.xpath("//form[@id=\'LoginForm\']/input[3]")).click();
  }
}
