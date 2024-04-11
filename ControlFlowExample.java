public class ControlFlowExample {

    public static void main(String[] args) {
        // if文の例
        int number = -10;

        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println(number + " is zero.");
        }

        // forループの例
        int sum = 0;
        int start = 1; // 開始値
        int end = 10; // 終了値

        for (int i = start; i <= end; i++) {
            sum += i; // 各ステップでiをsumに加算
        }

        System.out.println("Sum of " + start + " to " + end + " is " + sum);
    }
}
