package cn.caoicg.rpg;


import cn.nukkit.entity.item.EntityItem;
import java.util.concurrent.ThreadLocalRandom;

public class items extends ItemListMain{
    public void item(EntityItem itemEntity, int id, int Zid, int count){
        this.setNT(itemEntity, count, itemListId.getMapValue(id+":"+Zid));
    }

    //私有的设置nametag方法
    private void setNT(EntityItem itemEntity, int count, String name){
        String[] colorArray = {"§2","§3","§4","§5","§6","§7","§8","§a","§b","§c","§d","§e","§f"};
        ThreadLocalRandom localRandom = ThreadLocalRandom.current();
        int colorInt = localRandom.nextInt(0, 12);
        String color = colorArray[colorInt];

        itemEntity.setNameTag("§l"+color+count+"个"+name);
        itemEntity.setNameTagVisible(true);
        itemEntity.setNameTagAlwaysVisible(true);
    }

}
