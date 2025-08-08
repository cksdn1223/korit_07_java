package ch13_inheritance.Books;
/*
1. private title / author
2. 생성자는 AllArgsConstructor
3. Setter / Getter
4. showInfo()
showInfo() 메서드를 void ~~() 정의
예시
제목 : ~
저자 : ~

EBook 클래스에서 Book 상속
자식 고유 필드 private double fileSize / String format

예시
제목 : ~
저자 : ~
파일 크기 : ~
파일 형식 : PDF / EPUB ...

BookMain에서
Book 클래스 인스턴스 생성
Getter를 활용하여
이 책의 제목은 자바의 정석입니다.
이 책의 저자는 남궁성입니다.
book1.showInfo();
제목 : 자바의 정석
저자 : 남궁성

EBook 클래스의 인스턴스 생성
스프링 입문 / 이강준 / 5.2 mb / EPUB 으로 생성
setter 활용하여 파일 형식을 pdf 로 변환
그리고 getter 활용
이 전차잭의 포맷은 PDF입니다. 를 출력하시오.
ebook1.showInfo();
제목 : 스프링 입문
저자 : 이강준
파일 크기 : 5.2 MB
파일 형식 : PDF

를 출력하시오
 */
public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("자바의 정석", "남궁성");
        EBook ebook1 = new EBook("스프링 입문", "이강준", 5.2,"EPUB");

        System.out.println("이 책의 제목은 " + book1.getTitle() + "입니다.");
        System.out.println("이 책의 저자는 " + book1.getAuthor() + "입니다.");
        book1.showInfo();
        System.out.println();

        ebook1.setFormat("PDF");
        System.out.println("이 전자책의 포맷은 " + ebook1.getFormat() + "입니다.");
        ebook1.showInfo();
    }
}
