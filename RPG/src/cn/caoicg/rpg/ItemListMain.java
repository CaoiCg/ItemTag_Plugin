package cn.caoicg.rpg;

import cn.nukkit.entity.item.EntityItem;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.entity.ItemSpawnEvent;
import cn.nukkit.item.Item;
import cn.nukkit.plugin.PluginBase;
import java.util.Map;

public class ItemListMain extends PluginBase implements Listener{

    private static ItemListMain obj = null;

    public static ItemListMain getInstance(){
        return ItemListMain.obj;
    }

    @Override
    public void onLoad() {
        ItemListMain.obj = this;

        //注册物品idMap合集
        itemListId.registerItemId();
    }

    @Override
    public void onEnable() {

        this.getServer().getPluginManager().registerEvents(this, this);
        this.getLogger().info("ItemTag正在加载，作者CaoiCg！");
        Map<String, String> map = itemListId.getMap();
        for (String value : map.values()){
            this.getLogger().info("已加载显示物品： "+value);
        }
        this.getLogger().info("ItemTag加载成功，感谢您的使用");

    }

    @EventHandler
    public void ItemSpawn(ItemSpawnEvent event){
        EntityItem entity = event.getEntity();
        Item item = entity.getItem();
        int itemId = item.getId();
        int itemZid = item.getDamage();
        int itemSl = item.getCount();

        this.getLogger().info("物品id为： "+itemId+" 子id为： "+itemZid+" 数量为"+itemSl);

        new items().item(entity, itemId, itemZid, itemSl);

    }

    //写入id
    public void writeItemListId(String key, String value){
        itemListId.put(key, value);
    }

    //重载id
    public void reloadItemId(){
        itemListId.registerItemId();
    }

    //获取ItemListMap方法
    public Map<String, String> getItemListMap(){
        return itemListId.getMap();
    }
}
