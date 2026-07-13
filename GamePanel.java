import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel  extends JPanel{

    final int TILE_SIZE = 100;

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        for(int row = 0; row < 8;  row++){
            for(int col = 0; col < 8; col++){
                if((row + col ) % 2 == 0){
                    g.setColor(Color.WHITE);
                }else{
                    g.setColor(Color.DARK_GRAY);
                }
                g.fillRect(col * TILE_SIZE, row * TILE_SIZE, TILE_SIZE, TILE_SIZE);
            }
        }
    }

    
}
