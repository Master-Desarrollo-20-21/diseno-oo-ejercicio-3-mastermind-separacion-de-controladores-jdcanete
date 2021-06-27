package mastermind.views;

import mastermind.controllers.VisitorController;

public interface View extends VisitorController{

    /* private PlayView playView;

    private ResumeView resumeView;

    private Game game;

    public View(Game game) {
        this.game = game;
        this.playView = new PlayView(this.game);
        this.resumeView = new ResumeView(this.game);
    }

    public void interact() {
        new StartView().write();
        do {
            playView.interact();
            resumeView.interact();
        } while(resumeView.isResumed());
    }
 */
}
