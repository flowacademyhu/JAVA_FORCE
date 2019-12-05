package hu.flowacademy;

public class Emperor  implements  ForceSensitive, Sith{
   private double evilMeter;
   private double emperorPower;


    public Emperor(){
    evilMeter = 100;
    }

    public double getEvilMeter() {
        return evilMeter;
    }

    public void setEvilMeter(double evilMeter) {
        this.evilMeter = evilMeter;
    }

    public double getEmperorPower() {
        return emperorPower;
    }

    public void setEmperorPower(double emperorPower) {
        this.emperorPower = emperorPower;
    }

    @Override
    public boolean canDefeat(ForceSensitive forceSensitive) {
        return false;
    }

    @Override
    public float howBigIsHisForce() {
        return 0;
    }

    @Override
    public void letOutYourWraith() {

    }

    public void setEmperorPower(){
        emperorPower = evilMeter*2;
    }





    @Override
    public String toString() {
        return "Emperor{" +
                "evilMeter=" + evilMeter +
                '}';
    }
}
