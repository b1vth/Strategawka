package me.b1vth420.strategawkaApi.Utils;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.ComponentBuilder;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.text.DecimalFormat;

public class ChatUtil {

    private static final int arabic[] = {1000, 500, 100, 50, 10, 5, 1};
    private static final char roman[] = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
    private static final int ROMAN_N = arabic.length;

    public static String chat(String s){
        return ChatColor.translateAlternateColorCodes('&', s);
    }
    public static void sendActionBar(Player p, String message){
        p.spigot().sendMessage(ChatMessageType.ACTION_BAR, new ComponentBuilder(chat(message)).create());
    }
    public static void broadcastActionBar(String message){
        for(Player p : Bukkit.getOnlinePlayers())
            p.spigot().sendMessage(ChatMessageType.ACTION_BAR, new ComponentBuilder(chat(message)).create());
    }
    public static String formatDouble(double d){
        DecimalFormat df = new DecimalFormat("#0.00");
        return df.format(d);
    }

    public static boolean isDouble(String str) {
        try {
            double v = Double.parseDouble(str);
            return true;
        } catch (NumberFormatException nfe) {
        }
        return false;
    }

    public static boolean isInteger(String s) {
        return isInteger(s,10);
    }

    public static boolean isInteger(String s, int radix) {
        if(s.isEmpty()) return false;
        for(int i = 0; i < s.length(); i++) {
            if(i == 0 && s.charAt(i) == '-') {
                if(s.length() == 1) return false;
                else continue;
            }
            if(Character.digit(s.charAt(i),radix) < 0) return false;
        }
        return true;
    }

    public static String arabic2roman(int number) {
        int i = 0;

        String result = "";

        if ((number > 3999) || (number <= 0)) {
            return result;
        }

        while ((number > 0) && (i < ROMAN_N)) {
            if(number >= arabic[i]) {
                number -= arabic[i];
                result += roman[i];
            }
            else if ((i%2 == 0) &&
                    (i<ROMAN_N-2) && // 9xx condition
                    (number >= arabic[i] - arabic[i+2]) &&
                    (arabic[i+2] != arabic[i] - arabic[i+2]))
            {
                number -= arabic[i] - arabic[i+2];
                result += roman[i+2];
                result += roman[i];
                i++;
            }
            else if ((i%2 == 1) &&
                    (i<ROMAN_N-1) && //4xx condition
                    (number >= arabic[i] - arabic[i+1]) &&
                    (arabic[i+1] != arabic[i] - arabic[i+1])) {
                number -= arabic[i] - arabic[i+1];
                result += roman[i+1];
                result += roman[i];
                i++;
            }
            else {
                i++;
            }
        }

        return result;
    }
}
