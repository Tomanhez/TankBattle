package pl.tomek.sut.tankbattle.items;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import pl.tomek.sut.tankbattle.TankBattle;

public class PlayButton extends Image {

    private final static int WIDTH = 180;
    private final static int HEIGHT = 60;
    private final static int STARTING_X = 150;
    private final static int STARTING_Y = 300;

    TankBattle game;

    public PlayButton(TankBattle game){
        super(game.getAssets().manager.get("play.png", Texture.class));
        this.setOrigin(WIDTH/2,HEIGHT/2);//orientation from center our image
        this.setSize(WIDTH,HEIGHT);
        this.setPosition(STARTING_X,STARTING_Y);
        this.game = game;
    }

}
