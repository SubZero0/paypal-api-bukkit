package paypalnvp.bukkit;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	@Override
    public void onEnable() {
		getLogger().info("Enabling PayPal NVP (V"+getDescription().getVersion()+") - Author: http://paypal-nvp.sourceforge.net/ & SubZero0");
	}
	
	@Override
    public void onDisable() {
    	getLogger().info("Disabling PayPal NVP - Author: http://paypal-nvp.sourceforge.net/ & SubZero0");
    }
}
