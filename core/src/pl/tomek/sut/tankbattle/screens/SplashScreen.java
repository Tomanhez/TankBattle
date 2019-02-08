package pl.tomek.sut.tankbattle.screens;

import com.badlogic.gdx.utils.Timer.Task;
import com.badlogic.gdx.utils.Timer;

import pl.tomek.sut.tankbattle.TankBattle;
import pl.tomek.sut.tankbattle.items.PlayButton;

public class SplashScreen extends AbstractScreen {

    PlayButton playButton;

    public SplashScreen(final TankBattle game) {
        super(game);
        init();
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
        playButton = new PlayButton(game);
        stage.addActor(playButton);
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
