public class SolidThings extends Things {

    // --- Attribut ---
    private HitBox hitBox;

    // --- Constructeur ---
    public SolidThings(int x, int y, int width, int height) {
        super(x, y, width, height);

        // La HitBox a la même taille que Things
        this.hitBox = new HitBox(x, y, width, height);
    }

    // --- Getter pour la HitBox ---
    public HitBox getHitBox() {
        return hitBox;
    }

    // --- Setter pour la HitBox (optionnel) ---
    public void setHitBox(HitBox hitBox) {
        this.hitBox = hitBox;
    }

    // --- toString ---
    @Override
    public String toString() {
        return "SolidThings{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", width=" + getWidth() +
                ", height=" + getHeight() +
                ", hitBox=" + hitBox +
                '}';
    }
}
