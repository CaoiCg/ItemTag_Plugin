# ItemTag_Plugin
一个用于显示物品明及数量的Nukkit插件

使用方法：放入plugins文件夹即可

目前只加入了部分物品，持续加入中

没有加入显示名字的显示为null(空)

如果里面没你想要的物品，或者rpg武器需要修改显示名字，请使用下面api进行操作

开发者API:

1.导入包 import cn.caoicg.rpg.ItemListMain;

2.插件API：

ItemListMain.getInstance().writeItemListId("295:0", "小麦"); 用于写入你想要的物品名称或修改此物品显示名称

ItemListMain.getInstance().reloadItemId(); 写入完成调用reloadItemId() 方法进行刷新

ItemListMain.getInstance().getItemListMap(); 用于返回ItemTag插件的id和物品名称map， 自行遍历map的key及value

