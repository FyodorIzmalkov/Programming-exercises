package hackerrank.unsorted;

import java.util.*;

class Student2 {
    private int id;
    private String name;
    private double cgpa;

    public Student2(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class StudentsComparator implements Comparator<Student2> {
    @Override
    public int compare(Student2 o1, Student2 o2) {
        int CGPAresult = Double.compare(o2.getCGPA(), o1.getCGPA());
        if (CGPAresult == 0){
            int nameResult = o1.getName().compareTo(o2.getName());
            if (nameResult == 0){
                return Integer.compare(o2.getID(), o1.getID());
            } else {
                return nameResult;
            }
        } else {
            return CGPAresult;
        }
    }
}

class Priorities {
    List<Student2> getStudents(List<String> events){
        PriorityQueue<Student2> pq = new PriorityQueue<>(events.size(),
                new StudentsComparator());
        for (String event : events){
            String[] arr = event.split(" ");
            if (arr[0].equals("ENTER")){
                pq.add(new Student2(Integer.parseInt(arr[3]),arr[1], Double.parseDouble(arr[2])));
            } else {
                pq.poll();
            }
        }

        List<Student2> result = new ArrayList<>();
        while (!pq.isEmpty()){
            result.add(pq.poll());
        }
        return result;
    }
}


public class PriorityQueue1 {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student2> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student2 st: students) {
                System.out.println(st.getName());
            }
        }
    }
}