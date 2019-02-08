package pl.tomek.sut.tankbattle.screens;

import pl.tomek.sut.tankbattle.TankBattle;
import pl.tomek.sut.tankbattle.items.Tank;

public class GamePlayScreen extends AbstractScreen{

    Tank tank;
    TankBattle game;

    public GamePlayScreen(TankBattle game) {
        super(game);
        this.game = game;
        init();
    }

    public void init(){
        tank = new Tank(game);
        stage.addActor(tank);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        update();//must update it before draw
        draw();
    }

    private void update() {
        stage.act();//update all actors in our stage
    }

    private void draw() {
        spriteBatch.begin();
        stage.draw();
        spriteBatch.end();
    }
}
