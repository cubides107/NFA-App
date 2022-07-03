package Views.Body;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Body extends JPanel {
    public Body(ActionListener actionListener) {
        configBody();
        createComponents();
    }

    private void configBody() {
        setLayout(new BorderLayout());
    }

    private void createComponents() {
    }
}
