package cursedbread.extracrafting;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.WeightedRandomLootObject;
import net.minecraft.core.block.Block;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;


public class CraftingMain implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
    public static final String MOD_ID = "extracrafting";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
    public void onInitialize() {
        LOGGER.info("What");
    }

	@Override
	public void beforeGameStart() {

	}

	@Override
	public void afterGameStart() {

	}

	@Override
	public void onRecipesReady() {
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(Block.brickStonePolished)
			.addInput(Block.tallgrass)
			.create("brickStonePolishedMossy", new ItemStack(Block.brickStonePolishedMossy, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(Block.cobbleStone)
			.addInput(Block.tallgrass)
			.create("cobbleStoneMossy", new ItemStack(Block.cobbleStoneMossy, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(Block.grass)
			.addInput(Item.toolClock)
			.create("grassRetro", new ItemStack(Block.grassRetro, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(Block.dirtScorched)
			.addInput(Item.oreRawGold)
			.addInput(Item.oreRawIron)
			.addInput(Item.olivine)
			.addInput(Item.ammoPebble)
			.addInput(Item.clay)
			.addInput(Item.dye, 4)
			.addInput(Item.quartz)
			.create("dirtScorchedRich", new ItemStack(Block.dirtScorchedRich, 1));

		RecipeBuilder.Shaped(MOD_ID)
			.setShape("PI", "IP")
			.addInput('P', Item.ammoPebble)
			.addInput('I', Block.ice)
			.create("cobblePermafrost", new ItemStack(Block.cobblePermafrost, 1));

		RecipeBuilder.Furnace(MOD_ID)
			.setInput(Block.blockClay)
			.create("dirt", new ItemStack(Block.dirt, 1));
		RecipeBuilder.Furnace(MOD_ID)
			.setInput(Block.dirt)
			.create("dirtScorched", new ItemStack(Block.dirtScorched, 1));

		RecipeBuilder.Trommel(MOD_ID)
			.setInput(Item.bucketWater)
			.addEntry(new WeightedRandomLootObject(Block.spongeWet.getDefaultStack(), 0, 1), 5)
			.create("spongeWet");
	}

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(CraftingMain.MOD_ID);
		RecipeBuilder.getRecipeNamespace(CraftingMain.MOD_ID);
	}
}
