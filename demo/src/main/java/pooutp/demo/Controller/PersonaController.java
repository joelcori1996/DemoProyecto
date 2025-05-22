package pooutp.demo.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pooutp.demo.Entity.Persona;
import pooutp.demo.Service.PersonaService;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/personas")//no usages
public class PersonaController {

    @Autowired  //1 usage
    private PersonaService service;

    @GetMapping("listar-personas")
    public String listar_personas(Model model){

        List<Persona> lista = service.listar_persona();

        model.addAttribute("personas",lista );

        return "personas";
    }



}
