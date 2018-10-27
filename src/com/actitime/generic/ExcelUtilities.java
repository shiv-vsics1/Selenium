package com.actitime.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author Shiv.Singh
 * Created on 26/03/2018
 * Reviewed by Shiv Singh
 **/

public class ExcelUtilities 
{
static String filepath= "./testdata/testdata.xlsx";
/**
 * @description Read data from testdata.xlsx
 * @param sheetName
 * @param row 
 * @param cell
 * @return String
 */
public static String readData 
					(String sheetName, int row, int cell) 
{
	String value = null;
	try {
		Workbook wb = WorkbookFactory.create(new FileInputStream(new File (filepath)));
		value=wb.getSheet(sheetName).getRow
				(row).getCell(cell).getStringCellValue();
	}
	catch (EncryptedDocumentException e) {
		e.printStackTrace();
	}
	catch (InvalidFormatException e) {
		e.printStackTrace();
	}
	catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	catch (IOException e) {
		e.printStackTrace();
	}
	return value;
    }
    }
