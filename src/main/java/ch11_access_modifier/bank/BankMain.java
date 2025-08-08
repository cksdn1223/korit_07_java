package ch11_access_modifier.bank;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Bank account1 = new Bank(123456,"홍길동",100000);
        Bank account2 = new Bank(987654, "신사임당", 500000);

        account1.setPinNumber(1234);
        account2.setPinNumber(4321);

        account1.showAccountInfo();
        account2.showAccountInfo();

        account1.deposit(50000,1234);
        account1.withdraw(200000,1234);
        account1.withdraw(100000,1234);
        System.out.println();
        account2.withdraw(100000,4321);
        account2.deposit(200000,4321);

        System.out.println("\n최종 계좌 정보");
        account1.showAccountInfo();
        account2.showAccountInfo();
//        while(true){
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("이름을 입력해주세요 >>> ");
//            String name = scanner.nextLine();
//            int amount, pinNum;
//            if(name.equals("홍길동")){
//                System.out.print("1입금 2출금 3잔액확인 >>> ");
//                int choose = scanner.nextInt();
//                switch (choose){
//                    case 1:
//                        System.out.print("얼마를 입금하시겠습니까 ? >>> ");
//                        amount = scanner.nextInt();
//                        System.out.print("비밀번호를 입력하세요 >>> ");
//                        pinNum = scanner.nextInt();
//                        account1.deposit(amount,pinNum);
//                        break;
//                    case 2:
//                        System.out.print("얼마를 출금하시겠습니까 ? >>> ");
//                        amount = scanner.nextInt();
//                        System.out.print("비밀번호를 입력하세요 >>> ");
//                        pinNum = scanner.nextInt();
//                        account1.withdraw(amount,pinNum);
//                        break;
//                    case 3:
//                        System.out.println("현재 잔액 : " + account1.getBalance());
//                        break;
//                    default:
//                        System.out.println("초기화면으로 돌아갑니다.");
//                        break;
//                }
//            } else if (name.equals("신사임당")){
//                System.out.print("1입금 2출금 3잔액확인 >>> ");
//                int choose = scanner.nextInt();
//                switch (choose){
//                    case 1:
//                        System.out.print("얼마를 입금하시겠습니까 ? >>> ");
//                        amount = scanner.nextInt();
//                        System.out.print("비밀번호를 입력하세요 >>> ");
//                        pinNum = scanner.nextInt();
//                        account2.deposit(amount,pinNum);
//                        break;
//                    case 2:
//                        System.out.print("얼마를 출금하시겠습니까 ? >>> ");
//                        amount = scanner.nextInt();
//                        System.out.print("비밀번호를 입력하세요 >>> ");
//                        pinNum = scanner.nextInt();
//                        account2.withdraw(amount,pinNum);
//                        break;
//                    case 3:
//                        System.out.println("현재 잔액 : " + account2.getBalance());
//                        break;
//                    default:
//                        System.out.println("없는 메뉴입니다.");
//                        break;
//                }
//            } else {
//                System.out.println("등록된 이름이 없습니다.");
//            }
//
//        }
    }
}
