package pwr.awt.library;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @Autowired
    private NameRepo nameRepo;

    @GetMapping("/hello")
    public String greet() {
        return "Greetings" + nameRepo.findAll();
    }

    @PostMapping("/name/{name}")
    public void name(@PathVariable String name) {
        nameRepo.save(new Name(name));
    }
}
