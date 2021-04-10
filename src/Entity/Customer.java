package Entity;

public class Customer extends AppUser {
    private String level;//0 normal, 1 VIP

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
