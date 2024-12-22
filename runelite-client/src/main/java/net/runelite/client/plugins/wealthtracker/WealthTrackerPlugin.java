package net.runelite.client.plugins.wealthtracker;

import net.runelite.api.Client;
import net.runelite.api.events.ItemReceived;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.api.widgets.ComponentID;
import net.runelite.api.widgets.InterfaceID;


import javax.inject.Inject;

@PluginDescriptor(
        name = "Wealth Tracker",
        description = "Tracks your in-game wealth",
        tags = {"wealth", "tracker"}
)
public class WealthTrackerPlugin extends Plugin
{
    @Inject
    private Client client;

    @Inject
    private OverlayManager overlayManager;

    @Inject
    private WealthTrackerOverlay overlay;

    @Override
    protected void startUp() throws Exception
    {
        overlayManager.add(overlay);
    }

    @Override
    protected void shutDown() throws Exception
    {
        overlayManager.remove(overlay);
    }

    @Subscribe
    public void onItemReceived(ItemReceived event)
    {
        // Code to track items received
    }

    @Subscribe
    public void onGameTick(GameTick event)
    {
        // Code to calculate and update wealth on each game tick
    }
}
