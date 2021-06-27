package mastermind.controllers;

import mastermind.models.Game;
import mastermind.models.State;

public abstract class Controller {

    protected Game game;

    protected State state;

    protected Controller(Game game, State state) {
        this.game = game;
        this.state = state;
    }

    public void nextState() {
        state.next();
    }

    public abstract void accept(VisitorController visitorController);
}
