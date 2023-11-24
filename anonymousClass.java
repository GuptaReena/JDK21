public class anonymousClass {

    interface DemoAnno {
        void method1();

        void method2();
    }

    public static void main(String[] args) {

        DemoAnno obj = new DemoAnno() {

            @Override
            public void method1() {
                // TODO Auto-generated method stub
                // throw new UnsupportedOperationException("Unimplemented method 'method1'");
                System.out.println("I am method 1");
            }

            @Override
            public void method2() {
                // TODO Auto-generated method stub
                // throw new UnsupportedOperationException("Unimplemented method 'method2'");
                System.out.println("I am method 2");
            }

        };
        obj.method1();
        obj.method2();

    }
}
