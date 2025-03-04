package service_auto_project.Auto.service.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service_auto_project.Auto.service.common.BenzinaMecanic;
import service_auto_project.Auto.service.common.DieselMecanic;
import service_auto_project.Auto.service.common.Mecanic;

@RestController
public class DemoController implements Mecanic{

    private Mecanic mecanicBenzina;
    private Mecanic mecanicDiesel;

    @Autowired
    public DemoController(@Qualifier("mecanicReparaBenzina") Mecanic mecanicBenzina,
    @Qualifier("mecanicReparaDiesel") Mecanic mecanicDiesel) {
       this.mecanicBenzina = mecanicBenzina;
       this.mecanicDiesel = mecanicDiesel;
    }


BenzinaMecanic objBenzina = new BenzinaMecanic();
DieselMecanic objDiesel = new DieselMecanic();

    @GetMapping("/autoBenzina")
    public String reparaMasina(BenzinaMecanic benzina) {
        System.out.println(benzina == objBenzina);
        return benzina.reparaMasina();
    }

    @GetMapping("/autoDiesel")
    public String reparaMasina(DieselMecanic diesel) {
        System.out.println(diesel == objDiesel);
        return diesel.reparaMasina();
    }


    @Override
    public String reparaMasina() {
        return "";
    }
}




