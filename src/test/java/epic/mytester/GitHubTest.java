package epic.mytester;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GitHubTest {

    @Test
    void gitHubTest() {

        open("https://github.com/");
        //$("[data-test-selector=nav-search-input]").setValue("loving joe").pressEnter();
        $("input.form-control").setValue("google").pressEnter();
        $$("div.f4 a").findBy(text("google/googletest")).click();
        $(byText("googletest")).click();
        $("h1").$("strong.mr-2").$("a").shouldHave(text("googletest"));
        $$("a.js-navigation-open").find(text("docs")).click();
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        // $("div.px-2 h3").shouldHave(text("We couldn\'t find any code matching 'selenide' in google/googletest"));
        // how to handle Selenide.closeWindow if it closes current?
        // cannot click button in GitHub Search box. How?





    }

}
