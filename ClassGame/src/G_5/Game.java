package G_5;

import java.awt.*;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Game extends Thread{

	public static Musicgame gam;
	

	private Image Line = new ImageIcon(Main.class.getResource("../images/judgementLine.png")).getImage();
	
	private Image noteRouteImage_a = new ImageIcon(Main.class.getResource("../images/noteRutePressed_1.png")).getImage();
	private Image Back;
	

	private Image judgeImage ;
	

	int s_JLabel_t=0;
	int Per_score=0;
	int Great_score=0;
	int Good_score=0;
	int Miss_score=0;
	int Score=0;
	int COMBO=0;
	
	
	private String titleName;
	private String difficult;
	private String musicTitle;
	private Music gameMusic;
	
	ArrayList<Note> noteList =  new ArrayList<Note>();
	

	
	
	public Game(String titleName,String difficult,String musicTitle) {
		this.titleName =titleName;
		this.difficult=difficult;
		this.musicTitle=musicTitle;
		if(musicTitle != "drum_Tutorial") {
			gameMusic=new Music(this.musicTitle,false);
		}else {
			gameMusic=new Music("drum_Tutorial.mp3",true);
		}
	}


	public void screenDraw(Graphics2D g) {
		g.drawImage(noteRouteImage_a, 0 ,0 ,null);
		g.drawImage(judgeImage, 457 ,430 ,null);
		

		
		for(int i=0; i < noteList.size(); i++) {
		
			if(COMBO!=0) {
				if(COMBO>=10) {
					g.setColor(Color.lightGray);
					g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
					g.setFont(new Font("Royalacid_o",Font.BOLD,85));
					g.drawString(Integer.toString(COMBO),1018, 136);
				}else {
					g.setColor(Color.lightGray);
					g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
					g.setFont(new Font("Royalacid_o",Font.BOLD,75));
					g.drawString(Integer.toString(COMBO),1040, 136);
				}
				g.setColor(Color.white);
				g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
				g.setFont(new Font("�Ƹ���-����(TTF)-Bold",Font.BOLD,43));
				g.drawString("COMBO",980, 170);
			}
			Note note = noteList.get(i);
			if(note.getx() > 1100) {
				judgeImage = new ImageIcon(Main.class.getResource("../images/Miss_Image.png")).getImage();
				COMBO=0;
			}
			if(!note.isProceeded()) {
				noteList.remove(i);
				i--;
			}else {
				note.screenDraw(g);	
			}
		}
		g.drawImage(Line, 0 ,0 ,null);
		g.drawImage(Back, 0 ,0 ,null);
		
		
	}
	
	

	
	public void pressLeft() {
		judge("LEFT");
		noteRouteImage_a =  new ImageIcon(Main.class.getResource("../images/noteRutePressed.png")).getImage();
		new Music("drum_1.mp3",false).start();
	}
	public void releaseLeft() {
		noteRouteImage_a =  new ImageIcon(Main.class.getResource("../images/noteRutePressed_1.png")).getImage();
	}
	
	
	public void pressUp() {
		judge("UP");
		noteRouteImage_a =  new ImageIcon(Main.class.getResource("../images/noteRutePressed.png")).getImage();
		new Music("drum_3.mp3",false).start();
	}
	public void releaseUp() {
		noteRouteImage_a =  new ImageIcon(Main.class.getResource("../images/noteRutePressed_1.png")).getImage();
	}
	
	
	public void pressRight() {
		judge("RIGHT");
		noteRouteImage_a =  new ImageIcon(Main.class.getResource("../images/noteRutePressed.png")).getImage();
		new Music("drum_1.mp3",false).start();
	}
	public void releaseRight() {
		noteRouteImage_a =  new ImageIcon(Main.class.getResource("../images/noteRutePressed_1.png")).getImage();
	}
	
	
	
	public void close() {
		gameMusic.close();
		this.interrupt();

	}
	

	@Override
	public void run() {
		dropNote(this.titleName);
		
	}
	public void dropNote(String titleName) {
		
		Beat [] beats = null;
		if(titleName.equals("Tutorial") && difficult.equals("nano")) {
			int startTime = 650;
			int gap = 550;

			beats = new Beat[] {	
					new Beat(startTime + (gap-35)* 0,"LEFT"),
					new Beat(startTime + (gap-35)* 3,"UP"),
					new Beat(startTime + (gap-35)* 6,"RIGHT"),
					new Beat(startTime + (gap-35)* 9,"LEFT"),
					new Beat(startTime + (gap-35)* 14,"UP"),
					new Beat(startTime + (gap-35)* 17,"RIGHT"),
					new Beat(startTime + (gap-35)* 19,"LEFT"),
					new Beat(startTime + (gap-35)* 21,"UP"),
					new Beat(startTime + (gap-35)* 24,"RIGHT"),
					new Beat(startTime + (gap-35)* 27,"LEFT"),
					new Beat(startTime + (gap-35)* 30,"UP"),
					new Beat(startTime + (gap-35)* 33,"RIGHT"),
					new Beat(startTime + (gap-35)* 36,"LEFT"),
					new Beat(startTime + (gap-35)* 39,"UP"),
					new Beat(startTime + (gap-35)* 42,"RIGHT"),
					new Beat(startTime + (gap-35)* 45,"LEFT"),
					new Beat(startTime + (gap-35)* 48,"UP"),
					new Beat(startTime + (gap-35)* 51,"RIGHT"),
					new Beat(startTime + (gap-35)* 54,"LEFT"),
					new Beat(startTime + (gap-35)* 57,"UP"),
					new Beat(startTime + (gap-35)* 60,"RIGHT"),
					new Beat(startTime + (gap-35)* 63,"LEFT"),
					new Beat(startTime + (gap-35)* 66,"UP"),
					new Beat(startTime + (gap-35)* 69,"RIGHT"),
					new Beat(startTime + (gap-35)* 72,"LEFT"),
					new Beat(startTime + (gap-35)* 75,"UP"),
					new Beat(startTime + (gap-35)* 78,"RIGHT"),
					new Beat(startTime + (gap-35)* 81,"LEFT"),
					new Beat(startTime + (gap-35)* 84,"UP"),
					new Beat(startTime + (gap-35)* 87,"RIGHT"),
			};
		}
		else if(titleName.equals("DEVYN") && difficult.equals("Easy")) {
			int startTime = 4200 - Main.REACH_TIME*1000;
			int gap=600;
			
			beats = new Beat[] {
					new Beat(startTime,"LEFT"),
					new Beat(startTime + gap* 3,"UP"),
					new Beat(startTime + (gap-13)* 6,"LEFT"),
					new Beat(startTime + (gap)* 9,"RIGHT"),
					new Beat(startTime + gap* 12,"RIGHT"),
					new Beat(startTime + gap* 15,"LEFT"),
					new Beat(startTime + gap* 16,"UP"),
					new Beat(startTime + gap* 18,"RIGHT"),
					new Beat(startTime + (gap-13)* 21,"LEFT"),
					new Beat(startTime + (gap-13)* 24,"LEFT"),
					new Beat(startTime + gap* 27,"LEFT"),
					new Beat(startTime + (gap-13)* 30,"UP"),
					new Beat(startTime + gap* 31,"RIGHT"),
					new Beat(startTime + gap* 33,"UP"),
					new Beat(startTime + gap* 36,"RIGHT"),
					new Beat(startTime + gap* 39,"RIGHT"),
					new Beat(startTime + gap* 42,"LEFT"),
					new Beat(startTime + gap* 43,"RIGHT"),
					new Beat(startTime + gap* 45,"LEFT"),
					new Beat(startTime + gap* 48,"RIGHT"),
					new Beat(startTime + gap* 51,"RIGHT"),
					new Beat(startTime + (gap-13)* 54,"LEFT"),
					new Beat(startTime + gap* 57,"RIGHT"),
					new Beat(startTime + gap* 60,"LEFT"),
					
					new Beat(startTime + gap* 63,"RIGHT"),
					new Beat(startTime + gap* 64,"UP"),
					new Beat(startTime + gap* 66,"LEFT"),
					new Beat(startTime + (gap-15)* 69,"UP"),
					new Beat(startTime + (gap-15)* 70,"RIGHT"),
					new Beat(startTime + (gap-15)* 71,"UP"),
					new Beat(startTime + (gap-15)* 73,"RIGHT"),
					new Beat(startTime + (gap-15)* 76,"RIGHT"),
					new Beat(startTime + (gap-15)* 77,"LEFT"),
					new Beat(startTime + (gap-15)* 79,"UP"),
					new Beat(startTime + (gap-15)* 80,"UP"),
					new Beat(startTime + (gap-15)* 81,"UP"),
					new Beat(startTime + (gap-15)* 82,"RIGHT"),
					new Beat(startTime + (gap-15)* 85,"UP"),
					new Beat(startTime + (gap-15)* 86,"UP"),
					
					new Beat(startTime + (gap-15)* 89,"UP"),
					new Beat(startTime + (gap-15)* 90,"RIGHT"),
					new Beat(startTime + (gap-15)* 91,"UP"),
					new Beat(startTime + (gap-15)* 93,"LEFT"),
					new Beat(startTime + (gap-15)* 94,"LEFT"),
					new Beat(startTime + (gap-15)* 96,"RIGHT"),
					new Beat(startTime + (gap-15)* 97,"LEFT"),
					new Beat(startTime + (gap-15)* 100,"LEFT"),
					new Beat(startTime + (gap-15)* 101,"RIGHT"),
				
					new Beat(startTime + (gap-15)* 104,"UP"),
					new Beat(startTime + (gap-15)* 107,"UP"),
					new Beat(startTime + (gap-15)* 110,"LEFT"),
					new Beat(startTime + gap* 113,"RIGHT"),
					new Beat(startTime + (gap)* 116,"UP"),
					new Beat(startTime + (gap)* 117,"LEFT"),
					new Beat(startTime + gap* 119,"LEFT"),
					new Beat(startTime + (gap)* 122,"RIGHT"),
					new Beat(startTime + (gap)* 125,"UP"),
					new Beat(startTime + (gap)* 128,"LEFT"),
					new Beat(startTime + gap* 131,"LEFT"),
					new Beat(startTime + gap* 134,"UP"),
					new Beat(startTime + gap* 135,"RIGHT"),
					new Beat(startTime + gap* 137,"UP"),
					
					new Beat(startTime + (gap)* 140,"RIGHT"),
					new Beat(startTime + (gap)* 143,"LEFT"),
					new Beat(startTime + (gap-12)* 146,"UP"),
					new Beat(startTime + (gap-12)* 147,"RIGHT"),
					new Beat(startTime + (gap-12)* 148,"LEFT"),
					
					new Beat(startTime + (gap)* 151,"UP"),
					new Beat(startTime + (gap)* 154,"RIGHT"),
					new Beat(startTime + (gap)* 155,"LEFT"),
					new Beat(startTime + (gap)* 157,"RIGHT"),
					new Beat(startTime + (gap)* 160,"UP"),
					new Beat(startTime + (gap)* 163,"LEFT"),
					new Beat(startTime + (gap)* 166,"RIGHT"),
					new Beat(startTime + (gap)* 169,"UP"),
					new Beat(startTime + (gap)* 170,"UP"),
					new Beat(startTime + (gap-13)* 172,"RIGHT"),
					new Beat(startTime + (gap-13)* 175,"LEFT"),
					new Beat(startTime + (gap)* 178,"UP"),
					
					new Beat(startTime + gap* 181,"LEFT"),
					new Beat(startTime + gap* 184,"LEFT"),
					new Beat(startTime + (gap-13)* 187,"UP"),
					new Beat(startTime + gap* 190,"LEFT"),
					new Beat(startTime + gap* 193,"RIGHT"),
					new Beat(startTime + gap* 196,"RIGHT"),
					new Beat(startTime + gap* 199,"LEFT"),
					new Beat(startTime + gap* 200,"UP"),
					new Beat(startTime + gap* 202,"RIGHT"),
					new Beat(startTime + gap* 205,"LEFT"),
					new Beat(startTime + gap* 208,"LEFT"),
					new Beat(startTime + gap* 209,"LEFT"),
					new Beat(startTime + gap* 212,"UP"),
					new Beat(startTime + gap* 215,"RIGHT"),
					new Beat(startTime + gap* 218,"UP"),
					new Beat(startTime + (gap-15)* 221,"RIGHT"),
					new Beat(startTime + (gap-15)* 224,"RIGHT"),
					new Beat(startTime + (gap-15)* 227,"LEFT"),
					new Beat(startTime + (gap-15)* 230,"RIGHT"),
					new Beat(startTime + (gap-15)* 233,"LEFT"),
					
					new Beat(startTime + (gap-15)* 234,"LEFT"),
					new Beat(startTime + (gap-15)* 236,"UP"),
					new Beat(startTime + (gap-15)* 237,"LEFT"),
					new Beat(startTime + (gap-15)* 239,"RIGHT"),
					new Beat(startTime + (gap-15)* 240,"UP"),
					new Beat(startTime + (gap-15)* 242,"RIGHT"),
					new Beat(startTime + (gap-15)* 243,"LEFT"),
					new Beat(startTime + (gap-15)* 245,"LEFT"),
					new Beat(startTime + (gap-15)* 246,"RIGHT"),
					new Beat(startTime + (gap-15)* 247,"UP"),
					new Beat(startTime + (gap-15)* 249,"RIGHT"),
					new Beat(startTime + (gap-15)* 250,"RIGHT"),
					new Beat(startTime + (gap-15)* 252,"LEFT"),
					new Beat(startTime + (gap-15)* 253,"UP"),
					new Beat(startTime + (gap-15)* 255,"RIGHT"),
					new Beat(startTime + (gap-15)* 256,"LEFT"),
					new Beat(startTime + (gap-15)* 258,"UP"),
					
					new Beat(startTime + (gap)* 259,"UP"),
					new Beat(startTime + (gap)* 262,"RIGHT"),
					new Beat(startTime + (gap)* 265,"UP"),
					new Beat(startTime + (gap)* 268,"RIGHT"),
					new Beat(startTime + (gap)* 271,"UP"),
					new Beat(startTime + (gap)* 274,"RIGHT"),
					new Beat(startTime + (gap)* 277,"UP"),
					new Beat(startTime + (gap)* 280,"LEFT"),
					new Beat(startTime + (gap)* 283,"UP"),
					new Beat(startTime + (gap)* 286,"UP"),
					new Beat(startTime + (gap)* 289,"RIGHT"),
					new Beat(startTime + (gap)* 292,"LEFT"),
					
					new Beat(startTime + (gap)* 302,"NOne"),
				
	
					
			};
		}
		else if(titleName.equals("Boomerang") && difficult.equals("Easy")) {
			int startTime = 1000;
			int gap = 520;
			beats = new Beat[] {
					new Beat(startTime,"LEFT"),
					new Beat(startTime + gap* 1,"LEFT"),
					new Beat(startTime + gap* 3,"LEFT"),
					new Beat(startTime + gap* 6,"UP"),
					new Beat(startTime + gap* 9,"RIGHT"),
					new Beat(startTime + gap* 12,"UP"),
					new Beat(startTime + gap* 15,"LEFT"),
					new Beat(startTime + gap* 18,"LEFT"),
					new Beat(startTime + gap* 21,"LEFT"),
					new Beat(startTime + gap* 24,"UP"),
					new Beat(startTime + (gap-50)* 27,"RIGHT"),
					new Beat(startTime + (gap-50)* 30,"RIGHT"),
					new Beat(startTime + (gap-50)* 33,"RIGHT"),
					new Beat(startTime + (gap-50)* 36,"UP"),
					new Beat(startTime + (gap-50)* 39,"LEFT"),
					new Beat(startTime + (gap-50)* 42,"LEFT"),
					new Beat(startTime + (gap-50)* 45,"LEFT"),
					new Beat(startTime + (gap-50)* 48,"UP"),
					new Beat(startTime + (gap-50)* 51,"LEFT"),
					new Beat(startTime + (gap-50)* 54,"RIGHT"),
					new Beat(startTime + (gap-50)* 57,"UP"),
					new Beat(startTime + (gap-50)* 60,"LEFT"),
					new Beat(startTime + gap* 63,"LEFT"),
					new Beat(startTime + gap* 67,"UP"),
					new Beat(startTime + gap* 70,"LEFT"),
					new Beat(startTime + gap* 73,"LEFT"),
					new Beat(startTime + gap* 74,"UP"),
					new Beat(startTime + gap* 76,"LEFT"),
					new Beat(startTime + gap* 79,"LEFT"),
					new Beat(startTime + gap* 82,"RIGHT"),
					new Beat(startTime + gap* 85,"LEFT"),
					new Beat(startTime + gap* 88,"UP"),
					new Beat(startTime + gap* 89,"RIGHT"),
					new Beat(startTime + gap* 91,"RIGHT"),
					new Beat(startTime + gap* 94,"RIGHT"),
					new Beat(startTime + gap* 97,"UP"),
					new Beat(startTime + gap* 100,"LEFT"),
					new Beat(startTime + gap* 103,"LEFT"),
					new Beat(startTime + gap* 106,"LEFT"),
					new Beat(startTime + gap* 109,"UP"),
					new Beat(startTime + gap* 102,"RIGHT"),
					new Beat(startTime + gap* 105,"RIGHT"),
					new Beat(startTime + gap* 108,"UP"),
					new Beat(startTime + gap* 111,"LEFT"),
					new Beat(startTime + gap* 114,"LEFT"),
					new Beat(startTime + gap* 117,"UP"),
					new Beat(startTime + gap* 120,"LEFT"),
					new Beat(startTime + gap* 123,"RIGHT"),
					new Beat(startTime + gap* 127,"UP"),
					
					new Beat(startTime + gap* 130,"RIGHT"),
					new Beat(startTime + gap* 133,"RIGHT"),
					new Beat(startTime + gap* 134,"UP"),
					new Beat(startTime + gap* 136,"LEFT"),
					new Beat(startTime + gap* 139,"LEFT"),
					new Beat(startTime + gap* 140,"UP"),
					new Beat(startTime + gap* 141,"LEFT"),
					new Beat(startTime + gap* 142,"RIGHT"),
					new Beat(startTime + gap* 145,"UP"),
					new Beat(startTime + gap* 148,"LEFT"),
					new Beat(startTime + gap* 151,"LEFT"),
					new Beat(startTime + gap* 154,"UP"),
					new Beat(startTime + gap* 155,"LEFT"),
					new Beat(startTime + gap* 157,"RIGHT"),
					new Beat(startTime + gap* 160,"RIGHT"),
					new Beat(startTime + gap* 163,"UP"),
					new Beat(startTime + gap* 166,"RIGHT"),
					new Beat(startTime + gap* 167,"RIGHT"),
					
					new Beat(startTime + (gap)* 170,"LEFT"),
					new Beat(startTime + (gap)* 173,"RIGHT"),
					new Beat(startTime + (gap)* 176,"LEFT"),
					new Beat(startTime + (gap)* 179,"RIGHT"),
					new Beat(startTime + (gap)* 182,"LEFT"),
					new Beat(startTime + (gap)* 185,"RIGHT"),
					new Beat(startTime + (gap)* 188,"LEFT"),
					new Beat(startTime + (gap)* 191,"RIGHT"),
					new Beat(startTime + (gap)* 194,"LEFT"),
					new Beat(startTime + (gap)* 195,"LEFT"),
					new Beat(startTime + (gap)* 197,"RIGHT"),
					new Beat(startTime + (gap)* 200,"UP"),
					new Beat(startTime + (gap)* 203,"UP"),
					new Beat(startTime + (gap)* 206,"RIGHT"),
					new Beat(startTime + (gap)* 207,"LEFT"),
					new Beat(startTime + (gap)* 209,"UP"),
					new Beat(startTime + (gap)* 212,"UP"),
					
					new Beat(startTime + gap* 215,"LEFT"),
					new Beat(startTime + gap* 218,"LEFT"),
					new Beat(startTime + gap* 221,"RIGHT"),
					new Beat(startTime + gap* 224,"UP"),
					new Beat(startTime + gap* 225,"UP"),
					new Beat(startTime + gap* 227,"RIGHT"),
					new Beat(startTime + gap* 230,"LEFT"),
					new Beat(startTime + gap* 233,"UP"),
					new Beat(startTime + gap* 236,"UP"),
					new Beat(startTime + gap* 239,"RIGHT"),
					new Beat(startTime + gap* 240,"RIGHT"),
					new Beat(startTime + gap* 242,"LEFT"),
					new Beat(startTime + gap* 245,"RIGHT"),
					new Beat(startTime + gap* 248,"UP"),
					new Beat(startTime + gap* 251,"LEFT"),
					new Beat(startTime + gap* 252,"UP"),
					new Beat(startTime + (gap)* 255,"LEFT"),
					new Beat(startTime + (gap)* 258,"RIGHT"),
					new Beat(startTime + (gap)* 261,"LEFT"),
					new Beat(startTime + (gap)* 262,"RIGHT"),
					new Beat(startTime + gap* 264,"UP"),
					new Beat(startTime + (gap)* 267,"LEFT"),
					new Beat(startTime + (gap)* 270,"RIGHT"),
					
					new Beat(startTime + gap* 273,"UP"),
					new Beat(startTime + gap* 274,"RIGHT"),
					new Beat(startTime + gap* 277,"RIGHT"),
					new Beat(startTime + gap* 280,"UP"),
					new Beat(startTime + gap* 283,"LEFT"),
					new Beat(startTime + gap* 284,"LEFT"),
					new Beat(startTime + gap* 286,"UP"),
					
					new Beat(startTime + (gap)* 289,"LEFT"),
					new Beat(startTime + (gap)* 290,"LEFT"),
					new Beat(startTime + (gap)* 293,"LEFT"),
					new Beat(startTime + (gap)* 297,"RIGHT"),
					
					new Beat(startTime + gap* 300,"RIGHT"),
					new Beat(startTime + gap* 303,"UP"),
					new Beat(startTime + gap* 307,"LEFT"),
					new Beat(startTime + gap* 310,"UP"),
					new Beat(startTime + gap* 311,"UP"),
					new Beat(startTime + gap* 312,"LEFT"),
					
					new Beat(startTime + (gap)* 315,"RIGHT"),
					new Beat(startTime + (gap)* 318,"LEFT"),
					new Beat(startTime + (gap)* 319,"RIGHT"),
					new Beat(startTime + (gap)* 321,"LEFT"),
					new Beat(startTime + (gap)* 324,"RIGHT"),
					new Beat(startTime + (gap)* 327,"LEFT"),
					new Beat(startTime + (gap)* 330,"LEFT"),
					
					new Beat(startTime + (gap)* 340,"NOne"),
					
			};
		}
		else if(titleName.equals("Boomerang") && difficult.equals("Easy")) {
			int startTime = 1000;
			int gap = 520;
			beats = new Beat[] {
					new Beat(startTime,"LEFT"),
					new Beat(startTime + gap* 1,"LEFT"),
					new Beat(startTime + gap* 3,"LEFT"),
					new Beat(startTime + gap* 6,"UP"),
					new Beat(startTime + gap* 9,"RIGHT"),
					new Beat(startTime + gap* 12,"UP"),
					new Beat(startTime + gap* 15,"LEFT"),
					new Beat(startTime + gap* 18,"LEFT"),
					new Beat(startTime + gap* 21,"LEFT"),
					new Beat(startTime + gap* 24,"UP"),
					new Beat(startTime + (gap-50)* 27,"RIGHT"),
					new Beat(startTime + (gap-50)* 30,"RIGHT"),
					new Beat(startTime + (gap-50)* 33,"RIGHT"),
					new Beat(startTime + (gap-50)* 36,"UP"),
					new Beat(startTime + (gap-50)* 39,"LEFT"),
					new Beat(startTime + (gap-50)* 42,"LEFT"),
					new Beat(startTime + (gap-50)* 45,"LEFT"),
					new Beat(startTime + (gap-50)* 48,"UP"),
					new Beat(startTime + (gap-50)* 51,"LEFT"),
					new Beat(startTime + (gap-50)* 54,"RIGHT"),
					new Beat(startTime + (gap-50)* 57,"UP"),
					new Beat(startTime + (gap-50)* 60,"LEFT"),
					new Beat(startTime + gap* 63,"LEFT"),
					new Beat(startTime + gap* 67,"UP"),
					new Beat(startTime + gap* 70,"LEFT"),
					new Beat(startTime + gap* 73,"LEFT"),
					new Beat(startTime + gap* 74,"UP"),
					new Beat(startTime + gap* 76,"LEFT"),
					new Beat(startTime + gap* 79,"LEFT"),
					new Beat(startTime + gap* 82,"RIGHT"),
					new Beat(startTime + gap* 85,"LEFT"),
					new Beat(startTime + gap* 88,"UP"),
					new Beat(startTime + gap* 89,"RIGHT"),
					new Beat(startTime + gap* 91,"RIGHT"),
					new Beat(startTime + gap* 94,"RIGHT"),
					new Beat(startTime + gap* 97,"UP"),
					new Beat(startTime + gap* 100,"LEFT"),
					new Beat(startTime + gap* 103,"LEFT"),
					new Beat(startTime + gap* 106,"LEFT"),
					new Beat(startTime + gap* 109,"UP"),
					new Beat(startTime + gap* 102,"RIGHT"),
					new Beat(startTime + gap* 105,"RIGHT"),
					new Beat(startTime + gap* 108,"UP"),
					new Beat(startTime + gap* 111,"LEFT"),
					new Beat(startTime + gap* 114,"LEFT"),
					new Beat(startTime + gap* 117,"UP"),
					new Beat(startTime + gap* 120,"LEFT"),
					new Beat(startTime + gap* 123,"RIGHT"),
					new Beat(startTime + gap* 127,"UP"),
					
					new Beat(startTime + gap* 130,"RIGHT"),
					new Beat(startTime + gap* 133,"RIGHT"),
					new Beat(startTime + gap* 134,"UP"),
					new Beat(startTime + gap* 136,"LEFT"),
					new Beat(startTime + gap* 139,"LEFT"),
					new Beat(startTime + gap* 140,"UP"),
					new Beat(startTime + gap* 141,"LEFT"),
					new Beat(startTime + gap* 142,"RIGHT"),
					new Beat(startTime + gap* 145,"UP"),
					new Beat(startTime + gap* 148,"LEFT"),
					new Beat(startTime + gap* 151,"LEFT"),
					new Beat(startTime + gap* 154,"UP"),
					new Beat(startTime + gap* 155,"LEFT"),
					new Beat(startTime + gap* 157,"RIGHT"),
					new Beat(startTime + gap* 160,"RIGHT"),
					new Beat(startTime + gap* 163,"UP"),
					new Beat(startTime + gap* 166,"RIGHT"),
					new Beat(startTime + gap* 167,"RIGHT"),
					
					new Beat(startTime + (gap)* 170,"LEFT"),
					new Beat(startTime + (gap)* 173,"RIGHT"),
					new Beat(startTime + (gap)* 176,"LEFT"),
					new Beat(startTime + (gap)* 179,"RIGHT"),
					new Beat(startTime + (gap)* 182,"LEFT"),
					new Beat(startTime + (gap)* 185,"RIGHT"),
					new Beat(startTime + (gap)* 188,"LEFT"),
					new Beat(startTime + (gap)* 191,"RIGHT"),
					new Beat(startTime + (gap)* 194,"LEFT"),
					new Beat(startTime + (gap)* 195,"LEFT"),
					new Beat(startTime + (gap)* 197,"RIGHT"),
					new Beat(startTime + (gap)* 200,"UP"),
					new Beat(startTime + (gap)* 203,"UP"),
					new Beat(startTime + (gap)* 206,"RIGHT"),
					new Beat(startTime + (gap)* 207,"LEFT"),
					new Beat(startTime + (gap)* 209,"UP"),
					new Beat(startTime + (gap)* 212,"UP"),
					
					new Beat(startTime + gap* 215,"LEFT"),
					new Beat(startTime + gap* 218,"LEFT"),
					new Beat(startTime + gap* 221,"RIGHT"),
					new Beat(startTime + gap* 224,"UP"),
					new Beat(startTime + gap* 225,"UP"),
					new Beat(startTime + gap* 227,"RIGHT"),
					new Beat(startTime + gap* 230,"LEFT"),
					new Beat(startTime + gap* 233,"UP"),
					new Beat(startTime + gap* 236,"UP"),
					new Beat(startTime + gap* 239,"RIGHT"),
					new Beat(startTime + gap* 240,"RIGHT"),
					new Beat(startTime + gap* 242,"LEFT"),
					new Beat(startTime + gap* 245,"RIGHT"),
					new Beat(startTime + gap* 248,"UP"),
					new Beat(startTime + gap* 251,"LEFT"),
					new Beat(startTime + gap* 252,"UP"),
					new Beat(startTime + (gap)* 255,"LEFT"),
					new Beat(startTime + (gap)* 258,"RIGHT"),
					new Beat(startTime + (gap)* 261,"LEFT"),
					new Beat(startTime + (gap)* 262,"RIGHT"),
					new Beat(startTime + gap* 264,"UP"),
					new Beat(startTime + (gap)* 267,"LEFT"),
					new Beat(startTime + (gap)* 270,"RIGHT"),
					
					new Beat(startTime + gap* 273,"UP"),
					new Beat(startTime + gap* 274,"RIGHT"),
					new Beat(startTime + gap* 277,"RIGHT"),
					new Beat(startTime + gap* 280,"UP"),
					new Beat(startTime + gap* 283,"LEFT"),
					new Beat(startTime + gap* 284,"LEFT"),
					new Beat(startTime + gap* 286,"UP"),
					
					new Beat(startTime + (gap)* 289,"LEFT"),
					new Beat(startTime + (gap)* 290,"LEFT"),
					new Beat(startTime + (gap)* 293,"LEFT"),
					new Beat(startTime + (gap)* 297,"RIGHT"),
					
					new Beat(startTime + gap* 300,"RIGHT"),
					new Beat(startTime + gap* 303,"UP"),
					new Beat(startTime + gap* 307,"LEFT"),
					new Beat(startTime + gap* 310,"UP"),
					new Beat(startTime + gap* 311,"UP"),
					new Beat(startTime + gap* 312,"LEFT"),
					
					new Beat(startTime + (gap)* 315,"RIGHT"),
					new Beat(startTime + (gap)* 318,"LEFT"),
					new Beat(startTime + (gap)* 319,"RIGHT"),
					new Beat(startTime + (gap)* 321,"LEFT"),
					new Beat(startTime + (gap)* 324,"RIGHT"),
					new Beat(startTime + (gap)* 327,"LEFT"),
					new Beat(startTime + (gap)* 330,"LEFT"),
					
					new Beat(startTime + (gap)* 340,"NOne"),
					
			};
			
		}else if(titleName.equals("Boomerang") && difficult.equals("Hard")) {
			int startTime = 1000;
			int gap = 550;

			beats = new Beat[] {	
					new Beat(startTime + (gap-35)* 1,"LEFT"),
					new Beat(startTime + (gap-35)* 2,"LEFT"),
					new Beat(startTime + (gap-35)* 3,"LEFT"),
					new Beat(startTime + (gap-35)* 4,"RIGHT"),
					
					
					
					new Beat(startTime + (gap-35)* 8,"RIGHT"),
					new Beat(startTime + (gap-35)* 9,"UP"),
					new Beat(startTime + (gap-35)* 10,"LEFT"),
					new Beat(startTime + (gap-35)* 11,"LEFT"),
					new Beat(startTime + (gap-35)* 12,"LEFT"),
					
					//new Beat(startTime + gap* 14,"RIGHT"),
					new Beat(startTime + gap* 15,"RIGHT"),
					new Beat(startTime + gap* 16,"RIGHT"),
					new Beat(startTime + gap* 17,"UP"),
					new Beat(startTime + gap* 18,"LEFT"),
					new Beat(startTime + gap* 19,"LEFT"),
					new Beat(startTime + gap* 20,"LEFT"),
					new Beat(startTime + gap* 21,"UP"),
					new Beat(startTime + gap* 22,"LEFT"),
					new Beat(startTime + gap* 23,"RIGHT"),
					new Beat(startTime + gap* 24,"UP"),
					new Beat(startTime + gap* 25,"LEFT"),
					new Beat(startTime + gap* 26,"LEFT"),
					new Beat(startTime + gap* 27,"UP"),
					new Beat(startTime + gap* 28,"LEFT"),
					new Beat(startTime + gap* 29,"RIGHT"),
					new Beat(startTime + gap* 30,"RIGHT"),
					new Beat(startTime + gap* 31,"LEFT"),
					new Beat(startTime + gap* 32,"UP"),
					new Beat(startTime + gap* 33,"RIGHT"),
					new Beat(startTime + gap* 34,"LEFT"),
					new Beat(startTime + gap* 35,"LEFT"),
					new Beat(startTime + gap* 36,"LEFT"),
					new Beat(startTime + gap* 37,"UP"),
					new Beat(startTime + gap* 38,"RIGHT"),
					new Beat(startTime + gap* 39,"UP"),
					new Beat(startTime + gap* 40,"RIGHT"),
					new Beat(startTime + gap* 41,"RIGHT"),
					new Beat(startTime + gap* 42,"LEFT"),
					new Beat(startTime + gap* 43,"RIGHT"),
					new Beat(startTime + gap* 44,"LEFT"),
					new Beat(startTime + gap* 45,"RIGHT"),
					new Beat(startTime + gap* 46,"RIGHT"),
					new Beat(startTime + gap* 47,"LEFT"),
					new Beat(startTime + gap* 48,"RIGHT"),
					new Beat(startTime + gap* 49,"LEFT"),
					new Beat(startTime + gap* 50,"LEFT"),
					new Beat(startTime + gap* 51,"RIGHT"),
					new Beat(startTime + gap* 52,"UP"),
					new Beat(startTime + gap* 53,"UP"),
					new Beat(startTime + gap* 54,"RIGHT"),
					new Beat(startTime + gap* 55,"LEFT"),
					new Beat(startTime + gap* 56,"UP"),
					new Beat(startTime + gap* 57,"UP"),
					new Beat(startTime + gap* 58,"RIGHT"),
					new Beat(startTime + gap* 59,"RIGHT"),
					new Beat(startTime + gap* 60,"LEFT"),
					new Beat(startTime + gap* 61,"RIGHT"),
					new Beat(startTime + gap* 62,"UP"),
					new Beat(startTime + gap* 63,"LEFT"),
					new Beat(startTime + gap* 64,"UP"),
					new Beat(startTime + gap* 65,"UP"),
					new Beat(startTime + gap* 65,"LEFT"),
					new Beat(startTime + gap* 66,"UP"),
					new Beat(startTime + gap* 67,"RIGHT"),
					new Beat(startTime + gap* 68,"LEFT"),
					new Beat(startTime + gap* 69,"RIGHT"),
					new Beat(startTime + gap* 70,"UP"),
					new Beat(startTime + gap* 71,"UP"),
					new Beat(startTime + gap* 72,"RIGHT"),
					new Beat(startTime + gap* 73,"RIGHT"),
					new Beat(startTime + gap* 74,"RIGHT"),
					new Beat(startTime + gap* 75,"LEFT"),
					new Beat(startTime + gap* 76,"LEFT"),
					new Beat(startTime + gap* 77,"LEFT"),
					new Beat(startTime + gap* 78,"RIGHT"),
					new Beat(startTime + gap* 79,"UP"),
					new Beat(startTime + gap* 80,"RIGHT"),
					new Beat(startTime + gap* 81,"RIGHT"),
					new Beat(startTime + gap* 82,"RIGHT"),
					new Beat(startTime +gap* 83,"RIGHT"),
					
					new Beat(startTime + gap* 85,"LEFT"),
					new Beat(startTime + gap* 86,"LEFT"),
					new Beat(startTime + gap* 87,"LEFT"),
					new Beat(startTime + gap* 88,"RIGHT"),
					new Beat(startTime + gap* 89,"LEFT"),
					new Beat(startTime + gap* 90,"UP"),
					new Beat(startTime + gap* 91,"RIGHT"),
					new Beat(startTime + gap* 92,"RIGHT"),
					new Beat(startTime + gap* 93,"UP"),
					new Beat(startTime + gap* 94,"LEFT"),
					new Beat(startTime + gap* 95,"LEFT"),
					new Beat(startTime + gap* 96,"LEFT"),
					new Beat(startTime + gap* 97,"UP"),
					new Beat(startTime + gap* 98,"RIGHT"),
					new Beat(startTime + gap* 99,"RIGHT"),
					new Beat(startTime + gap* 100,"UP"),
					new Beat(startTime + gap* 101,"LEFT"),
					new Beat(startTime + gap* 102,"LEFT"),
					new Beat(startTime + gap* 103,"UP"),
					new Beat(startTime + gap* 104,"LEFT"),
					new Beat(startTime + gap* 105,"RIGHT"),
					new Beat(startTime + gap* 106,"UP"),
					new Beat(startTime + gap* 107,"LEFT"),
					new Beat(startTime + gap* 108,"LEFT"),
					new Beat(startTime + gap* 109,"UP"),
					new Beat(startTime + gap* 110,"LEFT"),
					new Beat(startTime + gap* 111,"RIGHT"),
					new Beat(startTime + gap* 112,"RIGHT"),
					new Beat(startTime + gap* 113,"UP"),
					new Beat(startTime + gap* 114,"RIGHT"),
					new Beat(startTime + gap* 115,"LEFT"),
					new Beat(startTime + gap* 116,"LEFT"),
					new Beat(startTime + (gap)* 117,"LEFT"),
					new Beat(startTime + (gap)* 118,"UP"),
					new Beat(startTime + (gap)* 119,"UP"),
					new Beat(startTime + (gap)* 120,"RIGHT"),
					new Beat(startTime + (gap)* 121,"LEFT"),
					new Beat(startTime + (gap)* 123,"RIGHT"),
					new Beat(startTime + (gap)* 123,"LEFT"),
					new Beat(startTime + (gap)* 124,"RIGHT"),
					new Beat(startTime + (gap)* 125,"LEFT"),
					new Beat(startTime + (gap)* 126,"RIGHT"),
					new Beat(startTime + (gap)* 127,"LEFT"),
					new Beat(startTime + (gap)* 128,"RIGHT"),
					new Beat(startTime + (gap)* 129,"LEFT"),
					new Beat(startTime + (gap)* 130,"RIGHT"),
					new Beat(startTime + (gap)* 131,"LEFT"),
					new Beat(startTime + (gap)* 132,"LEFT"),
					new Beat(startTime + (gap)* 133,"RIGHT"),
					new Beat(startTime + (gap)* 134,"UP"),
					new Beat(startTime + (gap)* 135,"UP"),
					new Beat(startTime + (gap)* 136,"RIGHT"),
					new Beat(startTime + (gap)* 137,"LEFT"),
					new Beat(startTime + (gap)* 138,"UP"),
					new Beat(startTime + (gap)* 139,"UP"),
					new Beat(startTime + (gap)* 140,"RIGHT"),
					new Beat(startTime + (gap)* 141,"RIGHT"),
					new Beat(startTime + (gap)* 142,"RIGHT"),
					new Beat(startTime + (gap)* 143,"UP"),
					new Beat(startTime + (gap)* 144,"LEFT"),
					new Beat(startTime + (gap)* 145,"UP"),
					new Beat(startTime + (gap)* 146,"UP"),
					new Beat(startTime + (gap)* 147,"LEFT"),
					new Beat(startTime + (gap)* 148,"UP"),
					new Beat(startTime + (gap)* 149,"LEFT"),
					new Beat(startTime + (gap)* 150,"RIGHT"),
					new Beat(startTime + (gap)* 151,"UP"),
					new Beat(startTime + (gap)* 152,"RIGHT"),
					new Beat(startTime + (gap)* 153,"RIGHT"),
					new Beat(startTime + (gap)* 154,"RIGHT"),
					new Beat(startTime + (gap)* 155,"LEFT"),
					new Beat(startTime + (gap)* 156,"LEFT"),
					new Beat(startTime + (gap)* 157,"LEFT"),
					new Beat(startTime + (gap)* 158,"RIGHT"),
					new Beat(startTime + (gap)* 159,"UP"),
					new Beat(startTime + (gap)* 160,"RIGHT"),
					new Beat(startTime + (gap)* 161,"RIGHT"),
					new Beat(startTime + (gap)* 162,"RIGHT"),
					new Beat(startTime + (gap)* 163,"RIGHT"),
					
					new Beat(startTime + (gap)* 164,"UP"),
					new Beat(startTime + gap* 165,"LEFT"),
					new Beat(startTime + gap* 166,"RIGHT"),
					new Beat(startTime + gap* 167,"UP"),
					new Beat(startTime + gap* 168,"RIGHT"),
					new Beat(startTime + gap* 169,"RIGHT"),
					new Beat(startTime + gap* 170,"UP"),
					new Beat(startTime + gap* 170,"LEFT"),
					new Beat(startTime + gap* 172,"LEFT"),
					new Beat(startTime + (gap)* 173,"RIGHT"),
					new Beat(startTime + (gap)* 174,"LEFT"),
					new Beat(startTime + (gap)* 175,"UP"),
					new Beat(startTime + (gap)* 176,"UP"),
					new Beat(startTime + (gap)* 178,"RIGHT"),
					new Beat(startTime + (gap)* 178,"LEFT"),
					new Beat(startTime + (gap)* 179,"RIGHT"),
					new Beat(startTime + (gap)* 180,"UP"),
					new Beat(startTime + (gap)* 181,"RIGHT"),
					new Beat(startTime + (gap)* 182,"RIGHT"),
					new Beat(startTime + (gap)* 183,"UP"),
					new Beat(startTime + (gap)* 184,"LEFT"),
					new Beat(startTime + (gap)* 185,"RIGHT"),
					new Beat(startTime + (gap)* 186,"LEFT"),
					new Beat(startTime + (gap)* 187,"RIGHT"),
					new Beat(startTime + (gap)* 189,"LEFT"),
					new Beat(startTime + (gap)* 190,"RIGHT"),
					new Beat(startTime + (gap)* 190,"LEFT"),
					new Beat(startTime + (gap)* 191,"RIGHT"),
					new Beat(startTime + (gap)* 192,"LEFT"),
					new Beat(startTime + (gap)* 193,"LEFT"),
					new Beat(startTime + (gap)* 194,"LEFT"),
					new Beat(startTime + (gap)* 196,"RIGHT"),
					new Beat(startTime + (gap)* 197,"LEFT"),
					new Beat(startTime + (gap)* 198,"RIGHT"),
					new Beat(startTime + (gap)* 199,"UP"),
					new Beat(startTime + (gap)* 200,"LEFT"),
					new Beat(startTime + (gap)* 201,"RIGHT"),
					new Beat(startTime + (gap)* 202,"LEFT"),
					new Beat(startTime + (gap)* 203,"UP"),
					new Beat(startTime + (gap)* 204,"RIGHT"),
					new Beat(startTime + (gap)* 205,"LEFT"),
					new Beat(startTime + (gap)* 206,"RIGHT"),
					new Beat(startTime + (gap)* 207,"LEFT"),
					new Beat(startTime + (gap)* 208,"RIGHT"),
					new Beat(startTime + (gap)* 209,"RIGHT"),
					new Beat(startTime + (gap)* 211,"LEFT"),
					new Beat(startTime + (gap)* 212,"UP"),
					new Beat(startTime + (gap)* 213,"LEFT"),
					new Beat(startTime + (gap)* 214,"LEFT"),
					new Beat(startTime + (gap)* 215,"UP"),
					new Beat(startTime + (gap)* 216,"RIGHT"),
					new Beat(startTime + (gap)* 217,"LEFT"),
					new Beat(startTime + (gap)* 218,"RIGHT"),
					new Beat(startTime + (gap)* 219,"LEFT"),
					new Beat(startTime + (gap)* 220,"UP"),
					new Beat(startTime + (gap)* 221,"RIGHT"),
					new Beat(startTime + (gap)* 222,"LEFT"),
					new Beat(startTime + (gap)* 223,"RIGHT"),
					new Beat(startTime + (gap)* 224,"RIGHT"),
					new Beat(startTime + (gap)* 225,"LEFT"),
					new Beat(startTime + (gap)* 226,"LEFT"),
					new Beat(startTime + (gap)* 227,"RIGHT"),
					new Beat(startTime + (gap)* 228,"LEFT"),
					new Beat(startTime + (gap)* 229,"RIGHT"),
					new Beat(startTime + (gap)* 231,"RIGHT"),
					new Beat(startTime + (gap)* 232,"RIGHT"),
					new Beat(startTime + (gap)* 233,"LEFT"),
					new Beat(startTime + (gap)* 234,"UP"),
					new Beat(startTime + (gap)* 235,"RIGHT"),
					new Beat(startTime + (gap)* 236,"RIGHT"),
					new Beat(startTime + (gap)* 237,"LEFT"),
					new Beat(startTime + (gap)* 238,"RIGHT"),
					new Beat(startTime + (gap)* 239,"LEFT"),
					new Beat(startTime + (gap)* 240,"LEFT"),
					new Beat(startTime + (gap)* 242,"RIGHT"),

					new Beat(startTime + (gap)* 243,"RIGHT"),
					new Beat(startTime + (gap)* 244,"LEFT"),
					new Beat(startTime + (gap)* 245,"RIGHT"),
					new Beat(startTime + (gap)* 246,"RIGHT"),
					new Beat(startTime + (gap)* 247,"LEFT"),
					new Beat(startTime + (gap)* 248,"LEFT"),
					new Beat(startTime + (gap)* 249,"RIGHT"),
					new Beat(startTime + (gap)* 250,"LEFT"),
					new Beat(startTime + (gap)* 251,"RIGHT"),
					new Beat(startTime + (gap)* 252,"RIGHT"),
					new Beat(startTime + (gap)* 253,"RIGHT"),
					new Beat(startTime + (gap)* 254,"LEFT"),
					new Beat(startTime + (gap)* 255,"UP"),
					new Beat(startTime + (gap)* 256,"RIGHT"),
					new Beat(startTime + (gap)* 257,"RIGHT"),
					new Beat(startTime + (gap)* 258,"LEFT"),
					new Beat(startTime + (gap)* 259,"RIGHT"),
					new Beat(startTime + (gap)* 260,"LEFT"),
					new Beat(startTime + (gap)* 261,"LEFT"),
					new Beat(startTime + (gap)* 262,"RIGHT"),
					
					new Beat(startTime + (gap)* 263,"UP"),
					new Beat(startTime + gap* 264,"LEFT"),
					new Beat(startTime + gap* 266,"RIGHT"),
					new Beat(startTime + gap* 267,"UP"),
					new Beat(startTime + gap* 268,"RIGHT"),
					new Beat(startTime + gap* 269,"RIGHT"),
					new Beat(startTime + gap* 270,"UP"),
					new Beat(startTime + gap* 272,"LEFT"),
					new Beat(startTime + (gap)* 273,"RIGHT"),
					new Beat(startTime + (gap)* 274,"LEFT"),
					new Beat(startTime + (gap)* 275,"UP"),
					new Beat(startTime + (gap)* 276,"UP"),
					new Beat(startTime + (gap)* 278,"RIGHT"),
					new Beat(startTime + (gap)* 278,"LEFT"),
					new Beat(startTime + (gap)* 279,"RIGHT"),
					new Beat(startTime + (gap)* 280,"UP"),
					new Beat(startTime + (gap)* 281,"RIGHT"),
					new Beat(startTime + (gap)* 282,"RIGHT"),
					new Beat(startTime + (gap)* 283,"UP"),
					new Beat(startTime + (gap)* 284,"LEFT"),
					new Beat(startTime + (gap)* 285,"RIGHT"),
					new Beat(startTime + (gap)* 286,"LEFT"),
					
					new Beat(startTime + (gap)* 286,"RIGHT"),
					new Beat(startTime + (gap)* 287,"LEFT"),
					new Beat(startTime + (gap)* 288,"RIGHT"),
					new Beat(startTime + (gap)* 289,"LEFT"),
					new Beat(startTime + (gap)* 290,"RIGHT"),
					new Beat(startTime + (gap)* 291,"LEFT"),
					new Beat(startTime + (gap)* 292,"RIGHT"),
					new Beat(startTime + (gap)* 293,"LEFT"),
					new Beat(startTime + (gap)* 294,"RIGHT"),
					new Beat(startTime + (gap)* 295,"LEFT"),
					new Beat(startTime + (gap)* 296,"RIGHT"),
					new Beat(startTime + (gap)* 297,"LEFT"),
					new Beat(startTime + (gap)* 298,"LEFT"),
					new Beat(startTime + (gap)* 299,"RIGHT"),
					new Beat(startTime + (gap)* 300,"UP"),
					new Beat(startTime + (gap)* 301,"UP"),
					new Beat(startTime + (gap)* 302,"RIGHT"),
					new Beat(startTime + (gap)* 303,"LEFT"),
					

					new Beat(startTime + (gap)* 313,"NOne"),
			};
		}else if(titleName.equals("Skyline") && difficult.equals("Easy")) {
			int startTime = 1000;
			int gap = 520;
			beats = new Beat[] {
					new Beat(startTime,"LEFT"),
					new Beat(startTime + gap* 1,"LEFT"),
					new Beat(startTime + gap* 3,"LEFT"),
					new Beat(startTime + gap* 6,"UP"),
					new Beat(startTime + gap* 9,"RIGHT"),
					new Beat(startTime + gap* 12,"UP"),
					new Beat(startTime + gap* 15,"LEFT"),
					new Beat(startTime + gap* 18,"RIGHT"),
					new Beat(startTime + gap* 21,"LEFT"),
					new Beat(startTime + gap* 24,"UP"),
					new Beat(startTime + (gap-50)* 27,"RIGHT"),
					new Beat(startTime + (gap-50)* 30,"LEFT"),
					new Beat(startTime + (gap-50)* 33,"RIGHT"),
					new Beat(startTime + (gap-50)* 36,"UP"),
					new Beat(startTime + (gap-50)* 39,"LEFT"),
					new Beat(startTime + (gap-50)* 42,"LEFT"),
					new Beat(startTime + (gap-50)* 45,"LEFT"),
					new Beat(startTime + (gap-50)* 48,"UP"),
					new Beat(startTime + (gap-50)* 51,"LEFT"),
					new Beat(startTime + (gap-50)* 54,"RIGHT"),
					new Beat(startTime + (gap-50)* 57,"UP"),
					new Beat(startTime + (gap-50)* 60,"LEFT"),
					new Beat(startTime + (gap-20)* 63,"LEFT"),
					new Beat(startTime + (gap-20)* 67,"UP"),
					new Beat(startTime + (gap-20)* 70,"LEFT"),
					new Beat(startTime + (gap-10)* 73,"UP"),
					new Beat(startTime + gap* 74,"UP"),
					new Beat(startTime + gap* 76,"LEFT"),
					new Beat(startTime + gap* 79,"UP"),
					new Beat(startTime + gap* 82,"RIGHT"),
					new Beat(startTime + gap* 85,"LEFT"),
					new Beat(startTime + gap* 88,"UP"),
					new Beat(startTime + gap* 89,"RIGHT"),
					new Beat(startTime + gap* 91,"RIGHT"),
					new Beat(startTime + gap* 94,"RIGHT"),
					new Beat(startTime + gap* 97,"UP"),
					new Beat(startTime + gap* 100,"LEFT"),
					new Beat(startTime + gap* 103,"RIGHT"),
					new Beat(startTime + gap* 105,"RIGHT"),
					new Beat(startTime + gap* 108,"UP"),
					new Beat(startTime + gap* 111,"LEFT"),
					new Beat(startTime + gap* 114,"RIGHT"),
					new Beat(startTime + gap* 117,"UP"),
					new Beat(startTime + gap* 120,"LEFT"),
					new Beat(startTime + gap* 123,"RIGHT"),
					new Beat(startTime + gap* 127,"UP"),
					
					new Beat(startTime + gap* 130,"RIGHT"),
					new Beat(startTime + gap* 133,"RIGHT"),
					new Beat(startTime + gap* 134,"UP"),
					new Beat(startTime + gap* 136,"UP"),
					new Beat(startTime + gap* 139,"LEFT"),
					new Beat(startTime + gap* 140,"UP"),
					new Beat(startTime + gap* 141,"LEFT"),
					new Beat(startTime + gap* 142,"RIGHT"),
					new Beat(startTime + gap* 145,"UP"),
					new Beat(startTime + gap* 148,"LEFT"),
					new Beat(startTime + gap* 151,"LEFT"),
					new Beat(startTime + gap* 154,"UP"),
					new Beat(startTime + gap* 155,"LEFT"),
					new Beat(startTime + gap* 157,"RIGHT"),
					new Beat(startTime + gap* 160,"RIGHT"),
					new Beat(startTime + gap* 163,"UP"),
					new Beat(startTime + gap* 166,"LEFT"),
					new Beat(startTime + gap* 167,"RIGHT"),
					
					new Beat(startTime + (gap)* 170,"LEFT"),
					new Beat(startTime + (gap)* 173,"UP"),
					new Beat(startTime + (gap)* 176,"LEFT"),
					new Beat(startTime + (gap)* 179,"RIGHT"),
					new Beat(startTime + (gap)* 182,"UP"),
					new Beat(startTime + (gap)* 185,"RIGHT"),
					new Beat(startTime + (gap)* 188,"UP"),
					new Beat(startTime + (gap)* 191,"RIGHT"),
					
			};
			
		}else if(titleName.equals("Skyline") && difficult.equals("Hard")) {
			int startTime = 1000;
			//648
			int gap = 480;
			beats = new Beat[] {
					new Beat(startTime,"LEFT"),
					new Beat(startTime + gap* 1,"RIGHT"),
					new Beat(startTime + gap* 2,"UP"),
					new Beat(startTime + gap* 4,"UP"),
					new Beat(startTime + (gap-50)* 6,"RIGHT"),
					new Beat(startTime + (gap-50)* 7,"UP"),
					new Beat(startTime + gap* 8,"UP"),
					new Beat(startTime + gap* 9,"LEFT"),
					new Beat(startTime + gap* 10,"RIGHT"),
					new Beat(startTime + gap* 12,"UP"),
					new Beat(startTime + (gap)* 14,"LEFT"),
					new Beat(startTime + (gap)* 15,"RIGHT"),
					new Beat(startTime + (gap)* 16,"UP"),
					new Beat(startTime + (gap)* 18,"RIGHT"),
					new Beat(startTime + (gap)* 21,"LEFT"),
					new Beat(startTime + (gap)* 22,"UP"),
					new Beat(startTime + (gap)* 23,"RIGHT"),
					new Beat(startTime + (gap)* 26,"UP"),
					new Beat(startTime + (gap)* 28,"LEFT"),
					new Beat(startTime + (gap)* 30,"UP"),
					new Beat(startTime + (gap)* 32,"LEFT"),
					new Beat(startTime + (gap)* 33,"RIGHT"),
					new Beat(startTime + (gap)* 34,"UP"),
					new Beat(startTime + (gap)* 36,"LEFT"),
					new Beat(startTime + (gap)* 38,"RIGHT"),
					new Beat(startTime + (gap)* 40,"LEFT"),
					new Beat(startTime + (gap)* 41,"UP"),
					new Beat(startTime + (gap)* 42,"RIGHT"),
					new Beat(startTime + (gap)* 43,"LEFT"),
					new Beat(startTime + (gap)* 44,"UP"),
					new Beat(startTime + (gap)* 46,"UP"),
					new Beat(startTime + (gap)* 47,"RIGHT"),
					new Beat(startTime + (gap)* 49,"UP"),
					new Beat(startTime + (gap)* 51,"UP"),
					new Beat(startTime + (gap)* 53,"RIGHT"),
					new Beat(startTime + (gap)* 54,"LEFT"),
					new Beat(startTime + (gap)* 55,"LEFT"),
					new Beat(startTime + (gap)* 56,"UP"),
					new Beat(startTime + (gap)* 58,"LEFT"),
					new Beat(startTime + (gap)* 60,"LEFT"),
					new Beat(startTime + (gap)* 61,"RIGHT"),
					new Beat(startTime + (gap)* 63,"LEFT"),
					new Beat(startTime + (gap)* 65,"RIGHT"),
					new Beat(startTime + (gap)* 66,"UP"),
					new Beat(startTime + (gap)* 67,"UP"),
					new Beat(startTime + (gap)* 69,"RIGHT"),
					new Beat(startTime + (gap)* 70,"LEFT"),
					new Beat(startTime + (gap)* 73,"LEFT"),
					new Beat(startTime + (gap)* 75,"UP"),
					new Beat(startTime + (gap)* 77,"RIGHT"),
					new Beat(startTime + (gap)* 79,"LEFT"),
					new Beat(startTime + (gap)* 82,"RIGHT"),
					new Beat(startTime + (gap)* 85,"LEFT"),
					new Beat(startTime + (gap)* 87,"RIGHT"),
					new Beat(startTime + (gap)* 89,"RIGHT"),
					new Beat(startTime + (gap)* 91,"LEFT"),
					new Beat(startTime + (gap)* 94,"RIGHT"),
					new Beat(startTime + (gap)* 97,"UP"),
					new Beat(startTime + (gap)* 100,"LEFT"),
					new Beat(startTime + (gap)* 103,"LEFT"),
					new Beat(startTime + (gap)* 106,"RIGHT"),
					new Beat(startTime + (gap)* 109,"UP"),
					new Beat(startTime + (gap)* 111,"LEFT"),
					new Beat(startTime + (gap)* 112,"RIGHT"),
					new Beat(startTime + (gap)* 113,"RIGHT"),
					new Beat(startTime + (gap)* 114,"LEFT"),
					new Beat(startTime + (gap)* 117,"UP"),
					new Beat(startTime + (gap)* 120,"LEFT"),
					new Beat(startTime + (gap)* 123,"RIGHT"),
					new Beat(startTime + (gap)* 127,"UP"),
					
					new Beat(startTime + gap* 128,"UP"),
					new Beat(startTime + gap* 129,"RIGHT"),
					new Beat(startTime + gap* 132,"RIGHT"),
					new Beat(startTime + gap* 134,"UP"),
					new Beat(startTime + gap* 136,"LEFT"),
					new Beat(startTime + gap* 137,"LEFT"),
					new Beat(startTime + gap* 139,"UP"),
					new Beat(startTime + (gap)* 141,"LEFT"),
					new Beat(startTime + (gap)* 143,"LEFT"),
					new Beat(startTime + (gap)* 145,"LEFT"),
					new Beat(startTime + (gap)* 146,"RIGHT"),
					new Beat(startTime + gap-50* 148,"RIGHT"),
					new Beat(startTime + gap-50* 150,"UP"),
					new Beat(startTime + gap-50* 152,"LEFT"),
					new Beat(startTime + gap-50* 154,"UP"),
					new Beat(startTime + gap* 156,"UP"),
					new Beat(startTime + gap* 158,"LEFT"),
					new Beat(startTime + (gap)* 160,"RIGHT"),
					new Beat(startTime + (gap)* 162,"LEFT"),
					new Beat(startTime + (gap)* 164,"RIGHT"),
					new Beat(startTime + (gap)* 168,"UP"),
					new Beat(startTime + (gap)* 169,"RIGHT"),
					new Beat(startTime + (gap)* 170,"UP"),
					new Beat(startTime + (gap)* 171,"LEFT"),
					new Beat(startTime + (gap)* 173,"RIGHT"),
					new Beat(startTime + (gap)* 175,"LEFT"),
					new Beat(startTime + (gap)* 177,"RIGHT"),
					new Beat(startTime + (gap)* 179,"UP"),
					new Beat(startTime + (gap)* 181,"RIGHT"),
					new Beat(startTime + (gap)* 182,"UP"),
					new Beat(startTime + (gap)* 183,"LEFT"),
					new Beat(startTime + (gap)* 185,"RIGHT"),
					new Beat(startTime + (gap)* 187,"LEFT"),
					new Beat(startTime + (gap)* 189,"RIGHT"),
					new Beat(startTime + (gap)* 190,"UP"),
					new Beat(startTime + (gap)* 191,"RIGHT"),
					new Beat(startTime + (gap)* 192,"UP"),
					new Beat(startTime + (gap)* 193,"LEFT"),
					
					new Beat(startTime + (gap)* 195,"RIGHT"),
					new Beat(startTime + (gap)* 197,"UP"),
					new Beat(startTime + (gap)* 199,"RIGHT"),
					new Beat(startTime + (gap)* 201,"UP"),
					new Beat(startTime + (gap)* 202,"LEFT"),
					new Beat(startTime + (gap)* 204,"RIGHT"),
					new Beat(startTime + (gap)* 206,"LEFT"),
					new Beat(startTime + (gap)* 208,"RIGHT"),
					new Beat(startTime + (gap)* 209,"UP"),
					new Beat(startTime + (gap)* 210,"RIGHT"),
					new Beat(startTime + (gap)* 211,"UP"),
					new Beat(startTime + (gap)* 213,"LEFT"),

					new Beat(startTime + (gap)* 214,"LEFT"),
					new Beat(startTime + (gap)* 215,"RIGHT"),
					new Beat(startTime + (gap)* 216,"UP"),
					new Beat(startTime + (gap)* 218,"RIGHT"),
					new Beat(startTime + (gap)* 220,"UP"),
					new Beat(startTime + (gap)* 222,"LEFT"),
					new Beat(startTime + (gap)* 224,"LEFT"),
					new Beat(startTime + (gap)* 226,"RIGHT"),
			
					
			};
		}else if(titleName.equals("Countosh") && difficult.equals("Easy")) {
			int startTime = 1000;
			int gap = 590;
			beats = new Beat[] {
					new Beat(startTime,"LEFT"),
					new Beat(startTime + gap* 1,"UP"),
					new Beat(startTime + gap* 3,"LEFT"),
					new Beat(startTime + gap* 6,"UP"),
					new Beat(startTime + gap* 9,"RIGHT"),
					new Beat(startTime + gap* 10,"RIGHT"),
					new Beat(startTime + gap* 12,"UP"),
					new Beat(startTime + gap* 15,"LEFT"),
					new Beat(startTime + gap* 18,"RIGHT"),
					new Beat(startTime + gap* 21,"LEFT"),
					new Beat(startTime + gap* 24,"UP"),
					new Beat(startTime + (gap-50)* 27,"UP"),
					new Beat(startTime + (gap-50)* 30,"LEFT"),
					new Beat(startTime + (gap-50)* 33,"LEFT"),
					new Beat(startTime + (gap-50)* 36,"UP"),
					new Beat(startTime + (gap-50)* 39,"LEFT"),
					new Beat(startTime + (gap-50)* 42,"RIGHT"),
					new Beat(startTime + (gap-50)* 45,"RIGHT"),
					new Beat(startTime + (gap-50)* 48,"UP"),
					new Beat(startTime + (gap-50)* 51,"LEFT"),
					new Beat(startTime + (gap-50)* 54,"RIGHT"),
					new Beat(startTime + (gap-50)* 57,"UP"),
					new Beat(startTime + (gap-50)* 60,"LEFT"),
					new Beat(startTime + (gap-20)* 63,"RIGHT"),
					new Beat(startTime + (gap-20)* 67,"UP"),
					new Beat(startTime + (gap-20)* 70,"LEFT"),
					new Beat(startTime + (gap-10)* 73,"UP"),
					new Beat(startTime + gap* 74,"LEFT"),
					new Beat(startTime + gap* 76,"UP"),
					new Beat(startTime + gap* 79,"UP"),
					new Beat(startTime + gap* 82,"RIGHT"),
					new Beat(startTime + gap* 85,"LEFT"),
					new Beat(startTime + gap* 88,"UP"),
					new Beat(startTime + gap* 89,"RIGHT"),
					new Beat(startTime + gap* 91,"UP"),
					new Beat(startTime + gap* 94,"RIGHT"),
					new Beat(startTime + gap* 97,"UP"),
					new Beat(startTime + gap* 100,"LEFT"),
					new Beat(startTime + gap* 103,"UP"),
					new Beat(startTime + gap* 105,"RIGHT"),
					new Beat(startTime + gap* 108,"UP"),
					new Beat(startTime + gap* 111,"LEFT"),
					new Beat(startTime + gap* 114,"RIGHT"),
					new Beat(startTime + (gap)* 117,"UP"),
					new Beat(startTime + (gap)* 118,"LEFT"),
					new Beat(startTime + (gap)* 119,"UP"),
					new Beat(startTime + (gap)* 120,"RIGHT"),
					new Beat(startTime + (gap)* 123,"RIGHT"),
					new Beat(startTime + (gap)* 127,"UP"),
					
					new Beat(startTime + gap* 130,"RIGHT"),
					new Beat(startTime + gap* 133,"RIGHT"),
					new Beat(startTime + gap* 134,"UP"),
					new Beat(startTime + gap* 136,"UP"),
					new Beat(startTime + gap* 139,"LEFT"),
					new Beat(startTime + gap* 140,"UP"),
					new Beat(startTime + gap* 141,"LEFT"),
					new Beat(startTime + gap* 142,"RIGHT"),
					new Beat(startTime + gap* 145,"UP"),
					new Beat(startTime + gap* 148,"UP"),
					new Beat(startTime + gap* 151,"LEFT"),
					new Beat(startTime + gap* 154,"UP"),
					new Beat(startTime + gap* 155,"LEFT"),
					new Beat(startTime + gap* 157,"RIGHT"),
					new Beat(startTime + gap* 160,"RIGHT"),
					new Beat(startTime + gap* 163,"UP"),
					new Beat(startTime + gap* 166,"LEFT"),
					new Beat(startTime + gap* 167,"RIGHT"),
					
					new Beat(startTime + (gap)* 170,"LEFT"),
					new Beat(startTime + (gap)* 173,"UP"),
					new Beat(startTime + (gap)* 176,"LEFT"),
					new Beat(startTime + (gap)* 179,"LEFT"),
					new Beat(startTime + (gap)* 182,"UP"),
					new Beat(startTime + (gap)* 185,"RIGHT"),
					new Beat(startTime + (gap)* 188,"UP"),
					new Beat(startTime + (gap)* 191,"RIGHT"),
					
					new Beat(startTime + (gap)* 192,"LEFT"),
					new Beat(startTime + (gap)* 193,"RIGHT"),
					new Beat(startTime + (gap)* 194,"UP"),
					new Beat(startTime + (gap)* 197,"LEFT"),
					new Beat(startTime + (gap)* 200,"UP"),
					new Beat(startTime + (gap-30)* 203,"RIGHT"),
					new Beat(startTime + (gap-30)* 204,"UP"),
					new Beat(startTime + (gap)* 207,"RIGHT"),
					new Beat(startTime + (gap)* 210,"LEFT"),
					new Beat(startTime + (gap)* 211,"LEFT"),
					new Beat(startTime + (gap)* 214,"RIGHT"),
					new Beat(startTime + (gap)* 217,"UP"),
					
					new Beat(startTime + (gap)* 220,"RIGHT"),
					new Beat(startTime + (gap)* 223,"LEFT"),
					new Beat(startTime + (gap)* 226,"LEFT"),
					new Beat(startTime + (gap)* 227,"RIGHT"),
					new Beat(startTime + (gap)* 228,"UP"),
					new Beat(startTime + (gap)* 231,"RIGHT"),
					new Beat(startTime + (gap)* 234,"LEFT"),
					new Beat(startTime + (gap)* 237,"LEFT"),
					new Beat(startTime + (gap)* 240,"RIGHT"),
					new Beat(startTime + (gap)* 241,"NOne"),
					
			};
			
		}else if(titleName.equals("Countosh") && difficult.equals("Hard")) {
			int startTime = 1000;
			//648
			int gap = 550;
			beats = new Beat[] {
					new Beat(startTime,"UP"),
					new Beat(startTime + gap* 1,"RIGHT"),
					new Beat(startTime + gap* 2,"RIGHT"),
					new Beat(startTime + gap* 4,"LEFT"),
					new Beat(startTime + (gap-50)* 6,"LEFT"),
					new Beat(startTime + (gap-50)* 7,"UP"),
					new Beat(startTime + gap* 9,"LEFT"),
					new Beat(startTime + gap* 10,"RIGHT"),
					new Beat(startTime + gap* 12,"UP"),
					new Beat(startTime + (gap)* 14,"LEFT"),
					new Beat(startTime + (gap)* 15,"RIGHT"),
					new Beat(startTime + (gap)* 16,"UP"),
					new Beat(startTime + (gap)* 18,"RIGHT"),
					new Beat(startTime + (gap)* 21,"LEFT"),
					new Beat(startTime + (gap)* 22,"UP"),
					new Beat(startTime + (gap)* 23,"UP"),
					new Beat(startTime + (gap)* 26,"UP"),
					new Beat(startTime + (gap)* 28,"LEFT"),
					new Beat(startTime + (gap)* 30,"UP"),
					new Beat(startTime + (gap)* 31,"LEFT"),
					new Beat(startTime + (gap)* 32,"LEFT"),
					new Beat(startTime + (gap)* 33,"RIGHT"),
					new Beat(startTime + (gap)* 34,"UP"),
					new Beat(startTime + (gap)* 36,"LEFT"),
					new Beat(startTime + (gap)* 38,"RIGHT"),
					new Beat(startTime + (gap)* 39,"UP"),
					new Beat(startTime + (gap)* 40,"LEFT"),
					
					new Beat(startTime + (gap)* 43,"UP"),
					new Beat(startTime + (gap)* 44,"RIGHT"),
					new Beat(startTime + (gap)* 46,"LEFT"),
					new Beat(startTime + (gap)* 47,"RIGHT"),
					new Beat(startTime + (gap)* 49,"UP"),
					new Beat(startTime + (gap)* 51,"UP"),
					new Beat(startTime + (gap)* 53,"RIGHT"),
					new Beat(startTime + (gap)* 54,"LEFT"),
					new Beat(startTime + (gap)* 55,"RIGHT"),
					new Beat(startTime + (gap)* 56,"UP"),
					new Beat(startTime + (gap)* 58,"LEFT"),
					new Beat(startTime + (gap)* 59,"UP"),
					new Beat(startTime + (gap)* 60,"RIGHT"),
					new Beat(startTime + (gap)* 61,"LEFT"),
					new Beat(startTime + (gap)* 63,"UP"),
					new Beat(startTime + (gap)* 65,"RIGHT"),
					new Beat(startTime + (gap)* 66,"RIGHT"),
					new Beat(startTime + (gap)* 67,"UP"),
					new Beat(startTime + (gap)* 69,"RIGHT"),
					new Beat(startTime + (gap)* 70,"UP"),
					new Beat(startTime + (gap)* 73,"LEFT"),
					new Beat(startTime + (gap)* 75,"UP"),
					new Beat(startTime + (gap)* 77,"RIGHT"),
					new Beat(startTime + (gap)* 79,"LEFT"),
					new Beat(startTime + (gap)* 82,"LEFT"),
					new Beat(startTime + (gap)* 85,"RIGHT"),
					new Beat(startTime + (gap)* 87,"LEFT"),
					new Beat(startTime + (gap)* 89,"UP"),
					new Beat(startTime + (gap)* 91,"LEFT"),
					new Beat(startTime + (gap)* 94,"RIGHT"),
					new Beat(startTime + (gap)* 97,"UP"),
					new Beat(startTime + (gap)* 100,"UP"),
					new Beat(startTime + (gap)* 103,"LEFT"),
					new Beat(startTime + (gap)* 106,"RIGHT"),
					new Beat(startTime + (gap)* 109,"UP"),
					new Beat(startTime + (gap)* 111,"LEFT"),
					new Beat(startTime + (gap)* 112,"UP"),
					new Beat(startTime + (gap)* 113,"RIGHT"),
					new Beat(startTime + (gap)* 114,"LEFT"),
					new Beat(startTime + (gap)* 117,"UP"),
					new Beat(startTime + (gap)* 120,"LEFT"),
					new Beat(startTime + (gap)* 123,"RIGHT"),
					new Beat(startTime + (gap)* 127,"UP"),
					
					new Beat(startTime + gap* 128,"UP"),
					new Beat(startTime + gap* 129,"RIGHT"),
					new Beat(startTime + gap* 132,"LEFT"),
					new Beat(startTime + gap* 134,"UP"),
					new Beat(startTime + gap* 136,"LEFT"),
					new Beat(startTime + gap* 137,"LEFT"),
					new Beat(startTime + gap* 139,"UP"),
					new Beat(startTime + (gap)* 141,"LEFT"),
					new Beat(startTime + (gap)* 143,"RIGHT"),
					new Beat(startTime + (gap)* 145,"UP"),
					new Beat(startTime + (gap)* 146,"RIGHT"),
					new Beat(startTime + gap* 148,"RIGHT"),
					new Beat(startTime + gap* 150,"UP"),
					new Beat(startTime + gap* 152,"LEFT"),
					new Beat(startTime + gap* 154,"UP"),
					new Beat(startTime + gap* 156,"UP"),
					new Beat(startTime + gap* 158,"LEFT"),
					new Beat(startTime + (gap)* 160,"RIGHT"),
					new Beat(startTime + (gap)* 162,"RIGHT"),
					new Beat(startTime + (gap)* 164,"LEFT"),
					new Beat(startTime + (gap)* 168,"UP"),
					new Beat(startTime + (gap)* 169,"LEFT"),
					new Beat(startTime + (gap)* 170,"UP"),
					new Beat(startTime + (gap)* 171,"LEFT"),
					new Beat(startTime + (gap)* 173,"RIGHT"),
					new Beat(startTime + (gap)* 175,"LEFT"),
					new Beat(startTime + (gap)* 177,"RIGHT"),
					new Beat(startTime + (gap)* 179,"UP"),
					new Beat(startTime + (gap)* 181,"RIGHT"),
					new Beat(startTime + (gap)* 182,"UP"),
					new Beat(startTime + (gap)* 183,"RIGHT"),
					new Beat(startTime + (gap)* 185,"LEFT"),
					new Beat(startTime + (gap)* 187,"RIGHT"),
					new Beat(startTime + (gap)* 189,"LEFT"),
					new Beat(startTime + (gap)* 190,"UP"),
					new Beat(startTime + (gap)* 191,"RIGHT"),
					new Beat(startTime + (gap)* 192,"UP"),
					new Beat(startTime + (gap)* 193,"LEFT"),
					
					new Beat(startTime + (gap)* 195,"RIGHT"),
					new Beat(startTime + (gap)* 197,"UP"),
					new Beat(startTime + (gap)* 199,"RIGHT"),
					new Beat(startTime + (gap)* 201,"UP"),
					new Beat(startTime + (gap)* 202,"LEFT"),
					new Beat(startTime + (gap)* 203,"UP"),
					new Beat(startTime + (gap)* 204,"UP"),
					new Beat(startTime + (gap)* 206,"LEFT"),
					new Beat(startTime + (gap)* 208,"RIGHT"),
					new Beat(startTime + (gap)* 209,"UP"),
					new Beat(startTime + (gap)* 210,"RIGHT"),
					new Beat(startTime + (gap)* 211,"UP"),
					new Beat(startTime + (gap)* 213,"LEFT"),
					new Beat(startTime + (gap)* 214,"UP"),
					new Beat(startTime + (gap)* 215,"RIGHT"),
					new Beat(startTime + (gap)* 216,"UP"),
					new Beat(startTime + (gap)* 218,"RIGHT"),
					new Beat(startTime + (gap)* 220,"UP"),
					new Beat(startTime + (gap)* 222,"LEFT"),
					new Beat(startTime + (gap)* 223,"RIGHT"),
					new Beat(startTime + (gap)* 224,"UP"),
					
					new Beat(startTime + (gap)* 226,"UP"),
					new Beat(startTime + (gap)* 227,"LEFT"),
					new Beat(startTime + (gap)* 228,"RIGHT"),
					new Beat(startTime + (gap)* 229,"RIGHT"),
					new Beat(startTime + (gap)* 231,"LEFT"),
					new Beat(startTime + (gap)* 232,"UP"),
					new Beat(startTime + (gap)* 233,"UP"),
					new Beat(startTime + (gap)* 235,"LEFT"),
					new Beat(startTime + (gap)* 237,"UP"),
					new Beat(startTime + (gap)* 239,"RIGHT"),
					new Beat(startTime + (gap)* 240,"UP"),
					new Beat(startTime + (gap)* 241,"LEFT"),
					new Beat(startTime + (gap)* 242,"RIGHT"),
					new Beat(startTime + (gap)* 243,"UP"),
					new Beat(startTime + (gap)* 245,"LEFT"),
					new Beat(startTime + (gap)* 246,"RIGHT"),
					new Beat(startTime + (gap)* 247,"UP"),
			
					new Beat(startTime + (gap)* 254,"NOne"),
			};
		}
		
		int i=0;
		gameMusic.start();
		while(i < beats.length && !isInterrupted()) {
			boolean dropped = false;
				if(beats[i].getTime() <= gameMusic.getTime()) {
					Note note = new Note(beats[i].getNoteName());
					note.start();
					noteList.add(note);
					i++;
					dropped=true;
				}
			
			if(!dropped) {
				try {
					Thread.sleep(1);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		close();
	}
	public void judge(String input) {
		for(int i=0; i< noteList.size(); i++) {
			Note note = noteList.get(i);
			if(input.equals(note.getNoteType())) {
				judgeEvent(note.judge());
				break;
			}
		}
	}
	public void judgeEvent(String judge) {
		
		if(judge.equals("Good")){
			Score+=500;
			judgeImage = new ImageIcon(Main.class.getResource("../images/Good_Image.png")).getImage();
			COMBO=0;
			Good_score++;
		}
		else if(judge.equals("Great")){
			Score+=900;
			judgeImage = new ImageIcon(Main.class.getResource("../images/Great_Image.png")).getImage();
			COMBO++;
			Great_score++;
		}
		else if(judge.equals("perfect")){
			Score+=1200;
			judgeImage = new ImageIcon(Main.class.getResource("../images/Perfect_Image.png")).getImage();
			COMBO++;
			Per_score++;
		}else if(judge.equals("MISS")) {
			judgeImage = new ImageIcon(Main.class.getResource("../images/Miss_Image.png")).getImage();
			COMBO=0;
			Miss_score++;
		}
		
	}


}
