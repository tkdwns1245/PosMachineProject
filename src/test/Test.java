package test;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import LMH.gui.GoodsManage;
import LMH.gui.ReceiptManage;
import gui.util.CreateComponentUtil;
import ssz.gui.JoinFrame;
import ssz.gui.LoginFrame3;

public class Test {


	public static void main(String[] args) {
//		LoginFrame3 lf3 = new LoginFrame3();
		ReceiptManage gm = new ReceiptManage();
		gm.run();
		System.out.println("뿌엑");
		
	}
}
