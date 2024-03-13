package programming.java.collection.comparator;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable {
    private int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int id1 = this.id;
        Employee e = (Employee) o;
        int id2 = e.id;

        return id1 < id2 ? -1 : (id1 == id2 ? 0 : 1);
    }
}

class MyComparator1 implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        String s1 = e1.name;
        String s2 = e2.name;
        return s1.compareTo(s2);
    }
}

public class Demo5 {
    public static void main(String[] args) {
        Employee e1 = new Employee(102, "Bhoomi");
        Employee e2 = new Employee(104, "Yogesh");
        Employee e3 = new Employee(101, "Deepak");
        Employee e4 = new Employee(103, "Prakash");
        Employee e5 = new Employee(102, "Sandy");
        TreeSet t = new TreeSet();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);

        System.out.println(t);

        TreeSet t1 = new TreeSet(new MyComparator1());
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);

        System.out.println(t1);
    }
}