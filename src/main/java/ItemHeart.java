package nat.nshm.items;

import nat.nshm.Reference;
import nat.nshm.SuperHero;
import net.minecraft.item.Item;

public class ItemHeart extends Item {

	public ItemHeart() {
		setUnlocalizedName(Reference.SuperHeroItems.HEART.getUnlocalizedName());
		setRegistryName(Reference.SuperHeroItems.HEART.getRegistryName());
		setCreativeTab(SuperHero.CREATIVE_Tab);
	}

}
