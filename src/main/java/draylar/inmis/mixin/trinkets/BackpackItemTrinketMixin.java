package draylar.inmis.mixin.trinkets;

import dev.emi.trinkets.api.SlotGroups;
import dev.emi.trinkets.api.Slots;
import dev.emi.trinkets.api.Trinket;
import draylar.inmis.content.BackpackItem;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(BackpackItem.class)
public abstract class BackpackItemTrinketMixin extends Item implements Trinket {
    public BackpackItemTrinketMixin(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canWearInSlot(String group, String slot) {
        return group.equals(SlotGroups.CHEST) && slot.equals(Slots.BACKPACK);
    }
}
