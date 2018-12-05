package Utilities;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ResultWithDecimalPercisionUtility {
    public static double getDecimalWithPercision(double d, int scale) {
        return new BigDecimal(d).setScale(scale, RoundingMode.HALF_EVEN).doubleValue();
    }
}
