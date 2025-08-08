package ch12_arrays;

public class Array01 {
    public static void main(String[] args) {
        int[] arr01 = {1,2,3,4,5};
        int i = 1;
//        System.out.println(i);      // 결과값 : 1
//        System.out.println(arr01);  // 결과값 : ~~

        // 현재 상황에서 배열 내부의 값을 확인할 수가 없습니다. 주소지만 출력이 됩니다.
        // 배열 내부의 각 숫자들을 뭐라고 한다 ? 원소
        // 현재 배열 내부에는 다수의 데이터가 있기 때문에 콘솔창에서 전체 확인이 불가능합니다.
        // 즉 element들을 확인하기 위해서는 배열 내부로 직접 탐색하느 과정이 필요합니다.
        // 이때 필요한 개념이 index(주소지라기도 하기도 합니다) 개념입니다.
//        System.out.println(arr01[0]);   // 배열명[index]의 형태로 내부 데이터를 직접 확인 가능
//        System.out.println(arr01[1]);
//        System.out.println(arr01[2]);
//        System.out.println(arr01[3]);
//        System.out.println(arr01[4]);

//        for (i = 0 ; i < 5 ; i++){
//            System.out.print(arr01[i] + " ");
//        }
//        System.out.println( );
//        for (i = 0 ; i < arr01.length ; i++){
//            System.out.print(arr01[i] + " / ");
//        }
        // 객체명.필드 형태 필드 참조
        // field를 직접 참조 했다는 말은 length 필드는 public 이라고 볼 수 있음

        // 그렇다면 배열은 객체인가    -> 완전히 그렇다고는 X / 하지만 field로 length를 가진다
        // 빈 배열 생성
        int[] arr02 = new int[10];  //10개짜리 방을 가진 비어있는 배열
        // 이상의 모든 것을 종합했을때, 배열 내부의 방의 개수 / 주소지의 한계값 - 1 을 우리가 항상
        // 알고있는것은 아니기 때문에 element값을 출력하기 위한 반복문의 한계값을 설정할 때
        // 배열명.length를 스는 것을 생활화 하자.

        // arr01 내부에 있는 1, 2, 3, 4, 5는 굳이 따지자면 arr01[0], arr01[1], ....arr01[4] 라는 변수명을 지니고
        // 있다고 볼 수 있다.

//        arr01[0] = 10;
//        System.out.println(arr01[0]);

        // 배열에 값을 대입할 수 있다.
        // arr02는 현재 10개짜리 바을 지닌 배열에 해딩하고, 내부에는 아무런 값이 없습니다.
//        for(i=0;i<arr02.length;i++){
//            System.out.println(arr02[i]);
//        }
        // arr02에 21,22,23,24,25.... 30 을 대입하고
        // 21 / 22 / 23 / 24 / ,...... / 30 이라고 출력될 수 있도록 코드를 작성하시오.
        for (i = 0 ; i<arr02.length;i++){
            arr02[i] += (21+i);
//            System.out.print(arr02[i] + " / ");
        }
        // arr02에 현재 21,22,,,,30 이 대입되어있습니다
        // 42 44 46 ... 60 이 될 수 있도록 반복문 작성
        // 42, 44, 46, ... , 60, 으로 출력
        for(i=0;i<arr02.length;i++){
            arr02[i] *= 2;
            System.out.print(arr02[i] + ", ");
        }

        String[] strArray01 = {"안", "녕", "하","세","요"};
    }
}
