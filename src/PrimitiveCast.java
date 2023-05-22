// http://www.tcpschool.com/java/java_datatype_basic

public class PrimitiveCast {
    public static void main(String[] args) {
        long x2 = 50;
        int i2 = (int) x2;
        System.out.println(x2);
        System.out.println(i2);

        // 명시적 형변환 시 크기가 큰 타입을 작은 타입에 저장할 때는 overflow를 조심해야한다.
        long x3 = Long.MAX_VALUE;
        int i3 = (int) x3;
        System.out.println(x3);
        System.out.println(i3);
    }
}
