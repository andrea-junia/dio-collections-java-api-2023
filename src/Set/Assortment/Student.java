package Set.Assortment;

import java.util.Comparator;

public class Student implements Comparable<Student>{
    String name; 
    Long id; 
    double average;
    
    public Student(String name, Long id, double average) {
        this.name = name;
        this.id = id;
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + ", average=" + average + "]";
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareToIgnoreCase(name);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }   
   
}

class ComparatorByAverage implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getAverage(), s2.getAverage());
    }
}
