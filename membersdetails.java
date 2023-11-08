package House_Estate_management_system;

import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class membersdetails {
    public static void main(String[] args) {
        // Create and set the custom icon for the application
        ImageIcon icon = new ImageIcon("image.png"); // Replace "your_image.png" with the actual image path

        // Set the custom look and feel (optional)
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Create an instance of addmember and other necessary classes
        addmember add = new addmember();
        add.appartmentdetails.add(new holder_details("Name", "Flat", "Mobile No", false, false, false, false, false, false, false, false));
        add.appartmentdetails.add(new holder_details("Narayana", "3B1", "6309559251", true, false, true, true, true, false, false, true));
        add.appartmentdetails.add(new holder_details("Jayanth", "3B2", "9734864773", true, false, true, true, true, false, false, true));
        add.appartmentdetails.add(new holder_details("Charan", "3B3", "9364738648", true, false, true, true, true, false, false, true));

        MainPage page = new MainPage();
        editservices edi = new editservices();
        page.setVisible(true);

        // Set the custom icon for the main frame
        page.setIconImage(icon.getImage());
    }
}
