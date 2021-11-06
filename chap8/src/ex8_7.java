import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ex8_7
{
        public static void main(String[] args) {
            FileReader fin = null;
            int c;
            try {
                fin = new FileReader("c:\\Temp\\test2.txt");
                BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
                while ((c = fin.read()) != -1) {
                    out.write(c);
                }
                new Scanner(System.in).nextLine();
                out.flush(); // 버퍼에 남아 있던 문자 모두 출력
                fin.close();
                out.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
}
