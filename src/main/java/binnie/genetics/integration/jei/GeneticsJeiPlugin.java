package binnie.genetics.integration.jei;

import binnie.genetics.integration.jei.incubator.IncubatorRecipeCategory;
import binnie.genetics.integration.jei.incubator.IncubatorRecipeHandler;
import binnie.genetics.machine.Incubator;
import mezz.jei.api.BlankModPlugin;
import mezz.jei.api.IGuiHelper;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;

@JEIPlugin
public class GeneticsJeiPlugin extends BlankModPlugin {
    public static IJeiHelpers jeiHelpers;
    public static IGuiHelper guiHelper;

    @Override
    public void register(IModRegistry registry) {
        GeneticsJeiPlugin.jeiHelpers = registry.getJeiHelpers();
        GeneticsJeiPlugin.guiHelper = jeiHelpers.getGuiHelper();

        registry.addRecipeCategories(
                new IncubatorRecipeCategory()
        );

        registry.addRecipeHandlers(
                new IncubatorRecipeHandler()
        );

        registry.addRecipes(Incubator.getRecipes());
    }
}