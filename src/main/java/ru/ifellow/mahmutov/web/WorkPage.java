package ru.ifellow.mahmutov.web;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class WorkPage {

    private SelenideElement projectButton = $x("//*[text()='Проекты']");
    private SelenideElement projectButtonTest = $("#admin_main_proj_link_lnk");
    private SelenideElement taskCounter = $(".showing");
    private SelenideElement newTaskButton = $("#create-menu");
    private SelenideElement summary = $("#summary");
    private SelenideElement createIssue = $("#create-issue-submit");
    private SelenideElement searchField = $("#quickSearchInput");
    private SelenideElement ourTask = $x("//*[@class='quick-search-item-title' and text()='TestSeleniumATHomework']");
    private SelenideElement statusInfo = $x("//*[contains(@class, 'jira-issue-status-lozenge aui-lozenge jira-issue-status-lozenge-blue-gray jira-issue-status-lozenge-new jira-issue-status-lozenge-max-width-medium')]");
    private SelenideElement versionInfo = $("#versions-field");
    private SelenideElement visualButton = $x("//button[text()='Визуальный']");

    private SelenideElement taskType = $("#issuetype-options");
    private SelenideElement opisanie = $("#tinymce");
    private SelenideElement version1Button = $x("//*[text()='Version 1.0']");
    private SelenideElement priority = $("#priority-field");
    private SelenideElement menuIcon = $(".icon.drop-menu.noloading");
    private SelenideElement issueLinks = $("#issuelinks-linktype");
    private SelenideElement assignToMe = $x("//button[text()='Назначить меня']");
    private SelenideElement customField10100 = $("#customfield_10100-field");
    private SelenideElement customField10104 = $("#customfield_10104-field");

    public void clickProjectButton() {
        projectButton.shouldBe(visible).click();
    }

    public void clickProjectButtonTest() {
        projectButtonTest.shouldBe(visible).click();
    }
    public int getCount() {
        String Text = taskCounter.shouldBe(visible).getText();
        return Integer.parseInt(Text.split("из ")[1]);
    }
    public void clickNewTaskButton() {
        newTaskButton.shouldBe(visible).click();
    }
    public void clickAndPutValueInSummary() {
        summary.shouldBe(visible).click();
        summary.setValue("5");
    }
    public void createIssue() {
        createIssue.shouldBe(visible).click();
    }
    public void clickAndPutValueInSearchField() {
        searchField.shouldBe(visible).click();
        searchField.setValue("TestSeleniumATHomework");
        ourTask.shouldBe(visible).click();
    }
    public String getStatusInfo() {
        return statusInfo.shouldBe(visible).getText();
    }

    public String getVersionInfo() {
        return versionInfo.shouldBe(visible).getText();
    }

    public void clickTaskType() {
        taskType.shouldBe(visible).click();
        $x("//*[text()='Ошибка']").click();
    }

    public void setOpisanie(String text) {
        opisanie.setValue(text);
    }

    public void clickVersion1() {
        version1Button.shouldBe(visible).click();
    }

    public void setPriority()
    {
        priority.shouldBe(visible).click();
        $x("//*[text()='High']").shouldBe(visible).click();
    }


    public void clickMenuIcon() {
        menuIcon.shouldBe(visible).click();
        $x("//*[contains(text(),'tratata')]").click();
    }

    public void clickIssueLinks() {
        issueLinks.shouldBe(visible).click();
    }

    public void clickAssignToMe() {
        assignToMe.shouldBe(visible).click();
    }

    public void setCustomField10100(String value) {
        customField10100.setValue(value);
    }

    public void setCustomField10104(String value) {
        customField10104.setValue(value);
    }
    public void VisualButtonIsPressed() {
        if (!visualButton.has(attribute("aria-pressed", "true"))) {
            visualButton.shouldBe(visible).click();
        }
    }
}


