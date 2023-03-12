package TestCases;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
    public static void main(String[]args) throws IOException {
        File f=new File("C:\\Users\\swati\\IdeaProjects\\DH_hub\\testdata.xlsx");
        FileInputStream fis=new FileInputStream(f);
        XSSFWorkbook wk=new XSSFWorkbook(fis);
        XSSFSheet sheet=wk.getSheetAt(0);
        int rows=sheet.getPhysicalNumberOfRows();
        for(int i=0;i<rows;i++){
            XSSFRow r=sheet.getRow(i);
           int cell=r.getPhysicalNumberOfCells();
           for(int j=0;j<cell;j++){
               XSSFCell xc=r.getCell(j);
              System.out.println(xc.getStringCellValue());
               //System.out.println(xc.getNumericCellValue());
           }
        }


    }

}
