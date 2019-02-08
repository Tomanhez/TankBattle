package pl.tomek.sut.tankbattle.items;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import pl.tomek.sut.tankbattle.TankBattle;

public class IntroImage extends Image {

    private final static int WIDTH = 300;
    private final static int HEIGHT = 600;
    private final static int STARTING_X = 90;
    private final static int STARTING_Y = 0;

    TankBattle game;

    public IntroImage(TankBattle game){
        super(game.getAssets().manager.get("intro.png", Texture.class));
        this.setOrigin(WIDTH/2,HEIGHT/2);//orientation from center our image
        this.setSize(WIDTH,HEIGHT);
        this.setPosition(STARTING_X,STARTING_Y);
        this.game = game;
    }
}
