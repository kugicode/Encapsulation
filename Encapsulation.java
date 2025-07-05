/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulation;

/**
 *
 * @author anzoh
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s = new Student();
        s.setName("Anas");
        System.out.println(s.getName());
        s.setAge(21);
        System.out.println(s.getAge());
    }

}
