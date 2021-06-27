package mastermind.views.console;

import mastermind.controllers.ProposeCombinationController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.StartController;
import mastermind.views.View;

public class ConsoleView implements View {

    private StartView startView;

    private PlayView playView;

    private ResumeView resumeView;

    public ConsoleView() {
        startView = new StartView();
        playView = new PlayView();
        resumeView = new ResumeView();
    }

    @Override
    public void visit(StartController startController) {
        startView.interact(startController);
    }

    @Override
    public void visit(ProposeCombinationController proposeCombinationController) {
        playView.interact(proposeCombinationController);
    }

    @Override
    public void visit(ResumeController resumeController) {
        resumeView.interact(resumeController);
    }
    
}
