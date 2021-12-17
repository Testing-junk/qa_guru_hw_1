package epic.mytester;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.WithText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstSimpleTest {
    @BeforeAll
    static void maximizeScreen() {
        Configuration.browserSize= "1920x1080";
    }


    @Test
    void firstSelenideTest() {
    open("https://demoqa.com/text-box");
    $("[id=userName]").setValue("John Doe");
    $("#userEmail").setValue("john@gmail.com");
    $("#currentAddress").setValue("Zemgala 68");
    $("#permanentAddress").setValue("Zemgala 15");
    $("#submit").scrollTo().click();

    $("#output").shouldBe(visible);
    $("#name").shouldHave(text("John Doe"));
    $("#email").shouldHave(text("john@gmail.com"));
    $("#output").$("#currentAddress").shouldHave(text("Zemgala 68"));
    $("#output").$("#permanentAddress").shouldHave(text("Zemgala 15"));


    }


}
