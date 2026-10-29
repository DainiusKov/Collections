import java.util.*;


public class Task4 {

    public static void main(String[] args){

        Map<String, List<String>> courses = new HashMap<>(
                Map.of("Math",new ArrayList<String>(List.of("Anna","Matt")),
                                "Physics",new ArrayList<String>(List.of("Matt","Ben")),
                                "IT",new ArrayList<String>(List.of("Ben","Anna")),
                        "Java",new ArrayList<String>(List.of("Matt","Anna","Ben"))
                                )
                );

        System.out.println(courses);
        System.out.println(courses.get("Java"));
                for(Map.Entry<String,List<String> >entry:courses.entrySet()){
                    System.out.println(entry.getKey()+" "+entry.getValue().size());
        }
        System.out.println("Anna's courses: ");
        for(Map.Entry<String,List<String>>entry:courses.entrySet()){
            if(entry.getValue().contains("Anna")){
                System.out.printf(entry.getKey()+" ");
            }
        }
        courses.get("IT").add("Jack");
        courses.get("Math").add("Jack");
        courses.get("IT").remove("Anna");
        System.out.println("\n"+courses);

    }
}
