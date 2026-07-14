import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel  extends JPanel{
    // اندازه هر خانه از شطرنج
    final int TILE_SIZE = 80;
    // خانه های انتخاب شده 
    int selectedRow = -1;
    int selectedCol = -1;

    // بازخوانی کردن نمایش دادن پنجره هر باز بعد از بسته شده بازی 
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
            // رسم کردن سطر و ستو های بازی 
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
          
           


        }
            //   قزمر اضافه کردن مهره با رنگ 
            g.setColor(Color.CYAN);
            for(int row = 0; row < 3; row++){
                for(int col = 0; col < 8; col++){

                    // شرط فقط روی خانه های تیره قرار بده 
                    if((row + col ) % 2 != 0){
                        g.fillOval(
                            // محل افقی و عمودی مهره ها 
                            col* TILE_SIZE + 8, row * TILE_SIZE + 8,
                            // عرض و ارتفاع مهره ها
                             64, 64);
                    }
                }
            }
            
            g.setColor(Color.ORANGE);
            for(int row = 5; row <8; row++){
                for(int col = 0; col < 8; col++){

                    if((row + col) % 2 != 0){
                        g.fillOval(col * TILE_SIZE + 8,
                            row * TILE_SIZE + 8  ,
                             64, 64);
                    }
                   
                }
                System.out.println(row); System.out.println(row);
            }
 
    }
    @Override
           public java.awt.Dimension getPreferredSize() {
           return new java.awt.Dimension(640, 640);
            }
                  // 
            public GamePanel(){
                // کلیک موس را تشخیص میدهد 
                this.addMouseListener(new java.awt.event.MouseAdapter() {
                    // هربار دکمه موس که فشار داده می شود را اجرا می کند 
                    @Override 
                    public void mousePressed(java.awt.event.MouseEvent e) {
                           // ستون شماره 
                           int col = e.getX() / TILE_SIZE;
                            // با تقسیم کردن به هر خانه شماره سطر بدست می آید 
                           int row = e.getY() / TILE_SIZE;

                           selectedRow = row ;
                           selectedCol = col;

                           System.out.println("Row: " + row + "Col: " + col);

                           repaint();
                    }
                };

                )}
                    
                
            

    
}
