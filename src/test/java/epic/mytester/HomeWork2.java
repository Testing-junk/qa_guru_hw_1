package epic.mytester;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HomeWork2 {

    @Test

    void homeWork2() {
    open("https://github.com/selenide/selenide");
    $$("span.css-truncate").findBy(text("config")).click();
    $("#wiki-tab").click();
    $(byText("Soft assertions")).shouldBe(visible);
    $(byText("Soft assertions")).click();
    $("div.mt-4").find(byText("com.codeborne.selenide.junit5.SoftAssertsExtension")).shouldBe(visible);;





    }
}
