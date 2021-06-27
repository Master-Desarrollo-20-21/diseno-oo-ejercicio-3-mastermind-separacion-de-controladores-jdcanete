package mastermind.views.console;

import mastermind.controllers.ProposeCombinationController;
import mastermind.views.Message;
import utils.Console;

public class WinnerLooserView {

    public void write(ProposeCombinationController proposeCombinationController) {
        Console console = new Console();
        if(proposeCombinationController.isWinner()) {
            console.writeln(Message.WINNER.getMessage());
        } else {
            console.writeln(Message.LOOSER.getMessage());
        }
    }

}
