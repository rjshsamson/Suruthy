package com.properties;

public class File_Reader_Manager {
	// private constructor
	private File_Reader_Manager() {
		// We Can't create object in another class
	}
	
	//static method
	public static File_Reader_Manager getInstanceFRM() {
		File_Reader_Manager frm= new File_Reader_Manager();
		return frm;
	}
	//non static method
	public Configuration_Readaer getInstanceCR() throws Throwable {
		Configuration_Readaer cr=new Configuration_Readaer();
		return cr;
	}

}
