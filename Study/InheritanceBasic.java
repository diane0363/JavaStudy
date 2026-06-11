class Parent {
    int x = 10;
    String str = "Parent";

    Parent() {
        System.out.println("Parent() constructor");
    }

    void hello() {
        System.out.println("Parent.hello()");
    }
}

class Child extends Parent {
    int x = 999; // (주의) 필드 섀도잉: 부모 x를 '대체'하는 게 아님
    int y = 20;
    String str = "Child"; // (주의) 이것도 섀도잉

    Child() {
        // super(); // 생략해도 컴파일러가 자동 삽입(부모 기본 생성자 존재 시)
        System.out.println("Child() constructor");
    }

    @Override
    void hello() {
        System.out.println("Child.hello()");
    }

    void printFields() {
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
        System.out.println("this.str = " + this.str);
        System.out.println("super.str = " + super.str);
        System.out.println("y = " + y);
    }
}

public class InheritanceBasic {
    public static void main(String[] args) {
        System.out.println("=== new Child() ===");
        Child c = new Child();
        c.printFields();
        c.hello();

        System.out.println("\\n=== Upcasting: Parent p = new Child() ===");
        Parent p = new Child();

        // p.y 는 컴파일 에러: 참조 타입이 Parent라서 Child 멤버에 접근 불가
        // => 필드는 다형성이 없다!!
        System.out.println("p.x = " + p.x); // 필드: Parent의 x(10)가 보임
        System.out.println("p.str = " + p.str); // 필드: Parent가 보임
        // p.printFields(); // Parent에 해당 메소드가 없어서 사용 불가

        // 동적 메소드 (인스턴스 메소드) 動的ディスパッチ
        // = 오버라이드 가능한 메소드
        // 호출 시점에 JVM이 실제 객체 타입을 보고 결정
        p.hello(); // 메소드: 실제 객체가 Child라서 Child.hello() 호출됨

    }
}