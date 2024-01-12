package lv.acodemy;

import lv.acodemy.utlis.LocalDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditPage {
    WebDriver driver = LocalDriverManager.getInstance();

    private final By editButton =By.xpath("//button[@class='p-2 text-xs text-gray-900 hover:bg-gray-700 hover:text-white font-bold flex-1' and text()='Edit']");
    private final By newText=By.cssSelector("textarea.todo-text");
    private final By saveButton=By.xpath("//button[contains(@class, 'p-2') and contains(@class, 'text-sm') and contains(@class, 'text-gray-900') and contains(@class, 'hover:bg-gray-700') and contains(@class, 'hover:text-white') and contains(@class, 'flex-1') and contains(@class, 'rounded-lg') and contains(@class, 'font-bold')]");

    public void editExistedText(String newInput){


        driver.findElement(editButton).click();
       driver.findElement(newText).clear();
       driver.findElement(newText).sendKeys(newInput);
       driver.findElement(saveButton).click();

    }


}
