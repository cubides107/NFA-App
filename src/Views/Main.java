package Views;

import Views.Body.Body;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    private Body body;

    public Main (){
        configMain();
        createComponents();
    }

    private void configMain() {
        setTitle("NFA");
        setExtendedState(MAXIMIZED_BOTH);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void createComponents(){
        body = new Body();
    }

}
