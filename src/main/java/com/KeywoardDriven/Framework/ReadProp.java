package com.KeywoardDriven.Framework;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ReadProp
{

public Properties getPath() throws Exception
{
	//Properties File location
	String path=System.getProperty("user.dir")+"/WebsitePropertiesFile.properties";
	Properties p=new Properties();
	File f= new File(path);
	FileInputStream fis = new FileInputStream(f);
	Properties p1= new Properties();
	p1.load(fis);
	return p1;
}
}
