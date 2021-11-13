import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class prac10_6 extends JFrame {
    JLabel label;

    public prac10_6() {
        setTitle("클릭 연습용 응용프로그램"); // 제목 지정
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 닫기 버튼을 눌렀을 시 화면 닫기

        label = new JLabel("C");
        label.setSize(100, 50);
        label.setLocation(100, 100);
        label.addMouseListener(new MyMouseAdapter());

        add(label);
        setSize(500, 500);
        setVisible(true);
        label.requestFocus();
        // 컨텐트팬이 키 입력을 받을 수 있도록 포커스 강제 지정

    }

    public static void main(String[] args) {
        new prac10_6();
    }

    class MyMouseAdapter extends MouseAdapter {
        int x, y;

        public void mousePressed(MouseEvent e) {
            x = (int) (Math.random() * 400); // 여백을 조금 남기기 위해 400으로 지정
            y = (int) (Math.random() * 400); // 여백을 조금 남기기 위해 400으로 지정
            label.setLocation(x, y);
        }
    }
}