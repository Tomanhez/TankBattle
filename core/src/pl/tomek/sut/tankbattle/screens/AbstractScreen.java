package pl.tomek.sut.tankbattle.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import pl.tomek.sut.tankbattle.TankBattle;
import pl.tomek.sut.tankbattle.TankBattleConfig;

public abstract class AbstractScreen implements Screen{

    protected TankBattle game;
    protected Stage stage;
    protected OrthographicCamera camera;
    protected SpriteBatch spriteBatch;
    protected Viewport viewport;



    public AbstractScreen(TankBattle game){
        this.game = game;
        createCamera();
        spriteBatch = new SpriteBatch();
        viewport = new FitViewport(TankBattleConfig.VIEWPORT_WIDTH, TankBattleConfig.VIEWPORT_HEIGHT, camera);
        stage = new Stage(viewport);
        Gdx.input.setInputProcessor(stage);
        init();
    }

    protected abstract void init();

    private void createCamera(){
        camera = new OrthographicCamera();
        camera.setToOrtho(false, TankBattleConfig.WIDTH,TankBattleConfig.HEIGHT);
        camera.update();
    }

    @Override
    public void render(float delta) {
        clearScreen();
        camera.update();
        spriteBatch.setProjectionMatrix(camera.combined);//???
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
    public void resize(int width, int height) {
        viewport.update(width, height);
    }
    @Override
    public void hide() {}
    @Override
    public void dispose() {}
    @Override
    public void show() {}//if screen start first once
}
