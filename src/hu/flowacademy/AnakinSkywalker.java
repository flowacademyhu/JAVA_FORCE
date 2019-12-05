package hu.flowacademy;

public class AnakinSkywalker extends AbstractJedi implements Sith {

    public AnakinSkywalker() {
        super(150.0f, true);
    }

    @Override
    public void letOutYourWraith() {

    }

    @Override
    public boolean createBalance() {
        return false;
    }

    @Override
    public boolean canDefeat(ForceSensitive forceSensitive) {
        return false;
    }

    @Override
    public float howBigIsHisForce() {
        return 0;
    }
}
