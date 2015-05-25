package SuperDopeJediMod;

import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;


public class BaseBlock extends Block {

	public BaseBlock(Material materialIn, String unlocalizedName) {
		
		super(materialIn);
		
		//this.setMaxStackSize(64);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName(unlocalizedName);
	}
	
	
  
    


}
