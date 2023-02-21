package _24FinalExam.kindergarten;

import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;


public class Kindergarten {

    public String getName() {
        return name;
    }

    private String name;
	private int capacity;
	private List<Child> registry;

    public int getCapacity() {
        return capacity;
    }

    public Kindergarten(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.registry = new ArrayList<>();
    }

    public boolean addChild(Child child){
        if(this.getChildrenCount() < this.getCapacity()) {
            this.registry.add(child);
            return true;
        }
        return false;
    }

    public boolean removeChild(String firstName){
        for (Child ch: this.registry){
            if (ch.getFirstName().equals(firstName)){
                this.registry.remove(ch);
                return true;
            }
        }

        return false;
    }

    public String registryReport() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Registered children in %s:%n", this.getName()));
        this.registry.stream()
                .sorted(Comparator.comparingInt(Child::getAge).reversed());
                //.forEach(System.out::println);
                //.sorted(Comparator.comparing(Child::getFirstName));
//                //.forEach(System.out::println);
        this.registry.forEach(s -> sb.append(s.toString()).append(System.lineSeparator()));
        //return sb.toString();
        return sb.toString();
    }

    public int getChildrenCount () {
        return this.registry.size();
    }

    public Child getChild(String firstName) {
        for (Child child : this.registry){
            if(child.getFirstName().equals(firstName)) {
                return child;
            }
        }
        return null;
    }


    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
