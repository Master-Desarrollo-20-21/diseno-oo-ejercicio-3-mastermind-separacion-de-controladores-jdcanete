package mastermind.views.console;

import mastermind.controllers.ProposeCombinationController;
import mastermind.models.ProposedCombination;

public class PlayView {

    public void interact(ProposeCombinationController proposeCombinationController) {
        do {
            ProposedCombination proposedCombination = new ProposedCombinationView().read();
            proposeCombinationController.addProposedCombination(proposedCombination);
            new BoardView().write(proposeCombinationController);
        } while(!proposeCombinationController.isOver());
        new WinnerLooserView().write(proposeCombinationController);
        proposeCombinationController.nextState();
    }

}
