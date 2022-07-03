package Presenter;

import Views.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Presenter implements ActionListener {

    private Main main;

    public Presenter(){
        main = new Main(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
