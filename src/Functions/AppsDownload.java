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

    public void vsLink() throws Exception {

        String link = "https://code.visualstudio.com/download";
        Desktop vsdesktop = Desktop.getDesktop();

        if (Desktop.isDesktopSupported() && vsdesktop.isSupported(Desktop.Action.BROWSE)) {
            URI uri = new URI(link);
            vsdesktop.browse(uri);
        } else {
            throw new UnsupportedOperationException("Opening links is not supported on this platform.");
        }

    }
}
