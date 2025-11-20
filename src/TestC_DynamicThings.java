public class TestC_DynamicThings{

    public static void main(String[] args) {

        // --- Création d'un DynamicThings ---
        DynamicThings dyn = new DynamicThings(10, 20, 32, 32, 5, -3);

        System.out.println("== Test du constructeur ==");
        System.out.println("Position x = " + dyn.getX());
        System.out.println("Position y = " + dyn.getY());
        System.out.println("Width = " + dyn.getWidth());
        System.out.println("Height = " + dyn.getHeight());

        // --- Vérification de la HitBox ---
        System.out.println("\n== Test de la HitBox ==");
        HitBox hb = dyn.getHitBox();
        System.out.println("HitBox x = " + hb.getX());
        System.out.println("HitBox y = " + hb.getY());
        System.out.println("HitBox width = " + hb.getWidth());
        System.out.println("HitBox height = " + hb.getHeight());

        // --- Vérification des vitesses ---
        System.out.println("\n== Test des vitesses ==");
        System.out.println("SpeedX = " + dyn.getSpeedX());
        System.out.println("SpeedY = " + dyn.getSpeedY());

        // --- Test du toString() ---
        System.out.println("\n== Test toString() ==");
        System.out.println(dyn);

        // --- Modification des vitesses ---
        System.out.println("\n== Test modification des vitesses ==");
        dyn.setSpeedX(10);
        dyn.setSpeedY(15);
        System.out.println("SpeedX = " + dyn.getSpeedX());
        System.out.println("SpeedY = " + dyn.getSpeedY());
        System.out.println(dyn);
    }
}
