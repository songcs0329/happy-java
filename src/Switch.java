public class Switch {
    public static void main(String[] args) {
        int num = 1;
        // 참인 case부터 밑에 다 실행(break가 없어서)
        switch (num) {
            case 1:
                System.out.println("1!");
            case 2:
                System.out.println("2@");
            case 3:
                System.out.println("3#");
        }

        System.out.println("=====================");

        num = 4;
        switch (num) {
            case 1:
                System.out.println("1!");
                break;
            case 2:
                System.out.println("2@");
                break;
            case 3:
                System.out.println("3#");
                break;
            default:
                System.out.println("Default");
        }
    }
}
