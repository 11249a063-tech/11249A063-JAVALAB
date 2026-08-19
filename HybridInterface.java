interface A {
    void showA();
}

interface B extends A {
    void showB();
}

interface C extends A {
    void showC();
}

interface D extends B, C {
    void showD();
}

public class HybridInheritance implements D {

    @Override
    public void showA() {
        System.out.println("Method from Interface A");
    }

    @Override
    public void showB() {
        System.out.println("Method from Interface B");
    }

    @Override
    public void showC() {
        System.out.println("Method from Interface C");
    }

    @Override
    public void showD() {
        System.out.println("Method from Interface D");
    }

    public static void main(String[] args) {
        HybridInheritance obj = new HybridInheritance();

        obj.showA();
        obj.showB();
        obj.showC();
        obj.showD();
    }
}