package pl.tomek.sut.tankbattle.screens;

import com.badlogic.gdx.utils.Timer;

import pl.tomek.sut.tankbattle.TankBattle;
import pl.tomek.sut.tankbattle.items.IntroImage;

public class IntroScreen extends AbstractScreen {

    IntroImage introImage;

    public IntroScreen(TankBattle game){
        super(game);
        init();
        changeScreen();
    }

    private void changeScreen() {
        Timer.schedule(new Timer.Task() {
            @Override
            public void run() {
                game.setScreen(new SplashScreen(game));
            }

        }, 3);
    }
    @Override
    protected void init() {
        introImage = new IntroImage(game);
        stage.addActor(introImage);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        draw();
    }

    private void draw() {
        spriteBatch.begin();
        stage.draw();
        spriteBatch.end();
    }
}
