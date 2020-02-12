import java.util.*;

class Student implements Comparator<Student> {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.cgpa == o2.cgpa ? (o1.fname.compareTo(o2.fname) == 0 ? (o1.id > o2.id ? -1 : 1) : o1.fname.compareTo(o2.fname)) : o1.cgpa > o2.cgpa ? -1 : 1;
    }
}

public class Sort1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, (o1, o2) ->
        {
            if (o1.getCgpa() == o2.getCgpa()){
                return o1.getFname().compareTo(o2.getFname()) == 0 ? o1.getId() - o2.getId() : o1.getFname().compareTo(o2.getFname());
            }
            return o1.getCgpa() > o2.getCgpa() ? -1 : 1;
        });

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
