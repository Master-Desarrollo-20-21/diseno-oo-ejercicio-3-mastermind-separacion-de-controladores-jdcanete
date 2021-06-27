package mastermind.controllers;

import mastermind.models.Game;
import mastermind.models.ProposedCombination;
import mastermind.models.Result;
import mastermind.models.State;

public abstract class ShowBoardController extends Controller {

    protected ShowBoardController(Game game, State state) {
        super(game, state);
    }
    
    public Result getResult(int index) {
        return game.getResult(index);
    }

    public int getAttemps() {
        return game.getAttemps();
    }

    public ProposedCombination getProposedCombination(int index) {
        return game.getProposedCombination(index);
    }
}
