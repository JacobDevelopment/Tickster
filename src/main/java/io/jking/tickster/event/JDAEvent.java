package io.jking.tickster.event;

import io.jking.tickster.core.Tickster;
import net.dv8tion.jda.api.events.*;
import net.dv8tion.jda.api.hooks.EventListener;
import org.jetbrains.annotations.NotNull;

public class JDAEvent implements EventListener {
    @Override
    public void onEvent(@NotNull GenericEvent event) {
        if (event instanceof ReadyEvent)
            onReady((ReadyEvent) event);
        else if (event instanceof DisconnectEvent)
            onDisconnect((DisconnectEvent) event);
        else if (event instanceof ShutdownEvent)
            onShutdown((ShutdownEvent) event);
        else if (event instanceof ReconnectedEvent)
            onReconnect((ReconnectedEvent) event);
    }

    private void onReconnect(ReconnectedEvent event) {
        Tickster.getLogger().info("Tiskter Reconnected");
    }

    private void onShutdown(ShutdownEvent event) {
        Tickster.getLogger().info("Tickster Shutdown");
    }

    private void onDisconnect(DisconnectEvent event) {
        Tickster.getLogger().info("Tickster Disconnected");
    }

    private void onReady(ReadyEvent event) {
        Tickster.getLogger().info("Tickster Ready");
    }
}