package buildingWebsitesWithHTML.GillCleeren.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PieOverviewController {
    @GetMapping("PieOverview")
    public String PieOverview() {
        return "pieoverview";
    }
}
