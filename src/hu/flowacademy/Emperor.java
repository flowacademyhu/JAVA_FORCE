package hu.flowacademy;

public class Emperor  implements  ForceSensitive, Sith{
    

    @Override
    public boolean canDefeat(ForceSensitive forceSensitive) {
        return false;
    }

    @Override
    public double howBigIsHisForce() {
        return 0;
    }

    @Override
    public void letOutYourWraith() {

    }
}
