public class PR_4_1 {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int c[] = { 1, 2, 3 };
        String ptr = null;
        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("Arithmatic Exception Occured");
        }
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println(c[i]);
            }
        } catch (Exception e) {
            System.out.println("Array Index Out Of Bound");
        }
        try {
            if (ptr.contains("Dharmik")) {
                System.out.println("Same");
            } else {
                System.out.println("Not Same");
            }
        } catch (Exception e) {
            System.out.println("Nullpointer Exception Occured");
        }
    }

}