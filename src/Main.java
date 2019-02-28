import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {



        System.out.println("Hello World!");




        File file =
                new File("/home/paulina/Downloads/a_example.in");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }

    public static int fu() {
        return 9;
    }
}

