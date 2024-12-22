package net.runelite.client.plugins.wealthtracker;

import net.runelite.api.Client;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.components.LineComponent;

import javax.inject.Inject;
import java.awt.*;

public class WealthTrackerOverlay extends Overlay
{
    private final Client client;
    private final WealthTrackerConfig config;

    @Inject
    public WealthTrackerOverlay(Client client, WealthTrackerConfig config)
    {
        setPosition(OverlayPosition.TOP_LEFT);
        this.client = client;
        this.config = config;
    }

    @Override
    public Dimension render(Graphics2D graphics)
    {
        if (!config.showWealth())
        {
            return null;
        }

        // Example: Render wealth information
        int wealth = calculateWealth();
        graphics.setColor(Color.WHITE);
        graphics.drawString("Wealth: " + wealth + " GP", 10, 30);

        return null;
    }

    private int calculateWealth()
    {
        // Example: Calculate the player's wealth (could be based on inventory, bank, etc.)
        int wealth = 0;
        for (Item item : client.getInventory().getItems())
        {
            wealth += item.getQuantity() * item.getDef().getPrice();
        }
        return wealth;
    }
}
