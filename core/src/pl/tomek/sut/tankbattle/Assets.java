package pl.tomek.sut.tankbattle;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Disposable;

/**
 * This is our assets manager
 */
public class Assets implements Disposable {

    public final AssetManager manager = new AssetManager();


    public void load(){
        manager.load("tank.png", Texture.class);
        manager.load("music.mp3", Music.class);
        manager.load("badlogic.jpg",Texture.class);
        manager.load("play.png",Texture.class);
        manager.load("intro.png",Texture.class);
        manager.load("intro.wav",Sound.class);
    }


    @Override
    public void dispose() {
        manager.dispose();
    }
}
