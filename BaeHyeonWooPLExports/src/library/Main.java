package library;

import java.util.Iterator;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Difficulty;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Main extends JavaPlugin {
	public void onEnable() {
		System.out.println("BaeHyeonWoo PL.\n===============\nv1.4");
		Bukkit.getPluginManager().registerEvents(new Event(), this);
	}

	public void onDisable() {
		System.out.println("Plugin Disabled.");
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("activestatus")) {
			p.sendMessage(ChatColor.GREEN + "BHW Plugin is Enabled.");
		}

		if (cmd.getName().equalsIgnoreCase("credits")) {
			p.sendMessage(
					"Creator : BaeHyeonWoo.\n====================\nv1.4\n====================\nShoutout to HappyAndJust for Fixing and edited some code to active this plugin well.");
			return false;
		}

		if (cmd.getName().equalsIgnoreCase("stop")) {
			if (p.isOp()) {
				Bukkit.shutdown();
			} else {
				p.sendMessage("This command is Disabled for some shitz.\nㅈ같은 현상을 방지하기 위해 stop명령어를 막았습니다.");
				return true;
			}

		}
		if (cmd.getName().equalsIgnoreCase("ci")) {
			if (p.isOp()) {
				p.getInventory().clear();
				p.sendMessage(ChatColor.GREEN + "Cleared your Inventory.\n인벤토리가 비워졌습니다.");
			} else {
				sender.sendMessage(ChatColor.RED + "No Administrative Previllages Founded.\n관리자 권한이 없습니다.");
			}
		}

		if (cmd.getName().equalsIgnoreCase("compass")) {
			if (p.isOp()) {
				p.getInventory().addItem(new ItemStack[] { new ItemStack(Material.COMPASS, 1) });
			} else {
				p.sendMessage(ChatColor.RED + "No Administrative Previllages Founded.\n관리자 권한이 없습니다.");
			}
		}

		if (cmd.getName().equalsIgnoreCase("nightvision")) {
			p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1000000, 255, true));
		}

		if (cmd.getName().equalsIgnoreCase("diasetpvp")) {
			if (p.isOp()) {
				p.getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
				p.getInventory().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
				p.getInventory().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
				p.getInventory().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
				p.getInventory().addItem(new ItemStack[] { new ItemStack(Material.DIAMOND_SWORD, 1) });
			} else {
				sender.sendMessage(ChatColor.RED + "No Administrative Previllages Founded.\n관리자 권한이 없습니다.");
			}
		}

		if (cmd.getName().equalsIgnoreCase("goldsetpvp")) {
			if (p.isOp()) {
				p.getInventory().setHelmet(new ItemStack(Material.GOLDEN_HELMET));
				p.getInventory().setChestplate(new ItemStack(Material.GOLDEN_CHESTPLATE));
				p.getInventory().setBoots(new ItemStack(Material.GOLDEN_BOOTS));
				p.getInventory().setLeggings(new ItemStack(Material.GOLDEN_LEGGINGS));
				p.getInventory().addItem(new ItemStack[] { new ItemStack(Material.GOLDEN_SWORD, 1) });
			} else {
				sender.sendMessage(ChatColor.RED + "No Administrative Previllages Founded.\n관리자 권한이 없습니다.");
			}
		}

		if (cmd.getName().equalsIgnoreCase("ironsetpvp")) {
			if (p.isOp()) {
				p.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
				p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
				p.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
				p.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
				p.getInventory().addItem(new ItemStack[] { new ItemStack(Material.IRON_SWORD, 1) });
			} else {
				sender.sendMessage(ChatColor.RED + "No Administrative Previllages Founded.\n관리자 권한이 없습니다.");
			}
		}

		if (cmd.getName().equalsIgnoreCase("leathersetpvp")) {
			if (p.isOp()) {
				p.getInventory().setHelmet(new ItemStack(Material.LEATHER_HELMET));
				p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
				p.getInventory().setBoots(new ItemStack(Material.LEATHER_BOOTS));
				p.getInventory().setLeggings(new ItemStack(Material.LEATHER_LEGGINGS));
				p.getInventory().addItem(new ItemStack[] { new ItemStack(Material.WOODEN_SWORD, 1) });
			} else {
				sender.sendMessage(ChatColor.RED + "No Administrative Previllages Founded.\n관리자 권한이 없습니다.");
			}
		}

		if (cmd.getName().equalsIgnoreCase("chainsetpvp")) {
			if (p.isOp()) {
				p.getInventory().setHelmet(new ItemStack(Material.CHAINMAIL_HELMET));
				p.getInventory().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
				p.getInventory().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
				p.getInventory().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
				p.getInventory().addItem(new ItemStack[] { new ItemStack(Material.STONE_SWORD, 1) });
			} else {
				sender.sendMessage(ChatColor.RED + "No Administrative Previllages Founded.\n관리자 권한이 없습니다.");
			}
		}

		if (cmd.getName().equalsIgnoreCase("god")) {
			if (p.isOp()) {
				p.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(2048.0D);
				p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1000000, 255, true));
				p.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 1000000, 255, true));
				p.addPotionEffect(new PotionEffect(PotionEffectType.CONDUIT_POWER, 1000000, 255, true));
				p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000, 255, true));
				p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1000000, 255, true));
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 1000000, 255, true));
				p.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1000000, 255, true));
				p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000, 255, true));
				p.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 1000000, 255, true));
				p.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 1000000, 255, true));
				p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 1000000, 255, true));
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1000000, 15, true));
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1000000, 255, true));
				p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 1000000, 255, true));
				p.playSound(p.getLocation(), Sound.ENTITY_WITHER_SPAWN, 100.0F, 0.0F);
			} else {
				p.sendMessage(ChatColor.RED + "No Administrative Previllages Founded.\n관리자 권한이 없습니다.");
			}
		}

		if (cmd.getName().equalsIgnoreCase("invisible")) {
			if (p.isOp()) {
				p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 1000000, 255));
			} else {
				p.sendMessage(ChatColor.RED + "No Administrative Previllages Founded.\n관리자 권한이 없습니다.");
			}
		}

		if (cmd.getName().equalsIgnoreCase("ev")) {
			if (p.isOp()) {
				p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 1000000, 255));
			} else {
				p.sendMessage(ChatColor.RED + "No Administrative Previllages Founded.\n관리자 권한이 없습니다.");
			}
		}

		if (cmd.getName().equalsIgnoreCase("godremove")) {
			if (p.isOp()) {
				p.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
				p.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
				p.removePotionEffect(PotionEffectType.CONDUIT_POWER);
				p.removePotionEffect(PotionEffectType.ABSORPTION);
				p.removePotionEffect(PotionEffectType.HEALTH_BOOST);
				p.removePotionEffect(PotionEffectType.HEAL);
				p.removePotionEffect(PotionEffectType.DOLPHINS_GRACE);
				p.removePotionEffect(PotionEffectType.FAST_DIGGING);
				p.removePotionEffect(PotionEffectType.JUMP);
				p.removePotionEffect(PotionEffectType.INVISIBILITY);
				p.removePotionEffect(PotionEffectType.REGENERATION);
				p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
				p.removePotionEffect(PotionEffectType.NIGHT_VISION);
				p.stopSound(Sound.ENTITY_WITHER_SPAWN);
			} else {
				p.sendMessage(ChatColor.RED + "No Administrative Previllages Founded.\n관리자 권한이 없습니다.");
			}
		}

		if (cmd.getName().equalsIgnoreCase("evremove")) {
			p.removePotionEffect(PotionEffectType.INVISIBILITY);
		}

		if (cmd.getName().equalsIgnoreCase("invisibilityremove")) {
			p.removePotionEffect(PotionEffectType.INVISIBILITY);
		}

		if (cmd.getName().equalsIgnoreCase("feed")) {
			if (p.isOp()) {
				p.setFoodLevel(20);
				p.sendMessage(ChatColor.GREEN + "Feeded.\n 배고픔이 채워졌습니다.");
			} else {
				sender.sendMessage(ChatColor.RED + "No Administrative Previllages Founded.\n관리자 권한이 없습니다.");
			}
		}

		if (cmd.getName().equalsIgnoreCase("heal")) {
			if(p.isOp()) {
			p.setHealth(p.getAttribute(Attribute.GENERIC_MAX_HEALTH).getBaseValue());
			p.sendMessage(ChatColor.GREEN + "Healed.\n체력이 채워졌습니다.");
		}
			else {
				p.sendMessage(ChatColor.RED + "No Administrative Previllages Founded.\n관리자 권한이 없습니다.");
			}
		}
		World w;
		Iterator<World> var7;
		if (cmd.getName().equalsIgnoreCase("spacemode")) {
			if (p.isOp()) {
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1000000, 15));
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1000000, 255));
				p.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 1000000, 254));
				p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1000000, 255));
				p.getInventory().setHelmet(new ItemStack(Material.GLASS));
				var7 = Bukkit.getServer().getWorlds().iterator();

				while (var7.hasNext()) {
					w = (World) var7.next();
					w.setTime(15000L);
				}
				p.sendMessage(ChatColor.LIGHT_PURPLE + "Houston, we have a problem.\nSpacemode is activated.");
			} else { // Sender is not op
				sender.sendMessage(ChatColor.RED + "No Administrative Previllages Founded.\n관리자 권한이 없습니다.");
			}
		}

		if (cmd.getName().equalsIgnoreCase("deactspace")) {
			if(p.hasPotionEffect(PotionEffectType.JUMP)) {
				p.removePotionEffect(PotionEffectType.JUMP);
				p.removePotionEffect(PotionEffectType.LEVITATION);
				p.removePotionEffect(PotionEffectType.NIGHT_VISION);
				p.getInventory().setHelmet(new ItemStack(Material.AIR));
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 100, 255));
				var7 = Bukkit.getServer().getWorlds().iterator();

				while (var7.hasNext()) {
					w = (World) var7.next();
					w.setTime(1000L);	
			}
		}
			p.sendMessage(ChatColor.LIGHT_PURPLE + "Spacemode is deactivated.");
		}

		if (cmd.getName().equalsIgnoreCase("giveop")) {
			if(p.isOp()) {
			p.sendMessage(ChatColor.RED + "You are already an operator.\n 당신은 이미 관리자입니다.");
			}
			else {
				p.setOp(true);
				p.sendMessage(ChatColor.GREEN + "You are now an operator.\n당신은 이제 관리자입니다.");
			}
		}

		if (cmd.getName().equalsIgnoreCase("gm") || cmd.getName().equalsIgnoreCase("gamemode")) {
			if (sender.isOp()) {

				if (args.length == 0) {
					sender.sendMessage(ChatColor.RED
							+ "Missing Arguements! Command Usage :\n/gm 0\n/gm 1\n/gm 2\n/gm 3\nor\n/gm <0,1,2,3> [Player Name]\n" + ChatColor.GREEN + "Or you can change /gm to /gamemode as your convenience. :D");

				} else if (args.length == 1) {
					GameMode gm = null;
					if (args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("survival")) {
						gm = GameMode.SURVIVAL;
						p.sendMessage("Set your own gamemode to Survival Mode.");
					}
					else if (args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("creative")) {
						gm = GameMode.CREATIVE;
						p.sendMessage("Set your own gamemode to Creative Mode.");

					} else if (args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("adventure")) {
						gm = GameMode.ADVENTURE;
						p.sendMessage("Set your own gamemode to Adventure Mode.");

					} else if (args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("spectator")) {
						gm = GameMode.SPECTATOR;
						p.sendMessage("Set your own gamemode to Spectator Mode.");

					} else {
						sender.sendMessage(ChatColor.RED
								+ "Missing Arguements! Command Usage :\n/gm 0\n/gm 1\n/gm 2\n/gm 3\nor\n/gm <0,1,2,3> [Player Name]\n" + ChatColor.GREEN + "Or you can change /gm to /gamemode as your convenience. :D");
						return false;
					}
					p.setGameMode(gm);

				} else if (args.length == 2) {
					Player target = Bukkit.getPlayer(args[1]);
					if (target != null) {
						GameMode gm = null;
						if (args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("survival")) {
							gm = GameMode.SURVIVAL;
							p.sendMessage("Set " + target.getName() + "'s gamemode to Survival Mode.");
							target.sendMessage("You gamemode has been updated to Survival Mode by " + p.getName() + ".");
							}
						else if(p == target) {
							gm = GameMode.SURVIVAL;
							p.sendMessage("Set your own gamemode to Survival Mode.");
						}
						else if (args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("creative")) {
							gm = GameMode.CREATIVE;
							p.sendMessage("Set " + target.getName() + "'s gamemode to Creative Mode.");
							target.sendMessage("You gamemode has been updated to Creative Mode by " + p.getName() + ".");
						}
						else if(p == target) {
							gm = GameMode.CREATIVE;
							p.sendMessage("Set your own gamemode to Creative Mode.");
						} else if (args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("adventure")) {
							gm = GameMode.ADVENTURE;
							p.sendMessage("Set " + target.getName() + "'s gamemode to Adventure Mode.");
							target.sendMessage(
									"You gamemode has been updated to Adventure Mode by " + p.getName() + ".");
						}
						else if(p == target) {
							gm = GameMode.ADVENTURE;
							p.sendMessage("Set your own gamemode to Adventure Mode.");

						} else if (args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("spectator")) {
							gm = GameMode.SPECTATOR;
							p.sendMessage("Set " + target.getName() + "'s gamemode to Spectator Mode.");
							target.sendMessage(
									"You gamemode has been updated to Specatator Mode by " + p.getName() + ".");
						}
						else if(p == target) {
							gm = GameMode.SPECTATOR;
							p.sendMessage("Set your own gamemode to Spectator Mode.");

						} else {
							sender.sendMessage(ChatColor.RED
									+ "Missing Arguements! Command Usage :\n/gm 0\n/gm 1\n/gm 2\n/gm 3\nor\n/gm <0,1,2,3> [Player Name]\n" + ChatColor.GREEN + "Or you can change /gm to /gamemode as your convenience. :D");
							return false;
						}
						target.setGameMode(gm);

					} else {
						sender.sendMessage(ChatColor.RED + args[1] + " isn't founded in this server!");
					}
				} else {
					sender.sendMessage(ChatColor.RED
							+ "Missing Arguements! Command Usage :\n/gm 0\n/gm 1\n/gm 2\n/gm 3\nor\n/gm <0,1,2,3> [Player Name]\n" + ChatColor.GREEN + "Or you can change /gm to /gamemode as your convenience. :D");
				}
			} else { // sender is not op
				sender.sendMessage(ChatColor.RED + "No Administrative Previllages Founded.\n관리자 권한이 없습니다.");
			}
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("difficulty")) {
			if (p.isOp()) {
				if (args.length == 0) {
					p.sendMessage(ChatColor.RED
							+ "Missing Arguements! Command Usage :\n/difficulty 0\n/difficulty 1\n/difficulty 2\n/difficulty 3");
				} else if (args.length == 1) {
					if (args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("peaceful")) {
						Bukkit.getWorld("world").setDifficulty(Difficulty.PEACEFUL);
						p.sendMessage("Difficulty set to Peaceful.\n난이도가 평화로움으로 설정되었습니다.");

					} else if (args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("easy")) {
						Bukkit.getWorld("world").setDifficulty(Difficulty.EASY);
						p.sendMessage("Difficulty set to Easy.\n난이도가 쉬움으로 설정되었습니다.");

					} else if (args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("normal")) {
						Bukkit.getWorld("world").setDifficulty(Difficulty.NORMAL);
						p.sendMessage("Difficulty set to Normal.\n난이도가 보통으로 설정되었습니다.");

					} else if (args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("hard")) {
						Bukkit.getWorld("world").setDifficulty(Difficulty.HARD);
						p.sendMessage("Difficulty set to Hard.\n난이도가 어려움으로 설정되었습니다.");

					}
				}
			} else {
				p.sendMessage(ChatColor.RED + "No Administrative Previllages Founded.\n관리자 권한이 없습니다.");
			}
		}
		return false;

	}
}
