public class HogwartsMetod {
    public static void metodGriffindor(Grifindor first, Grifindor secound) {
        int firstSum = first.getBravery() + first.getHonor() + first.getNobility();
        int secoundSum = secound.getBravery() + secound.getHonor() + secound.getNobility();

        if (firstSum > secoundSum) {
            System.out.println(first.getName() + " лучше чем " + secound.getName());
        } else if (secoundSum > firstSum ) {
            System.out.println(secound.getName() + " лучше чем " + first.getName());
        } else {
            System.out.println(secound.getName() + " равен " + first.getName());
        }
    }
    public static void metodCogtefran(Cogtefran first, Cogtefran secound) {
        int firstSum = first.getIntelgency() + first.getIntelgency()+ first.getSmartness() + first.getCreativity();
        int secoundSum = secound.getIntelgency() + secound.getIntelgency()+ secound.getSmartness() + secound.getCreativity();

        if (firstSum > secoundSum) {
            System.out.println(first.getName() + " лучше чем " + secound.getName());
        } else if (secoundSum > firstSum ) {
            System.out.println(secound.getName() + " лучше чем " + first.getName());
        } else {
            System.out.println(secound.getName() + " равен " + first.getName());
        }
    }
    public static void metodPufendyi(Pufendyi first, Pufendyi secound) {
        int firstSum = first.getHardWork() + first.getLoyality()+ first.getInterety();
        int secoundSum = secound.getHardWork() + secound.getLoyality()+ secound.getInterety();

        if (firstSum > secoundSum) {
            System.out.println(first.getName() + " лучше чем " + secound.getName());
        } else if (secoundSum > firstSum ) {
            System.out.println(secound.getName() + " лучше чем " + first.getName());
        } else {
            System.out.println(secound.getName() + " равен " + first.getName());
        }
    }
    public static void metodSlizerin(Slizerin first, Slizerin secound) {
        int firstSum = first.getAmbion() + first.getCunning()+ first.getDecisivennes() + first.getRecourcefullness() + first.getPowerLast();
        int secoundSum = secound.getAmbion() + secound.getCunning()+ secound.getDecisivennes() + secound.getRecourcefullness() +secound.getPowerLast();

        if (firstSum > secoundSum) {
            System.out.println(first.getName() + " лучше чем " + secound.getName());
        } else if (secoundSum > firstSum ) {
            System.out.println(secound.getName() + " лучше чем " + first.getName());
        } else {
            System.out.println(secound.getName() + " равен " + first.getName());
        }
    }
    public static void HogwartsMetod (Hogwarts first,Hogwarts secound ) {
        if (first.getMagicPower() > secound.getMagicPower()) {
            System.out.println(first.getMagicPower() + " обладаеет большей силой магии, чем " + secound.getMagicPower());
        } else if (secound.getMagicPower() > first.getMagicPower() ) {
            System.out.println(secound.getMagicPower() + " обладаеет большей силой магии, чем " + first.getMagicPower());
        } else {
            System.out.println(secound.getMagicPower() + " равен " + first.getMagicPower());
        }

        if (first.getTrangressionDistation() > secound.getTrangressionDistation()) {
            System.out.println(first.getTrangressionDistation() + " обладаеет большей силой магии, чем " + secound.getTrangressionDistation());
        } else if (secound.getTrangressionDistation() > first.getTrangressionDistation() ) {
            System.out.println(secound.getTrangressionDistation() + " обладаеет большей силой магии, чем " + first.getTrangressionDistation());
        } else {
            System.out.println(first.getTrangressionDistation() + " равен по расстоянию трансгрессии ученику" + secound.getTrangressionDistation());
        }
    }

}