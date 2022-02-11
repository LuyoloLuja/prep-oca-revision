package java_building_blocks.instance_initializer_blocks;

public class OrderOfInitialization {
    //  when writing code that initializes fields in multiple places,
    //  you have to keep in track of the order of initialization

    //  * fields and instance initializer blocks are run in the order they appear in the file
    //  * the constructor runs after all fields and instance initializer blocks have run
}

//  example:
class Chick {
    private String name = "Fluffy"; // 3. set name to Fluffy --- fields and instance initializer blocks are run in the order they appear in the file
    {
        System.out.println("setting field");    //  4.  print this statement
    }

    //  * the constructor runs after all fields and instance initializer blocks have run
    public Chick() {
        name = "Tiny";  //  5.  set name to Tiny
        System.out.println("setting constructor");  // 6. print this statement
    }

    public static void main(String[] args) {    // 1. java starts execution on the main method
        Chick chick = new Chick();  //  2. we come here on object creation
        System.out.println(chick.name); // 7. print name
    }
}

//  Another example
class Egg {
    //  * the constructor runs after all fields and instance initializer blocks have run
    public Egg() {
        number = 5; // 5. set number to 5
    }

    public static void main(String[] args) {    //  1. java execution starts here
        Egg egg = new Egg();    //  2. check which object is created
        System.out.println(egg.number); // 6. print 5
    }

//    fields and instance initializer blocks are run in the order they appear in the file
    private int number = 3; // 3. so set number to 3
    { number = 4; } // 4. set number to 4
}