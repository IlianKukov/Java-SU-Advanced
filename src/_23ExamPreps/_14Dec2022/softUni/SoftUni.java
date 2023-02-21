package _23ExamPreps._14Dec2022.softUni;

import java.util.ArrayList;
import java.util.List;

public class SoftUni {
    private int capacity;
    private List<Student> data;

    public int getCapacity() {
        return capacity;
    }
    public int getCount() {
        return data.size();
    }

    public SoftUni(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String insert(Student student) {
        if(this.data.size() >= this.capacity) {
            return "The hall is full.";
        } else if(this.data.contains(student)){
            return "Student is already in the hall.";
        } else {
            this.data.add(student);
            return String.format("Added student %s %s.", student.getFirstName(), student.getLastName());
        }
    }
    public String remove(Student student){
        if (this.data.contains(student)){
            this.data.remove(student);
            return String.format("Removed student %s %s.", student.getFirstName(), student.getLastName());
        }else {
            return String.format("Student not found.");
        }
    }

    public Student getStudent(String firstName, String lastName) {
        for (Student student : this.data){
            if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return student;
            }
        }
        return null;
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Hall size: %d%n", this.getCount()));
        this.data.forEach(s -> sb.append(s.toString()).append(System.lineSeparator()));
        return sb.toString();
    }

}
