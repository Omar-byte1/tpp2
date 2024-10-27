package tp2.bank.models;
import java.time.LocalDateTime;
public class Log {

    private LocalDateTime dateTime;
    private String type;
    private double amount;
    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public Log(String type) {
        this.dateTime = LocalDateTime.now();
        this.type = type;
        this.amount = amount;
    }
    @Override
    public String toString() {
        return dateTime + " - " + type + ": " + amount;
    }

}
