public class DynamicThings extends SolidThings {

    // --- Vitesse en x et y ---
    private int speedX;
    private int speedY;

    // --- Constructeur ---
    public DynamicThings(int x, int y, int width, int height, int speedX, int speedY) {
        super(x, y, width, height);
        this.speedX = speedX;
        this.speedY = speedY;
    }

    // --- Getters ---
    public int getSpeedX() {
        return speedX;
    }

    public int getSpeedY() {
        return speedY;
    }

    // --- Setters ---
    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }

    public void setSpeedY(int speedY) {
        this.speedY = speedY;
    }

    // --- toString ---
    @Override
    public String toString() {
        return "DynamicThings{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", width=" + getWidth() +
                ", height=" + getHeight() +
                ", hitBox=" + getHitBox() +
                ", speedX=" + speedX +
                ", speedY=" + speedY +
                '}';
    }
}
