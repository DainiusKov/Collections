import java.util.Comparator;
import java.util.PriorityQueue;

public class Task5 {
    public static void main(String[] args){
        PriorityQueue<Task> tasks = new PriorityQueue<>(Comparator.comparing(Task::getPriority).thenComparing(Task::getName));
        tasks.offer(new Task ("ACalculus",5));
        tasks.offer(new Task ("DCalculus2",3));
        tasks.offer(new Task("BCalculus3",2));
        tasks.offer(new Task("CCalculus6",2));
        tasks.offer(new Task("ECalculus4",1));
        tasks.offer(new Task("FCalculus5",5));
        tasks.offer(new Task("BGeometry",5));
        tasks.offer(new Task("DGeometry4",3));
        tasks.offer(new Task("CGeometry3",1));
        tasks.offer(new Task("AGeometry2",2));

        while(!tasks.isEmpty()){
            System.out.printf("Processing: ");
            System.out.println(tasks.poll().getBoth());
        }

    }
}
