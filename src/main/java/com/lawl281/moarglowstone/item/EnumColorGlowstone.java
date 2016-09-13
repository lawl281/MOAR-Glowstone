package com.lawl281.moarglowstone.item;

import net.minecraft.util.IStringSerializable;

/**
 * Created by lawl281 on 9/6/2016.
 */
public enum EnumColorGlowstone implements IStringSerializable {
    BLACK(0, "black"),
    RED(1, "red"),
    GREEN(2, "green"),
    BROWN(3, "brown"),
    BLUE(4, "blue"),
    PURPLE(5, "purple"),
    CYAN(6, "cyan"),
    LIGHTGRAY(7, "lightgray"),
    GRAY(8, "gray"),
    PINK(9, "pink"),
    LIME(10, "lime"),
    YELLOW(11, "yellow"),
    LIGHTBLUE(12, "lightblue"),
    MAGENTA(13, "magenta"),
    ORANGE(14, "orange"),
    WHITE(15, "white");

    private static final EnumColorGlowstone[] META_LOOKUP = new EnumColorGlowstone[values().length];
    private int meta;
    private String name;

    EnumColorGlowstone(int meta, String name) {
        this.meta = meta;
        this.name = name + "_glowstone_dust";
    }

    public int getMeta() {
        return meta;
    }

    @Override
    public String getName() {
        return name;
    }

    public static EnumColorGlowstone byMetadata(int meta) {
        if (meta < 0 || meta >= META_LOOKUP.length) {
            meta = 0;
        }

        return META_LOOKUP[meta];
    }

    static {
        for (EnumColorGlowstone glowstone : values()) {
            META_LOOKUP[glowstone.getMeta()] = glowstone;
        }
    }
}
