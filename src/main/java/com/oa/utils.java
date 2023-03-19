package com.oa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utils {
    public WebElement waitFindEleByxpath(WebDriver driver, String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, 10, 1);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }

    public WebElement waitFindEleByid(WebDriver driver, String id) {
        WebDriverWait wait = new WebDriverWait(driver, 10, 1);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
    }

    public void clearAndSendKeys(WebDriver driver, String id, String sendKeys) {
        WebElement ele = driver.findElement(By.id(id));
        ele.clear();
        ele.sendKeys(sendKeys);
    }

    public void checkBox(WebDriver driver, String id, String flag) {
        if (flag.equals("Y")) driver.findElement(By.id(id)).click();
    }
}
