package mastermind.controllers;

import mastermind.models.Game;
import mastermind.models.State;

public class ResumeController extends Controller {

    public ResumeController(Game game, State state) {
        super(game, state);
    }

    @Override
    public void accept(VisitorController visitorController) {
        visitorController.visit(this);
    }

    public void reset() {
        state.reset();
    }
    
}
