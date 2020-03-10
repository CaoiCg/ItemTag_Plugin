package cn.caoicg.itemtag;

import cn.caoicg.rpg.ItemListMain;
import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase implements Listener {
    @Override
    public void onEnable() {
        this.getLogger().info("api插件加载成功");
        ItemListMain.getInstance().writeItemListId("295:0", "小麦");
        ItemListMain.getInstance().reloadItemId();
    }
}
