public class Label {
    public static void main(String[] args) {
        outter:
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(i == 0 && j == 2) {
                    // break outter;
                    // 0,0 0,1
                    // break: 가장 인접한 반목문 빠져나감 label이 있을 경우는 해당 label 반복문
                    // 중첩 반복문 빠져나가고 싶을때 break label 사용
                    continue outter;
                    // 0,2 빼고 다 출력
                    // continue: 아래를 실행하지 않고 label이 있는 반복문 이어 실행
                }
                System.out.println(i + "," + j);
            }
        }
    }
}
