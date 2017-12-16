package com.scp.selenium.seleniumBatchSeven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 
 * Apache POI - to read write excel in java
 * POI -- <=2007
 * POI-XML >=
 * 
 * 
 * @author Yogesh
 *
 * Apache POI -- <2007 -- HSSFWorkbook
 * APache POI-OOXMl >=2007-- XSSFWorkbook
 *
 */
public class ExcelReadWrite {
	public static void main(String[] args) throws IOException {

		String path ="C:\\Users\\Yogesh\\Desktop\\src\\main\\java\\seleniumReadExcel.xlsx";
		File file = new File(path);
		FileInputStream inputstream = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		
		//readExcelFile(workbook);
		writeIntoExcelFile(workbook,file);

	}

	private static void writeIntoExcelFile(XSSFWorkbook workbook,File file) throws IOException {
		XSSFSheet sheet = workbook.getSheet("mydata");
		//int lastDataPresentRow = sheet.getLastRowNum();
		
		for(int i=1;i<=10;i++){
			Row row = sheet.createRow(1+i);
			for(int j=0;j<15;j++){
				Cell cell = row.createCell(j);
				cell.setCellValue("A"+j);
			}
		}
		
		FileOutputStream outputStream = new FileOutputStream(file);
		workbook.write(outputStream);
		
	}

	private static void readExcelFile(XSSFWorkbook workbook) {
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int noOfRows = sheet.getLastRowNum();
		for(int i=0;i<noOfRows;i++){
			Row row = sheet.getRow(i);
			int noofcell = row.getLastCellNum();
			for(int j=0;j<noofcell;j++){
				Cell cell = row.getCell(j);
				if(cell.getCellType()==0){
					System.out.print("\t"+cell.getNumericCellValue());
				}else if (cell.getCellType()==1){
					System.out.print("\t"+cell.getStringCellValue());
				}
			}
			System.out.println();
		}	
	}

}
