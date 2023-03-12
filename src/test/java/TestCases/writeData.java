package TestCases;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class writeData {
    public static void main(String[]args) throws FileNotFoundException {
        File f=new File("C:\\Users\\swati\\IdeaProjects\\DH_hub\\testdata1.xlsx");
        FileOutputStream fio=new FileOutputStream(f);
        XSSFWorkbook workbook =new XSSFWorkbook();
       XSSFSheet sheet= workbook.createSheet("test");
        Scanner sc=new Scanner(System.in);
        String data=null;

        int  rows=sheet.getPhysicalNumberOfRows();
      for(int i=0;i<3;i++){


      }





    }
}
