package com.Data_Driven;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Reader {
			
			
			public  void file_Reader() throws IOException {
				
					File fil= new File("C:\\Users\\Jaicj\\eclipse-workspace\\Maven_First\\src\\main\\java\\Data_File.xlsx");
					
					FileInputStream fis=new FileInputStream(fil);
					
					Workbook wb=new XSSFWorkbook(fis);
					
					System.out.println(wb.getSheetAt(0).getRow(0).getCell(0));
									
					
					
			}
			
			public static void main(String[] args) throws IOException {
				
				Excel_Reader er=new Excel_Reader();
				er.file_Reader();
			}

		}



