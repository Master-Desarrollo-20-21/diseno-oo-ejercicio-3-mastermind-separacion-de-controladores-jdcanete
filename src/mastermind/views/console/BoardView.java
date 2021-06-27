package mastermind.views.console;

import mastermind.controllers.ShowBoardController;
import mastermind.views.Message;
import utils.Console;

public class BoardView {

    public void write(ShowBoardController showBoardController) {
        new Console().writeln(Message.ATTEMPTS.getMessage().replace("#attempts", showBoardController.getAttemps() + ""));
        new SecretCombinationView().write();
        for(int i = 0; i < showBoardController.getAttemps(); i++) {
            new ProposedCombinationView(showBoardController.getProposedCombination(i)).write();
            new ResultView().write(showBoardController.getResult(i));
        }
    }

}
