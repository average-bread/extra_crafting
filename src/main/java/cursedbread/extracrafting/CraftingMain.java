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
			.addInput(Block.stone)
			.addInput(Block.tallgrass)
			.create("mossStone", new ItemStack(Block.mossStone, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(Block.basalt)
			.addInput(Block.tallgrass)
			.create("mossBasalt", new ItemStack(Block.mossBasalt, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(Block.limestone)
			.addInput(Block.tallgrass)
			.create("mossLimestone", new ItemStack(Block.mossLimestone, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(Block.granite)
			.addInput(Block.tallgrass)
			.create("mossGranite", new ItemStack(Block.mossGranite, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(Block.cobbleStone)
			.addInput(Block.tallgrass)
			.create("cobbleStoneMossy", new ItemStack(Block.cobbleStoneMossy, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(Block.grass)
			.addInput(Item.toolClock)
			.create("grassRetro", new ItemStack(Block.grassRetro, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(Block.saplingOak)
			.addInput(Item.toolClock)
			.create("saplingOakRetro", new ItemStack(Block.saplingOakRetro, 1));
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
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("MMM", "BRB", "MMM")
			.addInput('M', Block.cobbleStoneMossy)
			.addInput('B', Item.bone)
			.addInput('R', Block.blockRedstone)
			.create("motionsensorIdle", new ItemStack(Block.motionsensorIdle, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("MMM", "MMM", "MMM")
			.addInput('M', Block.mesh)
			.create("mobspawnerDeactivated", new ItemStack(Block.mobspawnerDeactivated, 1));

		RecipeBuilder.Furnace(MOD_ID)
			.setInput(Block.blockClay)
			.create("dirt", new ItemStack(Block.dirt, 1));
		RecipeBuilder.Furnace(MOD_ID)
			.setInput(Block.dirt)
			.create("dirtScorched", new ItemStack(Block.dirtScorched, 1));

		RecipeBuilder.Trommel(MOD_ID)
			.setInput(Item.bucketWater)
			.addEntry(new WeightedRandomLootObject(Block.spongeWet.getDefaultStack(), 0, 1), 5)
			.addEntry(new WeightedRandomLootObject(Block.algae.getDefaultStack(), 0, 10), 95)
			.create("spongeWet");
		RecipeBuilder.Trommel(MOD_ID)
			.setInput(Block.cobbleStone)
			.addEntry(new WeightedRandomLootObject(Block.gravel.getDefaultStack(), 1, 1), 1)
			.create("gravel");
		RecipeBuilder.ModifyTrommel("minecraft", "gravel")
			.addEntry(new WeightedRandomLootObject(Block.sand.getDefaultStack(), 1, 1), 100);
		RecipeBuilder.ModifyTrommel("minecraft", "sand")
			.addEntry(new WeightedRandomLootObject(Block.saplingPalm.getDefaultStack(), 1, 1), 1)
			.addEntry(new WeightedRandomLootObject(Block.sugarcane.getDefaultStack(), 1, 1), 5)
			.addEntry(new WeightedRandomLootObject(Block.cactus.getDefaultStack(), 1, 1), 5);
		RecipeBuilder.Trommel(MOD_ID)
			.setInput(Block.grass)
			.addEntry(new WeightedRandomLootObject(Item.seedsWheat.getDefaultStack(), 1, 1), 25)
			.addEntry(new WeightedRandomLootObject(Item.seedsPumpkin.getDefaultStack(), 1, 1), 25)
			.addEntry(new WeightedRandomLootObject(Block.saplingOak.getDefaultStack(), 1, 1), 6.25)
			.addEntry(new WeightedRandomLootObject(Block.saplingBirch.getDefaultStack(), 1, 1), 6.25)
			.addEntry(new WeightedRandomLootObject(Block.saplingCacao.getDefaultStack(), 1, 1), 6.25)
			.addEntry(new WeightedRandomLootObject(Block.saplingCherry.getDefaultStack(), 1, 1), 6.25)
			.addEntry(new WeightedRandomLootObject(Block.saplingEucalyptus.getDefaultStack(), 1, 1), 6.25)
			.addEntry(new WeightedRandomLootObject(Block.saplingShrub.getDefaultStack(), 1, 1), 6.25)
			.addEntry(new WeightedRandomLootObject(Block.saplingThorn.getDefaultStack(), 1, 1), 6.25)
			.addEntry(new WeightedRandomLootObject(Block.saplingPine.getDefaultStack(), 1, 1), 6.25)
			.create("grasstromelling");
	}

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(CraftingMain.MOD_ID);
		RecipeBuilder.getRecipeNamespace(CraftingMain.MOD_ID);
	}
}
