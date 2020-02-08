package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class UploadFilePage {

    private SelenideElement uploadedFileName = $("#fileName");

    public void uploadFile() {
        $("#fileToUpload").uploadFromClasspath("files/googlePic.png");
    }
}
