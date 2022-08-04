import java.util.Scanner;
class FibonacciExample1{
    public static void main(String args[])
    {
        Scanner sn = new Scanner(System.in);
        int n1=0,n2=1,n3,i,count= sn.nextInt();
        if (count == 1){
            System.out.print(n1);
        } else {
            System.out.println(n1+"\n"+n2);
        }
        for(i=2;i<count;++i)
        {
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
}