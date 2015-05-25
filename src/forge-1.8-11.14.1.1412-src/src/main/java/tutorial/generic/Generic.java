package tutorial.generic;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


@Mod(modid=Generic.MODID, name=Generic.MODNAME, version=Generic.MODVER) //Tell forge "Oh hey, there's a new mod here to load."
public class Generic //Start the class Declaration
{
    //Set the metadata of the mod.
    public static final String MODID = "generic";
    public static final String MODNAME = "Generic Mod";
    public static final String MODVER = "0.0.0";

    public static Item genericItem;
    public static Item genericIngot;
    public final static Block genericBlock = new GenericBlock(Material.ground);
    public final static Block genericDirt = new GenericBlock(Material.ground).setHardness(0.5F).setStepSound(Block.soundTypeGravel)
            .setUnlocalizedName("genericDirt").setCreativeTab(CreativeTabs.tabBlock);
    public final static Block genericOre = new GenericOre(Material.rock);
    
    @Instance(value = Generic.MODID) //Tell Forge what instance to use.
    public static Generic instance;
        
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
       	// A note on GameRegistry.registerItem ...
        // The second parameter is an unique registry identifier (not the displayed name)
        // Please don't use item1.getUnlocalizedName(), or you will make Lex sad

        genericItem = new GenericItem();
        GameRegistry.registerItem(genericItem, "genericItem");
        
        genericIngot = new GenericItem().setMaxStackSize(16).setUnlocalizedName("genericIngot"); //16, CreativeTabs.tabMisc, 1, "genericIngot");
        GameRegistry.registerItem(genericIngot, "genericIngot");
   
        GameRegistry.registerBlock(genericDirt, "genericDirt");
        GameRegistry.registerBlock(genericOre,  "genericOre");
    }
        
    
    @EventHandler
    public void load(FMLInitializationEvent event) {
    }
    
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    }
    
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
    
}