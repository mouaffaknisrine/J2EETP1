package metier;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("metier")
public class MetierImpl implements IMetier{
    @Autowired
    private IDao dao;
    @Override
    public double calcul() {
        double data = dao.getData();
        return data*10;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
