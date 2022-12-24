class Person{
    String name;
    int age;
    String marStatus;
    Person(String name, int age, String marStatus){
        this.name = name;
        this.age = age;
        this.marStatus = marStatus;
    }
}
class Employ extends Person{
    int experance;
    int salary;
    String preCompany;
    Employ(String name,int age,String marStatus, int experance, int salary, String preCompany){
        super(name, age, marStatus);
        this.experance = experance;
        this.salary = salary;
        this.preCompany = preCompany;
    }

    void display(){
        System.out.println(" "+name+" "+age+" "+marStatus+" "+experance+" "+salary+" "+preCompany);
    }

}
public class suppeer {
    public static void main(String[] args) {
        Employ emp1 = new Employ("naveen",12,"single",7,150000,"Wipro");
        Employ emp2 = new Employ("Navin",21,"single",16,1500000000,"SpaceX");
        emp1.display();
        emp2.display();
    }
}
