public class DataTypesExample {
    public static void main(String[] args) {
        // プリミティブ型の例
        int anInteger = 5; // 整数
        double aDouble = 5.99; // 浮動小数点数
        char aCharacter = 'A'; // 文字
        boolean aBoolean = true; // 真偽値

        // 参照型の例
        String aString = "Hello, Java"; // 文字列
        int[] anArray = { 1, 2, 3, 4, 5 }; // 整数の配列
        MyClass myObject = new MyClass(); // カスタムクラスのオブジェクト

        // 型と値の表示
        System.out.println("Integer: " + anInteger);
        System.out.println("Double: " + aDouble);
        System.out.println("Character: " + aCharacter);
        System.out.println("Boolean: " + aBoolean);
        System.out.println("String: " + aString);
        System.out.println("Array: " + java.util.Arrays.toString(anArray));
        System.out.println("Object of MyClass: " + myObject);
    }
}

class MyClass {
    @Override
    public String toString() {
        return "This is a MyClass object!";
    }
}
