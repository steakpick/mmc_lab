public class Calculator {
    public static double ownFunction(MathData data) {
        return data.getA() * square(data.getX()) + 2 * data.getX() * data.getY() +
                data.getB() * square(data.getY()) - 2 * data.getX() - 3 * data.getY();
    }

    public static double zFunction(MathData data) {
        return data.getA() * square(data.getZx()) + 2 * data.getZx() * data.getZy() +
                data.getB() * square(data.getZy()) - 2 * data.getZx() - 3 * data.getZy();
    }

    private static double derivativeByX(MathData data) {
        return data.getA() * 2 * data.getX() + 2 * data.getY() - 2;
    }

    private static double derivativeByY(MathData data) {
        return 2 * data.getX() + data.getB() * 2 * data.getY() - 3;
    }

    private static double getSuperFunction(MathData data) {
        return radical(square(derivativeByX(data)) + square(derivativeByY(data)));
    }

    private static boolean stopSolving(MathData data){
        System.out.println();
        System.out.println("X = " + data.getZx());
        System.out.println("Y = " + data.getZy());
        System.out.println("F(z) = " + zFunction(data));
        System.out.println("F(x) = " + ownFunction(data));
        System.out.println("F(z) - F(x) = " + (zFunction(data) - ownFunction(data)));
        System.out.println("Equal value = " + (-1 * data.getBeta() * data.getAlpha() * square(getSuperFunction(data))));
        return zFunction(data) - ownFunction(data) <= -1 * data.getBeta() * data.getAlpha() * square(getSuperFunction(data));
    }

    public static void calculate(MathData data) {
        if (getSuperFunction(data) <= data.getEpsilon()) {
            System.out.println("there is no decision!");
        }

        data.setX(1);
        data.setY(1);

        double derByX = derivativeByX(data);
        double derByY = derivativeByY(data);

        do {
            data.cutAlpha();

            data.setZx(data.getAlpha() * derByX * -1 + data.getX());
            data.setZy(data.getAlpha() * derByY * -1 + data.getY());
        } while (!stopSolving(data));

        System.out.println();
        System.out.println("X = " + data.getZx());
        System.out.println("Y = " + data.getZy());
    }

    private static double square(double num) {
        return num * num;
    }

    private static int square(int num) {
        return num * num;
    }

    private static double radical(double num) {
        return Math.sqrt(num);
    }

    private static double radical(int num) {
        return Math.sqrt(num);
    }

}
