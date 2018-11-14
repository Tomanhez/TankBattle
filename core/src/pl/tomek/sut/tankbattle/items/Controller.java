package pl.tomek.sut.tankbattle.items;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import pl.tomek.sut.tankbattle.TankBattle;

public class Controller {
    Viewport viewport;
    Stage stage;
    boolean upPressed,downPressed,leftPressed,rightPressed;
    OrthographicCamera cam;

    public Controller(){
        cam = new OrthographicCamera();
        viewport = new FitViewport(800,480,cam);
        stage = new Stage(viewport,TankBattle.batch);//, ???
        Gdx.input.setInputProcessor(stage);

        //table for controllers
        Table table = new Table();
        table.left().bottom();

        Image upImg = new Image(new Texture("up.png"));
        upImg.setSize(50,50);
        upImg.addListener(new InputListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                upPressed = true;
                return true;
            }

            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                downPressed = false;
            }
        });

        Image downImg = new Image(new Texture("down.png"));
        downImg.setSize(50,50);
        downImg.addListener(new InputListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                upPressed = true;
                return true;
            }

            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                downPressed = false;
            }
        });

        Image rightImg = new Image(new Texture("right.png"));
        rightImg.setSize(50,50);
        rightImg.addListener(new InputListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                upPressed = true;
                return true;
            }

            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                downPressed = false;
            }
        });

        Image leftImg = new Image(new Texture("left.png"));
        leftImg.setSize(50,50);
        leftImg.addListener(new InputListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                upPressed = true;
                return true;
            }

            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                downPressed = false;
            }
        });

        table.add();
        table.add(upImg).size(upImg.getWidth(),upImg.getHeight());
        table.add();
        table.row().pad(5,5,5,5);
        table.add(leftImg).size(leftImg.getWidth(),leftImg.getHeight());
        table.add();
        table.add(rightImg).size(rightImg.getWidth(),rightImg.getHeight());
        table.row().padBottom(5);
        table.add(downImg).size(downImg.getWidth(),downImg.getHeight());
        table.add();

        stage.addActor(table);

    }

    public void draw(){
        stage.draw();
    }

    public boolean isUpPressed() {
        return upPressed;
    }

    public boolean isDownPressed() {
        return downPressed;
    }

    public boolean isLeftPressed() {
        return leftPressed;
    }

    public boolean isRightPressed() {
        return rightPressed;
    }

    public void resize(int width,int height){
        viewport.update(width,height);
    }
}
