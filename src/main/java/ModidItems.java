
import net.minecraft.block.Block;
import net.minecraft.client.model.ModelLargeChest;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;

public class  ModidItems {
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    protected static void registerItemModels(ModelRegistryEvent e) {
        ITEMS.forEach(item -> registerModel(item, 0));
    }

    @SideOnly(Side.CLIENT)
    protected static void registerModel(Item item, int metadata) {
        ModelLoader.setCustomModelResourceLocation(item, metadata, new
                ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
    public static final ArrayList<Item> ITEMS = new ArrayList<>();
    public static void setItemName(Item item, String name) {
        item.setRegistryName(re.noah.worshop.WorkshopMod.MODID,name).setUnlocalizedName(re.noah.worshop.WorkshopMod.MODID + "." + name);
        ITEMS.add(item);
        }
    public static void setitemBlockName(Item item, Block block) {
        item.setRegistryName(block.getRegistryName());
        ITEMS.add(item);
        }
}