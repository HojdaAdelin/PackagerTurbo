package Functions;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class AppsDownload {

    public void downloadFile(String fileUrl, String downloadDirectory) throws IOException {
        URL url = new URL(fileUrl);

        String fileName = getFileNameFromUrl(fileUrl);
        String savePath = downloadDirectory + "/" + fileName;

        Path saveDirectory = Path.of(downloadDirectory);
        if (!Files.exists(saveDirectory)) {
            Files.createDirectories(saveDirectory);
        }

        try (BufferedInputStream in = new BufferedInputStream(url.openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(savePath)) {

            byte[] dataBuffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        }
    }

    public String getFileNameFromUrl(String fileUrl) {
        int lastSlashIndex = fileUrl.lastIndexOf("/");
        if (lastSlashIndex != -1 && lastSlashIndex < fileUrl.length() - 1) {
            return fileUrl.substring(lastSlashIndex + 1);
        } else {
            return "";
        }
    }

}
