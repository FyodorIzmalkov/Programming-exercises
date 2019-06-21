import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cf867A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String line = br.readLine();
        char current = line.charAt(0);
        int Seatle_to_SF = 0;
        int SF_to_Seatle = 0;
        for (int i = 1; i < n; i++){
            if (current == line.charAt(i)) {
                continue;
            }
            else if (current == 'F' && line.charAt(i) == 'S')
                SF_to_Seatle++;
            else
                Seatle_to_SF++;
            current = line.charAt(i);
        }
        System.out.print(Seatle_to_SF > SF_to_Seatle ? "YES" : "NO");
    }
}
