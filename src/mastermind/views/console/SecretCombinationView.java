package mastermind.views.console;

import mastermind.models.Combination;
import mastermind.views.Message;
import utils.Console;

public class SecretCombinationView {

    public void write() {
        Console console = new Console();
        for(int i = 0; i < Combination.SIZE; i++) {
            console.write(Message.SECRET_COMBINATION.getMessage());
        }
        console.writeln();
    }

}
