package com.bedrockindustrial.config;

import net.minecraftforge.common.ForgeConfigSpec;

public final class ModConfig {
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.BooleanValue DEBUG_LOGGING;

    static {
        ForgeConfigSpec.Builder b = new ForgeConfigSpec.Builder();
        b.push("general");
        DEBUG_LOGGING = b
                .comment("Extra debug logging. Turn on when reporting a crash or bug.")
                .define("debugLogging", false);
        b.pop();
        SPEC = b.build();
        // P2 adds: maxStructureSize, FE/t formulas. P3/P4 add speed values.
    }

    private ModConfig() {}
}
