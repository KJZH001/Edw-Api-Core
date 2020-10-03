package moeworld.XiaoKong.mirai_MinecraftEdwApiCore;

import net.mamoe.mirai.console.plugins.Config;
import net.mamoe.mirai.console.plugins.ConfigSection;
import net.mamoe.mirai.console.plugins.ConfigSectionFactory;
import net.mamoe.mirai.console.plugins.PluginBase;
import net.mamoe.mirai.message.GroupMessage;

public class Mirai extends PluginBase {
	
	
	//插件被加载
	public void onLoad()
	{
		super.onLoad();

	}
	//插件初始化
	public void onEnable() 
	 {
		//监听群消息
		this.getEventListener().subscribeAlways(GroupMessage.class, (GroupMessage event) -> {

            String messageInString = event.getMessage().toString();

            //定义群消息指令开头
            if(messageInString.contains("..")) {
                //event.getSubject().sendMessage("#测试消息被触发了");
                return;
            }


            /*
            测试消息

            if(messageInString.contains("#测试消息1")) {
            	event.getSubject().sendMessage("#测试消息1被触发了");
                return;
            }
            
            if(messageInString.contains("#测试消息2")) {
            	event.getSubject().sendMessage("#测试消息2被触发了");
                return;
            }
             */

		});
		
	 }
	 //插件被关闭
	 public void onDisable()
	 {
		 
	 }
	
	
}
