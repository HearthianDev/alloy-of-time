package net.HearthianDev.alloyOfTime;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.text.Text;

import static net.HearthianDev.alloyOfTime.AlloyOfTime.DEBUG_LOG;

public class AlloyOfTimeClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.

		ClientPlayNetworking.registerGlobalReceiver(DEBUG_LOG, (client, handler, buf, responseSender) -> client.execute(() -> {
			assert client.player != null;
			client.player.sendMessage(Text.literal("[DEBUG] metal " + buf.readInt()));
			client.player.sendMessage(Text.literal("[DEBUG] awakening " + buf.readBoolean()));
		}));
	}
}