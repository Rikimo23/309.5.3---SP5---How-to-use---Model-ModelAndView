import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ModelAndViewcontroller {
    @GetMapping("/showViewPage")
    public String passParametersWithModel(Model model) {
        model.addText("message");
        model.addText("welcomeMessage");
        int i = 10;
        model.addText("number");

        List<String> list = Arrays.asList("one", "two");
        model.addText("listData");
        return "viewPage";
    }
}
