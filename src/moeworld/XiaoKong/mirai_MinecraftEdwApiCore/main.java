/* 
 * Copyright (c) 2018-2020 晓空 All rights reserved.
 * 基于Mirai框架开发的 空梦世界 Minecraft 服务器 Api 核心
 */


package moeworld.XiaoKong.mirai_MinecraftEdwApiCore;

import java.io.IOException;
import java.util.Scanner;

import net.kronos.rkon.core.Rcon;
import net.kronos.rkon.core.ex.AuthenticationException;

public class main {
	
	public static void main(String[] args) throws IOException, AuthenticationException
	{
	System.out.println("请注意，这是一个Mirai console插件" +
			"您现在直接启动了用于开发的调试模式，这并不能起到机器人的作用" +
			"如果这不是您想要的结果，请关闭它，然后将它放入到mirai console的插件目录中" +
			"并从Mirai启动它");
	System.out.println("空梦世界Api核心正在启动...\n请稍后...");
	
	try {
		System.out.println("正在尝试创建RCON连接...");
		//创建连接
		Rcon rcon = new Rcon(全局.远程地址, 全局.端口, 全局.密码.getBytes());
		//获取输入
		Scanner 输入=new Scanner(System.in);
		while(true)
		{
			System.out.println("请输入要执行的指令：");
			String contant=输入.nextLine();
			正则匹配 zz=new 正则匹配();
			contant=zz.match(contant);
			//权限检查
			
			//System.out.println("你输入的是:"+contant);
			if(contant.equals("结束控制台"))
			{
				System.out.println("控制台已经成功关闭！");
				//结束循环
				break;
			}
			else if(contant.equals("未匹配到内容！"))
			{
				System.out.println("您输入的指令有误！请重新输入！");
			}
			else
			{
				String result = rcon.command(contant);
				// 输出结果
				System.out.println(result);
			}
		}
		//关闭输入
		输入.close();
		
	}
	catch(Exception e)
	{
		//连接失败
		System.out.print("发生了意外的错误！无法与Minecraft服务器控制台正常通讯！\n"
				+ "请检查您填写的参数是否正确！");
	}
	}
}
