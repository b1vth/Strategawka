package me.b1vth420.strategawkaItems.Data;

import me.b1vth420.strategawkaApi.Api;
import me.b1vth420.strategawkaItems.Managers.ItemManager;
import me.b1vth420.strategawkaItems.Objects.Item;
import me.b1vth420.strategawkaItems.Objects.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class MySQL {

    public static void createTable() {
        Api.getInst().getSQLManager().createTable("CREATE TABLE IF NOT EXISTS strategawkaItems(UUID varchar(36) not null, name VARCHAR(16) not null, item text not null, primary key(UUID))");
    }

    public static void saveData(User u) {
        String items = "";
        StringBuilder sb = new StringBuilder(items);
        for(Map.Entry<Item, Long> entry : u.getItemTimeHashMap().entrySet()) {
            sb.append(entry.getKey().getName().replace(" ", "_") + "/" + entry.getValue() + ";");
        }
        Api.getInst().getSQLManager().saveData("INSERT INTO strategawkaItems(uuid, name, item) VALUES (?,?,?) ON DUPLICATE KEY UPDATE name=?, item=?", new String[] {
                u.getUuid().toString(),
                u.getName(),
                sb.toString(),
                u.getName(),
                sb.toString()
        });
    }

    public static void loadData() {
        List<String> users = Api.getInst().getSQLManager().loadData("SELECT * FROM strategawkaItems");

        for(String s : users) {
            String[] ss = s.split(" ");
            HashMap<Item, Long> itemTimeHashMap = new HashMap<>();
            int i = 0;

            String[] sss = ss[2].split(";");

            for(char c : ss[2].toCharArray())
                if(c == ';') i++;

            for(int x = 0; x<i; x++) {
                String[] ssss = sss[x].split("/");
                Item ix = ItemManager.getItem(ssss[0].replace("_", " "));
                Long l = Long.parseLong(ssss[1]);
                itemTimeHashMap.put(ix, l);
            }
            new User(ss[1], UUID.fromString(ss[0]), itemTimeHashMap);
        }
    }
}
