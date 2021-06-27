package mastermind.views;

public abstract class ErrorView {

    protected static final String[] MESSAGES = {
        "Wrong proposed combination length",
        "Wrong colors, they must be: rgybmc",
        "Wrong colors, they must be not duplicated"
    };

    protected Error error;

    protected ErrorView(Error error) {
        this.error = error;
    }

    public abstract void write();

}
