import java.util.Scanner;
public class Ex
{
    public void Task1()
    {
        /*------------------------ Завдання 1-------------------------*/
        System.out.print (" Enter the three values of the quadratic equation ---> ");
        Scanner scanner = new Scanner(System.in);
        //x^2+4+1 = 0
        double x1 ;
        double x2 ;
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();
        double bC ;
        double D ;
        double Ds ;

        bC = Math.pow (b,2); // В квадрат
        D = bC - 4 * a * c ; //Обрахуноу дискримінанту
        Ds = Math.sqrt (D);  //Обрахуноу кореня дискримінанту
        System.out.println( "Result D = " + D );

        x1 = (-b - Ds) / (2 * a);
        x2 = (-b + Ds) / (2 * a);

        String e = String.format("%.3f", x1 );
        String d = String.format("%.3f", x2 );
        System.out.println("Result X1 = " + e +" i X2 = "+  d);
    }
    /*------------------------ Завдання 2-------------------------*/
    public void Task2() {
        System.out.print(" Enter the X and Y coordinate ---> ");

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > 0 && y > 0)
            System.out.println("The I Sqrt");
        else if (x < 0 && y > 0)
            System.out.println("The II Sqrt");
        else if (x < 0 && y < 0)
            System.out.println("The III Sqrt");
        else if (x > 0 && y < 0)
            System.out.println("The IV Sqrt");
    }
    /*------------------------ Завдання 3-------------------------*/
    public void Task3()
    {
        System.out.print (" Entered number ---> ");

        Scanner Scan = new Scanner(System.in);
        int x = Scan.nextInt();

        if (x>=10 && x<=99)
            System.out.println (" A two-digit number = " + x );
        else
            System.out.println (" Is a number less than 10 or greater than 99 " );

        double SCN ;
        SCN = x%2;
        if(SCN == 0)
            System.out.println (" It will be an even number " );
        else
            System.out.println (" The number is not even " );
    }
    /*------------------------ Завдання 4-------------------------*/
    public void Task4()
    {
        /*
                    / x^2+3 ,  x < 0
           f(x) = -[  6c/x  ,  0<=x<=5
                    \ -x+9  ,  x>5
                                             */
        System.out.print (" Entered X ---> ");
        Scanner Scan = new Scanner(System.in);
        double x = Scan.nextInt();
        double res1 ,res2;
        double pow_x ;
        double sqrt_x ;

        sqrt_x = Math.sqrt(x);
        pow_x = Math.pow(x,2);

        res1 = pow_x + 3 ;
        res2 = 6 * sqrt_x ;

        double f;
        if (x < 0) {
            f = res1;
        } else if (x <= 5) {
            f = res2 * x;
        } else {
            f = -x + 9;
        }
        System.out.println("f(x) = " + f);
    }
    /*------------------------ Завдання 5-------------------------*/
    public void Task5()
    {
        System.out.println(" Введіть цифру від 1 до 7 і вам покаже який це день ");
        Scanner scn = new Scanner(System.in);
        int day = scn.nextInt();

        switch (day)
        {
            case 1: case 2: case 3: case 4: case 5:
            {
            System.out.println(" Робочий день ");
            break;
            }
            case 6: case 7:
            {
            System.out.println(" Вихідний день ");
            break;
            }
        }
    }
}
