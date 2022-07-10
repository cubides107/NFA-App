package models;

import java.util.ArrayList;
import java.util.List;

public class State {

    private String name;
    private boolean isFinal;
    private List<Transition> transitionList;

    public State(String name,boolean isFinal) {
        this.name = name;
        this.isFinal = isFinal;
        transitionList = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean aFinal) {
        isFinal = aFinal;
    }

    public List<Transition> getTransitionList() {
        return transitionList;
    }

    public void setTransitionList(List<Transition> transitionList) {
        this.transitionList = transitionList;
    }

    public void addTransition(Transition transition){
        transitionList.add(transition);
    }
}
