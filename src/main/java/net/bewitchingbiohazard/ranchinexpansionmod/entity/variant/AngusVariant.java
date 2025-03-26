package net.bewitchingbiohazard.ranchinexpansionmod.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum AngusVariant {
    BLACK(0),
    RED(1);

    private static final AngusVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(AngusVariant::getId)).toArray(AngusVariant[]::new);
    private final int id;

    AngusVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static AngusVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
