package mastermind.controllers;

import mastermind.models.Game;
import mastermind.models.State;

public class StartController extends ShowBoardController {

    public StartController(Game game, State state) {
        super(game, state);
    }

    @Override
    public void accept(VisitorController visitorController) {
        visitorController.visit(this);
    }

}