package com.fy.trading.Controller;

import com.fy.trading.Model.InfoTable;
import com.fy.trading.Service.WebScraping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
public class HomeController {

    @Autowired
    private WebScraping webScraping;

    @RequestMapping(value = "/getInfo")
    public String home() {
        return "info";
    }

    @RequestMapping(value = "/liveData")
    public String liveData(Model model)
    {
        List<InfoTable> infoTables = webScraping.getInfo();

        model.addAttribute("values",infoTables);

        if (infoTables.isEmpty())
        {
            return "info table is null";
        }
        return "getTableInfo";
    }
}
