package net.maketendo.ben_ten.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.maketendo.ben_ten.Ben10Mod;

import java.util.function.Supplier;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Ben10ModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		Ben10Mod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.OmnitrixTimedOut = original.OmnitrixTimedOut;
			clone.OmnitrixEnabled = original.OmnitrixEnabled;
			clone.OmnitrixWorn = original.OmnitrixWorn;
			clone.OmnitrixSlotSelection = original.OmnitrixSlotSelection;
			clone.OmnitrixDialAnimation = original.OmnitrixDialAnimation;
			clone.OmnitrixAlien = original.OmnitrixAlien;
			clone.OmnitrixUpgradeAlienTitles = original.OmnitrixUpgradeAlienTitles;
			clone.OmnitrixTransformed = original.OmnitrixTransformed;
			clone.OmniEnergy = original.OmniEnergy;
			if (!event.isWasDeath()) {
			}
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("ben_10", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public boolean OmnitrixTimedOut = false;
		public boolean OmnitrixEnabled = false;
		public boolean OmnitrixWorn = false;
		public double OmnitrixSlotSelection = 0.0;
		public double OmnitrixDialAnimation = 0;
		public String OmnitrixAlien = "\"\"";
		public boolean OmnitrixUpgradeAlienTitles = false;
		public boolean OmnitrixTransformed = false;
		public double OmniEnergy = 100.0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				Ben10Mod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(entity.level()::dimension), new PlayerVariablesSyncMessage(this, entity.getId()));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("OmnitrixTimedOut", OmnitrixTimedOut);
			nbt.putBoolean("OmnitrixEnabled", OmnitrixEnabled);
			nbt.putBoolean("OmnitrixWorn", OmnitrixWorn);
			nbt.putDouble("OmnitrixSlotSelection", OmnitrixSlotSelection);
			nbt.putDouble("OmnitrixDialAnimation", OmnitrixDialAnimation);
			nbt.putString("OmnitrixAlien", OmnitrixAlien);
			nbt.putBoolean("OmnitrixUpgradeAlienTitles", OmnitrixUpgradeAlienTitles);
			nbt.putBoolean("OmnitrixTransformed", OmnitrixTransformed);
			nbt.putDouble("OmniEnergy", OmniEnergy);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			OmnitrixTimedOut = nbt.getBoolean("OmnitrixTimedOut");
			OmnitrixEnabled = nbt.getBoolean("OmnitrixEnabled");
			OmnitrixWorn = nbt.getBoolean("OmnitrixWorn");
			OmnitrixSlotSelection = nbt.getDouble("OmnitrixSlotSelection");
			OmnitrixDialAnimation = nbt.getDouble("OmnitrixDialAnimation");
			OmnitrixAlien = nbt.getString("OmnitrixAlien");
			OmnitrixUpgradeAlienTitles = nbt.getBoolean("OmnitrixUpgradeAlienTitles");
			OmnitrixTransformed = nbt.getBoolean("OmnitrixTransformed");
			OmniEnergy = nbt.getDouble("OmniEnergy");
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		Ben10Mod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	public static class PlayerVariablesSyncMessage {
		private final int target;
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
			this.target = buffer.readInt();
		}

		public PlayerVariablesSyncMessage(PlayerVariables data, int entityid) {
			this.data = data;
			this.target = entityid;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
			buffer.writeInt(message.target);
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.level().getEntity(message.target).getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.OmnitrixTimedOut = message.data.OmnitrixTimedOut;
					variables.OmnitrixEnabled = message.data.OmnitrixEnabled;
					variables.OmnitrixWorn = message.data.OmnitrixWorn;
					variables.OmnitrixSlotSelection = message.data.OmnitrixSlotSelection;
					variables.OmnitrixDialAnimation = message.data.OmnitrixDialAnimation;
					variables.OmnitrixAlien = message.data.OmnitrixAlien;
					variables.OmnitrixUpgradeAlienTitles = message.data.OmnitrixUpgradeAlienTitles;
					variables.OmnitrixTransformed = message.data.OmnitrixTransformed;
					variables.OmniEnergy = message.data.OmniEnergy;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
