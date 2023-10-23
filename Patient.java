public class Patient {

    /* Your code goes here */
    private static double height;
    private static String name;

    public void setHeight(double newHeight) {
        height = newHeight;
    }

    public void setName(String newName) {
        name = newName;
    }

    public static double getHeight(){
        return height;
    }

    public static String getName(){
        return name;
    }
}