/*
 * Copyright (c) 2019. All rights reserved.
 */

package xzot1k.plugins.hd.core.packets.titles;

import org.bukkit.entity.Player;

public interface TitleHandler {
    void sendTitle(Player player, String text, int fadeIn, int displayTime, int fadeOut);

    void sendSubTitle(Player player, String text, int fadeIn, int displayTime, int fadeOut);

    void sendTitle(Player player, String title, String subTitle, int fadeIn, int displayTime, int fadeOut);
}
