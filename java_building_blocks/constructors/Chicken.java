package java_building_blocks.constructors;

public class Chicken {
    //  the purpose of a constructor is to initialize fields during object creation,
    //  although you can put any code in there
    int numEggs = 0;    // initialize on line
    String name;
    public Chicken() {
        name = "Duke";  // initialize in constructor
    }
    //  for most classes you don't have to create a constructor,
    //  the compiler will supply a default constructor for you
}
