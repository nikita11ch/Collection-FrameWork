package CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

class Professor
{
    private String name;
    private String specialization;

    public Professor(String name, String specialization) 
    {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() 
    {
        return name;
    }

    public String getSpecialization() 
    {
        return specialization;
    }
}

class Department 
{
    private String name;
    private final List<Professor> professors; // Department "HAS-A" relationship with Professor

    public Department(String name) 
    {
        this.name = name;
        this.professors = new ArrayList<>();
    }

    public void addProfessor(Professor prof)
    {
        professors.add(prof);
    }

    public String getName() 
    {
        return name;
    }

    public List<Professor> getProfessors() 
    {
        return professors;
    }
}

public class ArrayListDemo7
{
    public static void main(String[] args) 
    {
        Professor prof1 = new Professor("Ravi", "Java");
        Professor prof2 = new Professor("Rahul", "Python");
        Professor prof3 = new Professor("Samir", ".Net");
        
        Department csd = new Department("Computer Science");
        csd.addProfessor(prof1);
        csd.addProfessor(prof2);
        csd.addProfessor(prof3);
        
        // Accessing properties through the "HAS-A" relationship
        System.out.println("Department Name: " + csd.getName());

        System.out.println("Professors in " + csd.getName() + ":");
               
        csd.getProfessors().forEach(prof ->System.out.println("-> " + prof.getName() + " (" + prof.getSpecialization() + ")") );
        
    }
}