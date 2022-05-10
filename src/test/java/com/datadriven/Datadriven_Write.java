package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.binary.XSSFBCommentsTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Write {

	
	public  static  void write_Data() throws IOException {
		
		File f= new File("C:\\Users\\Admin\\eclipse-workspace\\Maven_Project\\userdata.xlsx");
		FileInputStream fis= new FileInputStream(f);
		Workbook w= new XSSFWorkbook(fis);
		Sheet createSheet = w.createSheet("Employee_Details");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Sathish");
		w.getSheet("Employee_Details").getRow(0).createCell(1).setCellValue("1542");
		w.getSheet("Employee_Details").createRow(1).createCell(0).setCellValue("Guru");
		w.getSheet("Employee_Details").getRow(1).createCell(1).setCellValue("1642");
		w.getSheet("Employee_Details").createRow(2).createCell(0).setCellValue("Sandhya");
		w.getSheet("Employee_Details").getRow(2).createCell(1).setCellValue("1555");
		FileOutputStream fos=new FileOutputStream(f);
		w.write(fos);
		w.close();
	}
	public  static void main(String[] args) throws IOException {
		write_Data();
	}
}


