import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class prac10_2 extends JFrame {
    JPanel contentPane = new JPanel(); // 컨텐트팬으로 사용할 패널
    public prac10_2(){
        setTitle("드래깅동안 YELLO"); // 제목 지정
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 닫기 버튼을 눌렀을 시 화면 닫기

        setContentPane(contentPane);
        contentPane.setBackground(Color.GREEN);

        contentPane.addMouseMotionListener(new MyMouseMotionAdapter());

        contentPane.addMouseListener(new MyMouseAdapter2());
        setSize(400,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new prac10_2();
    }

    class MyMouseMotionAdapter extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e) {
            // 마우스가 드래그되는 동안
            contentPane.setBackground(Color.YELLOW);
        }
    }

    class MyMouseAdapter2 extends MouseAdapter {
        public void mouseReleased(MouseEvent e) {
            // 눌러진 마우스 버튼이 떼어질 때
            contentPane.setBackground(Color.GREEN);
        }
    }
}
