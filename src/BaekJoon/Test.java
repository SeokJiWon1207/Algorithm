package BaekJoon;

import java.io.*;
import java.util.Locale;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'B': sb.append("v");
                    break;
                case 'E': sb.append("ye");
                    break;
                case 'H': sb.append("n");
                    break;
                case 'P': sb.append("r");
                    break;
                case 'C': sb.append("s");
                    break;
                case 'y': sb.append("u");
                    break;
                case 'X': sb.append("h");
                    break;
                default: sb.append(s.charAt(i));
            }
        }

        bw.write(sb.toString().toLowerCase(Locale.ROOT));
        bw.flush();
        bw.close();
    }
}

