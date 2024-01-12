package lv.acodemy.utlis;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assertion {
    WebDriver driver = LocalDriverManager.getInstance();
    private final By progressAssertion = By.xpath("//h2[@class='p-2 border-y border-gray-300 text-center text-5xl']");
    private final By completeAssertion = By.xpath("//h2[@class='p-2 border-y border-gray-300 text-center text-5xl']");
    String actualText;

    public String checkProgress() {
        try {
            WebElement progressElement = driver.findElement(progressAssertion);
            actualText = progressElement.getText();
        } catch (NoSuchElementException e) {
            actualText = "";
        }
        return actualText;
    }
    public String checkComplete() {
        try {
            WebElement progressElement = driver.findElement(progressAssertion);
            actualText = progressElement.getText();
        } catch (NoSuchElementException e) {
            actualText = "";
        }
        return actualText;
    }


}
