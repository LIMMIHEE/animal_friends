package G_5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.mysql.cj.xdevapi.Statement;



public class Musicgame extends JFrame {

     
     private String[] Ranking_name = new String[10];
     private int[] Ranking_score = new int[10];
	
	 private int info_fir=0;
	 private int info_tw=0;
	 private int paly_num=1;
	
	 
	 private ImageIcon Big_img_dButton_1 = new ImageIcon(Main.class.getResource("../images/Big_img.png"));
	 private JButton img_printButton_1 = new JButton(Big_img_dButton_1);
	 private ImageIcon Big_img_Button = new ImageIcon(Main.class.getResource("../images/card_chice_Range.png"));
	 private JButton Big_img_p_ = new JButton(Big_img_Button);
	 
	 
	 private ImageIcon TutorialendButton_1 = new ImageIcon(Main.class.getResource("../images/Tutorial_close.png"));
	 private JButton ENDTutorialButton_1 = new JButton(TutorialendButton_1);
	 private ImageIcon endButton_1 = new ImageIcon(Main.class.getResource("../images/close.png"));
	 private JButton ENDgameButton_1 = new JButton(endButton_1);
	 private ImageIcon end_moveButton_1 = new ImageIcon(Main.class.getResource("../images/end_after_Main.png"));
	 private JButton ENDgameButton_after_move = new JButton(end_moveButton_1);
	 private ImageIcon char_neButton_1 = new ImageIcon(Main.class.getResource("../images/next_card.png"));
	 private JButton next_card = new JButton(char_neButton_1);
	 private ImageIcon Ranking_Up_Btn = new ImageIcon(Main.class.getResource("../images/ranking_btn.png"));
	 private JButton Ranking_Up = new JButton(Ranking_Up_Btn);
	
	private Image screenImage;
	private Graphics screenGraphic;

	private ImageIcon Back = new ImageIcon(Main.class.getResource("../Card_gif/Main_Sc.gif"));
	private ImageIcon ExitButten_2 = new ImageIcon(Main.class.getResource("../images/ExitButten_2.png"));
	private ImageIcon ExitButton_1 = new ImageIcon(Main.class.getResource("../images/ExitButten_1.png"));
	private ImageIcon UpButtonEnter = new ImageIcon(Main.class.getResource("../images/down_2.png"));
	private ImageIcon UpButtonBasic = new ImageIcon(Main.class.getResource("../images/down_1.png"));
	private ImageIcon DownButtonEnter = new ImageIcon(Main.class.getResource("../images/up_2.png"));
	private ImageIcon DownButtonBasic = new ImageIcon(Main.class.getResource("../images/up_1.png"));
	
	private ImageIcon CardButton = new ImageIcon(Main.class.getResource("../images/Card.png"));
	private ImageIcon infoButton = new ImageIcon(Main.class.getResource("../images/info.png"));
	private ImageIcon CC_infoButton = new ImageIcon(Main.class.getResource("../images/CC_info.png"));
	
	
	private ImageIcon closeButton = new ImageIcon(Main.class.getResource("../images/exit_Screeninfo.png"));
	
	
	private ImageIcon Play = new ImageIcon(Main.class.getResource("../images/play_button.png"));
	private ImageIcon Gacha = new ImageIcon(Main.class.getResource("../images/Gacha_button.png"));
	

	private ImageIcon Gatcha_one = new ImageIcon(Main.class.getResource("../images/1_Gat.png"));
	private ImageIcon Gatcha_five = new ImageIcon(Main.class.getResource("../images/5_Gat.png"));
	
	private ImageIcon EasyButtonEnter = new ImageIcon(Main.class.getResource("../images/Easy_2.png"));
	private ImageIcon EasyButtonBasic = new ImageIcon(Main.class.getResource("../images/Easy_.png"));
	private ImageIcon HardButtonEnter = new ImageIcon(Main.class.getResource("../images/Hard_2.png"));
	private ImageIcon HardButtonBasic = new ImageIcon(Main.class.getResource("../images/Hard.png"));
	private ImageIcon BackButton = new ImageIcon(Main.class.getResource("../images/back_menu_button.png"));
	
	private Image _Back = new ImageIcon(Main.class.getResource("../Card_gif/Main_Sc.gif")).getImage();
	private JLabel menubar = new JLabel(new ImageIcon(Main.class.getResource("../images/menubar.png")));
	
	
	
	private String Character_Name = "일상 속 기버";
	private ImageIcon CButton_1 = new ImageIcon(Main.class.getResource("../images/card_chice_Range.png"));
	private JButton ChoiceButton_1 = new JButton(CButton_1);
	private ImageIcon CButton_2 = new ImageIcon(Main.class.getResource("../images/card_chice_Range.png"));
	private JButton ChoiceButton_2 = new JButton(CButton_2);	
	private ImageIcon CButton_3 = new ImageIcon(Main.class.getResource("../images/card_chice_Range.png"));
	private JButton ChoiceButton_3 = new JButton(CButton_3);
	private ImageIcon CButton_4 = new ImageIcon(Main.class.getResource("../images/card_chice_Range.png"));
	private JButton ChoiceButton_4 = new JButton(CButton_4);	
	private ImageIcon CButton_5 = new ImageIcon(Main.class.getResource("../images/card_chice_Range.png"));
	private JButton ChoiceButton_5 = new JButton(CButton_5);
	private ImageIcon CButton_6 = new ImageIcon(Main.class.getResource("../images/card_chice_Range.png"));
	private JButton ChoiceButton_6 = new JButton(CButton_6);	
	private ImageIcon CButton_7 = new ImageIcon(Main.class.getResource("../images/card_chice_Range.png"));
	private JButton ChoiceButton_7 = new JButton(CButton_7);
	private ImageIcon CButton_8 = new ImageIcon(Main.class.getResource("../images/card_chice_Range.png"));
	private JButton ChoiceButton_8 = new JButton(CButton_8);	
	private ImageIcon Ranking_Print_btn = new ImageIcon(Main.class.getResource("../images/ranking_Print_btn.png"));
	private JButton Ranking_Print = new JButton(Ranking_Print_btn);

	private ImageIcon Screen_explan = new ImageIcon(Main.class.getResource("../images/Screen_explan.png"));
	private JButton Screen_info = new JButton(Screen_explan);
	private ImageIcon Screen_explan_close = new ImageIcon(Main.class.getResource("../images/exit_Screeninfo.png"));
	private JButton Screen_info_exit_b = new JButton(Screen_explan_close);
	
	
	private JButton startButton = new JButton(Back);
	private JButton exitButton = new JButton(ExitButten_2);
	private JButton UpButton = new JButton(UpButtonBasic);
	private JButton DownButton = new JButton(DownButtonBasic);
	
