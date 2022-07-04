package Views.Header;


import Presenter.Command;
import Views.Constant;
import Views.Models.JModelMenu;
import Views.Models.JModelMenuItem;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

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
        //Add menu File
        menuFile = new JModelMenu("File",Constant.IMG_PATH_FILE,Constant.COLOR_WHITE,Constant.COLOR_BLACK,Constant.FONT_ARIAL_ROUNDER_17,30,30);

        menuItemOpen = new JModelMenuItem("Open",Constant.FONT_ARIAL_ROUNDER_15,Constant.COLOR_WHITE,Constant.COLOR_BLACK);
        menuItemOpen.addActionListener(actionListener);
        menuItemOpen.setActionCommand(Command.OPEN.toString());
        menuItemOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        menuFile.add(menuItemOpen);

        menuItemSave = new JModelMenuItem("Save",Constant.FONT_ARIAL_ROUNDER_15,Constant.COLOR_WHITE,Constant.COLOR_BLACK);
        menuItemSave.addActionListener(actionListener);
        menuItemSave.setActionCommand(Command.SAVE.toString());
        menuItemSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        menuFile.add(menuItemSave);

        menuItemSaveAs = new JModelMenuItem("Save As",Constant.FONT_ARIAL_ROUNDER_15,Constant.COLOR_WHITE,Constant.COLOR_BLACK);
        menuItemSaveAs.addActionListener(actionListener);
        menuItemSaveAs.setActionCommand(Command.SAVE_AS.toString());
        menuItemSaveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.ALT_DOWN_MASK));
        menuFile.add(menuItemSaveAs);

        menuItemClose = new JModelMenuItem("Close",Constant.FONT_ARIAL_ROUNDER_15,Constant.COLOR_WHITE,Constant.COLOR_BLACK);
        menuItemClose.addActionListener(actionListener);
        menuItemClose.setActionCommand(Command.EXIT.toString());
        menuItemClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_DOWN_MASK));
        menuFile.add(menuItemClose);
        this.add(menuFile);

        this.add(Box.createRigidArea(new Dimension(30,0)));
        //Add menu Imput

        menuInput = new JModelMenu("Imput",Constant.IMG_PATH_INPUT,Constant.COLOR_WHITE,Constant.COLOR_BLACK,Constant.FONT_ARIAL_ROUNDER_17,30,30);

        menuItemStepByState = new JModelMenuItem("Step by state",Constant.FONT_ARIAL_ROUNDER_15,Constant.COLOR_WHITE,Constant.COLOR_BLACK);
        menuItemStepByState.addActionListener(actionListener);
        menuItemStepByState.setActionCommand(Command.BY_STATE.toString());
        menuItemStepByState.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_DOWN_MASK));
        menuInput.add(menuItemStepByState);

        menuItemValidateWord = new JModelMenuItem("Validate Word",Constant.FONT_ARIAL_ROUNDER_15,Constant.COLOR_WHITE,Constant.COLOR_BLACK);
        menuItemValidateWord.addActionListener(actionListener);
        menuItemValidateWord.setActionCommand(Command.VALIDATE_WORD.toString());
        menuItemValidateWord.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, InputEvent.CTRL_DOWN_MASK));
        menuInput.add(menuItemValidateWord);

        this.add(menuInput);

        this.add(Box.createRigidArea(new Dimension(30,0)));

        //Add menu Help

        menuHelp = new JModelMenu("Help",Constant.IMG_PATH_HELP,Constant.COLOR_WHITE,Constant.COLOR_BLACK,Constant.FONT_ARIAL_ROUNDER_17,30,30);

        menuItemHelp = new JModelMenuItem("Help...",Constant.FONT_ARIAL_ROUNDER_15,Constant.COLOR_WHITE,Constant.COLOR_BLACK);
        menuItemHelp.addActionListener(actionListener);
        menuItemHelp.setActionCommand(Command.HELP.toString());
        menuHelp.add(menuItemHelp);

        menuItemAbout = new JModelMenuItem("About App...",Constant.FONT_ARIAL_ROUNDER_15,Constant.COLOR_WHITE,Constant.COLOR_BLACK);
        menuItemAbout.addActionListener(actionListener);
        menuItemAbout.setActionCommand(Command.HELP.toString());
        menuHelp.add(menuItemAbout);

        this.add(menuHelp);

        this.add(Box.createRigidArea(new Dimension(30,0)));

        //Close

        menuItemClose = new JModelMenuItem("Exit",Constant.IMG_PATH_CLOSE,Constant.FONT_ARIAL_ROUNDER_17,30,30,Constant.COLOR_WHITE,Constant.COLOR_BLACK);
        menuItemClose.addActionListener(actionListener);
        menuItemClose.setActionCommand(Command.EXIT.toString());
        this.add(menuItemClose);
    }

}
