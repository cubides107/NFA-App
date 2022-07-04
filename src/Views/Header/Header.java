package Views.Header;

import Views.Constant;
import Views.Models.JModelLabel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class Header extends JPanel {

    private JMainMenu jMainMenu;
    private JModelLabel jMLBanner;

    public Header(ActionListener actionListener){
        this.setBackground(Constant.COLOR_WHITE);
        this.setLayout(new BorderLayout());
        initComponents(actionListener);
    }

    private void initComponents(ActionListener actionListener) {

        JPanel panelBanner = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelBanner.setBackground(Constant.COLOR_WHITE);
        panelBanner.setBorder(null);
        jMLBanner = new JModelLabel(Constant.IMG_PATH_BANNER,250,35);
        jMLBanner.setBorder(new EmptyBorder(10,10,10,10));
        panelBanner.add(jMLBanner);
        this.add(panelBanner,BorderLayout.WEST);

        jMainMenu = new JMainMenu(actionListener);
        this.add(jMainMenu,BorderLayout.CENTER);
    }

}