	private JButton Card_Button = new JButton(CardButton);
	private JButton info_Button = new JButton(infoButton);
	private JButton CC_Button = new JButton(CC_infoButton);
	
	private JButton close_Button = new JButton(closeButton);
	
	private JButton PlayButton = new JButton(Play);
	private JButton GachaButton = new JButton(Gacha);
	
	private JButton Gatcha_one_Button = new JButton(Gatcha_one);
	private JButton Gatcha_five_Button = new JButton(Gatcha_five);
	
	private JButton easyButton = new JButton(EasyButtonBasic);
	private JButton hardButton = new JButton(HardButtonBasic);	
	private JButton Back_menu_Button = new JButton(BackButton);
	
	private Image CC_info_= new ImageIcon(Main.class.getResource("../images/cc_infomation.png")).getImage();
	private Image explan_Screenimg_= new ImageIcon(Main.class.getResource("../images/Screen_explan_img.png")).getImage();
	private Image Card_choice_screen= new ImageIcon(Main.class.getResource("../images/card_chice_Screen.png")).getImage();
	private Image Ranking_screen= new ImageIcon(Main.class.getResource("../images/ranking_page.png")).getImage();
	private Image Card_choice_Display= new ImageIcon(Main.class.getResource("../images/card_chice_notify.png")).getImage();
	private Image Card_char_img= new ImageIcon(Main.class.getResource("../images/ch_1_1.png")).getImage();
	private Image img_print_img= new ImageIcon(Main.class.getResource("../images/ch_1_1.png")).getImage();
	
	private Image info_text_sq = new ImageIcon(Main.class.getResource("../images/info_text.png")).getImage();
	
	private int mouseX, mouseY;
	private int mouse_CardX=103, mouse_CardY=172;
	private String[] info_text_random= new String [] {"디스코는 예민하고 섬세해요.",
			"꺼미는 다른 동물에게 별다른 관심이 없는 편이랍니다ㅣ.",
			"꺼미는 고양이, 디스코는 거북이, 피시는 뱀, 기버는 토끼에요!","기버는 다른 사람을 배려하기 좋아하죠",
			"피시는 긍정적이고 이타적이에요.","음원들을 구글에 검색하면 바로 찾을 수 있어요",
			"꺼미와 디스코는 사이가 그닥 좋지 않아요","기버는 피시와 자주 논답니다.",
			"기버는 꺼미와의 가위바위보에 져서 산타옷을 입었어요","디스코는 피시에게 양말을,피시는 루돌푸 머리띠를 선물로 줬어요","꺼미는 마음에 드는 트리 장식을 찾기위해 많은 시간을 썼어요",
			"피시는 디스코와 물에 있는 걸 매우 좋아해요","꺼미는 기버와 이웃사이에요, 친구이기도 하죠.",
			"사실 기버는 산타 옷을 입기 싫어했어요","피시는 양말에 들어가 있는 걸 좋아해요"};
	
	private boolean inMainScreen = false;
	private boolean inGameScreen = false;
	private boolean CC_info_Screen= false;
	private boolean mid_chr_img =false;
	private boolean Card_Random =false;
	private boolean info_text_Screen =false;
	private boolean Ranking_Screen =false;
	
	private boolean ScoreCheck_screen = false;
	private boolean explan_Screenimg_page= false;
	private boolean Card_choice_s= false;
	private boolean img_big_p =false;
	private boolean ranking_one_time=false;
	private int img_num =1;
	private int Card_next= 1;
	
	ArrayList<Track> trackList = new ArrayList<Track>();//트占쏙옙[shfo] 占쏙옙占쏙옙 占쏙옙占쏙옙占�
	
	private String nowImg="ch_1_1";
	private Image titleImage;
	private Music selectedMusic;
	private Image selectedImage;
	private Image selectedMusicImage;
	private Image selectedNotMusicImage;
	Music introMusic = new Music("dotabatare-su.mp3", true);
	
	private int nowSelected = 0; 
	
