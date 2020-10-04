package moeworld.XiaoKong.mirai_MinecraftEdwApiCore;

import net.kronos.rkon.core.Rcon;
import net.kronos.rkon.core.ex.*;

import net.mamoe.mirai.console.plugins.PluginBase;
import net.mamoe.mirai.message.GroupMessage;

import java.io.IOException;

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
            	//获取发信者的qq
                Long QQsender=event.getSender().getId();
                //event.getSubject().sendMessage(QQsender+"触发了测试的消息指令头");

				//尝试远程连接
				try {
					Rcon rcon = new Rcon(全局.远程地址, 全局.端口, 全局.密码.getBytes());
					//匹配内容
					String contant=messageInString;
					contant=contant.substring(contant.indexOf("]")+1);

                    if(全局.调试)
                    {
                        event.getSubject().sendMessage("捕获到的内容为：\n"+messageInString+
                                "\n截取到的内容为：\n"+contant);
                    }


					正则匹配 zz=new 正则匹配();
					contant=zz.match(contant,QQsender);

					if(contant.equals("结束控制台"))
					{
						event.getSubject().sendMessage("控制台已经成功关闭！");
					}
					else if(contant.equals("未匹配到内容！"))
					{
                        if(全局.调试)
                        {
                            event.getSubject().sendMessage("您输入的指令有误！请重新输入！");
                        }
					}
					else
					{
                        if(全局.调试)
                        {
                            event.getSubject().sendMessage("传入的指令为：\n"+contant);
                        }
						String result = rcon.command(contant);
						// 输出结果
						event.getSubject().sendMessage(result);
					}
				} catch (IOException e) {
					e.printStackTrace();
				} catch (AuthenticationException e) {
					e.printStackTrace();
				}
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
