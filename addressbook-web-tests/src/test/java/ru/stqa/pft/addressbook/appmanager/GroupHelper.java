package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper {
  public WebDriver driver;

  public GroupHelper(WebDriver driver) {
    this.driver = driver;
  }

  public void returnToGroupPage() {
    click(By.linkText("group page"));
  }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  private void click(By locator) {
    driver.findElement(locator).click();
  }

  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }

  private void type(By locator, String text) {
    click(locator);
    driver.findElement(locator).clear();
    driver.findElement(locator).sendKeys(text);
  }

  public void initGroupCreation() {
    click(By.xpath("//div[@id=\'content\']/form/input[4]"));
  }

  public void deleteGroup() {
    click(By.xpath("(//input[@name=\'delete\'])[2]"));
  }

  public void selectGroup() {
    click(By.xpath("(//input[@name=\'selected[]\'])[15]"));
  }
}
