package TestCases;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write {
    public static void main(String[]args) throws IOException {
        File f=new File("C:\\Users\\swati\\IdeaProjects\\DH_hub\\testdata.xlsx");
        FileOutputStream fo=new FileOutputStream(f);
        XSSFWorkbook worbook=new XSSFWorkbook();
        XSSFSheet sheet= worbook.createSheet("Test");
        for(int i=0; i<3;i++) {
           XSSFRow  row = sheet.createRow(i);
          for(int j=0;j<3;j++){
              XSSFCell cell=row.createCell(j);
           cell.setCellValue("add");

          }
        }
        worbook.write(fo);
        fo.flush();
    }
}
