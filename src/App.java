public class App {
    public static void main(String[] args) throws Exception {}

    Reader reader = new  Reader ();

    int num1 = Methods.randInt(1,10);
    int num2 = Methods.randInt(1,10);
    int answer = num1 + num2;

    System.out.printLn("What is " + num1 + "+" + num 2 + "?");
    int guess = reader.getInt("Your guess");

    if (guess == answer) {
        System.out.println("Correct!");
    } else {
        System.out.println("Incorrect.");
    }
    

