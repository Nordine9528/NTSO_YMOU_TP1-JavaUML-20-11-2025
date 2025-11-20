public class TestC_AnimetedThings{

    public static void main(String[] args) {

        // --- Création d'un AnimatedThings ---
        AnimatedThings anim = new AnimatedThings(10, 20, 32, 32);

        System.out.println("== Test du constructeur ==");
        System.out.println("Position x = " + anim.getX());
        System.out.println("Position y = " + anim.getY());
        System.out.println("Width = " + anim.getWidth());
        System.out.println("Height = " + anim.getHeight());

        // --- Vérification de la HitBox ---
        System.out.println("\n== Test de la HitBox ==");
        HitBox hb = anim.getHitBox();
        System.out.println("HitBox x = " + hb.getX());
        System.out.println("HitBox y = " + hb.getY());
        System.out.println("HitBox width = " + hb.getWidth());
        System.out.println("HitBox height = " + hb.getHeight());

        // --- Vérification du compteur de frames ---
        System.out.println("\n== Test du compteur de frames ==");
        System.out.println("CurrentFrame = " + anim.getCurrentFrame());

        // --- Avancer la frame ---
        anim.nextFrame();
        System.out.println("Après nextFrame(), CurrentFrame = " + anim.getCurrentFrame());

        // --- Test du toString() ---
        System.out.println("\n== Test toString() ==");
        System.out.println(anim);

        // --- Modification du compteur directement ---
        anim.setCurrentFrame(5);
        System.out.println("\nAprès setCurrentFrame(5) = " + anim.getCurrentFrame());
        System.out.println(anim);
    }
}
