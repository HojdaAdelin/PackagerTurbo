package Functions;
import java.awt.Desktop;
import java.net.URI;

public class AppsDownload {
    public void gitLink() throws Exception {
        String link = "https://git-scm.com/download/win";
        Desktop desktop = Desktop.getDesktop();

        if (Desktop.isDesktopSupported() && desktop.isSupported(Desktop.Action.BROWSE)) {
            URI uri = new URI(link);
            desktop.browse(uri);
        } else {
            throw new UnsupportedOperationException("Opening links is not supported on this platform.");
        }
    }
}
