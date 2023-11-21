public class varrestrictionExample {

    /*
     * In this example we cant declare the parameter using var keyword we have
     * to define the datatype
     */

    static void setname(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {

        setname("Reena");

    }
}
