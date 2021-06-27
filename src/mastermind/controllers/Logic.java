package mastermind.controllers;

import java.util.HashMap;
import java.util.Map;

import mastermind.models.Game;
import mastermind.models.StateValue;
import mastermind.models.State;

public class Logic {

    private State state;
    
    private Map<StateValue, Controller> controllers;

    public Logic(Game game) {
        state = new State();
        controllers = new HashMap<>();
        controllers.put(StateValue.INITIAL, new StartController(game, state));
        controllers.put(StateValue.IN_GAME, new ProposeCombinationController(game, state));
        controllers.put(StateValue.OUT_GAME, new ResumeController(game, state));
        controllers.put(StateValue.EXIT, null);
    }

    public Controller getController() {
        return controllers.get(state.getStateValue());
    }
}
