public class Main {
    public static void main(String[] args) {
        MathData data = new MathData();
        data.setEpsilon(0.000001);
        data.setBeta(0.5);
        data.setAlpha(1);
        data.setA(2);
        data.setB(1);

        Calculator.calculate(data);
    }
}
