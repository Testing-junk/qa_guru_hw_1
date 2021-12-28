package epic.mytester;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HomeWork2 {

    @Test

    void homeWork2() {
    open("https://github.com/selenide/selenide");
    $$("span.css-truncate").findBy(text("config")).click();




    }
}
