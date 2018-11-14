package pl.tomek.sut.tankbattle.items;

import com.badlogic.gdx.graphics.Texture;

import pl.tomek.sut.tankbattle.gameinterfaces.Element;
import pl.tomek.sut.tankbattle.gameinterfaces.Interaction;


public class Tank implements Interaction,Element{

    private static int tankNameCounter;//counter used for increase default tank name
    private String name;
    private int health;
    //private Rectangle tank;??// propably this element must be in primary class
    private int type;
    /**
     * x and y is a distance form upper left corner
     */
    private int x,y;


    public Tank(){
        name = "tank"+tankNameCounter;
        health = 300;
        type = ItemType.TANK;
        //tank= new Rectangle();?? issues
        ++tankNameCounter;
    }

    /*
    Interface Interaction
     */
    @Override//*OK*
    public int getItemType() {
        return type;
    }

    @Override
    public void setDestroyPoint() {
        //if i get?????
    }

    @Override //*OK*
    public int getDestroyPoint() {
        return DestroyPoint.TANK;
    }


    /*
    Interface Element
     */

    @Override //*OK*
    public Texture getImage() {
        return SourcesLoader.TANK;
    }

    @Override //*OK*
    public int getX() {
        return x;
    }

    @Override //*OK*
    public void setX(int a) { x = a; }

    @Override //*OK*
    public int getY() {
        return y;
    }

    @Override //*OK*
    public void setY(int b) { y = b; }

    @Override //*OK*
    public boolean isLive() {return (health<=0)?false:true; }

    @Override //*OK*
    public Object getElementObject() { return this; }

    @Override
    public int getWidthT() {return 228;}

    @Override
    public int getHeightT() {return 228;}

    /*
    Tank Fabric
     */
    public static Tank newTankInstance(){
        return new Tank();
    }
}
