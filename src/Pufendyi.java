public class Pufendyi extends Hogwarts {
    private int hardWork;
    private int loyality;
    private int interety;

    public Pufendyi(String name, int magicPower, int trangressionDistation, int hardWork, int loyality, int interety) {
        super(name, magicPower, trangressionDistation);
        this.hardWork = hardWork;
        this.loyality = loyality;
        this.interety = interety;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyality() {
        return loyality;
    }

    public void setLoyality(int loyality) {
        this.loyality = loyality;
    }

    public int getInterety() {
        return interety;
    }

    public void setInterety(int interety) {
        this.interety = interety;
    }

    @Override
    public String toString() {
        return "Pufendyi{" +
                "name" + getName() +
                ", magicPower=" + getMagicPower() +
                ", trangressionDistation=" + getTrangressionDistation() +
                ", hardWork=" + hardWork +
                ", loyality=" + loyality +
                ", interety=" + interety +
                '}';
    }
}
