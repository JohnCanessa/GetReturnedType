import java.lang.reflect.Method; 


/**
 * Definition for singly-linked list.
 * Class to get methods and returned types.
 */
class ListNode {

    // **** members ****
    int         val;
    ListNode    next;

    // **** constructors ****
    ListNode() {
    }

    ListNode(int val) {
        this.val = val; 
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // **** getter and setters ****
    public void setVal(int val) {
        this.val = val;
    }

    public int getVal() {
        return this.val;
    }

    // **** added for testing (not required) ****
    @Override
    public String toString() {
        return "" + this.val;
    }
}


/**
 * Display the names of methods and returned types
 * for the specified class.
 */
public class Solution {


    /**
     * Test scaffolding.
     */
    public static void main(String[] args) {
        
        // **** might get an exception ****
        try {

            // **** create a class object ****
            // Class<?> classObject = ListNode.class;
            Class<?> classObject = Solution.class;

            // **** get a list of all methods in the class ****
            Method[] methods = classObject.getMethods();

            // **** display the number of methods in the class ****
            System.out.println("main <<< methods.length: " + methods.length);

            // **** iterate through the methods ****
            // for (Method method : methods) {
            for (int i = 0; i <= methods.length; i++) {

                // ???? ????
                Method method = methods[i];

                // **** display method name ****
                System.out.println("main <<<       name: " + method.getName());

                // **** get the return type ****
                Class<?> returnType = method.getReturnType();

                // **** display the return type ****
                System.out.println("main <<< returnType: " + returnType.getName());
            }

        } catch (Exception e) {
            System.out.println("main <<< EXCEPTION " + e.getMessage());
        }

    }

}