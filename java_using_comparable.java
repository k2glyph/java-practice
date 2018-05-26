import java.util.*;
class Student implements Comparable {

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
    public int compareTo(Object o) {
        Student other=(Student) o;
        if(this.getCgpa()==other.getCgpa()) {
            if(this.getFname().equals(other.getFname())) {
                return this.getId()-other.getId();
            }
            return this.getFname().compareTo(other.getFname());
        }
        if(other.getCgpa()-this.getCgpa()>0){
            return 1;
        }
            return -1;
    }
}

public class Solution {

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
        Collections.sort(studentList);
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}



