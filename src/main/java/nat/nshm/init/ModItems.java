package nat.nshm.init;


import nat.nshm.items.ItemCarbonFiberMesh;
import nat.nshm.items.ItemDwarfStarIngot;
import nat.nshm.items.ItemDwarfStarTippedArrow;
import nat.nshm.items.ItemIonizedPalladiumIngot;
import nat.nshm.items.ItemIronRod;
import nat.nshm.items.ItemModArmor;
import nat.nshm.items.ItemModArrowArmor;
import nat.nshm.items.ItemModAxe;
import nat.nshm.items.ItemModHoe;
import nat.nshm.items.ItemModPickAxe;
import nat.nshm.items.ItemModShovel;
import nat.nshm.items.ItemModSword;
import nat.nshm.items.ItemPalladiumIngot;
import nat.nshm.items.ItemQuantumSplicer;
import nat.nshm.items.ItemSteelIngot;
import nat.nshm.items.ItemUnstableDwarfStarIngot;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {


	//Items
	public static Item DwarfStarIngot;
	public static Item UnstableDwarfStarIngot;
	public static Item CarbonFiberMesh;
	public static Item PalladiumIngot;
	public static Item SteelIngot;
	public static Item IonizedPalladiumIngot;
	public static Item DwarfStarTippedArrow;
	public static Item IronRod;
	public static Item QuantumSplicer;

	//Tools Dwarf-Star
	public static ToolMaterial DwarfStarTool = EnumHelper.addToolMaterial("DwarfStarTool", 3, 2000, 15.0f, 6.0f, 64);
	public static Item dwarfstar_axe;
	public static Item dwarfstar_shovel;
	public static Item dwarfstar_pickaxe;
	public static Item dwarfstar_hoe;
	public static Item dwarfstar_sword;
	
	//Palladium Tools
	public static ToolMaterial PalladiumTool = EnumHelper.addToolMaterial("PalladiumTool", 2, 1500, 7.0f, 5.0f, 64);
	public static Item palladium_axe;
	public static Item palladium_shovel;
	public static Item palladium_pickaxe;
	public static Item palladium_hoe;
	public static Item palladium_sword;
	
	//Armor Dwarf-Star
	public static ArmorMaterial DwarfStarArmor = EnumHelper.addArmorMaterial("DwarfStarArmor", "nshm:DwarfStar", 60, new int[]{4,9,6,3} , 64, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, (float) 9.0);
	public static Item dwarfstar_helmet;
	public static Item dwarfstar_chestplate;
	public static Item dwarfstar_leggings;
	public static Item dwarfstar_boots;
	
	//Palaldium Armor
	public static ArmorMaterial PalladiumArmor = EnumHelper.addArmorMaterial("PalladiumArmor", "nshm:Palladium", 60, new int[]{3,7,5,3} , 64, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, (float) 2.0);
	public static Item palladium_helmet;
	public static Item palladium_chestplate;
	public static Item palladium_leggings;
	public static Item palladium_boots;
	
	//Carbon Fiber Armor
	public static ArmorMaterial CarbonArmor = EnumHelper.addArmorMaterial("CarbonArmor", "nshm:Carbon", 60, new int[]{2,2,1,2} , 64, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, (float) 1.0);
	public static Item carbon_helmet;
	public static Item carbon_chestplate;
	public static Item carbon_leggings;
	public static Item carbon_boots;
	
	//Arrow Armor
	public static ArmorMaterial ArrowArmor = EnumHelper.addArmorMaterial("ArrowArmor", "nshm:Arrow", 60, new int[]{3,4,4,4} , 64, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, (float) 2.0);
	public static Item arrow_helmet;
	public static Item arrow_chestplate;
	public static Item arrow_leggings;
	public static Item arrow_boots;




	public static void init(){
		DwarfStarIngot = new ItemDwarfStarIngot();
		UnstableDwarfStarIngot = new ItemUnstableDwarfStarIngot();
		DwarfStarTippedArrow = new ItemDwarfStarTippedArrow();
		QuantumSplicer = new ItemQuantumSplicer();
		IronRod = new ItemIronRod();
		CarbonFiberMesh = new ItemCarbonFiberMesh();
		PalladiumIngot = new ItemPalladiumIngot();
		SteelIngot = new ItemSteelIngot();
		IonizedPalladiumIngot = new ItemIonizedPalladiumIngot();
	}
	public static void register(){
		//Items
		GameRegistry.register(DwarfStarIngot);
		GameRegistry.register(UnstableDwarfStarIngot);
		GameRegistry.register(QuantumSplicer);
		GameRegistry.register(CarbonFiberMesh);
		GameRegistry.register(PalladiumIngot);
		GameRegistry.register(IronRod);
		GameRegistry.register(SteelIngot);
		GameRegistry.register(DwarfStarTippedArrow);
		
		//Dwarf-Star Tools
		GameRegistry.register(IonizedPalladiumIngot);
		GameRegistry.registerItem(dwarfstar_axe = new ItemModAxe("dwarfstar_axe", DwarfStarTool), dwarfstar_axe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(dwarfstar_pickaxe = new ItemModPickAxe("dwarfstar_pickaxe", DwarfStarTool), dwarfstar_pickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(dwarfstar_shovel = new ItemModShovel("dwarfstar_shovel", DwarfStarTool), dwarfstar_shovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(dwarfstar_hoe = new ItemModHoe("dwarfstar_hoe", DwarfStarTool), dwarfstar_hoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(dwarfstar_sword = new ItemModSword("dwarfstar_sword", DwarfStarTool), dwarfstar_sword.getUnlocalizedName().substring(5));

		//Palladium Tools
		GameRegistry.registerItem(palladium_axe = new ItemModAxe("palladium_axe", PalladiumTool), palladium_axe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(palladium_pickaxe = new ItemModPickAxe("palladium_pickaxe", PalladiumTool), palladium_pickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(palladium_shovel = new ItemModShovel("palladium_shovel", PalladiumTool), palladium_shovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(palladium_hoe = new ItemModHoe("palladium_hoe", PalladiumTool), palladium_hoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(palladium_sword = new ItemModSword("palladium_sword", PalladiumTool), palladium_sword.getUnlocalizedName().substring(5));

		//Dwarf-Star Armor
		GameRegistry.registerItem(dwarfstar_helmet = new ItemModArmor("dwarfstar_helmet", DwarfStarArmor, 1, EntityEquipmentSlot.HEAD), dwarfstar_helmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(dwarfstar_chestplate = new ItemModArmor("dwarfstar_chestplate", DwarfStarArmor, 1, EntityEquipmentSlot.CHEST), dwarfstar_chestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(dwarfstar_leggings = new ItemModArmor("dwarfstar_leggings", DwarfStarArmor, 1, EntityEquipmentSlot.LEGS), dwarfstar_leggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(dwarfstar_boots = new ItemModArmor("dwarfstar_boots", DwarfStarArmor, 1, EntityEquipmentSlot.FEET), dwarfstar_boots.getUnlocalizedName().substring(5));
	
		//Paladium Armor
		GameRegistry.registerItem(palladium_helmet = new ItemModArmor("palladium_helmet", PalladiumArmor, 1, EntityEquipmentSlot.HEAD), palladium_helmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(palladium_chestplate = new ItemModArmor("palladium_chestplate", PalladiumArmor, 1, EntityEquipmentSlot.CHEST), palladium_chestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(palladium_leggings = new ItemModArmor("palladium_leggings", PalladiumArmor, 1, EntityEquipmentSlot.LEGS), palladium_leggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(palladium_boots = new ItemModArmor("palladium_boots", PalladiumArmor, 1, EntityEquipmentSlot.FEET), palladium_boots.getUnlocalizedName().substring(5));
	
		//Carbon Fiber Armor
		GameRegistry.registerItem(carbon_helmet = new ItemModArmor("carbon_helmet", CarbonArmor, 1, EntityEquipmentSlot.HEAD), carbon_helmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(carbon_chestplate = new ItemModArmor("carbon_chestplate", CarbonArmor, 1, EntityEquipmentSlot.CHEST), carbon_chestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(carbon_leggings = new ItemModArmor("carbon_leggings", CarbonArmor, 1, EntityEquipmentSlot.LEGS), carbon_leggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(carbon_boots = new ItemModArmor("carbon_boots", CarbonArmor, 1, EntityEquipmentSlot.FEET), carbon_boots.getUnlocalizedName().substring(5));
	
		//Arrow Armor
		GameRegistry.registerItem(arrow_helmet = new ItemModArrowArmor("arrow_helmet", ArrowArmor, 1, EntityEquipmentSlot.HEAD), arrow_helmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(arrow_chestplate = new ItemModArrowArmor("arrow_chestplate", ArrowArmor, 1, EntityEquipmentSlot.CHEST), arrow_chestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(arrow_leggings = new ItemModArrowArmor("arrow_leggings", ArrowArmor, 1, EntityEquipmentSlot.LEGS), arrow_leggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(arrow_boots = new ItemModArrowArmor("arrow_boots", ArrowArmor, 1, EntityEquipmentSlot.FEET), arrow_boots.getUnlocalizedName().substring(5));



	}
	public static void registerRenders(){
		//Items
		registerRender(DwarfStarIngot);
		registerRender(UnstableDwarfStarIngot);
		registerRender(DwarfStarTippedArrow);
		registerRender(QuantumSplicer);
		registerRender(CarbonFiberMesh);
		registerRender(PalladiumIngot);
		registerRender(SteelIngot);
		registerRender(IronRod);
		registerRender(IonizedPalladiumIngot);
		
		//Armor Dwarf-Star
		registerRender(dwarfstar_helmet);
		registerRender(dwarfstar_chestplate);
		registerRender(dwarfstar_leggings);
		registerRender(dwarfstar_boots);
		
		//Armor Palladium
		registerRender(palladium_helmet);
		registerRender(palladium_chestplate);
		registerRender(palladium_leggings);
		registerRender(palladium_boots);
		
		//Tools Dwarf-Star
		registerRender(dwarfstar_hoe);
		registerRender(dwarfstar_shovel);
		registerRender(dwarfstar_pickaxe);
		registerRender(dwarfstar_axe);
		registerRender(dwarfstar_sword);
		
		//Tools Palladium
		registerRender(palladium_hoe);
		registerRender(palladium_shovel);
		registerRender(palladium_pickaxe);
		registerRender(palladium_axe);
		registerRender(palladium_sword);
		
		//Armor Carbon Fiber
		registerRender(carbon_helmet);
		registerRender(carbon_chestplate);
		registerRender(carbon_leggings);
		registerRender(carbon_boots);
		
		//Armor Carbon Fiber
		registerRender(arrow_helmet);
		registerRender(arrow_chestplate);
		registerRender(arrow_leggings);
		registerRender(arrow_boots);
		
	}

	private static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
