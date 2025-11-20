public class AnimatedThings extends SolidThings {

    // --- Attributs pour l'animation ---
    // Pour l'instant, on peut ajouter un simple compteur de frame ou nom d'animation
    private int currentFrame;

    // --- Constructeur ---
    public AnimatedThings(int x, int y, int width, int height) {
        super(x, y, width, height);
        this.currentFrame = 0; // initialisation de la frame
    }

    // --- Getters et setters ---
    public int getCurrentFrame() {
        return currentFrame;
    }

    public void setCurrentFrame(int currentFrame) {
        this.currentFrame = currentFrame;
    }

    // --- Méthode pour avancer l'animation ---
    public void nextFrame() {
        currentFrame++;
    }

    // --- toString() ---
    @Override
    public String toString() {
        return "AnimatedThings{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", width=" + getWidth() +
                ", height=" + getHeight() +
                ", hitBox=" + getHitBox() +
                ", currentFrame=" + currentFrame +
                '}';
    }
}
