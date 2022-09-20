import java.util.function.DoubleToIntFunction;

public class PR_4_3{
    public static void main(String[] args) {
        int a=10,b=0;
        int c[] = {1,2,3};
        String ptr=null;
        try{
            System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println("Arithmatic Exception Occured");
        }
        finally{
            System.out.println("Arithmatic Exception Finally Block");
        }
        try{
            for(int i=1;i<4;i++)
            {
                System.out.println(c[i]);
            }
        }
        catch(Exception e)
        {
            System.out.println("Array Index Out Of Bound");
        }
        finally{
            System.out.println("Array Index Finally Block");
        }
        try{
            if(ptr.contains("Dharmik"))
            {
                System.out.println("Same");
            }
            else
            {
                System.out.println("Not Same");
            }
        }
        catch(Exception e)
        {
            System.out.println("Nullpointer Exception Occured");
        }
        finally{
            System.out.println("Nullpointer Finally Block");
        }
    }
}