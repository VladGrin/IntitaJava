package ua.lesson8;

import java.util.List;

public class Service implements IService{

    private IRepository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }


    @Override
    public List<String> findAll() {
        return repository.findAll();
    }
}
