package racingcar.enums;

public enum Constants {
    NAME_LENGTH(5),
    BLANK_LENGTH(0),
    MIN_NUMBER(0),
    MAX_NUMBER(9),
    MOVE_NUMBER(4),
    NAME_SPLITTER(","),
    FORWARD(1),
    ZERO(0),
    INITIAL_DISTANCE(0),
    ;

    private int number;
    private String message;

    Constants(int number) {
        this.number = number;
    }

    Constants(String message) {
        this.message = message;
    }

    public int getNumber() {
        return number;
    }

    public String getMessage() {
        return message;
    }
}
