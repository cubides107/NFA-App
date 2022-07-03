package Views;

import Views.Body.Body;
import Views.Header.Header;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class JMainPanel extends JPanel {

    private Body body;
    private Header header;
    public JMainPanel(ActionListener actionListener) {
        this.setBackground(Constant.COLOR_WHITE);
        this.setLayout(new BorderLayout(0,0));
        initComponents(actionListener);
    }

    private void initComponents(ActionListener actionListener) {
        header = new Header(actionListener);
        this.add(header,BorderLayout.NORTH);

        body = new Body(actionListener);
        this.add(body,BorderLayout.CENTER);
    }


}
