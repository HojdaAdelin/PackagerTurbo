package Functions;
import java.awt.Desktop;
import java.net.URI;

public class LinkOpener {

    public void openLink(String link) {
        try {

            URI uri = new URI(link);


            Desktop desktop = Desktop.getDesktop();


            if (desktop.isSupported(Desktop.Action.BROWSE)) {

                desktop.browse(uri);
            } else {
                System.out.println("Desktop browsing is not supported.");
            }
        } catch (Exception ex) {
            System.out.println("An error occurred while opening the link: " + ex.getMessage());
        }
    }

}
