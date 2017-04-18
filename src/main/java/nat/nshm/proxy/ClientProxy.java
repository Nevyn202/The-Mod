package nat.nshm.proxy;

import nat.nshm.init.ModBlocks;
import nat.nshm.init.ModItems;

public class ClientProxy implements CommonProxy{

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		
	}

}
