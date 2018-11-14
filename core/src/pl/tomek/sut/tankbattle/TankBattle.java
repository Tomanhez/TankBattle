package pl.tomek.sut.tankbattle;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;
import java.util.List;

import pl.tomek.sut.tankbattle.gameinterfaces.Element;
import pl.tomek.sut.tankbattle.items.Controller;
import pl.tomek.sut.tankbattle.items.SourcesLoader;
import pl.tomek.sut.tankbattle.items.Tank;

public class TankBattle extends ApplicationAdapter {

	public static SpriteBatch batch;//?? public static because controller needs batch
    List<Element> eL;//element list
    //Controller controller;
	
	@Override
	public void create () {
        batch = new SpriteBatch();
	    eL = new ArrayList<Element>();
	    eL.add(Tank.newTankInstance());
        eL.get(0).setX(50);
        eL.get(0).setY(50);
        //controller = new Controller();

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		for(int i = 0;i< eL.size();i++) {//the loop that display items from Element interfaces ? maybe i will checking boolean flag from element
            batch.draw(eL.get(i).getImage(),
                    eL.get(i).getX(),
                    eL.get(i).getY(),
                    eL.get(i).getWidthT(),
                    eL.get(i).getHeightT());
        }
        //controller.draw();


		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		SourcesLoader.dispose();
	}
}
