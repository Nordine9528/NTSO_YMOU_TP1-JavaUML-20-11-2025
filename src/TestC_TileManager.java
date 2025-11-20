public class TestC_TileManager {
    public static void main(String[] args) {

        // Création d’un TileManager avec des valeurs de test
        TileManager tm = new TileManager(32, 32);

        // Affichage des valeurs pour vérifier que tout fonctionne
        System.out.println("Hauteur des tuiles : " + tm.getHeight());
        System.out.println("Largeur des tuiles : " + tm.getWidth());
    }
}
