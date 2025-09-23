package ru.ifellow.mahmutov;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import ru.ifellow.mahmutov.web.LoginPage;
import ru.ifellow.mahmutov.web.WorkPage;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest {

    private LoginPage loginPage;
    private WorkPage workPage;

    @BeforeEach
    void setUp() {
        Configuration.browser = "chrome";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        Configuration.pageLoadStrategy = "normal";

        loginPage = new LoginPage();
        workPage = new WorkPage();
    }

    @AfterEach
    void tearDown() {
        closeWebDriver();
    }

    @Test
    void successfulLoginTest() {
        loginPage.openLoginPage();
        loginPage.loginAs("AT11", "Qwerty123");
        String actualLoginValue = loginPage.getUsername();
        assertEquals("AT11", actualLoginValue, "Логин введен неверно");
    }

    @Test
    void task2Test() {
        loginPage.openLoginPage();
        loginPage.loginAs("AT11", "Qwerty123");

        workPage.clickProjectButton();
        workPage.clickProjectButtonTest();
    }

    @Test
    void task3Test() {
        loginPage.openLoginPage();
        loginPage.loginAs("AT11", "Qwerty123");

        workPage.clickProjectButton();
        workPage.clickProjectButtonTest();

        int firstCount = workPage.getCount();
        workPage.clickNewTaskButton();
        workPage.clickAndPutValueInSummary();
        workPage.createIssue();
        refresh();
        int secondCount = workPage.getCount();
        Assertions.assertTrue(secondCount > firstCount);
    }

    @Test
    void task4Test() {
        loginPage.openLoginPage();
        loginPage.loginAs("AT11", "Qwerty123");

        workPage.clickProjectButton();
        workPage.clickProjectButtonTest();

        int firstCount = workPage.getCount();
        workPage.clickNewTaskButton();
        workPage.clickAndPutValueInSummary();
        workPage.createIssue();
        refresh();
        int secondCount = workPage.getCount();
        //Assertions.assertTrue(secondCount > firstCount);

        String status = workPage.getStatusInfo();
        String version = workPage.getVersionInfo();
        Assertions.assertEquals("СДЕЛАТЬ", status);
        Assertions.assertEquals("Version 2.0", version);

    }
    @Test
    void task5Test() {
        loginPage.openLoginPage();
        loginPage.loginAs("AT11", "Qwerty123");

        workPage.clickProjectButton();
        workPage.clickProjectButtonTest();

        int firstCount = workPage.getCount();
        workPage.clickNewTaskButton();
        workPage.clickAndPutValueInSummary();
        workPage.createIssue();
        refresh();
        int secondCount = workPage.getCount();
        //Assertions.assertTrue(secondCount > firstCount);

        String status = workPage.getStatusInfo();
        String version = workPage.getVersionInfo();
        Assertions.assertEquals("СДЕЛАТЬ", status);
        Assertions.assertEquals("Version 2.0", version);

        workPage.clickNewTaskButton();
        workPage.VisualButtonIsPressed();
        workPage.clickAndPutValueInSummary();
        //нужен скрол
        workPage.clickTaskType();
        workPage.setOpisanie("Баг");
        workPage.clickVersion1();
        workPage.setPriority();
        workPage.clickMenuIcon();
    }
}
