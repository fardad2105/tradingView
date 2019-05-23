package com.fy.trading.Service;

import com.fy.trading.Model.InfoTable;
import com.fy.trading.Utils.Url;
import com.fy.trading.Utils.Values;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class WebScraping {


    public List<InfoTable> getInfo() {
        List<InfoTable> infoTables = new ArrayList<>();


        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        WebDriverWait driverWait = new WebDriverWait(driver, 20);
        driver.navigate().to(Url.URL_SITE);

        for (String value : Values.value) {

            InfoTable infoTable = new InfoTable();

            String value_txt = driver.findElement(new By.ByXPath(value)).getText();
            infoTable.setValue(value_txt);
            infoTables.add(infoTable);
        }

        return infoTables;

    }

}
