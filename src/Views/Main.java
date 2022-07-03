package Views;

import Presenter.Presenter;
import Views.Body.Body;
import Views.Header.Header;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    private JMainPanel jMainPanel;
    public Main (ActionListener actionListener){
        configMain();
        createComponents(actionListener);
        this.setVisible(true);
    }

    private void configMain() {
        setTitle("NFA");
        setExtendedState(MAXIMIZED_BOTH);
        this.setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void createComponents(ActionListener actionListener){
        jMainPanel = new JMainPanel(actionListener);
        this.getContentPane().add(jMainPanel,BorderLayout.CENTER);
    }

}
