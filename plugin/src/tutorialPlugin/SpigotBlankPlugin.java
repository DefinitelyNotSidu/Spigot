package tutorialPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;


public class SpigotBlankPlugin extends JavaPlugin implements Listener {

	FileConfiguration config = getConfig();
	@Override
	public void onEnable() {
		config.addDefault("youAreAwesome", true);
		config.options().copyDefaults(true);
		saveConfig();
		
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		
		if (config.getBoolean("youAreAwesome")) {
			player.sendMessage("You are awesome");
		} else {
			player.sendMessage("you are not awesome...");
		}
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("szery")) {
			sender.sendMessage("szery gej");
			return true;
		}
		return false;
	}
	

}
