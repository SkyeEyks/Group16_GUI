package za.ac.cput.factory;
/* Payroll.java
Factory for the Payroll.
Author: Bokang Molaoa (218131097).
Date: 09 June 2021
*/

import za.ac.cput.entity.PayRoll;
import za.ac.cput.util.GenericHelper;

public class PayRollFactory {
    public static PayRoll createPayRoll(int payrollID, String trainerID, String hours) {
        int payRollID = GenericHelper.generateId();
        PayRoll payRoll = new PayRoll.Builder()
                .setPayrollID(payrollID)
                .setTrainerID(trainerID)
                .setHours(hours)
                .build();

        return payRoll;
    }
}
