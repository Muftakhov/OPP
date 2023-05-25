public class Slizerin extends Hogwarts {
    private int cunning;
    private int ambion;
    private int decisivennes;
    private int recourcefullness;
    private int powerLast;

    public Slizerin(String name, int magicPower, int trangressionDistation, int cunning, int ambion, int decisivennes, int recourcefullness, int powerLast) {
        super(name, magicPower, trangressionDistation);
        this.cunning = cunning;
        this.ambion = ambion;
        this.decisivennes = decisivennes;
        this.recourcefullness = recourcefullness;
        this.powerLast = powerLast;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getAmbion() {
        return ambion;
    }

    public void setAmbion(int ambion) {
        this.ambion = ambion;
    }

    public int getDecisivennes() {
        return decisivennes;
    }

    public void setDecisivennes(int decisivennes) {
        this.decisivennes = decisivennes;
    }

    public int getRecourcefullness() {
        return recourcefullness;
    }

    public void setRecourcefullness(int recourcefullness) {
        this.recourcefullness = recourcefullness;
    }

    public int getPowerLast() {
        return powerLast;
    }

    public void setPowerLast(int powerLast) {
        this.powerLast = powerLast;
    }

    @Override
    public String toString() {
        return "Slizerin{" +
                "name" + getName() +
                ", magicPower=" + getMagicPower() +
                ", trangressionDistation=" + getTrangressionDistation() +
                ", cunning=" + cunning +
                ", ambion=" + ambion +
                ", decisivennes=" + decisivennes +
                ", recourcefullness=" + recourcefullness +
                ", powerLast=" + powerLast +
                '}';
    }
}
