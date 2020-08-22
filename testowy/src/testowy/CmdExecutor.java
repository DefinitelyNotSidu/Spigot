package testowy;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import java.util.concurrent.TimeUnit;


public class CmdExecutor implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("test")) {
			Player player = (Player) sender;
			
			player.playSound(player.getLocation(), Sound.ENTITY_CREEPER_PRIMED, 100, 0);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			player.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 100, 0);
			player.damage(10);
			return true;
			
		} 
		return false;
	}
	
}
