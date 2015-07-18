import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Daniel Jackson on 5/4/2015.
 */
public class Mario {

    private Egyptians egyptian;

    public Mario(Egyptians egyptian) {
        this.egyptian = egyptian;
    }

    public static void main(String[] args) throws FileNotFoundException {

        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        Mario obj = (Mario) context.getBean("mario1");
        obj.runIt();
    }

    public static void runIt() throws FileNotFoundException {

        Scanner user_input = new Scanner(System.in);
        //Will throw Exception, need file in source directory.
        PrintWriter printWriter = new PrintWriter("Mario.txt");

        int n;
        System.out.print("Enter a number between 0 and 23: ");
        n = Integer.parseInt(user_input.next());

        while (n > 23 || n < 0) {
            System.out.print("Number out of range, please input a number between 0 and 23: ");
            n = Integer.parseInt(user_input.next());
        }
        //We should now have an int between 0 and 23 stored as n and we can use the Pyramid class to build our pyramid.
        Pyramid theLevel = Egyptians.getInstance().creation(n);

        int outputType;
        System.out.print("Enter 1 for console output or 2 for .txt file output: ");
        outputType = Integer.parseInt(user_input.next());

        while (outputType != 1 && outputType != 2) {
            System.out.print("Please enter 1 for console output or 2 for .txt file output: ");
            outputType = Integer.parseInt(user_input.next());
        }

        if(outputType == 1){
            System.out.print(theLevel.toString());
        } else {
            printWriter.print(theLevel.toString());
            printWriter.close();
            System.out.println("Mario printed to Mario.txt");
        }
    }
}
