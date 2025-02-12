package studio.magemonkey.homestead.util;

import org.bukkit.ChatColor;
import studio.magemonkey.codex.CodexEngine;

public final class Util {
    /**
     * Gets the message for deduction from balance.
     *
     * @param amount amount to send
     * @return the message
     */
    public static String getDeductedMessage(final double amount) {
        return String.format("%s%s deducted from your balance.",
                ChatColor.YELLOW,
                CodexEngine.get().getVault().format(amount));
    }

    /**
     * Gets the message for addition to balance.
     *
     * @param amount amount to send
     * @return the message
     */
    public static String getAddedMessage(final double amount) {
        return String.format("%s%s added to your balance.",
                ChatColor.YELLOW,
                CodexEngine.get().getVault().format(amount));
    }
}
