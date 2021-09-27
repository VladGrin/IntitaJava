package ua.lesson8;

import java.util.ArrayList;
import java.util.List;

public class Repository implements IRepository{

    @Override
    public List<String> findAll() {
        return new ArrayList<>();
    }
}
