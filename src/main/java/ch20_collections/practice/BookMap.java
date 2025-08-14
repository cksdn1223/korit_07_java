package ch20_collections.practice;

import java.util.*;
//Map<String, Integer> bookInventory = new HashMap<>();
//Scanner scanner = new Scanner(System.in);
//public void onProgram(){
//    System.out.println("--- 도서 재고 관리 프로그램 ---");
//    System.out.println("0. 도서 삭제\n1. 도서 추가 \n2. 재고 수정\n3. 재고 목록\n4. 종료");
//    System.out.print("메뉴를 선택하세요 >>> ");
//    int option = scanner.nextInt();
//    scanner.nextLine();
//    if(option==4) System.out.println("프로그램을 종료합니다.");
//    else changeBook(option);
//}
//public void changeBook(int option){
//    switch(option){
//        case 0:
//            removeBook();
//        case 1:
//            addBook();
//        case 2:
//            editBook();
//        case 3:
//            listBook();
//        default:
//            System.out.println("올바른 값을 입력해주세요");
//    }
//    onProgram();
//}
//public void removeBook(){
//    System.out.print("삭제할 도서명을 입력하세요 >>> ");
//    String bookName = scanner.nextLine();
//    if (!bookInventory.containsKey(bookName)) {
//        System.out.println("존재하지 않는 도서입니다.");
//    } else {
//        bookInventory.remove(bookName);
//        System.out.println(bookName + " 도서를 삭제하였습니다.");
//    }
//    onProgram();
//}
//public void addBook() {
//    System.out.print("새 도서명을 입력하세요 >>> ");
//    String bookName = scanner.nextLine();
//    if (bookInventory.containsKey(bookName)) {
//        System.out.println("이미 존재하는 도서입니다. 재고 수정을 이용해주세요");
//    } else {
//        System.out.print("재고 수량을 입력하세요 >>> ");
//        int bookStock = scanner.nextInt();
//        scanner.nextLine();
//        bookInventory.put(bookName,bookStock);
//        System.out.println(bookName + " 도서가 " + bookStock + " 권 추가되었습니다.");
//    }
//    onProgram();
//}
//public void editBook() {
//    System.out.print("재고를 변경할 도서명을 입력하세요 >>>");
//    String bookName = scanner.nextLine();
//    if(!bookInventory.containsKey(bookName)) {
//        System.out.println("해당 도서가 재고에 없습니다.");
//
//    } else {
//        System.out.print("새로운 재고 수량을 입력하세요 >>> ");
//        int bookStock = scanner.nextInt();
//        scanner.nextLine();
//        bookInventory.replace(bookName,bookStock);
//        System.out.println(bookName + " 도서가 " + bookStock + " 권으로 변경되었습니다.");
//    }
//    onProgram();
//}
//public void listBook() {
//    System.out.println("--- 현재 재고 목록 ---");
//    List<String> bookNames = new ArrayList<>(bookInventory.keySet());
//    for (int i = 0 ; i < bookInventory.size() ; i++){
//        System.out.println("도서명 : " + bookNames.get(i) + ", 재고 수량 : " + bookInventory.get(bookNames.get(i)) + " 권");
//    }
//    onProgram();
//}
//public static void main(String[] args) {
//    test run = new test();
//    run.onProgram();
//}
public class BookMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> bookInventory = new HashMap<>();
        boolean endOfProgram = false;
        String bookName = "";
        int bookStock = -1;
        while(!endOfProgram){
            System.out.println("--- 도서 재고 관리 프로그램 ---");
            System.out.println("0. 도서 삭제\n1. 도서 추가 \n2. 재고 수정\n3. 재고 목록\n4. 종료");
            System.out.print("메뉴를 선택하세요 >>> ");
            int option = scanner.nextInt();
            scanner.nextLine();
            if(option==4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            switch(option){
                case 0:
                    System.out.print("삭제할 도서명을 입력하세요 >>> ");
                    bookName = scanner.nextLine();
                    if (!bookInventory.containsKey(bookName)) {
                        System.out.println("존재하지 않는 도서입니다.");
                        break;
                    }
                    bookInventory.remove(bookName);
                    System.out.println(bookName + " 도서를 삭제하였습니다.");
                    break;
                case 1:
                    System.out.print("새 도서명을 입력하세요 >>> ");
                    bookName = scanner.nextLine();
                    if (bookInventory.containsKey(bookName)) {
                        System.out.println("이미 존재하는 도서입니다. 재고 수정을 이용해주세요");
                        break;
                    }
                    System.out.print("재고 수량을 입력하세요 >>> ");
                    bookStock = scanner.nextInt();
                    scanner.nextLine();
                    bookInventory.put(bookName,bookStock);
                    System.out.println(bookName + " 도서가 " + bookStock + " 권 추가되었습니다.");
                    break;
                case 2:
                    System.out.print("재고를 변경할 도서명을 입력하세요 >>>");
                    bookName = scanner.nextLine();
                    if(!bookInventory.containsKey(bookName)) {
                        System.out.println("해당 도서가 재고에 없습니다.");
                        break;
                    }
                    System.out.print("새로운 재고 수량을 입력하세요 >>> ");
                    bookStock = scanner.nextInt();
                    scanner.nextLine();
                    bookInventory.replace(bookName,bookStock);
                    System.out.println(bookName + " 도서가 " + bookStock + " 권으로 변경되었습니다.");
                    break;
                case 3:
                    System.out.println("--- 현재 재고 목록 ---");
                    List<String> bookNames = new ArrayList<>(bookInventory.keySet());
//                    List<Integer> bookStocks = new ArrayList<>(bookInventory.values());
                    for (int i = 0 ; i < bookInventory.size() ; i++){
//                        System.out.println("도서명 : " + bookNames.get(i) + ", 재고 수량 : " + bookStocks.get(i) + " 권");
                        System.out.println("도서명 : " + bookNames.get(i) + ", 재고 수량 : " + bookInventory.get(bookNames.get(i)) + " 권");
                    }
                    break;
                default:
                    System.out.println("올바른 값을 입력해주세요");
            }
        }
    }
}
