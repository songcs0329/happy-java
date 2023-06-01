public class VendingMachineMain {
    public static void main(String[] args) {
        // main 메소드 없는 클래스는 실행되지 않는다.
        // static이 붙은 메소드: 클래스 메소드
        // 인스턴스를 생성하지 않아도 사용 가능 = 메모리에 올라가 있다.
        VendingMachine vm1 = new VendingMachine();
        // 클래스명(참조타입) 변수명(참조변수) = new(new 연산자) 클래스명()(생성자());
        // VendingMachine 클래스에 의존한다.
        // 인스턴스를 만들때마다 메모리에 인스턴스가 생성된다.

        String vm1Product = vm1.pushProductButton(100);
        System.out.println(vm1Product);
    }
}
