package Code;

import org.fusesource.jansi.AnsiConsole;

public class test {
    public static void main(String args[]){
        int a = 4;
        int s = 0;

        switch (a / 2){
            case 2: s++;
            case 3: a+=s;
            default: a++;
        }
        System.out.println(s+" "+ a);
    }
}
