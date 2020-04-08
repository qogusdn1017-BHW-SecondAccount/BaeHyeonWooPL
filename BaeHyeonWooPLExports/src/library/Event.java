package library;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class Event implements Listener{

	@EventHandler
	public void onBreak(BlockBreakEvent e) {
		e.setCancelled(false);
	}
	@EventHandler
	public void onPlace(BlockPlaceEvent e) {
		e.setCancelled(false);
	}
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		p.sendMessage(ChatColor.DARK_GREEN + "Welcome to HyeonWoo Server!");
		p.sendTitle(ChatColor.GOLD + "" + e.getPlayer().getName(), ChatColor.GREEN + "Welcome :)", 1, 150, 1);
	}
}
