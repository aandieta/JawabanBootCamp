import java.util.ArrayList;
import java.util.Scanner;

public class CekUname {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        String uname;
        ArrayList<Character> array = new ArrayList<>();
        
        System.out.println("Masukkan Username: ");
        uname = input.nextLine();
        
        for(int i = 0; i < uname.length(); i++) {
            array.add(uname.charAt(i));
        }
        int tidakvalid = 0;
        for(int i = 0; i < 5; i++) {
            if(array.get(i) < 97 && array.get(i) > 122) {
                tidakvalid = 1;
            }
        }
        if(tidakvalid == 0) {
            int valid = 0;
            if(array.get(5) == '_' || array.get(5) == '.') {
                int j = 6;
                for(int i = 0; i < 2; i++) {
                    if(array.get(j) >= 65 && array.get(j) < 91) {
                        valid++;
                    }
                    j++;
                }
            }
            if(valid == 2) {
                System.out.println("Valid");
            }
        }
    }
}
