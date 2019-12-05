package hu.flowacademy;

public abstract class AbstractJedi implements ForceSensitive{
    private float force;
    private boolean canTurn;

    public AbstractJedi(float force, boolean canTurn) {
        this.force = force;
        this.canTurn = canTurn;
    }

    public abstract boolean createBalance();

    @Override
    public boolean canDefeat(ForceSensitive forceSensitive) {
        if (forceSensitive instanceof Emperor) {

        } else if (forceSensitive instanceof AbstractJedi) {

        }
    }

    @Override
    public float howBigIsHisForce() {
        return this.force;
    }

    public float getForce() {
        return force;
    }

    public void setForce(float force) {
        this.force = force;
    }

    public boolean isCanTurn() {
        return canTurn;
    }

    public void setCanTurn(boolean canTurn) {
        this.canTurn = canTurn;
    }
}

