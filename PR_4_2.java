import java.util.*;

class MyException extends Exception
{
    MyException(String s)
    {
        super(s);
    }
}
public class PR_4_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        if(age<18)
        {
            try{
                throw new MyException("Not Eligile");
            }
            catch(MyException e)
            {
                System.out.println(e);
            }
        }
        else{
            System.out.println("You Are Eligible");
        }
        }
}

