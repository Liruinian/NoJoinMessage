package com.timlrn2016.nojoinmessage;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main
  extends JavaPlugin
  implements Listener
{
  public void onEnable()
  {
	  Bukkit.getServer().getConsoleSender().sendMessage("§2[消除进入提醒]成功加载消除进入提醒插件 Made By Tim_LRN2016");
  }
  
  @EventHandler
  public void onJoin(PlayerJoinEvent e)
  {
    e.setJoinMessage(null);
  }
  
  @EventHandler
  public void onQuit(PlayerQuitEvent e)
  {
    e.setQuitMessage(null);
  }
  
  @EventHandler
  public void onKick(PlayerKickEvent e)
  {
    e.setLeaveMessage(null);
  }
}