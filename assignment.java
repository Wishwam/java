// public class assignment{
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// }

// import java.util.Scanner;

// public class assignment {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         int sum = a + b;
//         System.out.println("Sum = " + sum);
//     }
// }

// import java.util.Scanner;

// public class assignment {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Principal: ");
//         double principal = sc.nextDouble();
//         System.out.print("Enter Rate of Interest: ");
//         double rate = sc.nextDouble();
//         System.out.print("Enter Time (in years): ");
//         double time = sc.nextDouble();

//         double si = (principal * rate * time) / 100;
//         System.out.println("Simple Interest = " + si);
//     }
// }

// import java.util.Scanner;

// public class assignment {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         int fact = 1;

//         for (int i = 1; i <= num; i++) {
//             fact *= i;
//         }

//         System.out.println("Factorial = " + fact);
//     }
// }

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int result = 0;
        int n = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            result += Math.pow(digit, n);
            num /= 10;
        }

        if (result == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}
