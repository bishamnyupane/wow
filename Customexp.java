import java.util.*;

class Semester extends Exception{
    public Semester(String msg){
        super(msg);
    }
}
    class Student{
        String name;
        int sem;
        public Student(String name,int sem) throws Semester{
            if(sem<1 || sem >=8){
                throw new Semester("Invalid Semester");

            }
             this.name = name;
             this.sem = sem;
        }
}


public class Customexp {
    public static void main(String[] args){
        try{
            Student s=new Student("Bisham", -20);
        }catch(Semester e){
            System.out.println(e.getMessage());
    }
}
}
