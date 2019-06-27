import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
   private static void createAndShowGui() {
      int rows = 7;
      int cols = 53;
      int cellWidth = 20;
      ColorGrid mainPanel = new ColorGrid(rows, cols, cellWidth);
      Toolbox tb = new Toolbox();

      JFrame frame = new JFrame("Color Grid Example");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(mainPanel);
      frame.pack();
      frame.setLocationByPlatform(true);
      frame.setVisible(true);
      frame.setResizable(false);
      
      JFrame frame2 = new JFrame("Colors");
      frame2.setDefaultCloseOperation(0);
      frame2.getContentPane().add(tb);
      frame2.pack();
      frame2.setLocationByPlatform(true);
      frame2.setVisible(true);
      frame2.setResizable(false);
      frame2.setLocationRelativeTo(null);
   }

   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            createAndShowGui();
         }
      });
   }
}