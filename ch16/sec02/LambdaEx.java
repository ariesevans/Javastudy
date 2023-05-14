package ch16.sec02;
@FunctionalInterface

interface BigNumber {
    int getBigNumber(int num1, int num2);
}

public class LambdaEx {
    public static void main(String[] args) {
        BigNumber bigNumber = (x, y) -> {
            if (x > y) {
                return x;
            } else {
                return y;
            }
        };

        int result = bigNumber.getBigNumber(2156, 12382);
        System.out.println(result);
    }
}