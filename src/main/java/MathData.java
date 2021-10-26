public class MathData {
    private double epsilon;
    private int a;
    private int b;
    private int x;
    private int y;
    private double zx;
    private double zy;
    private double beta;
    private double alpha;

    public MathData() {

    }

    public double getEpsilon() {
        return epsilon;
    }

    public void setEpsilon(double epsilon) {
        this.epsilon = epsilon;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getZx() {
        return zx;
    }

    public void setZx(double zx) {
        this.zx = zx;
    }

    public double getZy() {
        return zy;
    }

    public void setZy(double zy) {
        this.zy = zy;
    }

    public double getBeta() {
        return beta;
    }

    public void setBeta(double beta) {
        this.beta = beta;
    }

    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha * 2;
    }
    public void cutAlpha() {
        this.alpha = this.alpha / 2;
    }
}
