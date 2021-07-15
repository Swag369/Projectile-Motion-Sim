import java.util.*;
import java.io.*;
class problem {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(input.readLine());
        String[] base2 = new String[N];
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(input.readLine());
            int b = Integer.parseInt(st.nextToken());
            String n = ""+Integer.parseInt(st.nextToken());
            int base10 = Integer.parseInt(n, b);
            base2[i] = Integer.toString(base10,2);
        }
        for(int i = 0; i < N; i++) {
            System.out.println(base2[i]);
        }
        input.close();
    }
}
