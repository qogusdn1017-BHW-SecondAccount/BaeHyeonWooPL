package library;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Difficulty;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.inventory.ItemStack;


public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		System.out.println("BaeHyeonWoo PL.\n===============\nv1.3");
		Bukkit.getPluginManager().registerEvents(new Event(), this);
	}
	@Override
	public void onDisable() {
		System.out.println("Plugin Disabled.");
	}
	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("activestatus")) {
			if(sender instanceof Player) {
				sender.sendMessage("BHW Plugin is Enabled.");
				return false;
			}
			sender.sendMessage("This command only works In Game.");
		}
		if(cmd.getName().equalsIgnoreCase("credits")) {
			Player p = (Player) sender;
			p.sendMessage("Creator : BaeHyeonWoo.\n====================\nv1.3\n====================\nSpeical Thanks : HappyAndJust");
			return false;
		}
		if(cmd.getName().equalsIgnoreCase("stop")) {
			Player p = (Player) sender; {
				p.sendMessage("This command is Disabled for some shitz.");
				return true;
			}
		}
		if(cmd.getName().equalsIgnoreCase("stopserver")) {
			Bukkit.shutdown();
		}
		if(cmd.getName().equalsIgnoreCase("ci")) {
			Player p = (Player) sender;
			p.getInventory().clear();
			p.sendMessage(ChatColor.GREEN + "Cleared your Inventory.");
		}
		if(cmd.getName().equalsIgnoreCase("playwait")) {
			Player p = (Player) sender;
			p.playSound(p.getLocation(), Sound.MUSIC_DISC_WAIT, 1000, 0);
		}
		if(cmd.getName().equalsIgnoreCase("stopwait")) {
			Player p = (Player) sender;
			p.stopSound(Sound.MUSIC_DISC_WAIT);
		}
		if(cmd.getName().equalsIgnoreCase("whyme99")) {
			Player p = (Player) sender;
			p.sendMessage("He is Babo.");
		}
		if(cmd.getName().equalsIgnoreCase("compass")) {
			Player p = (Player) sender;
			p.getInventory().addItem(new ItemStack(Material.COMPASS, 1));
			}
		if(cmd.getName().equalsIgnoreCase("nightvision")) {
			Player p = (Player) sender;
			p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1000000, 255, true));
		}
		if(cmd.getName().equalsIgnoreCase("diasetpvp")) {
			Player p = (Player) sender;
			p.getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
			p.getInventory().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
			p.getInventory().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
			p.getInventory().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
			p.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD, 1));
			}
		if(cmd.getName().equalsIgnoreCase("goldsetpvp")) {
			Player p = (Player) sender;
			p.getInventory().setHelmet(new ItemStack(Material.GOLDEN_HELMET));
			p.getInventory().setChestplate(new ItemStack(Material.GOLDEN_CHESTPLATE));
			p.getInventory().setBoots(new ItemStack(Material.GOLDEN_BOOTS));
			p.getInventory().setLeggings(new ItemStack(Material.GOLDEN_LEGGINGS));
			p.getInventory().addItem(new ItemStack(Material.GOLDEN_SWORD, 1));
			}
		if(cmd.getName().equalsIgnoreCase("ironsetpvp")) {
			Player p = (Player) sender;
			p.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
			p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
			p.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
			p.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
			p.getInventory().addItem(new ItemStack(Material.IRON_SWORD, 1));
			}
		if(cmd.getName().equalsIgnoreCase("leathersetpvp")) {
			Player p = (Player) sender;
			p.getInventory().setHelmet(new ItemStack(Material.LEATHER_HELMET));
			p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
			p.getInventory().setBoots(new ItemStack(Material.LEATHER_BOOTS));
			p.getInventory().setLeggings(new ItemStack(Material.LEATHER_LEGGINGS));
			p.getInventory().addItem(new ItemStack(Material.WOODEN_SWORD, 1));
			}
		if(cmd.getName().equalsIgnoreCase("chainsetpvp")) {
			Player p = (Player) sender;
			p.getInventory().setHelmet(new ItemStack(Material.CHAINMAIL_HELMET));
			p.getInventory().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
			p.getInventory().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
			p.getInventory().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
			p.getInventory().addItem(new ItemStack(Material.STONE_SWORD, 1));
			}
		if(cmd.getName().equalsIgnoreCase("god")) {
			Player p = (Player) sender;
			if(p.isOp()) {
			p.setMaxHealth(8192);
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
			p.playSound(p.getLocation(), Sound.ENTITY_WITHER_SPAWN, 100, 0);
			}
			if(!p.isOp()) {
				p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
			}
		}
		if(cmd.getName().equalsIgnoreCase("invisible")) {
			Player p = (Player) sender;
			if(p.isOp()) {
			p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 1000000, 255));
		}
			if(!p.isOp()) {
				p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
			}
		}
		if(cmd.getName().equalsIgnoreCase("ev")) {
			Player p = (Player) sender;
			if(p.isOp()) {
			p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 1000000, 255));
		}
			if(!p.isOp()) {
				p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
			}
		}
		if(cmd.getName().equalsIgnoreCase("godremove")) {
			Player p = (Player) sender;
			if(p.isOp()) {
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
		}
			if(!p.isOp()) {
				p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
			}
		}
		if(cmd.getName().equalsIgnoreCase("evremove")) {
			Player p = (Player) sender;
			p.removePotionEffect(PotionEffectType.INVISIBILITY);
		}
		if(cmd.getName().equalsIgnoreCase("invisibilityremove")) {
			Player p = (Player) sender;
			p.removePotionEffect(PotionEffectType.INVISIBILITY);
		}
		if(cmd.getName().equalsIgnoreCase("feed")) {
			Player p = (Player) sender;
			p.setFoodLevel(20);
			p.sendMessage(ChatColor.GREEN + "배고프셨나요? 배고픔을 채워드렸습니다. :D");
		}
		if(cmd.getName().equalsIgnoreCase("heal")) {
			Player p = (Player) sender;
			p.setHealth(20);
			p.sendMessage(ChatColor.GREEN + "몸과 마음이 아프시다구요? 제가 치유해드릴게요 :D");
			}
		if(cmd.getName().equalsIgnoreCase("classicduel")) {
			Player p = (Player) sender;
			p.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
			p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
			p.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
			p.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
			p.getInventory().addItem(new ItemStack(Material.IRON_SWORD, 1));
			p.getInventory().addItem(new ItemStack(Material.BOW, 1));
			p.getInventory().addItem(new ItemStack(Material.FISHING_ROD, 1));
			p.getInventory().addItem(new ItemStack(Material.FLINT_AND_STEEL, 1));
			p.getInventory().addItem(new ItemStack(Material.ARROW, 5));
		}
		if(cmd.getName().equalsIgnoreCase("spacemode")) {
				Player p = (Player) sender;
		p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1000000, 15));
		p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1000000, 255));
		p.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 1000000, 254));
		p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1000000, 255));
		p.getInventory().setHelmet(new ItemStack(Material.GLASS));
		for (World w : Bukkit.getServer().getWorlds()) {
			w.setTime(15000L);
		}
		p.sendMessage(ChatColor.LIGHT_PURPLE +"Houston, we have a problem.\nSpacemode is activated.");
		}
		if(cmd.getName().equalsIgnoreCase("deactspace")) {
			Player p = (Player) sender;
			p.removePotionEffect(PotionEffectType.JUMP);
			p.removePotionEffect(PotionEffectType.LEVITATION);
			p.removePotionEffect(PotionEffectType.NIGHT_VISION);
			p.getInventory().setHelmet(new ItemStack(Material.AIR));
			p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 100, 255));
			for (World w : Bukkit.getServer().getWorlds()) {
				w.setTime(1000L);
			}
			p.sendMessage(ChatColor.LIGHT_PURPLE +"Spacemode is deactivated.");
		}
		if(cmd.getName().equalsIgnoreCase("giveop")) {
			Player p = (Player) sender;
			if(!p.isOp()) {
				p.setOp(true);
				p.sendMessage(ChatColor.GREEN + "You are now an operator.");
			}
			if(p.isOp()) {
				p.sendMessage(ChatColor.RED + "You are already an operator.");
			}
		}
		if(cmd.getName().equalsIgnoreCase("gm")) {
			
			if(args.length == 0) {
				if(sender.isOp()) {
				sender.sendMessage(ChatColor.RED +"Missing Arguements! Command Usage :\n/gm 0\n/gm 1\n/gm 2\n/gm 3");
			}
				if(!sender.isOp()) {
					sender.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
				}
			
			else if(args[0].equalsIgnoreCase("0")) {
					
					Player p =(Player) sender;
					if(p.isOp()) {
					p.setGameMode(GameMode.SURVIVAL);
					p.sendMessage("Set your own gamemode to Survival Mode.");
				}
					if(!p.isOp()) {
						p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
					}
			}
			else if(args[0].equalsIgnoreCase("1")) {
				
				Player p =(Player) sender;
				if(p.isOp()) {
				p.setGameMode(GameMode.CREATIVE);
				p.sendMessage("Set your own gamemode to Creative Mode.");
				}
				if(!p.isOp()) {
					p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
				}
			}
			else if(args[0].equalsIgnoreCase("2")) {
				
				Player p =(Player) sender;
				if(p.isOp()) {
				p.setGameMode(GameMode.ADVENTURE);
				p.sendMessage("Set your own gamemode to Adventure Mode.");
	            }
				if(!p.isOp()) {
					p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
				}
			}
			else if(args[0].equalsIgnoreCase("3")) {
				
				Player p =(Player) sender;
				if(p.isOp()) {
				p.setGameMode(GameMode.SPECTATOR);
				p.sendMessage("Set your own gamemode to Spectator Mode.");
                }
				if(!p.isOp()) {
					p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
				}
			}
			else if(args[0].equalsIgnoreCase("survival")) {
				
				Player p =(Player) sender;
				if(p.isOp()) {
				p.setGameMode(GameMode.SURVIVAL);
				p.sendMessage("Set your own gamemode to Survival Mode.");
				}
				if(!p.isOp()) {
					p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
				}
			}
			else if(args[0].equalsIgnoreCase("creative")) {
	
					Player p =(Player) sender;
					if(p.isOp()) {
						p.setGameMode(GameMode.CREATIVE);
						p.sendMessage("Set your own gamemode to Creative Mode.");
					}
					if(!p.isOp()) {
						p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
					}
			}
			else if(args[0].equalsIgnoreCase("adventure")) {
	
				Player p =(Player) sender;
				if(p.isOp()) {
					p.setGameMode(GameMode.ADVENTURE);
					p.sendMessage("Set your own gamemode to Adventure Mode.");
				}
				if(!p.isOp()) {
					p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
				}
			}
			else if(args[0].equalsIgnoreCase("specator")) {
	
				Player p =(Player) sender;
				if(p.isOp()) {
					p.setGameMode(GameMode.SPECTATOR);
					p.sendMessage("Set your own gamemode to Spectator Mode.");
				}
				if(!p.isOp()) {
					p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
				}
			}
				return true;
			}
			if(cmd.getName().equalsIgnoreCase("difficulty")) {
			
			if(args.length == 0) {
				
				if(sender.isOp()) {
				sender.sendMessage(ChatColor.RED +"Missing Arguements! Command Usage :\n/difficulty 0\n/difficulty 1\n/difficulty 2\n/difficulty 3");
			}
				if(!sender.isOp()) {
					sender.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
				}
			
			else if(args[0].equalsIgnoreCase("0")) {
				
				Player p =(Player) sender;
				if(p.isOp()) {
				Bukkit.getWorld("world").setDifficulty(Difficulty.PEACEFUL);
				p.sendMessage("Difficulty set to Peaceful.");
				}
				if(!p.isOp()) {
					p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
				}
			}
			else if(args[0].equalsIgnoreCase("1")) {
				
				Player p =(Player) sender;
				if(p.isOp()) {
				Bukkit.getWorld("world").setDifficulty(Difficulty.EASY);
				p.sendMessage("Difficulty set to Easy.");
				}
				if(!p.isOp()) {
					p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
				}
			}
			else if(args[0].equalsIgnoreCase("2")) {
				
				Player p =(Player) sender;
				if(p.isOp()) {
				Bukkit.getWorld("world").setDifficulty(Difficulty.NORMAL);
				p.sendMessage("Difficulty set to Normal.");
				}
				if(!p.isOp()) {
					p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
				}
			}
			else if(args[0].equalsIgnoreCase("3")) {
				
				Player p =(Player) sender;
				if(p.isOp()) {
				Bukkit.getWorld("world").setDifficulty(Difficulty.HARD);
				p.sendMessage("Difficulty set to Hard.");
				}
				if(!p.isOp()) {
					p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
				}
			}
				else if(args[0].equalsIgnoreCase("peaceful")) {
					
					Player p =(Player) sender;
					if(p.isOp()) {
					Bukkit.getWorld("world").setDifficulty(Difficulty.PEACEFUL);
					p.sendMessage("Difficulty set to Peaceful.");
					}
					if(!p.isOp()) {
						p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
					}
				}
				else if(args[0].equalsIgnoreCase("easy")) {
						
				Player p =(Player) sender;
				if(p.isOp()) {
				Bukkit.getWorld("world").setDifficulty(Difficulty.EASY);
				p.sendMessage("Difficulty set to Easy.");
				}
				if(!p.isOp()) {
					p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
					}
				}
				else if(args[0].equalsIgnoreCase("normal")) {
					
					Player p =(Player) sender;
					if(p.isOp()) {
					Bukkit.getWorld("world").setDifficulty(Difficulty.NORMAL);
					p.sendMessage("Difficulty set to Normal.");
					}
					if(!p.isOp()) {
						p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
						}
					}
				else if(args[0].equalsIgnoreCase("hard")) {
					
					Player p =(Player) sender;
					if(p.isOp()) {
					Bukkit.getWorld("world").setDifficulty(Difficulty.HARD);
					p.sendMessage("Difficulty set to Hard.");
					}
					if(!p.isOp()) {
						p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
						}
					}
			return true;
			}
				return true;
			}
			if(cmd.getName().equalsIgnoreCase("gamemode")) {
				
				if(args.length == 0) {
					if(sender.isOp()) {
					sender.sendMessage(ChatColor.RED +"Missing Arguements! Command Usage :\n/gm 0\n/gm 1\n/gm 2\n/gm 3");
				}
					if(!sender.isOp()) {
						sender.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
					}
				else if(args[0].equalsIgnoreCase("0")) {
						
						Player p =(Player) sender;
						if(p.isOp()) {
						p.setGameMode(GameMode.SURVIVAL);
						p.sendMessage("Set your own gamemode to Survival Mode.");
						}
						if(!p.isOp()) {
							p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
						}
					}
				else if(args[0].equalsIgnoreCase("1")) {
					
					Player p =(Player) sender;
					if(p.isOp()) {
					p.setGameMode(GameMode.CREATIVE);
					p.sendMessage("Set your own gamemode to Creative Mode.");
					}
					if(!p.isOp()) {
						p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
					}
				}
				else if(args[0].equalsIgnoreCase("2")) {
					
					Player p =(Player) sender;
					if(p.isOp()) {
					p.setGameMode(GameMode.ADVENTURE);
					p.sendMessage("Set your own gamemode to Adventure Mode.");
					}
					if(!p.isOp()) {
						p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
					}
		        }
				else if(args[0].equalsIgnoreCase("3")) {
					
					Player p =(Player) sender;
					if(p.isOp()) {
					p.setGameMode(GameMode.SPECTATOR);
					p.sendMessage("Set your own gamemode to Spectator Mode.");
					}
					if(!p.isOp()) {
						p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
					}
	            }
				else if(args[0].equalsIgnoreCase("survival")) {
					
					Player p =(Player) sender;
					if(p.isOp()) {
					p.setGameMode(GameMode.SURVIVAL);
					p.sendMessage("Set your own gamemode to Survival Mode.");
					}
					if(!p.isOp()) {
						p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
					}
				}
				else if(args[0].equalsIgnoreCase("creative")) {
					
					Player p =(Player) sender;
					if(p.isOp()) {
					p.setGameMode(GameMode.CREATIVE);
					p.sendMessage("Set your own gamemode to Creative Mode.");
					}
					if(!p.isOp()) {
						p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
					}
				}
				else if(args[0].equalsIgnoreCase("adventure")) {
					
					Player p =(Player) sender;
					if(p.isOp()) {
					p.setGameMode(GameMode.ADVENTURE);
					p.sendMessage("Set your own gamemode to Adventure Mode.");
					}
					if(!p.isOp()) {
						p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
					}
				}
				else if(args[0].equalsIgnoreCase("spectator")) {
					
					Player p =(Player) sender;
					if(p.isOp()) {
					p.setGameMode(GameMode.SPECTATOR);
					p.sendMessage("Set your own gamemode to Spectator Mode.");
					}
					if(!p.isOp()) {
						p.sendMessage(ChatColor.RED + "No Administrative Previllages founded.");
					}
				}
					return true;
					}
				return false;
				}
			
			}
		return false;
	}
}