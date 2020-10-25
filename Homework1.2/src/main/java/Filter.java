import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int i : source) {
            if (i > treshold) {
                logger.log("Число \"" + i + "\" подходит!");
                result.add(i);
                logger.log("Число \"" + i + "\" добавлено!");
            } else {
                logger.log("Число \"" + i + "\" не подходит!");
            }
        }
        logger.log("Новый список готов!");
        return result;
    }
}
