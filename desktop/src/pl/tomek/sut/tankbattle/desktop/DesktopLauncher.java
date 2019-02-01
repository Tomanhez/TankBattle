package pl.tomek.sut.tankbattle.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import pl.tomek.sut.tankbattle.TankBattle;
import pl.tomek.sut.tankbattle.TankBattleConfig;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.height = TankBattleConfig.HEIGHT;
		config.width = TankBattleConfig.WIDTH;
		new LwjglApplication(new TankBattle(), config);
	}
}
