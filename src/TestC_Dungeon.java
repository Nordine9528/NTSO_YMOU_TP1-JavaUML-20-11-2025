public class TestC_Dungeon {

    public static void main(String[] args) {

        // Chaque tuile fait 32x32 pixels
        TileManager tileManager = new TileManager(32, 32);

        // Donjon de 10 lignes x 20 colonnes
        Dungeon dungeon = new Dungeon(10, 20, tileManager);

        // Le héros a une HitBox 32x32 et est placé en pixel aux coordonnées (160, 64)
        // → correspond à la tuile (160/32 = 5, 64/32 = 2)
        HitBox hero = new HitBox(160, 64, 32, 32);

        // --- Test 1 : affichage du donjon avec le héros ---
        System.out.println("=== Affichage du donjon avec le héros ===");
        dungeon.displayDungeonInConsole(hero);

        // --- Test 2 : vérification des Things et SolidThings ---
        System.out.println("\n=== Vérification de la liste des Things ===");
        int countThings = 0;
        int countSolidThings = 0;

        for (Things t : dungeon.getThingsList()) {
            if (t instanceof SolidThings) {
                countSolidThings++;
            } else {
                countThings++;
            }
            System.out.println(t);
        }

        System.out.println("\nNombre de Things (sol) : " + countThings);
        System.out.println("Nombre de SolidThings (murs) : " + countSolidThings);
    }
}
