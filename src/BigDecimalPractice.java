
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
            int j = 0;
            for(int b=1;b>-1;b++){
                BigDecimal bd = new BigDecimal(s[b]);
                String strBd = s[b];
                BigDecimal smallerInt = new BigDecimal(s[b+1]);
                String strSmallerInt = s[b+1];
                BigDecimal biggerInt = new BigDecimal(s[b-1]);
                String strBiggerInt = s[b-1];

                if(smallerInt.compareTo(bd)==1) {
                    s[b] = strSmallerInt;
                    s[b + 1] = strBd;
                    j--;
                }else if(biggerInt.compareTo(bd)==-1){
                    s[b] = strBiggerInt;
                    s[b - 1] = strBd;
                    j--;
                }else {
                    j++;
                    if(j==n){
                        break;
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

