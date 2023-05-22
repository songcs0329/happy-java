public class NumberOverflow {
    public static void main(String[] args) {
        int value = 10;
        int maxInt = Integer.MAX_VALUE;

        System.out.println(value + 1);
        System.out.println(maxInt + 1);
        // overflow: 계산 결과가 최대값을 넘거나, 최소값보다 작을 경우 음수는 양수, 양수는 음수로 바뀌는 문제
        // 정수와 실수는 타입별로 메모리에 저장되는 방식이 다르다.
    }
}
