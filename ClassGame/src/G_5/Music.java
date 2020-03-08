package G_5;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

//Thread�� ���α׷� ���� ���� ���α׷� ����?
public class Music extends Thread{
	
	private Player player;
	private boolean isloop;
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	public Music(String name, Boolean isloop) {
		
		try {
			this.isloop = isloop;
			file = new File(Main.class.getResource("../MUSIC/"+name).toURI());
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis); //���� ��Ƽ� �о����
			player = new Player(bis);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public int getTime() {
		if(player == null)
			return 0;
		return player.getPosition();
	}
	//���� ����ǰ� �ִ� ������ ���ġ�� ����ǰ� �ִ��� �˷��ִ�?
	
	public void close() {
		isloop = false;
		player.close();
		this.interrupt(); // �ش� Thread �������·� �������
		
	}//������ ���� �����ϰ��ִ� �����ϰ� ����
	@Override
	public void run() { //run�� Thread������ ������ ��� �ؾ��Ѵ�
		try{
			do {
				player.play();
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis); //���� ��Ƽ� �о����
				player = new Player(bis);
			}while(isloop);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
}
