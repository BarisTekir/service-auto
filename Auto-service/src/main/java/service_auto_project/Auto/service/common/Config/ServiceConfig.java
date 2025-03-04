package service_auto_project.Auto.service.common.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service_auto_project.Auto.service.common.BenzinaMecanic;
import service_auto_project.Auto.service.common.DieselMecanic;
import service_auto_project.Auto.service.common.Mecanic;

@Configuration
public class ServiceConfig {

    @Bean("mecanicReparaBenzina")
    public Mecanic BenzinaMecanic(){
        return new BenzinaMecanic();
    }

    @Bean("mecanicReparaDiesel")
    public Mecanic DeiselMecanic(){
        return new DieselMecanic();
    }
}
