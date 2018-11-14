package pl.tomek.sut.tankbattle.gameinterfaces;

import com.badlogic.gdx.graphics.Texture;

public interface Element {

    public Texture getImage();

    /**
     * get position X from upper left corner
     */
    public int getX();
    /**
     * get position Y from upper left corner
     */
    public int getY();
    /**
     * set position X from upper left corner
     */
    public void setY(int b);
    /**
     * set position Y from upper left corner
     */
    public void setX(int a);

    /**
     * when i iterate elements list i search elements that it will don,t display and delete from lis
     */
    public boolean isLive();

    /**
     * returen current Element Object
     */
    public Object getElementObject();


    /**
     *  get width texture
     * @return
     */
    public int getWidthT();

    /**
     * get height texture
     * @return
     */
    public int getHeightT();


    //public Rectangle rect(); ? return object rectrangle represent this object

}
