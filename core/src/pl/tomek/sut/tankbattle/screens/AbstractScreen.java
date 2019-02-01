package pl.tomek.sut.tankbattle.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;

import pl.tomek.sut.tankbattle.TankBattle;
import pl.tomek.sut.tankbattle.TankBattleConfig;

public abstract class AbstractScreen implements Screen{

    protected TankBattle game;
    protected Stage stage;
    protected OrthographicCamera camera;
    protected SpriteBatch spriteBatch;



    public AbstractScreen(TankBattle game){
        this.game = game;
        createCamera();
        spriteBatch = new SpriteBatch();
    }

    private void createCamera(){
        camera = new OrthographicCamera();
        camera.setToOrtho(false, TankBattleConfig.WIDTH,TankBattleConfig.HEIGHT);
        camera.update();
    }

    @Override
    public void render(float delta) {
        clearScreen();
        camera.update();
        spriteBatch.setProjectionMatrix(camera.combined);
    }

    private void clearScreen() {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    @Override
    public void pause() {
        game.setPaused(true);
    }

    @Override
    public void resume() {
        game.setPaused(false);
    }



    @Override
    public void resize(int width, int height) {}
    @Override
    public void hide() {}
    @Override
    public void dispose() {}
    @Override
    public void show() {}//if screen start first once
}
