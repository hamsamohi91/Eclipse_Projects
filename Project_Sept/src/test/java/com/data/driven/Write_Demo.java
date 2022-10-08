package com.data.driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Demo {

	public static void main(String[] args) throws IOException {

		File f = new File("D:\\Hamsa\\Testing\\Test Case\\new.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		wb.createSheet("Staff_Data").createRow(0).createCell(0).setCellValue("Staff");

		wb.getSheet("Staff_Data").getRow(0).createCell(1).setCellValue("Age");

		wb.getSheet("Staff_Data").createRow(1).createCell(0).setCellValue("Rohit");

		wb.getSheet("Staff_Data").getRow(1).createCell(1).setCellValue("25");

		wb.getSheet("Staff_Data").createRow(2).createCell(0).setCellValue("Arun");

		wb.getSheet("Staff_Data").getRow(2).createCell(1).setCellValue("26");

		wb.getSheet("Staff_Data").createRow(3).createCell(0).setCellValue("Vino");

		wb.getSheet("Staff_Data").getRow(3).createCell(1).setCellValue("27");

		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();
	}

}
