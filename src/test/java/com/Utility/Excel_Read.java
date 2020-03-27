package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read {
	
	
		public String Excel_Username(int a) throws IOException
		{
			FileInputStream f=new FileInputStream(new File("src\\test\\resources\\TestData\\Jpet.xlsx"));
			XSSFWorkbook workbook=new XSSFWorkbook(f);
			XSSFSheet sheet=workbook.getSheetAt(0);
			String uname= sheet.getRow(a).getCell(0).getStringCellValue();
			return uname;
		}



		public String Excel_Password(int b) throws IOException
		{
			FileInputStream f=new FileInputStream(new File("src\\test\\\\resources\\TestData\\Jpet.xlsx"));
			XSSFWorkbook workbook=new XSSFWorkbook(f);
			XSSFSheet sheet=workbook.getSheetAt(0);
			String pwd= sheet.getRow(b).getCell(1).getStringCellValue();
			return pwd;
		}


	}
