package epic.mytester;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideOperations {

  @Test

    void selenideOperations() {

    // First Form
    open("https://developer.mozilla.org/en-US/docs/Learn/Server-side/Django/Introduction");
    $("#where_did_it_come_from").click();
    $(byText("release notes")).click();
    $(byText("Django 4.0.1 release notes")).click();
    $(withText("33346")).click();
    $("#h_severity").click();
    Selenide.back();
    $("#id_q").setValue("go");
    $("button").click();






  }

}
