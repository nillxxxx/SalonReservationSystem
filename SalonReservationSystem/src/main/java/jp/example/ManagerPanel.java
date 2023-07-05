package jp.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ManagerPanel extends JPanel implements ActionListener{

	/**
	 * Create the panel.
	 */
	public ManagerPanel() {
		setBounds(0, 0, 562, 529);//パネルサイズ
		setLayout(null);//絶対レイアウト
		
		JButton ReturnButton = new JButton("戻る");
		ReturnButton.setBounds(463, 481, 73, 21);
		ReturnButton.addActionListener(this);
		ReturnButton.setActionCommand("メインへ");
		add(ReturnButton);
		
		JButton M_BookButton = new JButton("予約台帳");
		M_BookButton.addActionListener(this);
		M_BookButton.setActionCommand("予約台帳");
		M_BookButton.setBounds(108, 146, 91, 21);
		add(M_BookButton);
		
		JButton M_CustomerButton = new JButton("顧客台帳");
		M_CustomerButton.addActionListener(this);
		M_CustomerButton.setActionCommand("顧客台帳");
		M_CustomerButton.setBounds(108, 322, 91, 21);
		add(M_CustomerButton);
		
		JButton M_StuffButton = new JButton("スタッフ管理");
		M_StuffButton.addActionListener(this);
		M_StuffButton.setActionCommand("スタッフ管理");
		M_StuffButton.setBounds(316, 146, 109, 21);
		add(M_StuffButton);
		
		JButton M_MenuButton = new JButton("メニュー管理");
		M_MenuButton.addActionListener(this);
		M_MenuButton.setActionCommand("メニュー管理");
		M_MenuButton.setBounds(316, 322, 109, 21);
		add(M_MenuButton);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("予約台帳")) {
			Main.card.show(Main.CardLayoutPanel, "予約台帳パネル");
		}
		
		if(e.getActionCommand().equals("顧客台帳")) {
			Main.card.show(Main.CardLayoutPanel, "顧客台帳パネル");
		}
		
		if(e.getActionCommand().equals("スタッフ管理")) {
			Main.card.show(Main.CardLayoutPanel, "スタッフ管理パネル");
		}
		
		if(e.getActionCommand().equals("メニュー管理")) {
			Main.card.show(Main.CardLayoutPanel, "メニュー管理パネル");
		}
		
		if(e.getActionCommand().equals("メインへ")) {
			Main.card.show(Main.CardLayoutPanel, "メインパネル");
		}
	}

}
