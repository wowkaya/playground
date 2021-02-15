package lotus.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GalleryController {

    @GetMapping("gallery/list")
    public String list(){
        return "gallery/list";
    }

}
