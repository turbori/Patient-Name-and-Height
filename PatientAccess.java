import java.util.Scanner;

public class PatientAccess {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Patient patient1 = new Patient();
        double userHeight;
        String userName;

        userHeight = scnr.nextDouble();
        userName = scnr.next();

        patient1.setHeight(userHeight);
        patient1.setName(userName);

        System.out.println("Height: " + patient1.getHeight());
        System.out.println("Name: " + patient1.getName());
    }
}