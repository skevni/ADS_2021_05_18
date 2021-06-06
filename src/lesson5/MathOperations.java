package lesson5;

public class MathOperations {
    /*  Метод умеет возводить в целую степень положительные и отрицательные числа
     *   Не реализовано: дробные степени не понял пока что как сделать
     */
    public static double power(int num, double power) {
        if (num < 0 && power < 1 && power > -1)
            throw new IllegalArgumentException(String.format("Incorrect parameter power(%f) for calculating a fractional power" +
                    " of a negative number(%d)", power, num));

        if (power % 1 != 0) {
            throw new IllegalArgumentException(String.format("Calculating of fractional power(%f) is not implemented", power));
        }
        if (num == 0)
            return 0;
        if (power > 0){
            return pw(num,power);
        } else {
            return (1 / pw(num, power*-1));
        }
    }

    private static double pw(int num, double power) {
        if (power == 0) {
            return 1;
        }
        return num * pw(num, power - 1);
    }
}
