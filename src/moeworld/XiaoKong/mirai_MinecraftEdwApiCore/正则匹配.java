package moeworld.XiaoKong.mirai_MinecraftEdwApiCore;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ����ƥ�� {
	//������
    public static void main( String args[] )
    {
    	 
        // ��ָ��ģʽ���ַ�������
        String line = "#ִ�� help 2";
        String pattern = "^#ִ�� [\\w+\\s]+";
   
        // ���� Pattern ����
        Pattern r = Pattern.compile(pattern);
   
        // ���ڴ��� matcher ����
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            String ����=m.group(0).substring(4);
            System.out.println("��ȡ��������Ϊ��"+����);
            /*
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) ); 
            */
         } else {
            System.out.println("δ�ҵ�ƥ������ݣ�");
         }
     }
    
    public String match(String line)
    {
    	// ��ָ��ģʽ���ַ�������
        String pattern = "^#ִ�� [\\w+\\s]+";   
        // ���� Pattern ����
        Pattern r = Pattern.compile(pattern);
        // ���ڴ��� matcher ����
        Matcher m = r.matcher(line);
        if (m.find( )) {
            String ����=m.group(0).substring(4);
            //System.out.println("��ȡ��������Ϊ��"+����);
            return ����;
         } 
        else 
         {
            return "δƥ�䵽���ݣ�";
         }
    }
}
