import java.util.Stack;

public class StackQuiz {
    public static void main (String [] args) {

        Stack shapes = new Stack();
        shape.push("Triangle");
        shapes.push("Circle");

        System.out.println(shapes.peek() + " is at the top of the stack.");
        shapes.pop(); //removes Circle from the stack 

        System.out.println("The stack contains: " + shapes);

    }

}
