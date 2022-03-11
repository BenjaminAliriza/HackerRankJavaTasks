import java.util.*;

public class Task7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int x = 1;        
        
        for (int b = 0; b <= x; b++){


            String s = scan.nextLine();
            
            if(scan.hasNext()){
                System.out.println(x + " " + s);
                x++;
            } else {
                System.out.println(x + " " + s);
                x--;
            }
            
        }
        
        scan.close();
    }

}
