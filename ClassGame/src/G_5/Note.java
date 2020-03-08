package G_5;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;



public class Note extends Thread{

	public static Game gam;
	private Image noteImage ;

	private int x=0, y=565;
	//560 - (1000 / Main.SLEEP_TIME * Main.NOTE_SPEED)*Main.REACH_TIME
	private String noteType;
	private boolean proceeded = true;
	

	
	
	public String getNoteType() {
		return noteType;
	}
	
	public boolean isProceeded() {
		return proceeded;
	}
	
	public void close() {
		proceeded = false;
	}
	
	public Note(String noteType) {
		if(noteType.equals("LEFT")) {
			 noteImage = new ImageIcon(Main.class.getResource("../images/red.png")).getImage();
		}
		else if(noteType.equals("UP")) {
			noteImage = new ImageIcon(Main.class.getResource("../images/yello.png")).getImage();
		}
		else if(noteType.equals("RIGHT")) {
			noteImage = new ImageIcon(Main.class.getResource("../images/green.png")).getImage();
		}else {
			noteImage= new ImageIcon(Main.class.getResource("../images/S_back.png")).getImage();
		}
		this.noteType=noteType;
	}
	
	public void screenDraw(Graphics2D g) {
		if(noteType.equals("Long")){
			g.drawImage(noteImage,x,y,null);
		}
		else if(noteType.equals("NOne")){
			
			//g.drawImage(noteImage,x-389,y,null);
		}
		else {
			g.drawImage(noteImage,x,y,null);
		}
	}
	
	public void drop() {
		x += Main.NOTE_SPEED;
		if( x > 1100) {
			System.out.println("MISS");
			close();
		}
	}
	public void S_drop() {
		if(y < 1200) {
			y += Main.NOTE_SPEED;
		}
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				
					drop();
					if(proceeded) {
						Thread.sleep(Main.SLEEP_TIME);
					}else {
						interrupt();
						break;
					}
				}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String judge() {
		if( x > 1095) {
			System.out.println("MISS");
			close();
			return "MISS";
		}else if(x >= 1065) {
			System.out.println("Good");
			close();
			return "Good";
		}else if(x >= 1045) {
			System.out.println("Great");
			close();
			return "Great";
		}else if(x >= 995) {
			System.out.println("perfect");
			close();
			return "perfect";
		}
		else if(x >= 955) {
			System.out.println("Great");
			close();
			return "Great";
		}else if(x >= 945) {
			System.out.println("Good");
			close();
			return "Good";
		}
		return "None";
	}
	
	public int getx() {
		return x;
	}
}
