package jp.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class M_CustomerPanel extends JPanel implements ActionListener{

	/**
	 * Create the panel.
	 */
	public M_CustomerPanel() {
		setBounds(0, 0, 562, 529);//パネルサイズ
		setLayout(null);//絶対レイアウト

		JButton ReturnButton = new JButton("戻る");
		ReturnButton.setBounds(463, 481, 73, 21);
		ReturnButton.addActionListener(this);
		ReturnButton.setActionCommand("店長へ");
		add(ReturnButton);

		JLabel lblNewLabel = new JLabel("顧客台帳パネル");
		lblNewLabel.setBounds(36, 31, 143, 13);
		add(lblNewLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("店長へ")) {
			Main.card.show(Main.CardLayoutPanel, "店長パネル");
		}
	}

}
