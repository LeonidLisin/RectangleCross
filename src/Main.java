import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String args[]) throws java.io.IOException {
        float x11, x21, y11, y21, x12, x22, y12, y22, crossArea;
        // вводим координаты двух прямоугольников с консоли
        Scanner scan = new Scanner(System.in);

        System.out.print("Input 1st rectangle x1");
        x11 = scan.nextFloat();
        System.out.print("Input 1st rectangle y1");
        y11 = scan.nextFloat();
        System.out.print("Input 1st rectangle x2");
        x12 = scan.nextFloat();
        System.out.print("Input 1st rectangle y2");
        y12 = scan.nextFloat();
        System.out.print("Input 2nd rectangle x1");
        x21 = scan.nextFloat();
        System.out.print("Input 2nd rectangle y1");
        y21 = scan.nextFloat();
        System.out.print("Input 2nd rectangle x2");
        x22 = scan.nextFloat();
        System.out.print("Input 2nd rectangle y2");
        y22 = scan.nextFloat();

        Rectangle[] rectangle = new Rectangle[2];
        rectangle[0] = new Rectangle (x11, y11, x12, y12);
        rectangle[1] = new Rectangle (x21, y21, x22, y22);

        if ((rectangle[0].getCrossLenghtX(rectangle[1])==-1)||(rectangle[0].getCrossLenghtY(rectangle[1])==-1)){
            System.out.println ("Rectangles are not crossing");
        }
        else {
            crossArea = rectangle[0].getCrossLenghtX(rectangle[1])*rectangle[0].getCrossLenghtY(rectangle[1]);
            System.out.println("Crossing area are " + crossArea);
        }
    }
}
