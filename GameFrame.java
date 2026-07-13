import javax.swing.JFrame;
import javax.swing.JPanel;
public class GameFrame extends JFrame {
    

    GameFrame(){

        this.add(new GamePanel());
        this.setTitle("Chekers Game.");
        this.setSize(700, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
    
}
