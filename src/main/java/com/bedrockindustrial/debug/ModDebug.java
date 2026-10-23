package com.bedrockindustrial.debug;

import com.bedrockindustrial.BedrockIndustrial;
import com.bedrockindustrial.config.ModConfig;

public final class ModDebug {
    public static boolean enabled() {
        return ModConfig.SPEC.isLoaded() && ModConfig.DEBUG_LOGGING.get();
    }

    public static void info(String msg, Object... args) {
        if (enabled()) {
            BedrockIndustrial.LOGGER.info("[DEBUG] " + msg, args);
        }
    }

    private ModDebug() {}
}
