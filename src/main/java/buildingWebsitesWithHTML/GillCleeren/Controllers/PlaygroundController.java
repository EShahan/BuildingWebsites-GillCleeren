package buildingWebsitesWithHTML.GillCleeren.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlaygroundController {
    @GetMapping("playground")
    public String playground() {
        return "playground";
    }
}
