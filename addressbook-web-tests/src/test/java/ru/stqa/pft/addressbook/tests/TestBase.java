package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

public class TestBase {

  public final ApplicationManager app = new ApplicationManager();

  @BeforeMethod //метод инициализации фикстуры ("фиксации" тестового метода)
  public void setUp() {
    app.init();
  }

    @AfterMethod //метод завершения фикстуры ("фиксации" тестового метода)
  public void tearDown() {
    app.stop();
  }

}

