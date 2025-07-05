/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author anzoh
 */
public class Student {
   private String name;
   private int age;
  
   public void setName(String name) { // Setter for name
        // Optional: Add validation here, e.g., if (name != null && !name.isEmpty())
        this.name = name;
    }
   
   public String getName(){
       return name;
   }
   
   public void setAge(int age){
       this.age = age;
   }
   
   public int getAge(){
       return age;
   }
    
}
