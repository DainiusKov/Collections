import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3 {
    public static void main(String[] args){
        Map<String, Double> grades = new HashMap<>(Map.of(
                "Jerry",7.2,
                "Beth",8.0,
                "Mary",6.7,
                "Caleb",7.9,
                "John",8.1,
                "Aaron",7.4,
                "Jake",4.9,
                "Phillip",5.6
        ));
        System.out.println(grades);
        System.out.println(grades.get("Jake"));
        grades.put("Mary",10.0);
        grades.remove("Caleb");

        double min=grades.get("Jerry");
        double max=grades.get("Jerry");
        double avg=0;
        int count=0;
        for(double grade:grades.values()){
            if(grade<min){min=grade;}
            if(grade>max){max=grade;}
            avg+=grade;
            if(grade>=8){count++;}
        }
        avg=avg/grades.size();
        System.out.println("Min: "+min+" Max: "+max);
        System.out.printf("%.1f\n",avg);
        System.out.println(count);
    }
}
