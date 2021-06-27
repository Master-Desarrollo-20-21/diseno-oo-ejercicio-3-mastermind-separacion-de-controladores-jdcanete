package mastermind.models;

public class State {
    
    private StateValue stateValue;

    public State() {
        stateValue = StateValue.INITIAL;
    }

    public void next() {
        stateValue = StateValue.values()[stateValue.ordinal() + 1];
    }

    public void reset() {
        stateValue = StateValue.IN_GAME;
    }

    public Object getStateValue() {
        return stateValue;
    }
}
