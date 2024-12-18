package net.TotemHack;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.item.Items;

public class Hack implements ClientModInitializer {

    @Override
    public void onInitializeClient() {


        ClientPlayerEntity player = MinecraftClient.getInstance().player;
        PlayerInventory inventory = player.getInventory();
        Item Totem = Items.TOTEM_OF_UNDYING;

        for (int i = 0; i < inventory.main.size(); i++){
            ItemStack stack = inventory.main.get(i);
            if (stack.getItem() == Totem) {
                ItemStack OffHand = player.getOffHandStack();
                if (OffHand.isEmpty())
                {
                    inventory.offHand.set(i,stack );
                }
                else
                {

                }

            }

        }
    }
}