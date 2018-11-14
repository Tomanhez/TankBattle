package pl.tomek.sut.tankbattle.items;

import java.awt.Rectangle;

import pl.tomek.sut.tankbattle.gameinterfaces.Interaction;

public class Bullet implements Interaction{

    private int health;
    private Rectangle tank;
    private int type;


    /*
    Interface Interaction
     */
    @Override//ok
    public int getItemType() {
        return type;
    }

    @Override
    public void setDestroyPoint() {

    }

    @Override
    public int getDestroyPoint() {
        return 0;
    }
}
