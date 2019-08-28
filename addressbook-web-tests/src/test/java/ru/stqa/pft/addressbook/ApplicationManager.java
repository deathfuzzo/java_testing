package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class ApplicationManager {
    protected WebDriver driver;
    protected Map<String, Object> vars;
    JavascriptExecutor js;

    protected void init() {
      driver = new FirefoxDriver();
      js = (JavascriptExecutor) driver;
      vars = new HashMap<String, Object>();
      driver.get("http://localhost/addressbook/");
      login("admin", "secret");
    }

    protected void login(String username, String password) {
      driver.findElement(By.name("user")).sendKeys(username);
      driver.findElement(By.name("pass")).sendKeys(password);
      driver.findElement(By.xpath("//form[@id=\'LoginForm\']/input[3]")).click();
    }

    protected void returnToGroupPage() {
      driver.findElement(By.linkText("group page")).click();
    }

    protected void submitGroupCreation() {
      driver.findElement(By.name("submit")).click();
    }

    protected void fillGroupForm(GroupData groupData) {
      driver.findElement(By.name("group_name")).click();
      driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
      driver.findElement(By.name("group_header")).click();
      driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
      driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    protected void initGroupCreation() {
      driver.findElement(By.xpath("//div[@id=\'content\']/form/input[4]")).click();
    }

    protected void gotoGroupPage() {
      driver.findElement(By.linkText("groups")).click();
    }

    protected void stop() {
      driver.quit();
    }

    protected void deleteGroup() {
      driver.findElement(By.xpath("(//input[@name=\'delete\'])[2]")).click();
    }

    protected void selectGroup() {
      driver.findElement(By.xpath("(//input[@name=\'selected[]\'])[15]")).click();
    }
}
