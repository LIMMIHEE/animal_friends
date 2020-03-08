package G_5;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Musicgame extends JFrame {
	
	
	
	 private ImageIcon endButton_1 = new ImageIcon(Main.class.getResource("../images/close.png"));
	 private JButton ENDgameButton_1 = new JButton(endButton_1);
	 private ImageIcon end_moveButton_1 = new ImageIcon(Main.class.getResource("../images/end_after_Main.png"));
	 private JButton ENDgameButton_after_move = new JButton(end_moveButton_1);
	 private ImageIcon char_neButton_1 = new ImageIcon(Main.class.getResource("../images/next_card.png"));
	 private JButton next_card = new JButton(char_neButton_1);

	
	private Image screenImage;
	private Graphics screenGraphic;

	private ImageIcon Back = new ImageIcon(Main.class.getResource("../images/Main_title.png"));
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
	
	private Image _Back = new ImageIcon(Main.class.getResource("../images/Main_title.png")).getImage();
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
	private Image Card_choice_Display= new ImageIcon(Main.class.getResource("../images/card_chice_notify.png")).getImage();
	private Image Card_char_img= new ImageIcon(Main.class.getResource("../images/ch_1_1.png")).getImage();
	private int mouseX, mouseY;
	private int mouse_CardX=103, mouse_CardY=172;
	
	private boolean inMainScreen = false;
	private boolean inGameScreen = false;
	private boolean CC_info_Screen= false;
	private boolean mid_chr_img =false;
	private boolean Card_Random =false;
	
	private boolean ScoreCheck_screen = false;
	private boolean explan_Screenimg_page= false;
	private boolean Card_choice_s= false;
	
	private int Card_next= 1;
	
	ArrayList<Track> trackList = new ArrayList<Track>();//Ʈ��[shfo] ���� �����
	
	private Image titleImage;
	private Music selectedMusic;
	private Image selectedImage;
	private Image selectedMusicImage;
	private Image selectedNotMusicImage;
	Music introMusic = new Music("dotabatare-su.mp3", true);
	Music ScoreMusic = new Music("Quiz-Results01-2.mp3", false);
	
	private int nowSelected = 0;
	
	public static Game game;

	
	public Musicgame() {
		
		trackList.add(new Track("Music_Back_4_U.png","DEVYN_.png","DEVYN_seleted.mp3",
				"DEVYN.mp3","DEVYN"));
		trackList.add(new Track("Music_Back_Boo.png","Boomerang_.png",
				"Boomerang_seleted.mp3","Boomerang.mp3","Boomerang"));
		
		setUndecorated(true);
		setTitle("Twin Live");

		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HIGHT);// ���� ����â ũ��
		setResizable(false); // ����â ũ�� ��ȯ����
		setLocationRelativeTo(null);// ����â �� �߾ӿ� �߰��ϱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ����â ���������� ���α׷� ��ü ����
		setVisible(true); // ����â ����ͷ� ����ϱ�
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);

		introMusic.start();
		
		addKeyListener(new KeyLisener());
		{	
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
					buttonpressed.start();
					
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
					buttonpressed.start();
					
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
					buttonpressed.start();	
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
					buttonpressed.start();
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
					buttonpressed.start();	
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
					buttonpressed.start();
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
					buttonpressed.start();	
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
					buttonpressed.start();
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
				ScoreCheck();
			}
		});
		add(ENDgameButton_1);
		ENDgameButton_after_move.setVisible(false);
		ENDgameButton_after_move.setBounds(700, 80, 155, 63);
		ENDgameButton_after_move.setBorderPainted(false);
		ENDgameButton_after_move.setContentAreaFilled(false);
		ENDgameButton_after_move.setFocusPainted(false);
		ENDgameButton_after_move.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonpressed = new Music("buttonpressed.mp3",false);
				buttonpressed.start();
			
				ScoreMusic.close();
				Mid_();
			}
		});
		add(ENDgameButton_after_move);
		
		 
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
				enterMain();
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
				CC_info_= new ImageIcon(Main.class.getResource("../images/noteRutePressed_1.png")).getImage();
				close_Button.setVisible(false);
				
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
			
		}
		if(Card_choice_s) {
			mid_chr_img= false;
			close_Button.setBounds(500,37, 202, 54);
			g.drawImage(Card_choice_screen,0,0,null);
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
			g.drawImage(Card_choice_Display,mouse_CardX,mouse_CardY,null);
			g.setColor(Color.lightGray); g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			g.setFont(new Font("돋움",Font.BOLD,25)); g.drawString(Character_Name,200, 626); 
			
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
		}
		paintComponents(g); // �̹����� ������ ����? ������ �̹����� �̷���
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
		//���� ���õ� �̹��� ��������~
		selectedImage = new ImageIcon(Main.class.getResource("../images/"+trackList.get(nowSeleted).getStartImage())).getImage();
		selectedMusic = new Music(trackList.get(nowSeleted).getStartMusic(),true);
		selectedMusic.start();
		
	}
	
	public void selectLeft() {
		if(nowSelected == 0) {
			nowSelected = trackList.size() -1; 
		}else {
			nowSelected --; //���� ������ �ƴҶ�
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
		
		
	}
	
	public void Mid_() {
		next_card.setVisible(false);
		ScoreCheck_screen = false;
		explan_Screenimg_page= false;
		mid_chr_img= true;
		Screen_info.setVisible(true);
		inGameScreen = false;
		CC_Button.setVisible(true);
		Card_Button.setVisible(true);
		info_Button.setVisible(true);
		Back_menu_Button.setVisible(false);
		startButton.setVisible(false);
		_Back = new ImageIcon(Main.class.getResource("../images/MD.png")).getImage();
		GachaButton.setVisible(true);
		PlayButton.setVisible(true);
		 ENDgameButton_1.setVisible(false);
		
		
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
		mid_chr_img= false;
		Screen_info.setVisible(false);
		CC_info_Screen=false;
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
		ScoreMusic.start();
		_Back = new ImageIcon(Main.class.getResource("../images/End_game_Screen.png")).getImage();
		ENDgameButton_after_move.setVisible(true);
		inGameScreen = false;
		game.close();
		ENDgameButton_1.setVisible(false);
		ScoreCheck_screen = true;
		Screen_info.setVisible(false);
		CC_info_Screen=false;
		close_Button.setVisible(false);
		Card_choice_s = false;

	}
	

}
