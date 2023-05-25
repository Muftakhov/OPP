public class Hogwarts {
    private String name;
    private int magicPower;
    private int trangressionDistation;

    public Hogwarts(String name, int magicPower, int trangressionDistation) {
        this.name = name;
        this.magicPower = magicPower;
        this.trangressionDistation = trangressionDistation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTrangressionDistation() {
        return trangressionDistation;
    }

    public void setTrangressionDistation(int trangressionDistation) {
        this.trangressionDistation = trangressionDistation;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", trangressionDistation=" + trangressionDistation +
                '}';
    }
}

