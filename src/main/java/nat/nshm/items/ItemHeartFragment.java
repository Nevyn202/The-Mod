package nat.nshm.items;

import nat.nshm.Reference;
import nat.nshm.SuperHero;
import net.minecraft.item.Item;

public class ItemHeartFragment extends Item {

	public ItemHeartFragment() {
		setUnlocalizedName(Reference.SuperHeroItems.HEARTFRAGMENT.getUnlocalizedName());
		setRegistryName(Reference.SuperHeroItems.HEARTFRAGMENT.getRegistryName());
		setCreativeTab(SuperHero.CREATIVE_Tab);
	}

}
