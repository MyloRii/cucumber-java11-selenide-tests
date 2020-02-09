package steps;

import io.cucumber.java.en.And;
import lombok.AllArgsConstructor;
import pages.FileDownloadPage;

@AllArgsConstructor
public class FileDownloadSteps {

    private FileDownloadPage fileDownloadPage;

    @And("User downloads file")
    public void userDownloadsFile() {
        fileDownloadPage.downloadFile();
    }
}
