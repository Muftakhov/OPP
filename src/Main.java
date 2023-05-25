

public class Main {
    public static void main(String[] args) {
       Grifindor gariPoter = new Grifindor(
               "Грарри Поттер",
               99,
               70,
               65,
               45,
               40
       );
        Grifindor germionaGreinger = new Grifindor(
                "Гермиона Грейнджер",
                99,
                65,
                55,
                60,
                50
        );
        Grifindor ronUzlly = new Grifindor(
                "Рон Узли",
                90,
                75,
                45,
                70,
                60
        );
        Pufendyi zahariaSmit = new Pufendyi(
                "Захария смит",
                70,
                60,
                55,
                61,
                85);
        System.out.println("gariPoter = " + gariPoter);
        System.out.println("germionaGreinger = " + germionaGreinger);
        System.out.println("ronUzlly = " + ronUzlly);
        System.out.println("zahariaSmit = " + zahariaSmit);
        System.out.println();

        HogwartsMetod.metodGriffindor (gariPoter,germionaGreinger);
        HogwartsMetod.metodGriffindor (ronUzlly,germionaGreinger);

        HogwartsMetod.HogwartsMetod (gariPoter,ronUzlly);
        HogwartsMetod.HogwartsMetod (gariPoter,zahariaSmit);
    }


}