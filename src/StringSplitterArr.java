
import java.util.*;

public class StringSplitterArr {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] tokens = s.split("[ ,.'!?_@]+");
    

        int index = 0;

        for(int b = 0; b < tokens.length; b++){
            if(tokens[b].length()>0){
                index++;
            }
        }

        System.out.println(index);

        for (int b = 0; b < tokens.length; b++) {
            if(tokens[b].length()!=0){
                System.out.println(tokens[b].toString());
            }
                    }

        scan.close();
    }
}
