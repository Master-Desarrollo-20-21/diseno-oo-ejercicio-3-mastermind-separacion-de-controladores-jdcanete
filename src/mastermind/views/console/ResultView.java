package mastermind.views.console;

import mastermind.models.Result;
import mastermind.views.Message;
import utils.Console;

public class ResultView {

    public void write(Result result) {
        new Console().writeln(Message.RESULTS.getMessage()
            .replace("#blacks", result.getBlacks() + "")
            .replace("#whites", result.getWhites() + ""));
    }

}
