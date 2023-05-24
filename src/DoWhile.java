public class DoWhile {
    public static void main(String[] args) {
        int i = 1;

        do { // 반복문 무조건 한번은 실행해야 할때 사용
            System.out.println("do: " + i); // 1
            i++;
        } while (i < 2); {
            System.out.println("while: " + i); // 2
        };
    }
}
