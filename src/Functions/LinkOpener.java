package Functions;
import java.awt.Desktop;
import java.net.URI;

public class LinkOpener {

    public void openLink(String link) {
        try {
            // Create a URI object from the link string
            URI uri = new URI(link);

            // Get the desktop instance
            Desktop desktop = Desktop.getDesktop();

            // Check if desktop is supported
            if (desktop.isSupported(Desktop.Action.BROWSE)) {
                // Open the link in the default browser
                desktop.browse(uri);
            } else {
                System.out.println("Desktop browsing is not supported.");
            }
        } catch (Exception ex) {
            System.out.println("An error occurred while opening the link: " + ex.getMessage());
        }
    }

}
