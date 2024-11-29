package com.co.dafiti.Utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ExcelData {

    public static ArrayList<Map<String, String>> readExcelData(String ExcelPath, String ExcelSheet) throws IOException {
        ArrayList<Map<String, String>> arrayListRoadmapData = new ArrayList<Map<String, String>>();
        Map<String, String> projectInformation = new HashMap<String, String>();
        File file = new File(ExcelPath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
        XSSFSheet newSheet = newWorkbook.getSheet(ExcelSheet);
        Iterator<Row> rowIterator = newSheet.iterator();
        Row titulos = rowIterator.next();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                cell.getColumnIndex();
                switch (cell.getCellTypeEnum()) {
                    case STRING:
                        projectInformation.put(titulos.getCell(cell.getColumnIndex()).toString(), cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        projectInformation.put(titulos.getCell(cell.getColumnIndex()).toString(), String.valueOf((long) cell.getNumericCellValue()));
                        break;
                    case BLANK:
                        projectInformation.put(titulos.getCell(cell.getColumnIndex()).toString(), "");
                        break;
                    default:
                }
            }
            arrayListRoadmapData.add(projectInformation);
            projectInformation = new HashMap<String, String>();
        }
        return arrayListRoadmapData;
    }
}