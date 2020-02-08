package pages;

import lombok.SneakyThrows;

import java.io.File;

import static com.codeborne.selenide.Selenide.download;

public class FileDownloadPage {

    @SneakyThrows
    public File downloadFile() {
        String downloadURL = "https://www.google.com/images/srpr/logo11w.png";
        return download(downloadURL);
    }
}
