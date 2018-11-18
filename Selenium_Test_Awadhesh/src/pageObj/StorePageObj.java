package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StorePageObj {
	
	
	@FindBy(how = How.LINK_TEXT, using = "Sample Page")
	public static WebElement samplePageLink;

	@FindBy(how = How.CSS, using = "#comment")
	public static WebElement commentTxtArea;
	
	public static WebElement getCommentTxtArea() {
		return commentTxtArea;
	}

	public static void setCommentTxtArea(WebElement commentTxtArea) {
		StorePageObj.commentTxtArea = commentTxtArea;
	}

	@FindBy(how = How.CSS, using = "#author")
	public static WebElement nameTxt;
	
	@FindBy(how = How.CSS, using = "#email")
	public static WebElement emailTxt;
	
	@FindBy(how = How.CSS, using = "#submit")
	public static WebElement postSubmitBtn;
	
	
	@FindBy(how = How.CSS, using = "#error-page")
	public static WebElement errorPage;
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Back")
	public static WebElement backBtn;	
	

	@FindBy(how = How.XPATH, using = "//button[@class='comment-body']")	
	public static WebElement addedCommentsStr;
}
