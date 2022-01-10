/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9;

/**
 *
 * @author chiew256
 */
public class PersonProfile {
    protected String name;
    protected String gender;
    protected String dateOfBirth;
    
    public PersonProfile(String name, String gender, String dateOfBirth){
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }
    
    public void display(){
        System.out.println("The name of the person is " + this.name);
        System.out.println("The gender of the person is " + this.gender);
        System.out.println("The date of birth of the person is " + this.dateOfBirth);
    }
}
