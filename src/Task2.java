import java.util.*;
import java.util.stream.Stream;

public class Task2 {

    public static void main(String[] args){
        String text = "Java is powerful and Java is popular and Java is fast";
        List<String>splitText= List.of(text.split(" "));
        System.out.println(splitText);

        Set<String>uniqueText=new HashSet<>(splitText);
        System.out.println(uniqueText);
        System.out.println("There are "+uniqueText.size()+" unique words");

        System.out.println(uniqueText.stream()
                .sorted(Comparator.comparing(name->name,String.CASE_INSENSITIVE_ORDER))
                .toList());
    }
}
