package mastermind.views;

public enum Error {
    WRONG_LENGTH,
    WRONG_CHARACTERS,
    DUPLICATED,
    NULL;

    public boolean isNull() {
        return this == Error.NULL;
    }
}
