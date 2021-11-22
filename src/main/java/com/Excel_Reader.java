package com;

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

public class Excel_Reader {

	public static void file_Reader() throws IOException {

		File fil = new File("C:\\Users\\Jaicj\\eclipse-workspace\\Maven_First\\src\\main\\java\\Data_File.xlsx");

		FileInputStream fis = new FileInputStream(fil);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheetAt(0);

		Row row = sheet.getRow(2);
		
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();


		for (int rows = 0; rows < physicalNumberOfCells; rows++) {
			Cell cell = row.getCell(rows);
			CellType cellType = cell.getCellType();
			
			if(cellType.equals(cellType.STRING))
			{
				String stringCellValue = cell.getStringCellValue();
				
				System.out.println(stringCellValue);
			}
			
			else if (cellType.equals(cellType.NUMERIC))
			{
				System.out.println(cell.getNumericCellValue()); // double so it will print double values
			}

		}
		 }

//			 for (int col = 0; col < physicalNumberOfCells; col++) {


//				Cell cell1 = row.getCell(col);
//
//				CellType cellType1 = cell1.getCellType();
//
//		if (cellType1.equals(cellType1.STRING)) {
//
//					String stringCellValue = cell1.getStringCellValue();
//					System.out.println(stringCellValue);
//				} else if (cellType1.equals(cellType1.NUMERIC)) {
//
//				double numericCellValue = cell1.getNumericCellValue();
//
//				System.out.println(numericCellValue);
//				}
//			}
//
//		}
//	}

	public static void main(String[] args) throws IOException {

		System.out.println("GET ALL DATA");
		file_Reader();
	}

}
