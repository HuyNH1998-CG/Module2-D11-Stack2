import java.util.Arrays;
import java.util.Scanner;

public class Manage {
    public static void reverseAString() {
        System.out.println("Created an empty Stack");
        MyGenericStack<String> stack = new MyGenericStack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Input a String");
        String string = input.nextLine();
        String[] strings = string.split("");
        for (String s : strings) {
            stack.push(s);
        }
        System.out.println("Stack size:" + stack.size());
        System.out.println("Making reverse String:");
        int i = 0;
        while (!stack.isEmpty()) {
            strings[i] = stack.pop();
            System.out.println(strings[i]);
            i++;
        }
        String joinString = String.join("", strings);
        System.out.println(joinString);
    }

    public static void reverseANumberArray() {
        System.out.println("Created an empty stack");
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Input Array size");
        int arraySize = input.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Input at Index " + i);
            array[i] = input.nextInt();
            stack.push(array[i]);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Stack size:" + stack.size());
        System.out.println("Reversing the array");
        int i = 0;
        while (!stack.isEmpty()){
            array[i] = stack.pop();
            System.out.println(array[i]);
            i++;
        }
        System.out.println(Arrays.toString(array));
    }
}
