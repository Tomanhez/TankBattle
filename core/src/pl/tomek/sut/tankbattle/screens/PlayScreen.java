package pl.tomek.sut.tankbattle.screens;

import com.badlogic.gdx.graphics.Texture;

import pl.tomek.sut.tankbattle.TankBattle;

public class PlayScreen extends AbstractScreen{

    Texture tank;

    public PlayScreen(TankBattle game) {
        super(game);
        init();
    }

    public void init(){
        tank = game.getAssets().manager.get("tank.png", Texture.class);
    }

    @Override
    public void render(float delta) {
        super.render(delta);

        spriteBatch.begin();

        spriteBatch.draw(tank,0,0);

        spriteBatch.end();

    }
}
