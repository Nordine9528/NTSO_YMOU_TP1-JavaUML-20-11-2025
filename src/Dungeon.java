import java.util.ArrayList;

public class Dungeon {

    private final int height;      // hauteur du DONJON en nombre de tuiles
    private final int width;       // largeur du DONJON en nombre de tuiles
    private final char[][] grid;   // tableau 2D représentant le donjon
    private TileManager tileManager;

    // --- Tableau dynamique pour stocker les Things ---
    private ArrayList<Things> thingsList;

    /**
     * Constructeur
     */
    public Dungeon(int height, int width, TileManager tileManager) {
        this.height = height;
        this.width = width;
        this.tileManager = tileManager;

        this.grid = new char[height][width];
        this.thingsList = new ArrayList<>();

        // Remplissage du donjon
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                // Bordures → murs
                if (y == 0 || y == height - 1 || x == 0 || x == width - 1) {
                    grid[y][x] = 'W';   // Mur
                } else {
                    grid[y][x] = ' ';   // Sol
                }
            }
        }

        // Remplissage du tableau dynamique
        fillThingsArray();
    }

    /**
     * Génère la liste des Things et SolidThings en fonction de la variable grid
     */
    private void fillThingsArray() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                char cell = grid[y][x];
                int pixelX = x * tileManager.getWidth();
                int pixelY = y * tileManager.getHeight();

                if (cell == ' ') {
                    thingsList.add(new Things(pixelX, pixelY, tileManager.getWidth(), tileManager.getHeight()));
                } else if (cell == 'B') {
                    thingsList.add(new SolidThings(pixelX, pixelY, tileManager.getWidth(), tileManager.getHeight()));
                }
            }
        }
    }

    /**
     * Affiche le donjon en console en plaçant le Héros ("H")
     */
    public void displayDungeonInConsole(HitBox hero) {

        // Conversion des pixels en coordonnées de TUILES
        int heroTileX = hero.getX() / tileManager.getWidth();
        int heroTileY = hero.getY() / tileManager.getHeight();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                if (x == heroTileX && y == heroTileY) {
                    System.out.print('H');
                } else {
                    System.out.print(grid[y][x]);
                }
            }
            System.out.println();
        }
    }

    /**
     * Getter pour la liste de Things
     */
    public ArrayList<Things> getThingsList() {
        return thingsList;
    }
}
