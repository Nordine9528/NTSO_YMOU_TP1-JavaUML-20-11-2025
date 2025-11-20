public class TestC_Things {

    public static void main(String[] args) {

        // --- Création d'un objet Things ---
        Things thing = new Things(10, 20, 32, 32);

        // --- Affichage initial ---
        System.out.println("== Test constructeur et getters ==");
        System.out.println("x = " + thing.getX());
        System.out.println("y = " + thing.getY());
        System.out.println("width = " + thing.getWidth());
        System.out.println("height = " + thing.getHeight());

        // --- Test toString() ---
        System.out.println("\n== Test toString() ==");
        System.out.println(thing);

        // --- Modification des valeurs ---
        thing.setX(50);
        thing.setY(60);
        thing.setWidth(64);
        thing.setHeight(64);

        // --- Vérification après modification ---
        System.out.println("\n== Test des setters ==");
        System.out.println("x = " + thing.getX());
        System.out.println("y = " + thing.getY());
        System.out.println("width = " + thing.getWidth());
        System.out.println("height = " + thing.getHeight());

        System.out.println("\n== toString() après modifications ==");
        System.out.println(thing);
    }
}
