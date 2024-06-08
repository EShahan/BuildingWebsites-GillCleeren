package buildingWebsitesWithHTML.GillCleeren.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplePieController {

    @GetMapping("ApplePie")
    public String applePie() {
        return "applepie";
    }

}
