package com.bedrockindustrial;

import com.bedrockindustrial.config.ModConfig;
import com.bedrockindustrial.debug.ModDebug;
import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(BedrockIndustrial.MOD_ID)
public class BedrockIndustrial {
    public static final String MOD_ID = "bedrockindustrial";
    public static final Logger LOGGER = LogUtils.getLogger();

    public BedrockIndustrial() {
        ModLoadingContext.get().registerConfig(
                net.minecraftforge.fml.config.ModConfig.Type.COMMON, ModConfig.SPEC);

        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.addListener(this::commonSetup);
        // Registries (blocks, items, block entities, menus) get hooked up here in P2.
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("[{}] loaded (P1 skeleton)", MOD_ID);
        ModDebug.info("debug logging is ON");
    }
}
