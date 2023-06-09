
public class Grifindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Grifindor(String name, int magicPower, int trangressionDistation, int nobility, int honor, int bravery) {
        super(name, magicPower, trangressionDistation);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Grifindor{" +
                "name" + getName() +
                ", magicPower=" + getMagicPower() +
                ", trangressionDistation=" + getTrangressionDistation() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
