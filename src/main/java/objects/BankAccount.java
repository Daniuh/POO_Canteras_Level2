package objects;

public class BankAccount {
    private int accountNumber;
    protected boolean activated;

    public boolean getActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
