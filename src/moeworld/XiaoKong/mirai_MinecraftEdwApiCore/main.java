/* 
 * Copyright (c) 2018-2020 ���� All rights reserved.
 * ����Mirai��ܿ����� �������� Minecraft ������ Api ����
 */


package moeworld.XiaoKong.mirai_MinecraftEdwApiCore;

import java.io.IOException;
import java.util.Scanner;

import net.kronos.rkon.core.Rcon;
import net.kronos.rkon.core.ex.AuthenticationException;

public class main {
	
	public static void main(String[] args) throws IOException, AuthenticationException
	{
	
	System.out.println("��������Api������������...\n���Ժ�...");
	
	try {
		System.out.println("���ڳ��Դ���RCON����...");
		//��������
		Rcon rcon = new Rcon(ȫ��.Զ�̵�ַ, ȫ��.�˿�, ȫ��.����.getBytes());
		//��ȡ����
		Scanner ����=new Scanner(System.in);
		while(true)
		{
			System.out.println("������Ҫִ�е�ָ�");
			String contant=����.nextLine();
			����ƥ�� zz=new ����ƥ��();
			contant=zz.match(contant);
			//System.out.println("���������:"+contant);
			if(contant.equals("����"))
			{
				System.out.println("����̨�Ѿ��ɹ��رգ�");
				//����ѭ��
				break;
			}
			else
			{
				String result = rcon.command(contant);
				// ������
				System.out.println(result);
			}
		}
		//�ر�����
		����.close();
		
	}
	catch(Exception e)
	{
		//����ʧ��
		System.out.print("����������Ĵ����޷���Minecraft����������̨����ͨѶ��\n"
				+ "��������д�Ĳ����Ƿ���ȷ��");
	}
	}
}
