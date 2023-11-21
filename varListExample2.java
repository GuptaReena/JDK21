import java.util.List;

public class varListExample2 {

    public static void main(String[] args) {

        /* In this we have decalred List type of variable is String */
        System.out.println("*****We have declare datatype*****");
        List<String> list = List.of("Reena", "Sritika", "Ava", "Riya");
        for (String str : list) {
            System.out.println(str);
        }

        /* Now we are decalring a list by using var keyword */
        System.out.println("*****Now we are using var Keyword*****");
        var list1 = List.of("Unit", "Tens", "Hundred", "Thousand", "Lakhs", "Crocer", "Million", "Billion");
        for (var str : list) {
            System.out.println(str);
        }
    }

}
