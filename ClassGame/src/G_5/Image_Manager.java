package G_5;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Image_Manager  {
	  ImageIcon TutorialendButton_1 = new ImageIcon(Main.class.getResource("../images/Tutorial_close.png"));
	  JButton ENDTutorialButton_1 = new JButton(TutorialendButton_1);
	  ImageIcon endButton_1 = new ImageIcon(Main.class.getResource("../images/close.png"));
	  JButton ENDgameButton_1 = new JButton(endButton_1);
	  ImageIcon end_moveButton_1 = new ImageIcon(Main.class.getResource("../images/end_after_Main.png"));
	  JButton ENDgameButton_after_move = new JButton(end_moveButton_1);
	  ImageIcon char_neButton_1 = new ImageIcon(Main.class.getResource("../images/next_card.png"));
	  JButton next_card = new JButton(char_neButton_1);

	
	  Image screenImage;
	  Graphics screenGraphic;

	  ImageIcon Back = new ImageIcon(Main.class.getResource("../Card_gif/Main_Sc.gif"));
	  ImageIcon ExitButten_2 = new ImageIcon(Main.class.getResource("../images/ExitButten_2.png"));
	 ImageIcon ExitButton_1 = new ImageIcon(Main.class.getResource("../images/ExitButten_1.png"));
	 ImageIcon UpButtonEnter = new ImageIcon(Main.class.getResource("../images/down_2.png"));
	 ImageIcon UpButtonBasic = new ImageIcon(Main.class.getResource("../images/down_1.png"));
	 ImageIcon DownButtonEnter = new ImageIcon(Main.class.getResource("../images/up_2.png"));
	 ImageIcon DownButtonBasic = new ImageIcon(Main.class.getResource("../images/up_1.png"));
	
	 ImageIcon CardButton = new ImageIcon(Main.class.getResource("../images/Card.png"));
	 ImageIcon infoButton = new ImageIcon(Main.class.getResource("../images/info.png"));
	 ImageIcon CC_infoButton = new ImageIcon(Main.class.getResource("../images/CC_info.png"));
	
	
	 ImageIcon closeButton = new ImageIcon(Main.class.getResource("../images/exit_Screeninfo.png"));
	
	
	 ImageIcon Play = new ImageIcon(Main.class.getResource("../images/play_button.png"));
	 ImageIcon Gacha = new ImageIcon(Main.class.getResource("../images/Gacha_button.png"));
	

	 ImageIcon Gatcha_one = new ImageIcon(Main.class.getResource("../images/1_Gat.png"));
	 ImageIcon Gatcha_five = new ImageIcon(Main.class.getResource("../images/5_Gat.png"));
	
	 ImageIcon EasyButtonEnter = new ImageIcon(Main.class.getResource("../images/Easy_2.png"));
	 ImageIcon EasyButtonBasic = new ImageIcon(Main.class.getResource("../images/Easy_.png"));
	 ImageIcon HardButtonEnter = new ImageIcon(Main.class.getResource("../images/Hard_2.png"));
	 ImageIcon HardButtonBasic = new ImageIcon(Main.class.getResource("../images/Hard.png"));
	 ImageIcon BackButton = new ImageIcon(Main.class.getResource("../images/back_menu_button.png"));
	
	 Image _Back = new ImageIcon(Main.class.getResource("../Card_gif/Main_Sc.gif")).getImage();
	 JLabel menubar = new JLabel(new ImageIcon(Main.class.getResource("../images/menubar.png")));
	
	
	
	 String Character_Name = "일상 속 기버";
	 ImageIcon CButton_1 = new ImageIcon(Main.class.getResource("../images/card_chice_Range.png"));
	 JButton ChoiceButton_1 = new JButton(CButton_1);
	 ImageIcon CButton_2 = new ImageIcon(Main.class.getResource("../images/card_chice_Range.png"));
	 JButton ChoiceButton_2 = new JButton(CButton_2);	
	 ImageIcon CButton_3 = new ImageIcon(Main.class.getResource("../images/card_chice_Range.png"));
	 JButton ChoiceButton_3 = new JButton(CButton_3);
	 ImageIcon CButton_4 = new ImageIcon(Main.class.getResource("../images/card_chice_Range.png"));
	 JButton ChoiceButton_4 = new JButton(CButton_4);	
	 ImageIcon CButton_5 = new ImageIcon(Main.class.getResource("../images/card_chice_Range.png"));
	 JButton ChoiceButton_5 = new JButton(CButton_5);
	 ImageIcon CButton_6 = new ImageIcon(Main.class.getResource("../images/card_chice_Range.png"));
	 JButton ChoiceButton_6 = new JButton(CButton_6);	
	 ImageIcon CButton_7 = new ImageIcon(Main.class.getResource("../images/card_chice_Range.png"));
	 JButton ChoiceButton_7 = new JButton(CButton_7);
	 ImageIcon CButton_8 = new ImageIcon(Main.class.getResource("../images/card_chice_Range.png"));
	 JButton ChoiceButton_8 = new JButton(CButton_8);	


	 ImageIcon Screen_explan = new ImageIcon(Main.class.getResource("../images/Screen_explan.png"));
	 JButton Screen_info = new JButton(Screen_explan);
	 ImageIcon Screen_explan_close = new ImageIcon(Main.class.getResource("../images/exit_Screeninfo.png"));
	 JButton Screen_info_exit_b = new JButton(Screen_explan_close);
	
	
	 JButton startButton = new JButton(Back);
	 JButton exitButton = new JButton(ExitButten_2);
	 JButton UpButton = new JButton(UpButtonBasic);
	 JButton DownButton = new JButton(DownButtonBasic);
	
	 JButton Card_Button = new JButton(CardButton);
	 JButton info_Button = new JButton(infoButton);
	 JButton CC_Button = new JButton(CC_infoButton);
	
	 JButton close_Button = new JButton(closeButton);
	
	 JButton PlayButton = new JButton(Play);
	 JButton GachaButton = new JButton(Gacha);
	
	 JButton Gatcha_one_Button = new JButton(Gatcha_one);
	 JButton Gatcha_five_Button = new JButton(Gatcha_five);
	
	 JButton easyButton = new JButton(EasyButtonBasic);
	 JButton hardButton = new JButton(HardButtonBasic);	
	 JButton Back_menu_Button = new JButton(BackButton);
	
	 Image CC_info_= new ImageIcon(Main.class.getResource("../images/cc_infomation.png")).getImage();
	 Image explan_Screenimg_= new ImageIcon(Main.class.getResource("../images/Screen_explan_img.png")).getImage();
	 Image Card_choice_screen= new ImageIcon(Main.class.getResource("../images/card_chice_Screen.png")).getImage();
	 Image Card_choice_Display= new ImageIcon(Main.class.getResource("../images/card_chice_notify.png")).getImage();
	 Image Card_char_img= new ImageIcon(Main.class.getResource("../images/ch_1_1.png")).getImage();
	
	 Image info_text_sq = new ImageIcon(Main.class.getResource("../images/info_text.png")).getImage();
	
	 int mouseX, mouseY;
	 int mouse_CardX=103, mouse_CardY=172;
	 String[] info_text_random= new String [] {"디스코는 예민하고 섬세하고 기버는 다른 사람을 배려하기 좋아하죠",
			"꺼미는 다른 동물에게 별다른 관심이 없는 편이고,피시는 긍정적이에요",
			"꺼미는 고양이, 디스코는 거북이, 피시는 뱀, 기버는 토끼에요!","일부 픽토그램 제외한 이미지는 전부 제작자가 디자인 했어요",
			"코드 도움의 김동빈님의 대한 정보는 구글을 통해 알 수 있어요.","음원들을 구글에 검색하면 바로 찾을 수 있어요",
			"이 프로그램은 약 1년간 지속적으로 만들어졌어요","UI는 약 5번 이상,음원은 3번 이상 다시 제작 및 추가했어요",
			"기버는 꺼미와의 가위바위보에 져서 산타옷을 입었어요","디스코는 피시에게 양말을,피시는 루돌푸 머리띠를 선물로 줬어요","꺼미는 마음에 드는 트리 장식을 찾기위해 많은 시간을 썼어요",
			"피시는 디스코와 물에 있는 걸 매우 좋아해요","꺼미는 기버와 이웃사이에요, 친구이기도 하죠.",
			"사실 기버는 산타 옷을 입기 싫어했어요","제작자의 깃허브 닉네임은 LIMIHEE에요."};
	
	 boolean inMainScreen = false;
	 boolean inGameScreen = false;
	 boolean CC_info_Screen= false;
	 boolean mid_chr_img =false;
	 boolean Card_Random =false;
	 boolean info_text_Screen =false;
	
	 boolean ScoreCheck_screen = false;
	 boolean explan_Screenimg_page= false;
	 boolean Card_choice_s= false;
	
	 int Card_next= 1;
	
	 Image titleImage;
	 Music selectedMusic;
	 Image selectedImage;
	 Image selectedMusicImage;
	 Image selectedNotMusicImage;
}
