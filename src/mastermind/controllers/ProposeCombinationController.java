package mastermind.controllers;

import mastermind.models.Game;
import mastermind.models.ProposedCombination;
import mastermind.models.State;

public class ProposeCombinationController extends ShowBoardController {

    protected ProposeCombinationController(Game game, State state) {
        super(game, state);
    }

    @Override
    public void accept(VisitorController visitorController) {
        visitorController.visit(this);
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        game.addProposedCombination(proposedCombination);
    }

    public boolean isOver() {
        return game.isOver();
    }

    public boolean isWinner() {
        return game.isWinner();
    }
    
}
