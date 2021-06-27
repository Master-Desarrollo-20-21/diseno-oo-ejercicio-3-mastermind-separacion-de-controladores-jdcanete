package mastermind.controllers;

public interface VisitorController {
    
    void visit(StartController startController);

    void visit(ProposeCombinationController proposeCombinationController); 

    void visit(ResumeController resumeController); 
}
