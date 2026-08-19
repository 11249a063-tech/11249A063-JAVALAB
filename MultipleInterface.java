interface A {
    void displayA();
}

interface B {
    void displayB();
}

public class MultipleInterface implements A, B {

    public void displayA() {
        System.out.println("Method from Interface A");
    }

    public void displayB() {
        System.out.println("Method from Interface B");
    }

    public static void main(String[] args) {
        MultipleInterface obj = new MultipleInterface();
        obj.displayA();
        obj.displayB();
    }
}