import lombok.extern.slf4j.Slf4j;
import lv.acodemy.Buttons;
import lv.acodemy.AddPage;
import lv.acodemy.EditPage;
import lv.acodemy.utlis.Assertion;
import lv.acodemy.utlis.Constant;
import lv.acodemy.utlis.LocalDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.time.Duration;

import static java.time.Duration.ofSeconds;
import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class TodoTest {
    WebDriver driver = LocalDriverManager.getInstance();
    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    AddPage addPage;
    EditPage editPage;
    Buttons buttons;
    Assertion assertion;
    Constant constant;




    @BeforeMethod
    public void beforeTest() {
        driver = LocalDriverManager.getInstance();
        //wait = new WebDriverWait(driver, ofSeconds(getConfiguration().getLong("wait.time")));
        addPage = new AddPage();
        editPage=new EditPage();
        buttons=new Buttons();
        assertion=new Assertion();
        constant=new Constant();
    }


    //Не знаю как сделать чтобы это работало в разных тестах, поскольку браузер открывается
    //в инкогнито и записанные таски не сохраняются

    String yourTodo="cat";
    String newTodo="dog";

    @Test()
    public void fullTest() {

        driver.get("https://goals-tasks-todos.netlify.app/");
        addPage.addTaskButton();
        addPage.setAddTask(yourTodo);
        ////////////////////
        editPage.editExistedText(newTodo);
        buttons.useActivationButton();
        buttons.useProgressButton();
        String actualText=assertion.checkProgress();
        //String expectedText =Constant.expectedText;
        assertThat(actualText).isEqualTo(Constant.expectedText);
        buttons.useCompleteButton();
        String completeText=assertion.checkComplete();
       // String expectedCompleteText=Constant.expectedCompleteText;
        assertThat(completeText).isEqualTo(Constant.expectedCompleteText);
        buttons.useDeleteButton();


        System.out.println(" daws");
    }



    @AfterMethod
    public void tearDown() {
        LocalDriverManager.closeDriver();
    }


}







