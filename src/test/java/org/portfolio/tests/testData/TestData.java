package org.portfolio.tests.testData;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestData {

    private final String pathToFile = "src/test/resources/testDataPositive.xlsx";
    private final String sheetName = "Sheet1";

    public String[][] retrieveTestData() throws IOException {
        File testDataFile = new File(pathToFile);
        FileInputStream fileInputStream = new FileInputStream(testDataFile);

        XSSFWorkbook testDataWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet testDataSheet = testDataWorkbook.getSheet(sheetName);

        int amountOfRows = testDataSheet.getLastRowNum() - testDataSheet.getFirstRowNum();

        String[][] testDataArray = new String[amountOfRows][];

        for (int i = 0; i < amountOfRows; i++) {
            String testDataFromCell = testDataSheet.getRow(i).getCell(0).getStringCellValue();
            String[] internalArray = {testDataFromCell};
            testDataArray[i] = internalArray;
        }
        return testDataArray;
    }
}
