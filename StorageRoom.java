import java.util.*;
public class DOM
{
static int c=1;
static int[][] a;
DOM(int nn)
{
 a= new int[nn][3];
}


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter:");
        int n=sc.nextInt();
        if(n>1&&n<(int)Math.pow(10,12))
        {

        int l,b,h;
        if(isPrime(n))
        {
            l=n;
            b=1;
            h=1;
            System.out.print((2*((l*b)+(b*h)+(h*l))));
        }
        else
        {
                    DOM ob=new DOM(n);
                 
             a[0][0]=1;
                a[0][1]=1;
                a[0][2]=n;

        
       
            
               
                   

                for(int i=2;i<n/2;i++)
                {
                    if(n%i==0)
                    {
                        filler(n/i,i);
  
                        
                    }
                }
                double avg=n*n;
                int fin=0;
                
                int fins[]=new int[c];
                for(int g=0;g<c;g++)
              
                {
                    fins[g]=(2*((a[g][0]*a[g][1])+(a[g][1]*a[g][2])+(a[g][2]*a[g][0])));
                }
                
                    fin=fins[0];
                        for(int g=0;g<c;g++)
                        {
                            if(fins[g]<fin)
                            {
                                fin=fins[g];
                            }
                            
                           
                        }
                        System.out.print(fin);
                        
           
        }
    }
    }
    public static void filler(int na, int y)
    {
        for(int i=1;i<na/2;i++)
        {
            if(na%i==0)
            {
                a[c][0]=y;
                a[c][1]=i;
                a[c][2]=na/i;
                c++;
            }
        }
    }
                

    public static boolean isPrime(int n)
{
for(int i=2;i<n/2;i++)
{
if(n%i==0)
{
return false;
}
}
return true;
}
}
                   
               
                        
            