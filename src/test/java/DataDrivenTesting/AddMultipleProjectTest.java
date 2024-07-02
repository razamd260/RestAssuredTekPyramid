package DataDrivenTesting;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.http.ContentType;

public class AddMultipleProjectTest {
   
	@SuppressWarnings("unchecked")
	@Test(dataProvider="data")
	public void sampleTest(String createdBy,String projectName,String status,String teamSize) {
		//String projectName=Faker.instance().name().firstName();
	    JSONObject reqBody=new JSONObject();
	    reqBody.put("createdBy", createdBy);
	    reqBody.put("projectName", projectName);
	    reqBody.put("status", status);
	    reqBody.put("teamSize", Integer.parseInt(teamSize));
	    
		given().contentType(ContentType.JSON).body(reqBody).
		 
		     when().post("http://49.249.28.218:8091/addProject").
		      
		         then().log().all();
	}
	
    
     
     
     @DataProvider(name="data")
     public Object[][] getdata() throws Throwable {
    	 ExcelUtility excel=new ExcelUtility();
    	 int count=excel.getRowcount("Sheet1");
    	 Object[][] objarr=new Object[count][2]; 
    	 for(int i=0;i<count;i++) {
    		 objarr[i][0]=excel.getDataFromExcel("Sheet1", i+1, 0);
    		 objarr[i][1]=excel.getDataFromExcel("Sheet1", i+1, 1);
    		 objarr[i][2]=excel.getDataFromExcel("Sheet1", i+1, 2);
    		 objarr[i][3]=excel.getDataFromExcel("Sheet1", i+1, 3);
    		 
    	 }
    	 return objarr;
     }
     
    
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     //@DataProvider(name="dataProvider")
 	public Object[][] provideData() throws Throwable {
     	
     	String projectName=Faker.instance().name().firstName();
 		Object[][] value=new Object[2][4];
 		value[0][0]="Naoushd";
 		value[0][1]=projectName;
 		value[0][2]="Created";
 		value[0][3]=10;
 		
 		value[1][0]="Sarfraj";
 		value[1][1]=projectName;
 		value[1][2]="Created";
 		value[1][3]=10;
 		
 		return value;
 		
 	}
     
     public void test01() throws Throwable {
    	 ExcelUtility excel=new ExcelUtility();
//    	 int numRow=excel.getRowcount("Sheet1");
//    	 int cellNum=excel.getCellcount("Sheet1");
    	 FileInputStream fis = new FileInputStream("G:\\BackEndTestingProject\\src\\test\\java\\DataDrivenTesting\\testScriptdata.xlsx");
 		Workbook wb =  WorkbookFactory.create(fis);
 		Sheet s=wb.getSheet("Sheet1");
 		int numRow=s.getLastRowNum();
 		int cellNum=s.getRow(0).getLastCellNum();
    	 System.out.println(numRow+"  :  "+numRow);
    	for(int i=0;i<=3;i++) {
    		for(int j=0;j<=cellNum;j++) {
    			String cell=excel.getDataFromExcel("Sheet1", i, j);
    			System.out.println(cell);
    		}
    	}
     }
}
