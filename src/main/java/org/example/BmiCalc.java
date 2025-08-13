package org.example;

import lombok.NonNull;

import java.util.Scanner;

public class BmiCalc {
    public void calcBmi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        System.out.print("키(cm)를 입력하세요 >>> ");
        double height = scanner.nextDouble();
        System.out.print("몸무게(kg)를 입력하세요 >>> ");
        double weight = scanner.nextDouble();
        double bmi = weight/((height/100)*(height/100));
        String info = "";
        if(bmi < 18.5) info = "저체중";
        else if(bmi < 22.9) info = "정상";
        else if(bmi < 24.9) info = "과체중";
        else if(bmi < 29.9) info = "비만";
        else info = "고도비만";
        System.out.println(name + " 님의 BMI 지수는 " + bmi + "으로 " + info +"입니다.");
    }

    public void calcBmi(String name, double height, double weight){
        double bmi = weight/((height/100)*(height/100));
        String info = "";
        if(bmi < 18.5) info = "저체중";
        else if(bmi < 22.9) info = "정상";
        else if(bmi < 24.9) info = "과체중";
        else if(bmi < 29.9) info = "비만";
        else info = "고도비만";
        System.out.println(name + " 님의 BMI 지수는 " + bmi + "으로 " + info +"입니다.");
    }

    public void calcBmi(Person person) {
        String name = person.getName();
        double height = person.getHeight() * 0.01;
        double weight = person.getWeight();
        double bmi = weight/(height*height);
        String info = "";
        if(bmi < 18.5) info = "저체중";
        else if(bmi < 23) info = "정상";
        else if(bmi < 25) info = "과체중";
        else if(bmi < 30) info = "비만";
        else info = "고도비만";
        System.out.println(name + " 님의 BMI 지수는 " + bmi + "으로 " + info +"입니다.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        System.out.print("키(cm)를 입력하세요 >>> ");
        double height = scanner.nextDouble();
        System.out.print("몸무게(kg)를 입력하세요 >>> ");
        double weight = scanner.nextDouble();

        BmiCalc bmiCalc = new BmiCalc();
//        bmiCalc.calcBmi();
//        bmiCalc.calcBmi(name,height,weight);
        Person person1 = Person.builder()
                .name(name)
                .height(height)
                .weight(weight)
                .build();
        bmiCalc.calcBmi(person1);
    }
}
