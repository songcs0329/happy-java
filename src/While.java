public class While {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("i: " + i);
            i++;
        }

        System.out.println("===========");

        int j = 1;
        while (true) { // 무한 loop
            if(j == 11) break;
            System.out.println("j: " + j);
            j++;
        }

        System.out.println("===========");

        // 후위 증감식
        int k = 0;
        while (k++ < 10) {
            System.out.println("k: " + k); // 1 ~ 10까지 출력
        }

        int l = 0;
        while (l++ < 10) {
            if(l % 2 != 0) {
                continue; // 밑에 실행하지 않고 while문 반복
            }
            System.out.println("l: " + l);
        }
    }
}
