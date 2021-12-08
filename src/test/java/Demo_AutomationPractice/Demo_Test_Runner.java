package Demo_AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Demo_programs.Demo_Config_Manager;
import com.Demo_programs.Demo_Home_Page;
import com.Demo_programs.Demo_My_Account;
import com.Demo_programs.Demo_Page_Object_Model;
import com.Maven_First.Base_class;
import com.Maven_First.Home_Page;
import Demo_property.Demo_Config_Reader;

public class Demo_Test_Runner extends Base_class {
	
	static WebDriver driver= Base_class.getBrowser("chrome");
	
	static Demo_Page_Object_Model pom=new Demo_Page_Object_Model(driver);
	
	public static void main(String[] args) throws Throwable {
		
		
		String Demo_url=Demo_Config_Manager.getInstanceDemo_Config().getInstanceDemo_Config_Reader().getInstanceURL();
		
		getURL(Demo_url); 
						
		ClickonBtn(pom.getInstanceHome_Page().sigin);
		
		String username=Demo_Config_Manager.getInstanceDemo_Config().getInstanceDemo_Config_Reader().getInstanceUsername();

		
		inputString(pom.getInstanceHome_Page().user_email, username);
		
		String password=Demo_Config_Manager.getInstanceDemo_Config().getInstanceDemo_Config_Reader().getInstancePassword();
		
		inputString(pom.getInstanceHome_Page().user_password, password);
		
		ClickonBtn(pom.getInstanceHome_Page().login_button);
		
		ClickonBtn(pom.getMyAccount().t_shirts);
		
		waits();
		ClickonBtn(pom.getMyAccount().add_2_cart);
		
		ClickonBtn(pom.getMyAccount().proceed_2_check);
		
		ClickonBtn(pom.getUserDetails().proceed_3_check);
		
		ClickonBtn(pom.getUserDetails().proceed_4_check);
		ClickonBtn(pom.getUserDetails().check_box);
		ClickonBtn(pom.getUserDetails().order_added);
		ClickonBtn(pom.getUserDetails().pay_2_check);
		ClickonBtn(pom.getUserDetails().order_placed);
		
		System.out.println("Order placed Successfully");
	
		
		
	}
	
	

}
