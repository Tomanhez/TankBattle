package pl.tomek.sut.tankbattle.items;

import com.badlogic.gdx.graphics.Texture;

/**
 * Class that has static final elemets that load texture and return Texture;
 */
public class SourcesLoader {

    public final static Texture TANK;

    static{
        TANK = new Texture("tank.png");
    }


    /**
     * when game is close must dispose open streams
     */
    public static void dispose(){
        TANK.dispose();
    }
}