	public static Game game;
	

	
	public Musicgame() {
		
		trackList.add(new Track("Music_1.png","DEVYN_.gif","DEVYN_seleted.mp3",
				"DEVYN.mp3","DEVYN"));
		trackList.add(new Track("Music_2.png","Boomerang_.gif",
				"Boomerang_seleted.mp3","Boomerang.mp3","Boomerang"));
		trackList.add(new Track("Music_3.png","Skyline_back.gif",
				"Samie_Bower_Skyline_Short.mp3","Samie_Bower_Skyline.mp3","Skyline"));
		trackList.add(new Track("Music_4.png","Countosh_back.gif",
				"Niki_J_Crawford_Countosh_short.mp3","Niki_J_Crawford_Countosh.mp3","Countosh"));
		trackList.add(new Track("Music_5.png","Girls_Like_You_back.gif",
				"The_Spin_Wires_Girls_Like_You_short.mp3","The_Spin_Wires_Girls_Like_You.mp3","Girls_Like_You"));
		
		setUndecorated(true);
		setTitle("Twin Live");

		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HIGHT);// 占쏙옙占쏙옙 占쏙옙占쏙옙창 크占쏙옙
		setResizable(false); // 占쏙옙占쏙옙창 크占쏙옙 占쏙옙환占쏙옙占쏙옙
		setLocationRelativeTo(null);// 占쏙옙占쏙옙창 占쏙옙 占쌩앙울옙 占쌩곤옙占싹깍옙
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 占쏙옙占쏙옙창 占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占싸그뤄옙 占쏙옙체 占쏙옙占쏙옙
		setVisible(true); // 占쏙옙占쏙옙창 占쏙옙占쏙옙庫占� 占쏙옙占쏙옙歐占�
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);

		introMusic.start();
		
		addKeyListener(new KeyLisener());
		{	
			
			Big_img_p_.setVisible(false);
			Big_img_p_.setBounds(300, 150, 561, 504);
			Big_img_p_.setBorderPainted(false);
			Big_img_p_.setContentAreaFilled(false);
			Big_img_p_.setFocusPainted(false);
			Big_img_p_.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Music buttonpressed = new Music("buttonpressed.mp3",false);
					buttonpressed.start();
					Big_img_p_.setVisible(false);
					img_big_p=false;
					
				}
			});
			add(Big_img_p_);
			
			img_printButton_1.setVisible(false);
			img_printButton_1.setBounds(605, 573, 498, 94);
			img_printButton_1.setBorderPainted(false);
			img_printButton_1.setContentAreaFilled(false);
			img_printButton_1.setFocusPainted(false);
			img_printButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Music buttonpressed = new Music("buttonpressed.mp3",false);
					buttonpressed.start();
					Big_img_p_.setVisible(true);
					img_big_p=true;
				}
			});
			add(img_printButton_1);
			
			ENDTutorialButton_1.setVisible(false);
			ENDTutorialButton_1.setBounds(50, 50, 155, 63);
			ENDTutorialButton_1.setBorderPainted(false);
			ENDTutorialButton_1.setContentAreaFilled(false);
			ENDTutorialButton_1.setFocusPainted(false);
			ENDTutorialButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Music buttonpressed = new Music("buttonpressed.mp3",false);
					buttonpressed.start();
					inGameScreen = false;
					game.close();
					enterMain();
				}
			});
			add(ENDTutorialButton_1);	
			
			
			Ranking_Print.setVisible(false);
			Ranking_Print.setBounds(44, 105,  155, 63);
			Ranking_Print.setBorderPainted(false);
			Ranking_Print.setContentAreaFilled(false);
			Ranking_Print.setFocusPainted(false);
			Ranking_Print.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Music buttonpressed = new Music("buttonpressed.mp3",false);
					buttonpressed.start();
					Ranking_Screen=true;
					close_Button.setBounds(500,37, 202, 54);
					Print_Ranking();
					
				}
			});
			add(Ranking_Print);	
			
			ChoiceButton_1.setVisible(false);
			ChoiceButton_1.setBounds(115, 184, 184, 133);
			ChoiceButton_1.setBorderPainted(false);
			ChoiceButton_1.setContentAreaFilled(false);
			ChoiceButton_1.setFocusPainted(false);
			ChoiceButton_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Character_Name = "일상 속 기버";
					mouse_CardX=103; mouse_CardY=172;
					Music buttonpressed = new Music("buttonpressed.mp3",false);
					Card_char_img = new ImageIcon(Main.class.getResource("../images/ch_1_1.png")).getImage();
					img_print_img = new ImageIcon(Main.class.getResource("../images/ch_1_1.png")).getImage();
					nowImg="ch_1_1";
					Big_img_p_.setBounds(400, 200, 561, 504);
					buttonpressed.start();
					img_num=1;
				}
			});
			add(ChoiceButton_1);	
			
	
			ChoiceButton_2.setVisible(false);
			ChoiceButton_2.setBounds(115, 372, 184, 133);
			ChoiceButton_2.setBorderPainted(false);
			ChoiceButton_2.setContentAreaFilled(false);
			ChoiceButton_2.setFocusPainted(false);
			ChoiceButton_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Character_Name = "산타가 된 기버";
					mouse_CardX=103; mouse_CardY=360;
					Music buttonpressed = new Music("buttonpressed.mp3",false);
					Card_char_img = new ImageIcon(Main.class.getResource("../images/ch_1_12.png")).getImage();
					img_print_img = new ImageIcon(Main.class.getResource("../images/ch_1_2.png")).getImage();
					nowImg="ch_1_12";
					Big_img_p_.setBounds(0, 0, 1200, 720);
					buttonpressed.start();
					img_num=2;
				}
			});
			add(ChoiceButton_2);	
			ChoiceButton_3.setVisible(false);
			ChoiceButton_3.setBounds(380, 185, 184, 133);
			ChoiceButton_3.setBorderPainted(false);
			ChoiceButton_3.setContentAreaFilled(false);
			ChoiceButton_3.setFocusPainted(false);
			ChoiceButton_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Character_Name = "일상 속 꺼미";
					mouse_CardX=368; mouse_CardY=173;
					Music buttonpressed = new Music("buttonpressed.mp3",false);
					Card_char_img = new ImageIcon(Main.class.getResource("../images/ch_2_1.png")).getImage();
					img_print_img = new ImageIcon(Main.class.getResource("../images/ch_2_1.png")).getImage();
					nowImg="ch_2_1";
					Big_img_p_.setBounds(400, 200, 561, 504);
					buttonpressed.start();	
					img_num=1;
				}
			});
			add(ChoiceButton_3);				ChoiceButton_4.setVisible(false);
			ChoiceButton_4.setBounds(380, 372, 184, 133);
			ChoiceButton_4.setBorderPainted(false);
			ChoiceButton_4.setContentAreaFilled(false);
			ChoiceButton_4.setFocusPainted(false);
			ChoiceButton_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Character_Name = "크리스마스의 꺼미";
					mouse_CardX=368; mouse_CardY=360;
					Music buttonpressed = new Music("buttonpressed.mp3",false);
					Card_char_img = new ImageIcon(Main.class.getResource("../images/ch_2_12.png")).getImage();
					img_print_img = new ImageIcon(Main.class.getResource("../images/ch_2_2.png")).getImage();
					nowImg="ch_2_12";
					Big_img_p_.setBounds(0, 0, 1200, 720);
					buttonpressed.start();
					img_num=2;
				}
			});
			add(ChoiceButton_4);
			ChoiceButton_5.setVisible(false);
			ChoiceButton_5.setBounds(642, 185, 184, 133);
			ChoiceButton_5.setBorderPainted(false);
			ChoiceButton_5.setContentAreaFilled(false);
			ChoiceButton_5.setFocusPainted(false);
			ChoiceButton_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Character_Name = "일상 속 피시";
					mouse_CardX=630; mouse_CardY=173;
					Music buttonpressed = new Music("buttonpressed.mp3",false);
					Card_char_img = new ImageIcon(Main.class.getResource("../images/ch_3_1.png")).getImage();
					img_print_img = new ImageIcon(Main.class.getResource("../images/ch_3_1.png")).getImage();
					nowImg="ch_3_1";
					Big_img_p_.setBounds(400, 200, 561, 504);
					buttonpressed.start();	
					img_num=1;
				}
			});
			add(ChoiceButton_5);				
			ChoiceButton_6.setVisible(false);
			ChoiceButton_6.setBounds(642, 372, 184, 133);
			ChoiceButton_6.setBorderPainted(false);
			ChoiceButton_6.setContentAreaFilled(false);
			ChoiceButton_6.setFocusPainted(false);
			ChoiceButton_6.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Character_Name = "양말 속 피시";
					mouse_CardX=630; mouse_CardY=360;
					Music buttonpressed = new Music("buttonpressed.mp3",false);
					Card_char_img = new ImageIcon(Main.class.getResource("../images/ch_3_12.png")).getImage();
					img_print_img = new ImageIcon(Main.class.getResource("../images/ch_3_2.png")).getImage();
					nowImg="ch_3_12";
					Big_img_p_.setBounds(0, 0, 1200, 720);
					buttonpressed.start();
					img_num=2;
				}
			});
			add(ChoiceButton_6);
			ChoiceButton_7.setVisible(false);
			ChoiceButton_7.setBounds(905, 185, 184, 133);
			ChoiceButton_7.setBorderPainted(false);
			ChoiceButton_7.setContentAreaFilled(false);
			ChoiceButton_7.setFocusPainted(false);
			ChoiceButton_7.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Character_Name = "일상 속 디스코";
					mouse_CardX=893; mouse_CardY=173;
					Music buttonpressed = new Music("buttonpressed.mp3",false);
					Card_char_img = new ImageIcon(Main.class.getResource("../images/ch_4_1.png")).getImage();
					img_print_img = new ImageIcon(Main.class.getResource("../images/ch_4_1.png")).getImage();
					nowImg="ch_4_1";
					Big_img_p_.setBounds(400, 200, 561, 504);
					buttonpressed.start();	
					img_num=1;
				}
			});
			add(ChoiceButton_7);				
			ChoiceButton_8.setVisible(false);
			ChoiceButton_8.setBounds(905, 372, 184, 133);
			ChoiceButton_8.setBorderPainted(false);
			ChoiceButton_8.setContentAreaFilled(false);
			ChoiceButton_8.setFocusPainted(false);
			ChoiceButton_8.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Character_Name = "루돌프로! 디스코";
					mouse_CardX=893; mouse_CardY=360;
					Music buttonpressed = new Music("buttonpressed.mp3",false);
					Card_char_img = new ImageIcon(Main.class.getResource("../images/ch_4_12.png")).getImage();
					img_print_img = new ImageIcon(Main.class.getResource("../images/ch_4_2.png")).getImage();
					nowImg="ch_4_12";
					Big_img_p_.setBounds(0, 0, 1200, 720);
					buttonpressed.start();
					img_num=2;
				}
			});
			add(ChoiceButton_8);
			
			
			next_card.setVisible(false);
			next_card.setBounds(970, 560, 125, 123);
			next_card.setBorderPainted(false);
			next_card.setContentAreaFilled(false);
			next_card.setFocusPainted(false);
			next_card.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Music buttonpressed = new Music("buttonpressed.mp3",false);
					buttonpressed.start();
					Card_next++;
					Gatcha_in(5);
				}
			});
			add(next_card);
			
			Screen_info.setVisible(false);
			Screen_info.setBounds(44, 175, 155, 63);
			Screen_info.setBorderPainted(false);
			Screen_info.setContentAreaFilled(false);
			Screen_info.setFocusPainted(false);
			Screen_info.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Music buttonpressed = new Music("buttonpressed.mp3",false);
					buttonpressed.start();
					explan_Screenimg_page=true;
				}
			});
			add(Screen_info);	
			
			Screen_info_exit_b.setVisible(false);
			Screen_info_exit_b.setBounds(484, 580, 202, 54);
			Screen_info_exit_b.setBorderPainted(false);
			Screen_info_exit_b.setContentAreaFilled(false);
			Screen_info_exit_b.setFocusPainted(false);
			Screen_info_exit_b.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					Music buttonpressed = new Music("buttonpressed.mp3",false);
					buttonpressed.start();
					Screen_info_exit_b.setVisible(false);
					Mid_();
				}
			});
			add(Screen_info_exit_b);
			
	

		}
		

		 ENDgameButton_1.setVisible(false);
		 ENDgameButton_1.setBounds(50, 50, 155, 63);
		 ENDgameButton_1.setBorderPainted(false);
		 ENDgameButton_1.setContentAreaFilled(false);
		 ENDgameButton_1.setFocusPainted(false);
		 ENDgameButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonpressed = new Music("buttonpressed.mp3",false);
				buttonpressed.start();
				Music ScoreMusic = new Music("Quiz-Results01-1.mp3", false);
				ScoreMusic.start();
				ScoreCheck();
			}
		});
		add(ENDgameButton_1);
		ENDgameButton_after_move.setVisible(false);
		ENDgameButton_after_move.setBounds(880, 80, 155, 63);
		ENDgameButton_after_move.setBorderPainted(false);
		ENDgameButton_after_move.setContentAreaFilled(false);
		ENDgameButton_after_move.setFocusPainted(false);
		ENDgameButton_after_move.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonpressed = new Music("buttonpressed.mp3",false);
				buttonpressed.start();
				Mid_();
			}
		});
		add(ENDgameButton_after_move);
		
		
		Ranking_Up.setVisible(false);
		Ranking_Up.setBounds(700, 80, 155, 63);
		Ranking_Up.setBorderPainted(false);
		Ranking_Up.setContentAreaFilled(false);
		Ranking_Up.setFocusPainted(false);
		Ranking_Up.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonpressed = new Music("buttonpressed.mp3",false);
				buttonpressed.start();
				
				
				Ranking_score();
		   		 
				
			}
		});
		add(Ranking_Up);
		 
		exitButton.setBounds(1150, 0, 30, 30);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setIcon(ExitButton_1);
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnter = new Music("buttonEnter.mp3",false);
				buttonEnter.start();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				exitButton.setIcon(ExitButten_2);
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonpressed = new Music("buttonpressed.mp3",false);
				buttonpressed.start();
				try {
					Thread.sleep(750);
				}catch(InterruptedException ex) {
					ex.printStackTrace();
				}
				System.exit(0);
			}
		});
		
		add(exitButton);
		
		
		startButton.setBounds(0, 0, 1200, 720);
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setFocusPainted(false);
		startButton.addMouseListener(new MouseAdapter() {	
		@Override
		public void mousePressed(MouseEvent e) {
			Music buttonpressed = new Music("buttonpressed.mp3",false);
			buttonpressed.start();
			introMusic.close();
			Mid_();
		}
			
		});
		
		add(startButton);
		

	
		
		Back_menu_Button.setBounds(0, 30, 170, 105);
		Back_menu_Button.setBorderPainted(false);
		Back_menu_Button.setContentAreaFilled(false);
		Back_menu_Button.setFocusPainted(false);
		Back_menu_Button.addMouseListener(new MouseAdapter() {	
		@Override
		public void mousePressed(MouseEvent e) {
			Music buttonpressed = new Music("buttonpressed.mp3",false);
			buttonpressed.start();
			Mid_();
		}
			
		});
		
		add(Back_menu_Button);
		
	
		UpButton.setVisible(false);
		UpButton.setBounds(900, 480, 60, 60);
		UpButton.setBorderPainted(false);
		UpButton.setContentAreaFilled(false);
		UpButton.setFocusPainted(false);
		UpButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				UpButton.setIcon(UpButtonEnter);
				UpButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnter = new Music("buttonEnter.mp3",false);
				buttonEnter.start();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				UpButton.setIcon(UpButtonBasic);
				UpButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonpressed = new Music("buttonpressed.mp3",false);
				buttonpressed.start();
				selectLeft();
			}
		});
		
		add(UpButton);
		
		DownButton.setVisible(false);
		DownButton.setBounds(900, 70, 60, 60);
		DownButton.setBorderPainted(false);
		DownButton.setContentAreaFilled(false);
		DownButton.setFocusPainted(false);
		DownButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				DownButton.setIcon(DownButtonEnter);
				DownButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnter = new Music("buttonEnter.mp3",false);
				buttonEnter.start();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				DownButton.setIcon(DownButtonBasic);
				DownButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonpressed = new Music("buttonpressed.mp3",false);
				buttonpressed.start();
				selectRight();
			}
		});
		add(DownButton);
		
		
		easyButton.setVisible(false);
		easyButton.setBounds(625, 579, 249, 75);
		easyButton.setBorderPainted(false);
		easyButton.setContentAreaFilled(false);
		easyButton.setFocusPainted(false);
		easyButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				easyButton.setIcon(EasyButtonEnter);
				easyButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnter = new Music("buttonEnter.mp3",false);
				buttonEnter.start();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				easyButton.setIcon(EasyButtonBasic);
				easyButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonpressed = new Music("buttonpressed.mp3",false);
				buttonpressed.start();
				gamestart(nowSelected,"Easy");
			}
		});
		add(easyButton);
		

		hardButton.setVisible(false);
		hardButton.setBounds(930, 580, 249, 75);
		hardButton.setBorderPainted(false);
		hardButton.setContentAreaFilled(false);
		hardButton.setFocusPainted(false);
		hardButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				hardButton.setIcon(HardButtonEnter);
				hardButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnter = new Music("buttonEnter.mp3",false);
				buttonEnter.start();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				hardButton.setIcon(HardButtonBasic);
				hardButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonpressed = new Music("buttonpressed.mp3",false);
				buttonpressed.start();
				gamestart(nowSelected,"Hard");
			}
		});
		
		add(hardButton);

		PlayButton.setVisible(false);
		PlayButton.setBounds(940, 500, 216, 192);
		PlayButton.setBorderPainted(false);
		PlayButton.setContentAreaFilled(false);
		PlayButton.setFocusPainted(false);
		PlayButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonpressed = new Music("buttonpressed.mp3",false);
				buttonpressed.start();
				ImgData_change();
				if(paly_num!=1) {
					enterMain();
				}else {
					Tgame_start();
				}
					
			}
		});
		add(PlayButton);
		
		
		GachaButton.setVisible(false);
		GachaButton.setBounds(940,300, 216, 192);
		GachaButton.setBorderPainted(false);
		GachaButton.setContentAreaFilled(false);
		GachaButton.setFocusPainted(false);
		GachaButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonpressed = new Music("buttonpressed.mp3",false);
				buttonpressed.start();
				Gatcha();
			}
		});
		add(GachaButton);
		

		
		
		menubar.setBounds(0, 0, 1200, 30);
		menubar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
			
		});
		menubar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x= e.getXOnScreen();
				int y= e.getYOnScreen();
				setLocation(x-mouseX,y-mouseY);
			}
			
		});
		add(menubar);

	
		CC_Button.setVisible(false);
		CC_Button.setBounds(62, 265, 121, 122);
		CC_Button.setBorderPainted(false);
		CC_Button.setContentAreaFilled(false);
		CC_Button.setFocusPainted(false);
		CC_Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				close_Button.setVisible(true);
				CC_info_= new ImageIcon(Main.class.getResource("../images/cc_infomation.png")).getImage();
				CC_info_Screen=true;
				Music buttonpressed = new Music("buttonpressed.mp3",false);
				buttonpressed.start();

				
			}
		});
		add(CC_Button);
		
		Card_Button.setVisible(false);
		Card_Button.setBounds(62, 405, 121, 122);
		Card_Button.setBorderPainted(false);
		Card_Button.setContentAreaFilled(false);
		Card_Button.setFocusPainted(false);
		Card_Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonpressed = new Music("buttonpressed.mp3",false);
				buttonpressed.start();
				Card_choice_s=true;
				close_Button.setVisible(true);
			}
		});
		add(Card_Button);
		

		info_Button.setVisible(false);
		info_Button.setBounds(62, 550, 121, 122);
		info_Button.setBorderPainted(false);
		info_Button.setContentAreaFilled(false);
		info_Button.setFocusPainted(false);
		info_Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonpressed = new Music("buttonpressed.mp3",false);
				buttonpressed.start();
				info_fir=(int)(Math.random()*15);
				info_tw=(int)(Math.random()*15);	
				while(info_fir == info_tw) {
					info_fir=(int)(Math.random()*15);
					info_tw=(int)(Math.random()*15);	
				}
				info_text_Screen=true;
				close_Button.setVisible(true);
				close_Button.setBounds(900, 600, 202, 54);
			}
		});
		add(info_Button);
	
	
		close_Button.setVisible(false);
		close_Button.setBounds(589, 580, 202, 54);
		close_Button.setBorderPainted(false);
		close_Button.setContentAreaFilled(false);
		close_Button.setFocusPainted(false);
		close_Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				close_Button.setBounds(589, 580, 202, 54);
				Music buttonpressed = new Music("buttonpressed.mp3",false);
				buttonpressed.start();
				CC_info_Screen=false;
				Card_choice_s=false;
				info_text_Screen=false;
				Big_img_p_.setVisible(false);
				Ranking_Screen=false;
				img_big_p=false;
				CC_info_= new ImageIcon(Main.class.getResource("../images/noteRutePressed_1.png")).getImage();
				close_Button.setVisible(false);
				img_printButton_1.setVisible(false);
				Mid_();
				
			}
		});
		add(close_Button);
		
		
		Gatcha_one_Button.setVisible(false);
		Gatcha_one_Button.setBounds(80, 180, 177, 174);
		Gatcha_one_Button.setBorderPainted(false);
		Gatcha_one_Button.setContentAreaFilled(false);
		Gatcha_one_Button.setFocusPainted(false);
		Gatcha_one_Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonpressed = new Music("buttonpressed.mp3",false);
				buttonpressed.start();
				Gatcha_in(1);
				
			}
		});
		add(Gatcha_one_Button);
		
		Gatcha_five_Button.setVisible(false);
		Gatcha_five_Button.setBounds(120, 450, 177, 174);
		Gatcha_five_Button.setBorderPainted(false);
		Gatcha_five_Button.setContentAreaFilled(false);
		Gatcha_five_Button.setFocusPainted(false);
		Gatcha_five_Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonpressed = new Music("buttonpressed.mp3",false);
				buttonpressed.start();
				for(int i=1; i<=5; i++) {
					Gatcha_in(5);
					
				}
			}
		});
		add(Gatcha_five_Button);
		
	
	}
	
	
	
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw((Graphics2D)screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}

	public void screenDraw(Graphics2D g) {
		g.drawImage(_Back, 0, 0, null); 
		if(CC_info_Screen) {
			mid_chr_img= false;
			g.drawImage(CC_info_,0,0,null);
			Screen_info.setVisible(false);
			info_Button.setVisible(false);
			Card_Button.setVisible(false);
			CC_Button.setVisible(false);
			PlayButton.setVisible(false);
			GachaButton.setVisible(false);
			startButton.setVisible(false);
			Ranking_Print.setVisible(false);
			
		}
		if(Card_choice_s) {
			mid_chr_img= false;
			close_Button.setBounds(500,37, 202, 54);
			g.drawImage(Card_choice_screen,0,0,null);
			Ranking_Print.setVisible(false);
			Screen_info.setVisible(false);
			info_Button.setVisible(false);
			Card_Button.setVisible(false);
			CC_Button.setVisible(false);
			PlayButton.setVisible(false);
			GachaButton.setVisible(false);
			startButton.setVisible(false);
			ChoiceButton_1.setVisible(true);
			ChoiceButton_2.setVisible(true);
			ChoiceButton_3.setVisible(true);
			ChoiceButton_4.setVisible(true);
			ChoiceButton_5.setVisible(true);
			ChoiceButton_6.setVisible(true);
			ChoiceButton_7.setVisible(true);
			ChoiceButton_8.setVisible(true);
			close_Button.setVisible(true);
			img_printButton_1.setVisible(true);
			g.drawImage(Card_choice_Display,mouse_CardX,mouse_CardY,null);
			g.setColor(Color.lightGray); g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			g.setFont(new Font("Royalacid_o",Font.BOLD,25)); g.drawString(Character_Name,200, 626); 
			
		}
		if(Ranking_Screen) {
			Ranking_Print.setVisible(false);
			mid_chr_img= false;
			close_Button.setVisible(true);
			g.drawImage(Ranking_screen,0,0,null);
			Screen_info.setVisible(false);
			info_Button.setVisible(false);
			Card_Button.setVisible(false);
			CC_Button.setVisible(false);
			PlayButton.setVisible(false);
			GachaButton.setVisible(false);
			startButton.setVisible(false);
			for(int i=0; i<10; i++) {
				if(i<5) {
					g.setColor(Color.gray); g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
					g.setFont(new Font("Royalacid_o",Font.BOLD,25)); g.drawString(Ranking_name[i],110, 199+(i*115));
					g.setColor(Color.gray); g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
					g.setFont(new Font("Royalacid_o",Font.BOLD,35)); g.drawString(Integer.toString(Ranking_score[i]),340, 200+(i*115));
				}
				else {
					g.setColor(Color.gray); g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
					g.setFont(new Font("Royalacid_o",Font.BOLD,25)); g.drawString(Ranking_name[i],730, 195+((i-5)*115));
					g.setColor(Color.gray); g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
					g.setFont(new Font("Royalacid_o",Font.BOLD,35)); g.drawString(Integer.toString(Ranking_score[i]),920, 200+((i-5)*115));
				}
			}
			
					
			
		}
		if(ScoreCheck_screen) {
			g.setColor(Color.gray); g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			g.setFont(new Font("Royalacid_o",Font.BOLD,45)); g.drawString(Integer.toString(game.Per_score),500, 200);
			g.setColor(Color.gray); g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			g.setFont(new Font("Royalacid_o",Font.BOLD,45)); g.drawString(Integer.toString(game.Great_score),500, 285);
			g.setColor(Color.gray); g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			g.setFont(new Font("Royalacid_o",Font.BOLD,45)); g.drawString(Integer.toString(game.Good_score),500, 380);
			g.setColor(Color.gray); g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			g.setFont(new Font("Royalacid_o",Font.BOLD,45)); g.drawString(Integer.toString(game.Miss_score),500, 475);
			g.setColor(Color.gray); g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			g.setFont(new Font("Royalacid_o",Font.BOLD,55)); g.drawString(Integer.toString(game.Score),400, 640);
			
			
			
			
			g.drawImage(Card_char_img,630,200,null);
			
		}
		if(mid_chr_img) {
			g.drawImage(Card_char_img,300,200,null);
		}
		if(inMainScreen) {
			g.drawImage(selectedNotMusicImage,0,0,null);
			g.drawImage(selectedMusicImage,0,0,null);
			g.drawImage(selectedImage,0,0,null);
			g.drawImage(titleImage,510,450,null);
		}
		if(inGameScreen) 
		{
			game.screenDraw(g);

		}
		if(Card_Random) {
			Gatcha_one_Button.setVisible(false);
			Gatcha_five_Button.setVisible(false);
		}
		if(explan_Screenimg_page) {
			g.drawImage(explan_Screenimg_,0,0,null);
			Screen_info_exit_b.setVisible(true);
			Screen_info.setVisible(false);
			close_Button.setVisible(false);
			info_Button.setVisible(false);
			Card_Button.setVisible(false);
			CC_Button.setVisible(false);
			PlayButton.setVisible(false);
			GachaButton.setVisible(false);
			startButton.setVisible(false);
			Ranking_Print.setVisible(false);
		}
		if(info_text_Screen) {
			mid_chr_img= true;
			g.drawImage(info_text_sq,0,0,null);
			Screen_info.setVisible(false);
			info_Button.setVisible(false);
			Card_Button.setVisible(false);
			CC_Button.setVisible(false);
			PlayButton.setVisible(false);
			GachaButton.setVisible(false);
			startButton.setVisible(false);
			Ranking_Print.setVisible(false);
			g.setColor(Color.black); g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			g.setFont(new Font("돋움",Font.BOLD,25)); g.drawString(info_text_random[info_fir],300, 530); 
			g.setFont(new Font("돋움",Font.BOLD,25)); g.drawString(info_text_random[info_tw],300, 580); 
										
		}
		if(img_big_p) {
			if(img_num !=1) {
				g.drawImage(img_print_img,0,0,null);
				close_Button.setVisible(false);
				img_printButton_1.setVisible(false);
			}
			else {
				g.drawImage(img_print_img,300,150,null);
			}
			
			
		}
		paintComponents(g); // 占싱뱄옙占쏙옙占쏙옙 占쏙옙占쏘씌占쏙옙占� 占쏙옙占쏙옙? 占쏙옙占쏙옙占쏙옙 占싱뱄옙占쏙옙占쏙옙 占싱뤄옙占쏙옙
		try {
			Thread.sleep(5);
		}catch(Exception e){
			e.printStackTrace();
		}
		this.repaint();
	}
	
	public void selectedTrack(int nowSeleted) {
		if(selectedMusic != null) {
			selectedMusic.close();
		}
		//占쏙옙占쏙옙 占쏙옙占시듸옙 占싱뱄옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙~
		selectedImage = new ImageIcon(Main.class.getResource("../images/"+trackList.get(nowSeleted).getStartImage())).getImage();
		selectedMusic = new Music(trackList.get(nowSeleted).getStartMusic(),true);
		selectedMusic.start();
		
	}
	
	public void selectLeft() {
		if(nowSelected == 0) {
			nowSelected = trackList.size() -1; 
		}else {
			nowSelected --; //占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占싣닐띰옙
		}
		selectedTrack(nowSelected);
	}
	public void selectRight() {
		if(nowSelected == trackList.size() -1) {
			nowSelected = 0;
		}else {
			nowSelected ++; 
		}
		selectedTrack(nowSelected);
	}
	
	public void gamestart(int nowselected,String difficlty) {
		paly_num++;
		ranking_one_time=true;
		mid_chr_img= false;
		CC_info_Screen=false;
		close_Button.setVisible(false);
		Back_menu_Button.setVisible(false);
		if(selectedMusic != null)
			selectedMusic.close();
		inMainScreen = false;
		UpButton.setVisible(false);
		DownButton.setVisible(false);
		easyButton.setVisible(false);
		hardButton.setVisible(false);
		_Back = new ImageIcon(Main.class.getResource("../images/"+trackList.get(nowselected).getGameImage()))
				.getImage();
		//backButton.setVisible(true);
		inGameScreen = true;
		game= new Game(trackList.get(nowselected).getTitleName(),difficlty,trackList.get(nowselected).getGameMusic());
		game.start();
		 ENDgameButton_1.setVisible(true);
		setFocusable(true);
		requestFocus(); 
		
		
	}
	public void Tgame_start() {
		mid_chr_img= false;
		Screen_info.setVisible(false);
		CC_info_Screen=false;
		Ranking_Print.setVisible(false);
		close_Button.setVisible(false);
		info_Button.setVisible(false);
		Card_Button.setVisible(false);
		CC_Button.setVisible(false);
		PlayButton.setVisible(false);
		GachaButton.setVisible(false);
		startButton.setVisible(false);
		paly_num++;
		mid_chr_img= false;
		CC_info_Screen=false;
		close_Button.setVisible(false);
		Back_menu_Button.setVisible(false);
		if(selectedMusic != null)
			selectedMusic.close();
		inMainScreen = false;
		_Back = new ImageIcon(Main.class.getResource("../images/Tutorial_back.png")).getImage();
		inGameScreen = true;
		game= new Game("Tutorial","nano","drum_Tutorial");
		game.start();
		ENDTutorialButton_1.setVisible(true);
		setFocusable(true);
		requestFocus(); 
		
	}
	
	public void Mid_() {
		next_card.setVisible(false);
		ScoreCheck_screen = false;
		explan_Screenimg_page= false;
		mid_chr_img= true;
		Screen_info.setVisible(true);
		inGameScreen = false;
		Ranking_Print.setVisible(true);
		CC_Button.setVisible(true);
		Card_Button.setVisible(true);
		info_Button.setVisible(true);
		Back_menu_Button.setVisible(false);
		startButton.setVisible(false);
		_Back = new ImageIcon(Main.class.getResource("../images/MD.png")).getImage();
		GachaButton.setVisible(true);
		PlayButton.setVisible(true);
		 ENDgameButton_1.setVisible(false);
		
		 Ranking_Up.setVisible(false);
		ENDgameButton_after_move.setVisible(false);
		UpButton.setVisible(false);
		DownButton.setVisible(false);
		easyButton.setVisible(false);
		hardButton.setVisible(false);
		inMainScreen = false;
		Gatcha_one_Button.setVisible(false);
		Gatcha_five_Button.setVisible(false);

		
		ChoiceButton_1.setVisible(false);
		ChoiceButton_2.setVisible(false);
		ChoiceButton_3.setVisible(false);
		ChoiceButton_4.setVisible(false);
		ChoiceButton_5.setVisible(false);
		ChoiceButton_6.setVisible(false);
		ChoiceButton_7.setVisible(false);
		ChoiceButton_8.setVisible(false);
		if(selectedMusic != null) {
			selectedMusic.close();
		}
	}

	public void enterMain() {
		ENDTutorialButton_1.setVisible(false);
		mid_chr_img= false;
		Screen_info.setVisible(false);
		CC_info_Screen=false;
		Ranking_Print.setVisible(false);
		close_Button.setVisible(false);
		info_Button.setVisible(false);
		Card_Button.setVisible(false);
		CC_Button.setVisible(false);
		PlayButton.setVisible(false);
		GachaButton.setVisible(false);
		startButton.setVisible(false);
		_Back = new ImageIcon(Main.class.getResource("../images/Music_back.png")).getImage();
		inMainScreen = true;
		Back_menu_Button.setVisible(true);
		UpButton.setVisible(true);
		DownButton.setVisible(true);
		easyButton.setVisible(true);
		hardButton.setVisible(true);
		
		selectedTrack(0);
	}

	public void Gatcha() {
		Card_Random=false;
		
		mid_chr_img= false;
		Gatcha_one_Button.setVisible(true);
		Gatcha_five_Button.setVisible(true);
		Ranking_Print.setVisible(false);
		CC_info_Screen=false;
		CC_Button.setVisible(false);
		Card_Button.setVisible(false);
		info_Button.setVisible(false);
		Back_menu_Button.setVisible(true);
		startButton.setVisible(false);
		_Back = new ImageIcon(Main.class.getResource("../images/Gacha_back_1.png")).getImage();
		GachaButton.setVisible(false);
		PlayButton.setVisible(false);
		introMusic.close();
		UpButton.setVisible(false);
		DownButton.setVisible(false);
		easyButton.setVisible(false);
		Screen_info.setVisible(false);
		hardButton.setVisible(false);
		inMainScreen = false;
		close_Button.setVisible(false);
		if(selectedMusic != null) {
			selectedMusic.close();
		}
	}
	
	public void Gatcha_in(int i) {
		if(i!=1 &&Card_next<5) {
			next_card.setVisible(true);
		}else if(Card_next==5) {
			next_card.setVisible(false);
			Card_next=1;
		}
		Card_Random=true;

			int m=(int)(Math.random()*100)+1; 
			if(m<=10) { _Back = new ImageIcon(Main.class.getResource("../Card_gif/ch_01_1.gif")).getImage();  }
			else if(m<=20) {_Back = new ImageIcon(Main.class.getResource("../Card_gif/ch_02_1.gif")).getImage();}
			else if(m<=30) {_Back = new ImageIcon(Main.class.getResource("../Card_gif/ch_03_1.gif")).getImage();}
			else if(m<=40) {_Back = new ImageIcon(Main.class.getResource("../Card_gif/ch_04_1.gif")).getImage();}
			else if(m<=50) {_Back = new ImageIcon(Main.class.getResource("../Card_gif/ch_01_2.gif")).getImage();}
			else if(m<=60) {_Back = new ImageIcon(Main.class.getResource("../Card_gif/ch_02_2.gif")).getImage();}
			else if(m<=70) {_Back = new ImageIcon(Main.class.getResource("../Card_gif/ch_03_2.gif")).getImage();}
			else if(m<=80) {_Back = new ImageIcon(Main.class.getResource("../Card_gif/ch_04_2.gif")).getImage();}
			else if(m<=90) {_Back = new ImageIcon(Main.class.getResource("../Card_gif/ch_02_1.gif")).getImage();}
			else {_Back = new ImageIcon(Main.class.getResource("../Card_gif/ch_01_2.gif")).getImage();}
			
	}

	

	public void ScoreCheck() {
		_Back = new ImageIcon(Main.class.getResource("../images/End_game_Screen.png")).getImage();
		ENDgameButton_after_move.setVisible(true);
		Ranking_Up.setVisible(true);
		inGameScreen = false;
		game.close();
		ENDgameButton_1.setVisible(false);
		ScoreCheck_screen = true;
		Screen_info.setVisible(false);
		CC_info_Screen=false;
		close_Button.setVisible(false);
		Card_choice_s = false;

	}
	
	private void ImgData_change() {
		 Connection conn = null ;
	     Statement st;
	     ResultSet rs;
	     
	     
	     try {
	   		  Class.forName("com.mysql.cj.jdbc.Driver");
	   		  conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/animal_friend?serverTimezone=UTC","root","root");
	   		  PreparedStatement pstmt;
	   		String SQL= "UPDATE charimg SET data = '"+nowImg+"' ";
	   		  pstmt = conn.prepareStatement(SQL);
			  pstmt.executeUpdate();
	   	  }catch(Exception ec) {
	   		  System.out.println("드라이버 로딩 실패");
		            System.out.println(ec);
	   	  }
	     
	     
	}
	
	private void Ranking_score() {
		 Connection conn = null ;
	     Statement st;
	     ResultSet rs;
	     
	     
	     try {
	   		  Class.forName("com.mysql.cj.jdbc.Driver");
	   		  conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/animal_friend?serverTimezone=UTC","root","root");
	   		System.out.println("드라이버 연결 굿");
	   	  }catch(Exception ec) {
	   		  System.out.println("드라이버 로딩 실패");
		            System.out.println(ec);
	   	  }
		
	    if(ranking_one_time) {
	    	Dimension dim = new Dimension(400,100);
			
			JFrame frame = new JFrame("이름 입력");
			
			frame.resize(400, 100);
			frame.setPreferredSize(dim);
			JTextField textField = new JTextField();
			JLabel label = new JLabel("순위에 등록 될 이름을 적어주세요.(8자 이내)");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setVerticalAlignment(SwingConstants.CENTER);
			
			JButton btton = new JButton("결정 완료!");
			btton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					
					String name=textField.getText();
					if(name.length()>8) {
						JOptionPane.showMessageDialog(null, "글자 길이가 깁니다.");
						
					}else
					{
						frame.setVisible(false);
						String SQL= "INSERT INTO ranking VALUES('"+name+"', "+game.Score+") ";
						try {
							PreparedStatement pstmt;
							Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/animal_friend?serverTimezone=UTC","root","root");
							pstmt = conn.prepareStatement(SQL);
							pstmt.executeUpdate();
							ranking_one_time=false;
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
				
			});
			frame.add(label, BorderLayout.NORTH);
			frame.add(textField, BorderLayout.CENTER);
			frame.add(btton,BorderLayout.SOUTH);
			frame.setVisible(true);
	    }else {
	    	JOptionPane.showMessageDialog(null, "이미 입력했습니다.");
	    }
		
		
		
	}
	
	private void  Print_Ranking() {
		 Connection conn = null ;
	     Statement st;
	     ResultSet rs;
	     PreparedStatement pstmt = null;

	     try {
	   		  Class.forName("com.mysql.cj.jdbc.Driver");
	   		  conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/animal_friend?serverTimezone=UTC","root","root");
	   		  System.out.println("드라이버 연결 굿");
	   	  }catch(Exception ec) {
	   		  System.out.println("드라이버 로딩 실패");
		            System.out.println(ec);
	   	  }

		try {
			String SQL= "select *  from (select * from ranking order by score desc) ranking LIMIT 10 ";
			pstmt = conn.prepareStatement(SQL);
			int i=0;
			//String Sql ="select @rownum:=@rownum+1 as rownum, ranking.*  from (select * from ranking order by score desc) ranking LIMIT 10";
			String Sql = "select *  from (select * from ranking order by score desc) ranking LIMIT 10";
			rs = pstmt.executeQuery(Sql);
			
			while (rs.next())
			{
				Ranking_name[i]=rs.getString("name");
				Ranking_score[i]=rs.getInt("score");
				i++;
			}
		} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
		}
	}
	public Image getCharImg() {
		return Card_char_img;
	}

}
