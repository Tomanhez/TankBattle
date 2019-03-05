package pl.tomek.sut.tankbattle;

import com.badlogic.gdx.Game;

import pl.tomek.sut.tankbattle.screens.GamePlayScreen;
import pl.tomek.sut.tankbattle.screens.IntroScreen;
import pl.tomek.sut.tankbattle.screens.SplashScreen;
//Test3
public class TankBattle extends Game {

	private Assets assets;//asset manager
	private boolean paused;



	@Override
	public void create () {
		assetsInit();
	}
	private void assetsInit() {
		assets = new Assets();
		assets.load();
		assets.manager.finishLoading();
		if(assets.manager.update()){
			//If all assets are loaded game starting
			this.setScreen(new IntroScreen(this));
		}
	}
	
	@Override
	public void dispose () {
		assets.dispose();
	}



	//get & set
	public boolean isPaused() {
		return paused;
	}
	public void setPaused(boolean paused) {
		this.paused = paused;
	}
	public Assets getAssets() {
		return assets;
	}
	public void setAssets(Assets assets) {
		this.assets = assets;
	}
}
