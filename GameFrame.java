import javax.swing.JFrame;
import javax.swing.JPanel;
public class GameFrame extends JFrame {
    

    GameFrame(){
          // اضافه کردن 
        this.add(new GamePanel());
        // عنوان بازی 
        this.setTitle("Chekers Game.");
        // اندازه صفحه 
        this.pack();
        this.setLocationRelativeTo(null);
        
        // بستن کامل برنامه با زدن دکمه 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        // جلو گیری از تغییرات خود کار صفحه
        this.setResizable(false);
        this.setVisible(true);
        
        
       
    }
    
    
}
