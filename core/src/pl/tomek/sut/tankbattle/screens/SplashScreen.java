package pl.tomek.sut.tankbattle.screens;

import com.badlogic.gdx.utils.Timer.Task;
import com.badlogic.gdx.utils.Timer;

import pl.tomek.sut.tankbattle.TankBattle;

public class SplashScreen extends AbstractScreen {

    public SplashScreen(final TankBattle game) {
        super(game);
        changeScreen();
    }

    private void changeScreen() {
        Timer.schedule(new Task() {
            @Override
            public void run() {
                game.setScreen(new GamePlayScreen(game));
            }

        }, 2);
    }

    @Override
    public void init(){
//        if(Gdx.input.justTouched()){
//            game.setScreen(new GamePlayScreen(game));}
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        draw();
    }

    private void draw() {
        spriteBatch.begin();
        spriteBatch.end();
    }


}
