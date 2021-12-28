package com.syntax.class30;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelDemo4 {
    public static void main(String[] args) throws IOException {

        String path = "Files/Moe WPS.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet1 = xssfWorkbook.getSheet("Sheet1");
        int noOfRows = sheet1.getPhysicalNumberOfRows();
        List<Map<String, String>> excelData = new ArrayList<>();

        Row row0 = sheet1.getRow(0);


        for (int i = 1; i < noOfRows; i++) {
            XSSFRow row = sheet1.getRow(i);
            HashMap<String, String> hashmap = new HashMap<>();
            int noCells = row.getPhysicalNumberOfCells();

            hashmap.put(row0.getCell(0).toString(), row.getCell(0).toString());
            hashmap.put(row0.getCell(1).toString(), row.getCell(1).toString());
            hashmap.put(row0.getCell(2).toString(), row.getCell(2).toString());
            hashmap.put(row0.getCell(3).toString(), row.getCell(3).toString());

            excelData.add(hashmap);


        }
        System.out.println(excelData);

    }
}
