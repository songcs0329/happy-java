public class Boolean {
    public static void main(String[] args) {
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        boolean flag6 = false;

        // &&, || 두개 있는 경우, 뒤에 연산이 있을 경우 실행되지 않기 때문에 연산이 필요한 경우 문제가 될 수 있다.
        flag1 = 10 > 5 && 5 < 20; // true && 앞이 false일 경우, 뒤를 실행하지 않는다.
        flag2 = 10 > 5 & 5 < 20; // true
        flag3 = 10 >= 10 || 5 > 6; // true || 앞이 true일 경우, 뒤를 실행하지 않는다.
        flag4 = 10 >= 10 | 5 > 6; // true
        flag5 = 10 == 10 ^ 5 == 4; // true
        flag6 = !flag5; // false

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(flag4);
        System.out.println(flag5);
        System.out.println(flag6);
    }
}
