public class Cogtefran extends Hogwarts {
    private int intelgency;
    private int winsdom;
    private int smartness;
    private int creativity;

    public Cogtefran(String name, int magicPower, int trangressionDistation, int intelgency, int winsdom, int smartness, int creativity) {
        super(name, magicPower, trangressionDistation);
        this.intelgency = intelgency;
        this.winsdom = winsdom;
        this.smartness = smartness;
        this.creativity = creativity;
    }

    public int getIntelgency() {
        return intelgency;
    }

    public void setIntelgency(int intelgency) {
        this.intelgency = intelgency;
    }

    public int getWinsdom() {
        return winsdom;
    }

    public void setWinsdom(int winsdom) {
        this.winsdom = winsdom;
    }

    public int getSmartness() {
        return smartness;
    }

    public void setSmartness(int smartness) {
        this.smartness = smartness;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Cogtefran{" +
                "name" + getName() +
                ", magicPower=" + getMagicPower() +
                ", trangressionDistation=" + getTrangressionDistation() +
                ", intelgency=" + intelgency +
                ", winsdom=" + winsdom +
                ", smartness=" + smartness +
                ", creativity=" + creativity +
                '}';
    }
}
