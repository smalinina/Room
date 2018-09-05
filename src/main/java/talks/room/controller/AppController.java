package talks.room.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import talks.room.model.CreateTable;

@Controller
public class AppController {


    private final CreateTable createTable;

    @Autowired
    public AppController(CreateTable createTable) {
        this.createTable = createTable;
    }

    @RequestMapping("/")
    public String getHelloPage(Model model) {
        return "hello";
    }

    @RequestMapping("/create")
    public String createTableStatus(Model model) {
        model.addAttribute("status", createTable.create());
        return "create";
    }
}
