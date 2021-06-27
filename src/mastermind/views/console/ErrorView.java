package mastermind.views.console;

import mastermind.views.Error;
import utils.Console;

public class ErrorView extends mastermind.views.ErrorView {
   
    protected ErrorView(Error error) {
        super(error);
    }

    @Override
    public void write() {
        new Console().writeln(MESSAGES[error.ordinal()]);
    }

}
