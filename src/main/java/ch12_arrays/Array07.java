package ch12_arrays;

/*
    20250805에 점수 배열의 내부 elemenet 들의 합과 평균을 구할 수 있음

    내부 element 의 값들의 점수 범위를 조사하여
    90이상 a
    80이상 b
    70 c
    60 d
    59 이하 f
    a몇명 b몇명 f몇명 출력
*/
public class Array07 {

    public static void main(String[] args) {
        int[] scores = {100, 97, 83, 85, 77, 76, 64, 64, 58, 59, 92, 100};
        int[] grades = {0, 0, 0, 0, 0};

        for (int i=0 ; i<scores.length ; i++) {
            if(scores[i]>89) {
                grades[0]++;
            } else if (scores[i] > 79) {
                grades[1]++;
            } else if (scores[i] > 69) {
                grades[2]++;
            } else if (scores[i] > 59) {
                grades[3]++;
            } else{
                grades[4]++;
            }
        }
        System.out.println("A 학생 수 : " + grades[0]);
        System.out.println("B 학생 수 : " + grades[1]);
        System.out.println("C 학생 수 : " + grades[2]);
        System.out.println("D 학생 수 : " + grades[3]);
        System.out.println("F 학생 수 : " + grades[4]);
    }
}
