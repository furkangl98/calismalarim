package gun1;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push("sabri");
        stack.push("furkan");
        stack.push("lol");
        stack.doldur("Lol atak mı");
        stack.showElements();




    }

     static public Stack stackiDoldur(Stack stack, String eleman) {
         for (; stack.index < stack.array.length; stack.index++) {
             if (stack.array[stack.index] == null) {
                 stack.array[stack.index]=eleman;

                }

         }



         return stack;
     }


}
