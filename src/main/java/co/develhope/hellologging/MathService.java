package co.develhope.hellologging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    private Logger logger  = LoggerFactory.getLogger(MathService.class);

    public int getSum(int a, int b){
        logger.debug("SUM");
        return a + b;
    }

    public int getSubtraction(int a, int b){
        logger.debug("SUBTRACTION");
        return a - b;
    }



}
