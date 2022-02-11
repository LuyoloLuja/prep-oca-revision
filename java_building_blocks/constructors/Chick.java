package java_building_blocks.constructors;

//  a constructor is a special method that creates a new object
//  the name of the constructor must match the name of the class
//  a constructor does not have a return type
public class Chick {
    public Chick() {
        System.out.println("In constructor");
    }

    public void Chick() {}  //  not a constructor, coz it has a return type
}