package de.artemis.flowerpots.common.data;

import de.artemis.flowerpots.FlowerPots;
import de.artemis.flowerpots.common.registration.Registration;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.PoiTypeTags;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;

public class PoiTypeTagsProvider extends net.minecraft.data.tags.PoiTypeTagsProvider {

    public PoiTypeTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, FlowerPots.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        TagsProvider.TagAppender<PoiType> appender = tag(PoiTypeTags.ACQUIRABLE_JOB_SITE);
        Registration.POI_TYPES.getEntries().stream().map(RegistryObject::getKey).filter(Objects::nonNull).forEach(appender::add);
    }

    @NotNull
    @Override
    public String getName() {
        return "Poi Type Tags";
    }
}
