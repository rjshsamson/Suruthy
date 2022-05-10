package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.checkerframework.common.value.qual.StaticallyExecutable;

public class Datadriven_Read {

	public static void read_All_Data() throws IOException {

		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Maven_Project\\userdata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);// upcasting
		Sheet sheetAt = w.getSheetAt(0);
		int NumberOfRows = sheetAt.getPhysicalNumberOfRows();

		for (int i = 0; i < NumberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < numberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();

				if (cellType.equals(CellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				}

				else if (cellType.equals(cellType.NUMERIC)) {
					double value = cell.getNumericCellValue();
					int num = (int) value;// narrow casting
					System.out.println(num);
				}
			}
		}
	}

	public static void read_Particular_Data() throws IOException {
		System.out.println("***Particular Data***");
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Maven_Project\\userdata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);// upcasting
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(4);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();

		if (cellType.equals(CellType.STRING)) {
			String value = cell.getStringCellValue();
			System.out.println(value);
		}

		else if (cellType.equals(cellType.NUMERIC)) {
			double value = cell.getNumericCellValue();
			int num = (int) value;// narrow casting
			System.out.println(num);

		}

	}

	public static void main(String[] args) throws IOException {

		read_All_Data();
		read_Particular_Data();

	}
}
