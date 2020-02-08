package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FileDownloadPage;
import pages.HomePage;
import pages.UploadFilePage;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static tests.BaseSteps.atPage;

public class HomePageSteps {

    @Given("User is on home page")
    public void userIsOnHOmePage() {
        atPage(HomePage.class).getHomePageActive().shouldBe(exist);
    }

    @When("Navigates to File -> Upload")
    public void userNavigatesToFileUpload() {
        atPage(HomePage.class)
                .openFileDD()
                .openUploadFile();
    }

    @When("Navigates to File -> Download")
    public void userNavigatesToFileDownload() {
        atPage(HomePage.class)
                .openFileDD()
                .openFileDownload();
    }

    @And("User uploads file")
    public void userUploadsFile() {
        atPage(UploadFilePage.class).uploadFile();
    }

    @And("User downloads file")
    public void userDownloadsFile() {
        atPage(FileDownloadPage.class).downloadFile();
    }

    @Then("File appears as uploaded")
    public void fileIsUploaded() {
        atPage(UploadFilePage.class).getUploadedFileName().shouldBe(visible);
    }
}
