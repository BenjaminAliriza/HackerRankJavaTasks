
import java.math.BigDecimal;
import java.util.*;
class BigDecimalPractice{

        public static void main(String []args){
            //Input
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            String []s=new String[n+2];
            for(int i=0;i<n;i++){
                s[i]=sc.next();
            }
            sc.close();

            //Write your code here
            for(int b=0;b>-1;b++){

                BigDecimal biggestInt = new BigDecimal(s[b]);
                BigDecimal bd = new BigDecimal(s[b+1]);
                if(bd.compareTo(biggestInt)==1){
                    s[b]=bd.toString();
                    s[b+1]=biggestInt.toString();
                    System.out.println("\n----------------------------\nOutput number: " + b + "\n");
                    for(int i=0;i<n;i++)
                    {
                        System.out.println(s[i]);
                    }

                }
                if(b==n-2){
                    b = 0;
                }

            }
            //Output
            for(int i=0;i<n;i++)
            {
                System.out.println(s[i]);
            }
        }

    }

