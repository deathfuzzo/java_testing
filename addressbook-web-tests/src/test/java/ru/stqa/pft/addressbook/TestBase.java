package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;
import java.util.Map;

public class TestBase extends ApplicationManager {

    @BeforeMethod //метод инициализации фикстуры ("фиксации" тестового метода)
  public void setUp() {
    init();
  }

    @AfterMethod //метод завершения фикстуры ("фиксации" тестового метода)
  public void tearDown() {
    stop();
  }

}
