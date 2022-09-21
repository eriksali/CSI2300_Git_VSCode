/*
public class Animal {
    
    public int age;
    public String gender;

    public static void main(String[] args) throws Exception {
        
        Animal myAnimal = new Animal();
        Fish     myFish = new Fish();
        Zebra   myZebra = new Zebra();

        myAnimal.isMammal();
        myAnimal.mate();
        myZebra.run();
        
    }

    public void isMammal(){
        System.out.println("This is a private method isMammal() from class Animal");
    }

    public void mate(){
        System.out.println("This is a private method mate() from class Animal");
    }


}

*/
import java.util.Scanner;  // Import the Scanner class

public class Animal {
    
    public static int age;
    public static String gender;

    public static void main(String[] args) throws Exception {
        
        Animal myAnimal = new Animal();
        Fish     myFish = new Fish();
        Zebra   myZebra = new Zebra();

        myAnimal.isMammal();
        myAnimal.mate();
        myZebra.run();

        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter gender");
    
        gender = sc.nextLine();  // Read user input
        System.out.println("Gender is " + gender);  // Output user input


        System.out.println("Enter age");
    
        age = sc.nextInt();  // Read user input
        System.out.println("Age is " + age);  // Output user input
        
    }

    public void isMammal(){
        System.out.println("This is a public method isMammal() from class Animal");
    }

    public void mate(){
        System.out.println("This is a public method mate() from class Animal");
    }


}




