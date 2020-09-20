package moeworld.XiaoKong.mirai_MinecraftEdwApiCore;

public class 权限 {
	public String 检测(String 群号,String 执行者)
	{
		if(群号.contains(全局.启用的群)&&执行者.contains(全局.管理员QQ))
		{
			return "true";
		}
		else
		{
			return "false";
		}
		
	}
	
}
