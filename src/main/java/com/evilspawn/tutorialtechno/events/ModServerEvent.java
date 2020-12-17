package com.evilspawn.tutorialtechno.events;

import com.evilspawn.tutorialtechno.Tutorial;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Tutorial.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.DEDICATED_SERVER)

public class ModServerEvent {

    @SubscribeEvent
    public static void onServerChat() {

    }
}
