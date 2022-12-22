package p1;
import java.io.*;
import java.util.*;

public class p1 {
	// member variables 
	String name;
	int id;
	String address;
	public p1(String name, String address, int id){
		this.name = name;
		this.address = address;
		this.id = id;
	}

	public static void main(String[] args) {
		
		 Scanner scr = new Scanner(System.in);
		 p1 obj = new p1("naveen", "sathupally", 0_00);
		 p1 obj2 = new p1("Mohan rao", "sathupally", 1_11);
		 p1 obj3 = new p1("Katta srikanth", "wira", 99_9);
		 System.out.println(obj.name + " " + obj.address + " "+ obj.id);
		 System.out.println(obj2.name + " " + obj2.address + " "+ obj2.id);
		 System.out.println(obj3.name + " " + obj3.address + " "+ obj3.id);
	}
	
}
