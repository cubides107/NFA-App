package Views.Header;


import Views.Constant;
import Views.Models.JModelMenu;
import Views.Models.JModelMenuItem;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class JMainMenu extends JMenuBar {

    //Menus principales
    private JModelMenu menuFile,menuInput,menuHelp;

    //Sub menus de File
    private JModelMenuItem menuItemOpen,menuItemSave,menuItemSaveAs,menuItemClose;
    //Sub menus de Input
    private JModelMenuItem menuItemStepByState,menuItemValidateWord;
    //Sub menus de Help
    private JModelMenuItem menuItemHelp,menuItemAbout;

    public JMainMenu(ActionListener actionListener){
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setBorder(new EmptyBorder(10,10,10,10));
        this.setBackground(Constant.COLOR_WHITE);
        initComponents(actionListener);
    }


    private void initComponents(ActionListener actionListener) {
        menuFile = new JModelMenu("File",Constant.COLOR_WHITE,Constant.COLOR_BLACK,Constant.FONT_NEW_ROMAN_25);
        this.add(menuFile);
    }

}
