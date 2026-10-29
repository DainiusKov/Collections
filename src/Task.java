public class Task {
String name;

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }
    public String getBoth(){
        return name+" "+priority;
    }

    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
};
