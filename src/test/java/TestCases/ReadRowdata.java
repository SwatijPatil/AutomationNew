package TestCases;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadRowdata {
    public void readParticularRowData(int rw) throws IOException {
        File f=new File("C:\\Users\\swati\\IdeaProjects\\DH_hub\\testdata.xlsx");
        FileInputStream fis=new FileInputStream(f);
        XSSFWorkbook workbook=new XSSFWorkbook(fis);
        XSSFSheet sheet=workbook.getSheetAt(0);
        int row= sheet.getPhysicalNumberOfRows();
            XSSFRow r = sheet.getRow(rw);
            for(int j=0;j<3;j++){
                int cell = sheet.getPhysicalNumberOfRows();
                XSSFCell xc = r.getCell(j);
                System.out.println(xc.getStringCellValue());
            }}
    public static void main(String[]args) throws IOException {
        ReadRowdata data=new ReadRowdata();
        data.readParticularRowData(1);

    }
}
