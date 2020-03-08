package G_5;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyLisener extends KeyAdapter{
	@Override
	public void keyPressed(KeyEvent e) {
		if(Musicgame.game == null) {
			return;
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			Musicgame.game.pressLeft();
		}
		else if(e.getKeyCode() == KeyEvent.VK_UP) {
			Musicgame.game.pressUp();
		}
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Musicgame.game.pressRight();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		if(Musicgame.game == null) {
			return;
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			Musicgame.game.releaseLeft();
		}
		else if(e.getKeyCode() == KeyEvent.VK_UP) {
			Musicgame.game.releaseUp();
		}
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Musicgame.game.releaseRight();
		}
	}
}
