package service_auto_project.Auto.service.common;

public class DieselMecanic implements  Mecanic {

    @Override
    public String reparaMasina() {
        return "Masina se repara, va costa cam 10.000 de euro!";
    }
}
