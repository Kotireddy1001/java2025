//Next Greater Element

import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        int[] result = nextGreater(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] nextGreater(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[arr.length];
        Arrays.fill(res, -1);
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i])
                res[stack.pop()] = arr[i];
            stack.push(i);
        }
        return res;
    }
}
