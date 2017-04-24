package Directory.traversal;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class DirectoryTra {
	List<File> list=new ArrayList<File>();
	public List<File> traverseFolder(String path){
		File file=new File(path);
		if(file.exists()){
			File files[]=file.listFiles();
			for(File fil:files){
			   if(fil.isDirectory()){
				   System.out.println(fil.getAbsolutePath());
				   traverseFolder(fil.getAbsolutePath());
			   }
			   else{
				   System.out.print(fil.getAbsolutePath());
				   System.out.println(fil.getName());
				   list.add(fil);
				   continue;
			   }
			}
		}else{
			System.out.println("文件不存在");
		}
		return list;
	}
	public static void main(String[] args){
		
		DirectoryTra dt =new DirectoryTra();
		List<File> files=dt.traverseFolder("E:\\excel\\");
		/*for(File file:files){
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getName());
		}*/
		for(int i=0;i<files.size();i++){
			System.out.println(files.size());
			System.out.println(files.get(i));
		}
	}
  
}
