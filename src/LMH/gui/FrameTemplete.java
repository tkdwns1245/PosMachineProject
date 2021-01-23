package LMH.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.nio.file.AtomicMoveNotSupportedException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



import java.awt.*;

public abstract class FrameTemplete extends JFrame implements Runnable { 
	protected int width=1000;
	protected int height=600;

	public FrameTemplete() {
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = screen.width / 2-width /2;
		int y =  screen.height / 2 - height/2;
        this.setTitle("SLR의 PosMachine");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setSize(width, height);
		this.setLocation(x,y);
	}  
	public void init() {
		initComponent();
		initEvent();
		addGui();
		this.setVisible(true);
		
	}
	public abstract void initComponent();
	public abstract void addGui();
	public abstract void initEvent();
}

