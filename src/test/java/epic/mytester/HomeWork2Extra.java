package epic.mytester;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HomeWork2Extra {

    @Test
    void HomeWork2Extra() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        // $("#column-a").dragAndDropTo("#column-b");
        // $("#column-a").shouldHave(text("B"));

        SelenideElement elementA = $("#column-a");
        SelenideElement elementB = $("#column-b");
        actions().dragAndDrop(elementA, elementB);       }

    }
