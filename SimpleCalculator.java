public class SimpleCalculator {

    // 2つの数の和を計算して返すメソッド
    public static int addTwoNumbers(int number1, int number2) {
        int result = number1 + number2;
        return result;
    }

    public static void main(String[] args) {
        // 'addTwoNumbers' メソッドを使用して計算
        int sum1 = addTwoNumbers(5, 3);
        System.out.println("5 + 3 = " + sum1);

        int sum2 = addTwoNumbers(10, 15);
        System.out.println("10 + 15 = " + sum2);

        int sum3 = addTwoNumbers(-1, 1);
        System.out.println("-1 + 1 = " + sum3);
    }
}
