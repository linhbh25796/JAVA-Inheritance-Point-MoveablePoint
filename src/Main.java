import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1. Point Test ");
            System.out.println("2. MoveablePoint Test ");
            System.out.println("0. Exit ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    PointTest();
                    break;
                case 2:
                    MoveablePointTest();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("just input 0 to 2.");
                    break;
            }
        }
    }

    public static void PointTest(){
        Point p = new Point();
        System.out.println(p);
        p = new Point(1,2);
        System.out.println(p);
    }

    public static void MoveablePointTest(){
        MoveablePoint mP = new MoveablePoint();
        System.out.println(mP);
        mP = new MoveablePoint(1,2,100,200);
        System.out.println(mP);
    }
}
