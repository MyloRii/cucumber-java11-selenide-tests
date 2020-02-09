package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import pages.HomePage;

import static com.codeborne.selenide.Condition.exist;

@AllArgsConstructor
public class HomePageSteps {

    private HomePage homePage;

    @Given("User is on home page")
    public void userIsOnHOmePage() {
        homePage
                .getHomePageActive()
                .shouldBe(exist);
    }

    @When("Navigates to File -> Upload")
    public void userNavigatesToFileUpload() {
        homePage
                .openFileDD()
                .openUploadFile();
    }

    @When("Navigates to File -> Download")
    public void userNavigatesToFileDownload() {
        homePage
                .openFileDD()
                .openFileDownload();
    }
}
