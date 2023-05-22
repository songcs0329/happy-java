public class NumberTypeChange {
    public static void main(String[] args) {
        // 묵시적 타입 변환(자동 타입 변환)
        double d1 = 50; // int 정수 리터럴 50
        double d2 = 500L; // long 정수 리터럴 500

        System.out.println(d1);
        System.out.println(d2);

        // int형에 실수(float, double) 대입 시 오류 발생
        // 실수값을 정수에 저장하려면 형(타입)변환을 해야 한다.(명시적 형변환)
        // 소수점 이하는 잘린다.
        int i1 = (int) 50.0; // 50
        int i2 = (int) 25.6f; // 25
        System.out.println(i1);
        System.out.println(i2);

        // 크기가 큰 타입은 작은 타입을 저장할 수 있다.
    }
}
