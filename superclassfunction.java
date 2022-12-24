class Person{
    String name;
    int age;
    String marStatus;
    Person(String name, int age, String marStatus){
        this.name = name;
        this.age = age;
        this.marStatus = marStatus;
    }
    void fun(String name, int age, String marStatus){
        System.out.println(" "+this.name+" "+this.age+" "+this.marStatus+"\n");

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
        super.fun(name, age, marStatus);
    }

    void display(){
        System.out.println(" "+name+" "+age+" "+marStatus+" "+experance+" "+salary+" "+preCompany);
    }

}
public class suppeer {
    public static void main(String[] args) {
        Employ E1 = new Employ("Naveen",12,"single",7,150_000,"Wipro");
        Employ E2 = new Employ("Navin",21,"single",16,500_000_000,"SpaceX");
        E1.display();
        E2.display();
    }
}
