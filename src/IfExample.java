public class IfExample {
    public static void main(String[] args) {
        int score = 70;

        if(score >= 90) {
            System.out.println("A");
        } else if(score >= 80) {
            System.out.println("B");
        } else if(score >= 70) {
            System.out.println("C");
        } else if(score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
        System.out.println("===== END =====");

        int a = 10;
        int value = (a > 5) ? 20 : 30;
        System.out.println(value);
    }
}
