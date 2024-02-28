package LambdaPractice;

public class Test {
    public static void main(String[] args) {

        MyFunction cube = a -> {
            System.out.println(a*a*a);
        };

        cube.test(2);

        MyFunction oddOrEven = a -> {
          String result =   a%2==0? "Even": "Odd";
            System.out.println(result);
        };

        oddOrEven.test(2);






    }
}
