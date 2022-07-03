package Views.Header;

import Views.Constant;
import Views.Models.JModelLabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Header extends JPanel {

    private JMainMenu jMainMenu;
    private JModelLabel jMLBanner;

    public Header(ActionListener actionListener){
        this.setBackground(Constant.COLOR_WHITE);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        initComponents(actionListener);
    }

    private void initComponents(ActionListener actionListener) {
        jMainMenu = new JMainMenu(actionListener);
        this.add(jMainMenu);
    }

}
