public class HitBox {

    private int x;
    private int y;
    private int width;
    private int height;

    // Constructeur
    public HitBox(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }


    public int getX() { return x; }
    public int getY() { return y; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }

    /**
     * Vérifie si cette HitBox intersecte une autre HitBox.
     */
    public boolean intersect(HitBox other) {

        // Détermination du rectangle le plus à gauche
        HitBox left  = (this.x <= other.x) ? this : other;
        HitBox right = (this.x <= other.x) ? other : this;

        int horizontalDistance = right.x - left.x;
        boolean xOverlap = left.width > horizontalDistance;

        // Détermination du rectangle le plus haut
        HitBox top    = (this.y <= other.y) ? this : other;
        HitBox bottom = (this.y <= other.y) ? other : this;

        int verticalDistance = bottom.y - top.y;
        boolean yOverlap = top.height > verticalDistance;

        return xOverlap && yOverlap;
    }

    @Override
    public String toString() {
        return "HitBox[x=" + x + ", y=" + y +
                ", width=" + width + ", height=" + height + "]";
    }
}
