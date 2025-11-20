public class TileManager {

    // Attributs privés et finaux
    private final int height;
    private final int width;

    // Constructeur simple
    public TileManager(int height, int width) {
        this.height = height;
        this.width = width;
    }

    // Getter pour la hauteur
    public int getHeight() {
        return height;
    }

    // Getter pour la largeur
    public int getWidth() {
        return width;
    }
}
