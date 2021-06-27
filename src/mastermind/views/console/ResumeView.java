package mastermind.views.console;

import mastermind.controllers.ResumeController;
import mastermind.views.Message;
import utils.YesNoDialog;

public class ResumeView {

    public void interact(ResumeController resumeController) {
        boolean isResumed = new YesNoDialog().read(Message.RESUME.getMessage());
        if(isResumed) {
            resumeController.reset();
        } else {
            resumeController.nextState();
        }
    }

}
