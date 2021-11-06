import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class prac8_10 {

    private String fileName = "c:\\temp\\phone.txt";
    private HashMap<String, String> phoneMap = new HashMap<String, String>();

    public prac8_10() { }

    private void readPhoneFile() {
        try {
            Scanner fScanner = new Scanner(new FileReader(new File(fileName)));
            while(fScanner.hasNext()) {
                String name = fScanner.next(); // 이름 읽기
                String tel = fScanner.next(); // 전화번호 읽기
                phoneMap.put(name, tel); // 해시맵에 저장
            }
            fScanner.close();
        }
        catch (IOException e) { // 파일을 저장할 수 없는 경우 예외
            e.printStackTrace();
        }

        System.out.println("총 " + phoneMap.size() + "개의 전화번호를 읽었습니다.");
    }

    private void processQuery() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("이름>> ");
            String name = scanner.next(); // 이름 입력
            if(name.equals("그만"))
                break;
            String tel = phoneMap.get(name);
            if(tel == null) {
                System.out.println("찾는 이름이 없습니다.");
            }
            else{
                System.out.println(tel);
            }
        }

        scanner.close();
    }

    public void run() {
        readPhoneFile();
        processQuery();
    }

    public static void main(String[] args) {
        prac8_10 phoneExplorer = new prac8_10();
        phoneExplorer.run();
    }

}