package java_building_blocks.understanding_imports_packages;

import java.util.Random;    // import tells java where to find Random class

//  Java comes with thousands of built-in classes, and there are countless more from developers
//  Java organises these classes using packages and imports
public class ImportExample {
    public static void main(String[] args) {
        Random r = new Random();    // it wouldn't work if we didn't import the class at line 3
        System.out.println(r.nextInt(10));  // prints number between 0 - 9
    }
}
