
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class Toolbox extends JPanel implements MouseListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel selected;
	private JLabel[] labels = new JLabel[5];
	public static MyColor mycolor = MyColor.LIGHT_GREEN;

	public Toolbox() {
		setBorder(new EmptyBorder(10, 10, 10, 10));
		// 2*3 because there are 5 possible colors
		GridLayout gl = new GridLayout(3, 3);
		gl.setHgap(10);
		gl.setVgap(10);
		setLayout(gl);

		Dimension d = new Dimension(20, 20);
		Border b = BorderFactory.createLineBorder(Color.BLACK, 3);
		Border selected = BorderFactory.createLineBorder(Color.BLUE, 3);

		//shouldve been in a loop instead of ctlr c ctrl v
		JLabel gray = new JLabel();
		gray.setPreferredSize(d);
		gray.setOpaque(true);
		gray.setBorder(b);
		gray.setBackground(MyColor.LIGHT_GRAY.getColor());
		add(gray, 0, 0);
		labels[0] = gray;
		JLabel green = new JLabel();
		green.setPreferredSize(d);
		green.setOpaque(true);
		green.setBorder(selected);
		green.setBackground(MyColor.LIGHT_GREEN.getColor());
		this.selected = green;
		add(green, 0, 1);
		labels[1] = green;
		JLabel green1 = new JLabel();
		green1.setPreferredSize(d);
		green1.setOpaque(true);
		green1.setBorder(b);
		green1.setBackground(MyColor.GREEN.getColor());
		add(green1, 0, 2);
		labels[2] = green1;
		JLabel green2 = new JLabel();
		green2.setOpaque(true);
		green2.setBorder(b);
		green2.setPreferredSize(d);
		green2.setBackground(MyColor.DARK_GREEN.getColor());
		add(green2, 1, 0);
		labels[3] = green2;
		JLabel green3 = new JLabel();
		green3.setBorder(b);
		green3.setOpaque(true);
		green3.setPreferredSize(d);
		green3.setBackground(MyColor.DARKEST_GREEN.getColor());
		add(green3, 1, 1);
		labels[4] = green3;
		
		gray.addMouseListener(this);
		green.addMouseListener(this);
		green1.addMouseListener(this);
		green2.addMouseListener(this);
		green3.addMouseListener(this);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		JLabel chosen = (JLabel)e.getSource();
		Border b = BorderFactory.createLineBorder(Color.BLACK, 3);
		Border selected = BorderFactory.createLineBorder(Color.BLUE, 3);
		
		for (int i = 0; i < 5; i++) {
			if (chosen == labels[i]) {
				this.selected.setBorder(b);
				labels[i].setBorder(selected);
				this.selected = labels[i];
				this.selected.setBorder(selected);
				switch(i) {
				case 0: mycolor = MyColor.LIGHT_GRAY; break;
				case 1: mycolor = MyColor.LIGHT_GREEN; break;
				case 2: mycolor = MyColor.GREEN; break;
				case 3: mycolor = MyColor.DARK_GREEN; break;
				case 4: mycolor = MyColor.DARKEST_GREEN; break;
				}
				break;
			}
		}
		
		
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
