// class
// *.java파일을 *.class파일로 컴파일(바이트코드로 바꿔준다)
// 바이트코드가 된 *.class파일을 JVM으로 실행(각 CPU 및 OS별 JDK 설치)
// 한줄씩 읽으면서 기계어로 바꿔가면서 실행: 인터프리터 방식
public class Hello {
    // class 안에는 field와 method가 존재
    // main method: java 프로그램이 실행되기 위해선 반드시 존재(프로그램 시작점)
    public static void main(String[] args) {
        // java에서 첫글짜가 대문자일 경우 class
        // System: class
        // out: field
        // println: method
        // System(class)의 out(field)에 있는 println(method)를 실행해라(https://docs.oracle.com/javase/8/docs/api/java/lang/System.html)
        System.out.println("Hello Java");
    }
}
