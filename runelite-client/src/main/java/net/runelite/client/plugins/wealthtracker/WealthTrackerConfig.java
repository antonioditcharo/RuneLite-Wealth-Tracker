package net.runelite.client.plugins.wealthtracker;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("wealthtracker")
public interface WealthTrackerConfig extends Config
{
    @ConfigItem(
            keyName = "showWealth",
            name = "Show Wealth Overlay",
            description = "Toggle displaying your wealth in the overlay",
            position = 1
    )
    default boolean showWealth() {
        return true;
    }
}
