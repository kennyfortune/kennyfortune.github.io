//生成基本信息博客
import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.io.*;
import java.time.*;
import java.time.format.*;

public class generator{
	
	public static void  main(String[] args) throws Exception{
		try{
		String title = JOptionPane.showInputDialog(" Please input title: \n");
		System.out.println(title);
		LocalDate t = LocalDate.now();
		String d = t.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		File file = new File("E:"+File.separator+
		"code"+File.separator+
		"kennyfortune.github.io"+File.separator+
		"_posts",d+"-"+title+".markdown");
		file.createNewFile();
		String subtitle = JOptionPane.showInputDialog(" Please input subtitle: \n");
		String header = "---\n"+
						"layout:     post\n"+
						"title:      "+title+"\n"+
						"subtitle:   "+subtitle+"\n"+ 
						"date:       "+d+"\n"+
						"author:     deponia\n"+
						"header-img: img/post-sisyphus.jpg\n"+
						"catalog: true\n"+
						"tags:\n";
		while(true){
			String tags = JOptionPane.showInputDialog(" Please input tags(If finished, please input END): \n");
			if("END".equals(tags)){
				break;
			}
			header += "    - " + tags +"\n";
		}
		header+= "---\n\n\n";
		FileOutputStream f = new FileOutputStream(file);
		OutputStreamWriter w = new OutputStreamWriter(f, "UTF-8");
		w.write(header);
		w.close();
		}catch(Exception e){
			throw e;
		}
	}
}