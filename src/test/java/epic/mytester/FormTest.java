package epic.mytester;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.WithText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

public class FormTest {
    @BeforeAll
    static void maximizeScreen() {
        // Configuration.browserSize= "1920x1080";
    }


    @Test
    void formTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("John");
        $("#lastName").setValue("Doe");
        $("#userEmail").setValue("johndoe@gmail.com");
        $(byText("Male")).click();
        $("#userNumber").setValue("7937711117");
        $("#dateOfBirthInput").setValue("1 Jan 2000");
        $("#subjectsInput").setValue("Math, History, Geography");
        $(byText("Sports")).click();
        $(byText("Reading")).click();
        $(byText("Music")).click();
        $("#uploadPicture").uploadFile(new File("upload.txt"));
        $("#currentAddress").setValue("Moscow, Zelenaya, 12-5");
        $("#react-select-3-input").setValue("NCR");
        $("#react-select-4-input").setValue("Delhi");



    }


}

