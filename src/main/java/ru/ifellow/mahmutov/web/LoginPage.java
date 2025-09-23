package ru.ifellow.mahmutov.web;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class LoginPage {
    private SelenideElement usernameInput = $("#login-form-username");
    private SelenideElement passwordInput = $("#login-form-password");
    private SelenideElement loginButton = $("#login");

    public void openLoginPage() {
        open("https://edujira.ifellow.ru");
    }

    public void enterUsername(String username) {
        usernameInput.shouldBe(Condition.visible).setValue(username);
    }

    public void enterPassword(String password) {
        passwordInput.shouldBe(Condition.visible).setValue(password);
    }

    public void clickLoginButton() {
        loginButton.shouldBe(Condition.visible).click();
    }

    public String getUsername() {
        return usernameInput.shouldBe(visible).getValue();
    }

    public void loginAs(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }
}
