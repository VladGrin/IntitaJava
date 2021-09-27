package ua.lesson8;

public class Controller {
    private IService service;

    public Controller(Service service) {
        this.service = new Service(new Repository());
    }
    // /users GET
    public String getUsers() {
        return service.findAll().toString();
    }
}
