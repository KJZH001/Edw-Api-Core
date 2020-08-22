package moeworld.XiaoKong.mirai_MinecraftEdwApiCore;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 正则匹配 {
	//调试用
    public static void main( String args[] )
    {
    	 
        // 按指定模式在字符串查找
        String line = "#执行 help 2";
        String pattern = "^#执行 [\\w+\\s]+";
   
        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);
   
        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            String 命令=m.group(0).substring(4);
            System.out.println("截取出的命令为："+命令);
            /*
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) ); 
            */
         } else {
            System.out.println("未找到匹配的内容！");
         }
     }
    
    public String match(String line)
    {
    	// 按指定模式在字符串查找
        String pattern = "^#执行 [\\w+\\s]+";   
        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);
        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find( )) {
            String 命令=m.group(0).substring(4);
            //System.out.println("截取出的命令为："+命令);
            return 命令;
         } 
        else 
         {
            return "未匹配到内容！";
         }
    }
}
