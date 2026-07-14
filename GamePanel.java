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
    
           // مهره ها را با آرایه رسم می کنیم 
           // تمام خانه های صفحه را بررسی می کنیم 
            for(int row = 0; row < 8; row++){
                for(int col = 0; col < 8; col++){

                    if(board[row][col] == 1) {
                        // رنگ مهره 
                        g.setColor(Color.CYAN);
                         // رسم مهره 
                        g.fillOval(col * TILE_SIZE + 8, row * TILE_SIZE + 8, 64, 64);
                    }
                     // اگر مقدار خانه 2 باشد مهره نارنجی است 
                  else if(board[row][col] == 2){
                    g.setColor(Color.ORANGE);
                    g.fillOval(col * TILE_SIZE + 8, row * TILE_SIZE + 8, 64, 64);
                  }
                }
            }
        }

    @Override
           public java.awt.Dimension getPreferredSize() {
           return new java.awt.Dimension(640, 640);
            }
             //اضافه کردن مهره ها به بازی 
             // 0 خالی 
             // 1 مهره زرد 
             // 2 مهره آبی 
            int[][] board= new int[8][8];
             // ساخت صفحه اولیه بازی    
            public void setupBoard(){
                  
                        System.out.println(board[0][1]);
                        System.out.println(board[7][0]);
                       // مهره ها زرد 
                for(int row = 0; row < 3; row++){
                    for(int col = 0; col < 8; col++){
                          // فقط روی خانه های تیره مهره ها را قرار بده 
                        if((row + col) %2 != 0){
                            board[row][col] = 1;
                        }
                    }
                }

                // مهره های آبی 
                for(int row = 5; row < 8; row++){
                    for(int col = 0; col < 8; col++){
                             // روی خانه های روشن قرار بده 
                        if((row + col) % 2 != 0){
                                        
                            board[row][col] = 2;
                        }
                    }
                }

            }
            public GamePanel(){
                // صدازدن صفحه اولیه بازی 
                setupBoard();
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

                           System.out.println("Row: " + row + " Col: " + col);

                           repaint();
                           
                    }
                });

                      
                }
                    
                
            

    
}
