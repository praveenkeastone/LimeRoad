package com.limeroadautomation.pages;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class HomeTestPage
		extends
			WebDriverBaseTestPage<com.qmetry.qaf.automation.ui.api.WebDriverTestPage> {

	@FindBy(locator = "category.homepage")
	private QAFWebElement categoryHomepage;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getCategoryHomepage() {
		return categoryHomepage;
	}
	
	public void selectProductByCategory(String by)
	{
		QAFExtendedWebElement ele= new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("category.homepage"), by));
		ele.click();
	}

}
