package lv.acodemy;

import lv.acodemy.utlis.LocalDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Buttons {
    WebDriver driver = LocalDriverManager.getInstance();
    private final By activateButton=By.xpath("//button[text()='Activate']");
    private final By progressButton=By.xpath("//button[text()='Progress']");
    private final By completeButton=By.xpath("//button[text()='Complete']");
    private final By deleteButton=By.xpath("//button[text()='Delete']");

    public void useActivationButton(){
        driver.findElement(activateButton).click();
    }
    public void useProgressButton(){
        driver.findElement(progressButton).click();
    }
    public void useCompleteButton(){
        driver.findElement(completeButton).click();
    }
    public void useDeleteButton(){
        driver.findElement(deleteButton).click();
    }





}
