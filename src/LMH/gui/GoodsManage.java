package LMH.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class GoodsManage extends FrameTemplete2 implements ActionListener{

	
	public GoodsManage() {
	}


	public static void main(String[] args) {
		GoodsManage fr = new GoodsManage();
		fr.timeGet();
		fr.run();
		}


	@Override
	public void actionPerformed(ActionEvent e) {
	}

	@Override
	public void CreateComponent() {	
	}

	
	@Override
	public void run() {
		while(true) {
			Calendar t = Calendar.getInstance();
			int year = t.get(Calendar.YEAR);
			int month = t.get(Calendar.MONTH)+1;
			int date = t.get(Calendar.DATE);
			int amPm = t.get(Calendar.AM_PM);
			int hour = t.get(Calendar.HOUR);
			int min = t.get(Calendar.MINUTE);
			int sec = t.get(Calendar.SECOND);
			String ampm=amPm==Calendar.AM? "AM":"PM";
			
			String day = (year +"³â " + month + "¿ù " + date + "ÀÏ " + ampm + " " + hour + ":" + min + ":" + sec);
			time.setText(day);
			
				
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
			
	}




}
