class Employee{
    private String name;
    private int id;
    private int salary;

    public Employee(String name, int id, int sal){
        this.name = name;
        this.id = id;
        this.salary = sal;

    }

    public String getOutput(){
        return "Name: " + this.name+"\n"+"Salary: " + this.salary+"\n"+"Id: " + this.id;
    }
}

class Teacher extends Employee{
    private int numSub;
    public Teacher(String name,int id,int sal,int numSub){
        super(name,id,sal);
        this.numSub = numSub;

}

public String getOutput(){
    return super.getOutput() +"\n"+ "number of subjects: " + this.numSub;
}
}

class Super{
    public static void main(String[] args){
        Teacher t = new Teacher("Bisham",24,2333,3);
        System.out.println(t.getOutput());
    }
}