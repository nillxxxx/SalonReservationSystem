package jp.example;

import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	private JPanel contentPane;
	static JPanel CardLayoutPanel;
	static CardLayout card;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setTitle("サロン予約システム");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//カードケース型の形をしたJPanel（名前：カードレイアウトパネル）を作成
		CardLayoutPanel = new JPanel();
		CardLayoutPanel.setBounds(0, 0, 562, 529);//サイズ
		card = new CardLayout(0, 0);
		CardLayoutPanel.setLayout(card);//カードレイアウト指定
		contentPane.add(CardLayoutPanel);//コンテントペインに追加
		
		//メインパネル
		MainPanel MainPanel = new MainPanel();
		CardLayoutPanel.add(MainPanel, "メインパネル");
		
		//店長パネル
		ManagerPanel ManagerPanel = new ManagerPanel();
		CardLayoutPanel.add(ManagerPanel, "店長パネル");
		
		//予約パネル
		C_ReservationPanel ReservationPanel = new C_ReservationPanel();
		CardLayoutPanel.add(ReservationPanel, "予約パネル");
		
		//変更パネル
		C_ChangePanel ChangePanel = new C_ChangePanel();
		CardLayoutPanel.add(ChangePanel, "変更パネル");
		
		//キャンセルパネル
		C_CancelPanel CancelPanel = new C_CancelPanel();
		CardLayoutPanel.add(CancelPanel, "キャンセルパネル");
		
		//予約台帳パネル
		M_BookPanel M_BookPanel = new M_BookPanel();
		CardLayoutPanel.add(M_BookPanel, "予約台帳パネル");
		
		//顧客台帳パネル
		M_CustomerPanel M_CustomerPanel = new M_CustomerPanel();
		CardLayoutPanel.add(M_CustomerPanel, "顧客台帳パネル");
		
		//スタッフ管理パネル
		M_StuffPanel M_StuffPanel = new M_StuffPanel();
		CardLayoutPanel.add(M_StuffPanel, "スタッフ管理パネル");
		
		//メニュー管理パネル
		M_MenuPanel M_MenuPanel = new M_MenuPanel();
		CardLayoutPanel.add(M_MenuPanel, "メニュー管理パネル");
		
	}

}
