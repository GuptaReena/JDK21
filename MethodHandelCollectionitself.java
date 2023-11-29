import java.util.ArrayList;
import java.util.Collection;

public class MethodHandelCollectionitself {
    
    public static void main(String[] args) {
        
        Collection<String> strings = new ArrayList<>();

        
        strings.add("one");
        strings.add("two");

        /*It check if the collection is empty or not */
        if(!strings.isEmpty()){
            System.out.println("Indeed String is not enpty");
        }

        System.out.println("The number of element in the string is : " + strings.size()); //2

        /*It clear the content of the collection */
        strings.clear();

        System.out.println("The number of element in the string is now : " + strings.size()); //0
    }
}
