import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class prac10_4 extends JFrame {
    JLabel label;
    String text = "Love Java";
    public prac10_4(){
        setTitle("Left 키로 문자열 바꾸기 예제"); // 제목 지정
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 닫기 버튼을 눌렀을 시 화면 닫기

        label= new JLabel("Love Java");

        // Jabel 컴포넌트 생성 후 KeyListener를 단다.
        label.addKeyListener(new MyKeyAdapter());

        label.setSize(200,50);
        add(label);
        setSize(400,200);
        setVisible(true);
        label.requestFocus();
        // 컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정

    }
    public static void main(String[] args) {
        new prac10_4();
    }
    class MyKeyAdapter extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()) { // 입력받은 코드가
                case KeyEvent.VK_LEFT: //<Left> 키 일때
                    label.setText(text); // text 한칸씩 앞으로 당김
                    text = text.substring(1)+text.substring(0, 1);
                    break;
                default:
                    break;
            }
        }
    }

}
