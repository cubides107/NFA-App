package models;

public class Transition {

    private String symbol;
    private State stateTarget;

    public Transition(String symbol, State stateTarget) {
        this.symbol = symbol;
        this.stateTarget = stateTarget;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public State getStateTarget() {
        return stateTarget;
    }

    public void setStateTarget(State stateTarget) {
        this.stateTarget = stateTarget;
    }
}
