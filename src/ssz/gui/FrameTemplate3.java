package ssz.gui;

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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



import java.awt.*;

public abstract class FrameTemplate3 extends JFrame { 
	protected int width=1000;
	protected int height=600;

	public FrameTemplate3() {
        this.setTitle("SLR�� PosMachine");
		this.setResizable(true);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setSize(width, height);
		
	}  
	public void init() {
		initComponent();
		addGui();
		initEvent();
	}
	public abstract void initComponent();
	public abstract void addGui();
	public abstract void initEvent();
}
