package pl.tomek.sut.tankbattle.gameinterfaces;

import pl.tomek.sut.tankbattle.items.ItemType;

/**
 * interfaces that will communicate between games items and if items will touched
 */
public interface Interaction {

    /**
     * before I get or set interaction point change type
     * @return ItemType(int)
     */
    int getItemType();

    /**
     *  when the items touch get next point and set current point
     */
    void setDestroyPoint();
    /**
     *  when the items touch get next point and set current point
     */
    int getDestroyPoint();
}
