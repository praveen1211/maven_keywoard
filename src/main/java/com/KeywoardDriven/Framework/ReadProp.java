package com.KeywoardDriven.Framework;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ReadProp{
//public Properties getDataProp() throws Exception{
//
//		File f= new File(System.getProperty("user.dir")+"/info.properties");
//		FileInputStream fis = new FileInputStream(f);
//		Properties p= new Properties();
//		p.load(fis);
//		return p;
//}
public Properties getPath() throws Exception
{
	String path=System.getProperty("user.dir")+"/WebsitePropertiesFile.properties";
	Properties p=new Properties();
	File f= new File(path);
	FileInputStream fis = new FileInputStream(f);
	Properties p1= new Properties();
	p1.load(fis);
	return p1;
}
}
