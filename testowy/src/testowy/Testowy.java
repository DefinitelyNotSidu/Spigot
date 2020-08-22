package testowy;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Testowy extends JavaPlugin {
	FileConfiguration conf = getConfig();
	@Override
	public void onEnable() {
		getCommand("test").setExecutor(new CmdExecutor());
	}
	@Override
	public void onDisable() {
		
	}
	
	
}
