import java.util.PriorityQueue;
public class PQ_objects {
static class Student implements Comparable<Student> {
    String name;
    int rank;

    public Student(String name, int rank){
        this.name= name;
        this.rank= rank;
    }


    @Override
    public int compareTo(Student s2){          //Java String compareTo() Method :The method returns 0 if the string is equal to the other string.
        return this.rank-s2.rank;
    }
}    
public static void main(String[] args) {
    PriorityQueue <Student> pq = new PriorityQueue<>();
    pq.add(new Student("A", 4));
    pq.add(new Student("B", 5));
    pq.add(new Student("C", 2));
    pq.add(new Student("D", 12));

    while(!pq.isEmpty()){
        System.out.println(pq.peek().name+"->"+pq.peek().rank);
        pq.remove();
    }
}
}
