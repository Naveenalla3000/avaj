class director{
    static void dirfun(){
        System.out.println("This is director function");
    }
}

class deen extends director{
    static void deenfun(){
        System.out.println("This is dean function");
    }
}

class hod extends deen{
    static void hodfun(){
        System.out.println("this is hod's function");
    }
}

class master extends hod{
    static void masfun(){
        System.out.println("this is master function");
    }
}

class student extends master{
    static void studentFunction(){
        System.out.println("This is student function");
    }
}
public class Inheretance{
    public static void main(String[] args) {
        student obj = new student();
        obj.studentFunction();
        obj.masfun();
        obj.hodfun();
        obj.deenfun();
        obj.dirfun();
    }
}
