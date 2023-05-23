public class BitOperator {
    public static void main(String[] args) {
        // >>, << : 부호 연산자와 같은 값으로 채워짐
        int a = 4;
        int b = a >> 1; // a(4) / 2^n(1)
        System.out.println(b);

        int c = 4;
        int d = c << 1; // c(4) * 2^n(1)
        System.out.println(d);

        int e = -4;
        int f = e >> 1; // -4 / 2 = -2
        int g = e << 1; // -4 * 2 = -8
        System.out.println(f);
        System.out.println(g);

        // >>>, <<< : 무조건 양수(양수화시프트)
    }
}
