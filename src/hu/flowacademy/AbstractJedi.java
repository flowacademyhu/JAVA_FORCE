package hu.flowacademy;

public abstract class AbstractJedi implements ForceSensitive{
    private float force;
    private boolean canTurn;

    public AbstractJedi(float force, boolean canTurn) {
        this.force = force;
        this.canTurn = canTurn;
    }

    public abstract boolean createBalance();
}

