package me.b1vth420.strategawkaApi.Data;

import me.b1vth420.strategawkaApi.Api;

import java.io.File;

public class FileManager {
    private static File mainDir = Api.getInst().getDataFolder();
    private static File cfgFile = new File(mainDir, "config.yml");

    public static void check(){
        if(!(mainDir.exists())) mainDir.mkdir();
        if(!(cfgFile.exists())) Api.getInst().saveDefaultConfig();
}

    public static File getMainDir() {
        return mainDir;
    }
}
