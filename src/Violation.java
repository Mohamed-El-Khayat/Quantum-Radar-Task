import java.awt.image.VolatileImage;

public class Violation {
    private String message;
    private int fee;

    public Violation(String message, int fee) {
        this.message = message;
        this.fee = fee;
    }

    public String getMessage() {
        return message;
    }

    public int getFee() {
        return fee;
    }
}
