public class TestC_SolidThings{

    public static void main(String[] args) {

        // --- Création d'un SolidThings ---
        SolidThings solid = new SolidThings(10, 20, 32, 32);

        System.out.println("== Test du constructeur de SolidThings ==");
        System.out.println("Position x = " + solid.getX());
        System.out.println("Position y = " + solid.getY());
        System.out.println("Width = " + solid.getWidth());
        System.out.println("Height = " + solid.getHeight());

        // --- Vérification de la HitBox ---
        System.out.println("\n== Test de la HitBox ==");
        HitBox hb = solid.getHitBox();
        System.out.println("HitBox x = " + hb.getX());
        System.out.println("HitBox y = " + hb.getY());
        System.out.println("HitBox width = " + hb.getWidth());
        System.out.println("HitBox height = " + hb.getHeight());

        // --- Test du toString() ---
        System.out.println("\n== Test toString() ==");
        System.out.println(solid);

        // --- Modification de la hitbox (optionnel) ---
        System.out.println("\n== Test modification HitBox ==");
        hb = new HitBox(100, 150, 64, 64);
        solid.setHitBox(hb);
        System.out.println(solid.getHitBox());
    }
}
