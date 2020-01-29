package me.b1vth420.strategawkaApi;

import me.b1vth420.strategawkaApi.Data.Config;
import me.b1vth420.strategawkaApi.Data.FileManager;
import me.b1vth420.strategawkaApi.Data.MySQL.SQLManager;
import me.b1vth420.strategawkaApi.Utils.SignMenuFactory;
import org.bukkit.plugin.java.JavaPlugin;

public final class Api extends JavaPlugin {

    private static Api inst;
    private SQLManager sql;
    private SignMenuFactory signMenuFactory;


    public Api() {
        inst = this;
    }

    @Override
    public void onEnable() {
        init();
    }

    @Override
    public void onDisable() {
        sql.onDisable();
    }

    private void init(){
        FileManager.check();
        Config.getInst().load();
        registerDatabase();
        if(this.signMenuFactory == null) this.signMenuFactory = new SignMenuFactory(this);
    }

    public static Api getInst() {
        if(inst == null) return new Api();
        return inst;
    }

    private void registerDatabase(){
        sql = new SQLManager(this);
    }
    public SQLManager getSQLManager() { return this.sql; }
    public SignMenuFactory getSignMenuFactory() { return this.signMenuFactory; }
}
