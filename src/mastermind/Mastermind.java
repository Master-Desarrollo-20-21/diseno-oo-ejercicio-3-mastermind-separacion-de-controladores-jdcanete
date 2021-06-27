package mastermind;

import mastermind.controllers.Logic;
import mastermind.controllers.Controller;
import mastermind.models.Game;
import mastermind.views.View;

abstract class Mastermind {

    private Logic logic;

    private View view;

    protected Mastermind() {
        logic = new Logic(new Game());
        view = this.createView();
    }

    protected abstract View createView();

    public void play() {
        Controller controller;
        do {
            controller = logic.getController();
            controller.accept(view);
        } while(logic.getController() != null);
        
    }

}