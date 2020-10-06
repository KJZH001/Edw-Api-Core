package moeworld.XiaoKong.mirai_MinecraftEdwApiCore;

public class 权限 {
	public boolean 群管理员(String 群号,String 执行者)
	{
		if(群号.contains(全局.启用的群)&&执行者.contains(全局.管理员QQ))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public boolean 管理员(String 执行者)
	{
		if(执行者.contains(全局.管理员QQ))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean 启用群(String 群号)
	{
		if(群号.contains(全局.启用的群))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	
}
