package steps;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class BaseSteps {

    @Before
    public void setup() {
        Configuration.baseUrl = "https://demo.stqatools.com/";
        open("/");
    }

    static <T> T atPage(Class<T> page) {
        return page(page);
    }
}
