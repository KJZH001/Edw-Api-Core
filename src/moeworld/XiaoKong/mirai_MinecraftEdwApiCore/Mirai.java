package moeworld.XiaoKong.mirai_MinecraftEdwApiCore;

import net.mamoe.mirai.console.plugins.Config;
import net.mamoe.mirai.console.plugins.ConfigSection;
import net.mamoe.mirai.console.plugins.ConfigSectionFactory;
import net.mamoe.mirai.console.plugins.PluginBase;
import net.mamoe.mirai.message.GroupMessage;

public class Mirai extends PluginBase {
	
	
	//���������
	public void onLoad()
	{
		super.onLoad();

	}
	//�����ʼ��
	public void onEnable() 
	 {
		//����Ⱥ��Ϣ
		this.getEventListener().subscribeAlways(GroupMessage.class, (GroupMessage event) -> {

            String messageInString = event.getMessage().toString();

            if(!messageInString.contains("#������Ϣ1")) {
            	event.getSubject().sendMessage("#������Ϣ1��������");
                return;
            }
            
            if(!messageInString.contains("#������Ϣ2")) {
            	event.getSubject().sendMessage("#������Ϣ2��������");
                return;
            }

		});
		
	 }
	 //������ر�
	 public void onDisable()
	 {
		 
	 }
	
	
}
