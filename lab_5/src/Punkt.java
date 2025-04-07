public class Punkt {
    public int x;
    public int y;

    public Punkt() {
        this.x = 0;
        this.y = 0;
    }

    public Punkt(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void zeruj() {
        this.y = 0;
        this.x = 0;
    }
    public String opis() {
        return "Punkt{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void przesun(int x, int y) {
        this.x += x;
        this.y += y;

    }
}
