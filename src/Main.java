import javax.swing.JFrame;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        JFrame obj = new JFrame();
        Gameplay gameplay = new Gameplay();
        obj.setBounds(10, 10, 710, 600); //set component
        obj.setTitle("Game Breakout Ball");
        obj.setResizable(false);
        obj.setVisible(true); //ถ้ากำหนด ให้ JFrame แสดงผลบนหน้าจอคอมพิวเตอร์
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);
    }
}