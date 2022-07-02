package Views.Body;

import Views.Header.Header;

import javax.swing.*;
import java.awt.*;

public class Body extends JPanel {

    private Header header;

    public Body() {
        configBody();
        createComponents();
    }

    private void configBody() {
        setLayout(new BorderLayout());
    }

    private void createComponents() {
        header = new Header();
        add(header, BorderLayout.NORTH);
    }
}
