package gui;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class LoginFrame extends FrameTemplete implements ActionListener {

	public LoginFrame() {
	}

	public void UserAuth(JButton loginBtn) {

		loginBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String id = "SLR";
				String pass = "1234";
				if (id.equals(idTF.getText()) && pass.equals(passwordTF.getText())) {

					JOptionPane.showMessageDialog(null, "로그인 성공");
				} else {

					JOptionPane.showMessageDialog(null, " 로그인 실패 ");
				}
			}
		});
	}

	@Override
	public void CreateComponent() {
		
		// BorderLayOut (동,서,남,북,중앙)
		add(northPanel, BorderLayout.NORTH);
		add(mainPanel, BorderLayout.CENTER);
		add(eastPanel, BorderLayout.EAST);
		add(westPanel, BorderLayout.WEST);
		add(southPanel, BorderLayout.SOUTH);


		// 프레임 북쪽패널  

		northPanel.add(northTop, BorderLayout.NORTH);
		northTop.setPreferredSize(new Dimension(1000, 0));

		northPanel.add(northBot, BorderLayout.SOUTH);
		northBot.setPreferredSize(new Dimension(1000, 10));

		northPanel.add(northLeft, BorderLayout.EAST);
		northLeft.setPreferredSize(new Dimension(100, 35));

		northPanel.add(northCen, BorderLayout.CENTER);
		northCen.setPreferredSize(new Dimension(750, 35));
		northCen.add(title);
		title.setFont(font1);


		northPanel.add(northRight, BorderLayout.WEST);
		northRight.setPreferredSize(new Dimension(100, 35));
		northRight.add(exitBtn);
		
		exitBtn.setPreferredSize(new Dimension(80, 25));
		exitBtn.addActionListener(this);
		exitBtn.setFont(font3);

		// 기타 패널 위치조정

		northPanel.setPreferredSize(new Dimension(1000, 240));
		westPanel.setPreferredSize(new Dimension(300, 600));
		eastPanel.setPreferredSize(new Dimension(300, 600));
		southPanel.setPreferredSize(new Dimension(1000, 190));
		mainPanel.setBackground(FadePoster);
		mainPanel.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1)));

		// mainPanel 구성
		mainPanel.add(mTopPanel);
		mTopPanel.add(id);
		mTopPanel.add(idTF);
		id.setFont(font2);
		mTopPanel.setPreferredSize(new Dimension(250, 30));
		mTopPanel.setBackground(FadePoster);

		mainPanel.add(mCenPanel);
		mCenPanel.add(password);
		password.setFont(font2);
		mCenPanel.add(passwordTF);
		mCenPanel.setPreferredSize(new Dimension(250, 30));
		mCenPanel.setBackground(FadePoster);

		mainPanel.add(mBotPanel);
		mBotPanel.add(loginBtn);
		mBotPanel.add(regiBtn);
		mBotPanel.setPreferredSize(new Dimension(250, 40));
		mBotPanel.setBackground(FadePoster);
	}

	// 종료버튼 구현(무명클래스)
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == exitBtn)
			System.exit(0);
	}

	public static void main(String[] args) {
		LoginFrame fr = new LoginFrame();
		fr.UserAuth(loginBtn);
		fr.CreateComponent();
	}
}
