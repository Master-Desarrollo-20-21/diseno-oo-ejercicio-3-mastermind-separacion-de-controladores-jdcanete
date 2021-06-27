package mastermind.views.console;

import mastermind.controllers.StartController;
import mastermind.views.Message;
import utils.Console;

public class StartView {

    public void interact(StartController startController) {
        new Console().writeln(Message.TITLE.getMessage());
        new BoardView().write(startController);
        startController.nextState();
    }

}
