package jp.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MainPanel extends JPanel implements ActionListener{

	/**
	 * Create the panel.
	 */
	public MainPanel() {
		setBounds(0, 0, 562, 529);//パネルサイズ
		setLayout(null);//絶対レイアウト

		JButton ReservationButton = new JButton("予約");
		ReservationButton.setBounds(234, 111, 69, 21);
		ReservationButton.addActionListener(this);
		setLayout(null);
		ReservationButton.setActionCommand("予約");
		add(ReservationButton);
		
		JButton ChangeButton = new JButton("変更");
		ChangeButton.setBounds(234, 235, 69, 21);
		ChangeButton.addActionListener(this);
		ChangeButton.setActionCommand("変更");
		add(ChangeButton);
		
		JButton CancelButton = new JButton("キャンセル");
		CancelButton.setBounds(220, 353, 97, 21);
		CancelButton.addActionListener(this);
		CancelButton.setActionCommand("キャンセル");
		add(CancelButton);
		
		JButton ManagerButton = new JButton("店長");
		ManagerButton.setBounds(466, 481, 69, 21);
		ManagerButton.addActionListener(this);
		ManagerButton.setActionCommand("店長へ");
		add(ManagerButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("予約")) {
			Main.card.show(Main.CardLayoutPanel, "予約パネル");
		}
		
		if(e.getActionCommand().equals("変更")) {
			Main.card.show(Main.CardLayoutPanel, "変更パネル");
		}
		
		if(e.getActionCommand().equals("キャンセル")) {
			Main.card.show(Main.CardLayoutPanel, "キャンセルパネル");
		}
		
		if(e.getActionCommand().equals("店長へ")) {
			Main.card.show(Main.CardLayoutPanel, "店長パネル");
		}
	}

}
