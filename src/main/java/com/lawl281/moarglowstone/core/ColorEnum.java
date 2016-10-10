package com.lawl281.moarglowstone.core;

import net.minecraft.util.IStringSerializable;


/**
 * Created by lawl281 on 9/20/2016.
 */
public enum ColorEnum implements IStringSerializable {

    BLACK(0, 0, "black"),
    BLUE(1, 4, "blue"),
    BROWN(2, 3, "brown"),
    CYAN(3, 6, "cyan"),
    GRAY(4, 8, "gray"),
    GREEN(5, 2, "green"),
    LIGHTBLUE(6, 12, "lightblue"),
    LIGHTGRAY(7, 7, "lightgray"),
    LIME(8, 10, "lime"),
    MAGENTA(9, 13, "magenta"),
    ORANGE(10, 14, "orange"),
    PINK(11, 9, "pink"),
    PURPLE(12, 5, "purple"),
    RED(13, 1, "red"),
    WHITE(14, 15, "white"),
    YELLOW(15, 11, "yellow");

    private static final ColorEnum[] META_LOOKUP = new ColorEnum[values().length];
    private int meta;
    private int dyeColor;
    private String name;


    ColorEnum(int meta, int dyeColor, String name) {
        this.name = name;
        this.meta = meta;
        this.dyeColor = dyeColor;

    }

    public String getName() {
        return name;
    }

    public int getMeta() {
        return meta;
    }

    public int getDyeColor() {
        return dyeColor;
    }

    @Override
    public String toString() {
        return getName();
    }

    public static ColorEnum byMetadata(int meta)
    {
        if (meta < 0 || meta >= META_LOOKUP.length)
        {
            meta = 0;
        }

        return META_LOOKUP[meta];
    }

    static {
        for (ColorEnum colorenum: values()) {
            META_LOOKUP[colorenum.getMeta()] =colorenum;
        }
    }

}





