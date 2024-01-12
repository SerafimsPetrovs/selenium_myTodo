package lv.acodemy;
import lv.acodemy.utlis.LocalDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddPage {
    WebDriver driver = LocalDriverManager.getInstance();
    private final By addTask=By.xpath("//button[text()='Add New']");
    private final By taskText=By.name("name");
    private final By addText = By.xpath("//button[@class='todo-form__submit h-16 p-4 bg-lime-900 text-white font-medium']");
    public void addTaskButton(){
    driver.findElement(addTask).click();
    }

    public void setAddTask(String input){

        driver.findElement(taskText).sendKeys(input);
        driver.findElement(addText).click();
    }
    public String getInputValue() {
        return driver.findElement(taskText).getAttribute("value");
    }






}
