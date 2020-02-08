package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class HomePage {

    private SelenideElement homePageActive = $("li.nav-item.active");
    private SelenideElement fileDD = $x("//a[@id='navbarDropdownPortfolio'][contains(text(),'File')]");
    private SelenideElement fileDownloadButton = $x("//*[.='File Download']");
    private SelenideElement fileUpload = $x("//*[.='File Upload']");

    public HomePage openFileDD() {
        fileDD.click();
        return this;
    }

    public FileDownloadPage openFileDownload() {
        fileDownloadButton.waitUntil(visible, 5).click();
        return new FileDownloadPage();
    }

    public UploadFilePage openUploadFile() {
        fileUpload.waitUntil(visible, 5).click();
        return new UploadFilePage();
    }
}
