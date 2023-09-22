package interfacepackage.com;

import java.io.*;

//A simple interface
interface In1 {

 // public, static and final
 final int a = 10;

 // public and abstract
 void display();
}

//A class that implements the interface.
public class TestClass implements In1 {

 // Implementing the capabilities of
 // interface.
 public void display(){
   System.out.println("watching movie");
 }

 // Driver Code
 public static void main(String[] args)
 {
     TestClass obj = new TestClass();
     obj.display();
     System.out.println(a);
 }
}