public class TestC_HitBox_T {
    public static void main(String[] args) {

        HitBox h1 = new HitBox(0, 0, 10, 10);
        HitBox h2 = new HitBox(5, 5, 10, 10);
        HitBox h3 = new HitBox(20, 20, 5, 5);

        System.out.println("h1 intersecte h2 ? " + h1.intersect(h2)); // true
        System.out.println("h1 intersecte h3 ? " + h1.intersect(h3)); // false
        System.out.println("h2 intersecte h3 ? " + h2.intersect(h3)); // false
    }
}
