package models;


import java.util.ArrayList;
import java.util.List;

public class Manager {

    private State stateInitial;
    private List<State> stateList;

    public Manager() {
        stateList = new ArrayList<State>();
    }



    public State getStateInitial() {
        return stateInitial;
    }

    public void setStateInitial(State stateInitial) {
        this.stateInitial = stateInitial;
    }

    public List<State> getStateList() {
        return stateList;
    }

    public void setStateList(List<State> stateList) {
        this.stateList = stateList;
    }
}
