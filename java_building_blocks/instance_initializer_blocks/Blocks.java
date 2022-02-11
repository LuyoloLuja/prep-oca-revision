package java_building_blocks.instance_initializer_blocks;

public class Blocks {
    public static void main(String[] args) {
        new Blocks();
        {
            System.out.println("Feathers");
        }
    }
    {
        System.out.println("Snowy");
    }
}
