import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel  extends JPanel{
    // اندازه هر خانه از شطرنج
    final int TILE_SIZE = 100;

    // بازخوانی کردن نمایش دادن پنجره هر باز بعد از بسته شده بازی 
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        for(int row = 0; row < 8;  row++){
            for(int col = 0; col < 8; col++){
                // شرط  گذاشتن بالا سطر و ستون ها 
                if((row + col ) % 2 == 0){
                    // رسم کردن یک مربع 
                    g.setColor(Color.WHITE);
                }else{
                    g.setColor(Color.DARK_GRAY);
                }
                g.fillRect(col * TILE_SIZE, row * TILE_SIZE, TILE_SIZE, TILE_SIZE);
            }
              // اضافه کردن مهره با رنگ 
            g.setColor(Color.RED);
            g.fillOval(10, // فاصله مهره از راست 
                        10,
                        80,
                        80);
                         g.setColor(Color.RED);


        }
    }

    
}
