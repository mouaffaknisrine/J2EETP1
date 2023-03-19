package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImlp implements IDao{
    @Override
    public double getData() {
        System.out.println("From SQL DB");
        return(7);
    }
}
