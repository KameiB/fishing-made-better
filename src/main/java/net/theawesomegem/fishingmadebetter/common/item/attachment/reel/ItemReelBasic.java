package net.theawesomegem.fishingmadebetter.common.item.attachment.reel;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemReelBasic extends ItemReel {

	public ItemReelBasic() {
		super("reel_basic", 0, 40, 2);
		this.setMaxStackSize(16);
	}

	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(TextFormatting.DARK_RED + I18n.format("tooltip.fishingmadebetter.reel_basic") + TextFormatting.RESET);
    }
}
