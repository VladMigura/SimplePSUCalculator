package com.bsuir.psucalculator.utility;

import com.bsuir.model.PowerSupplyModel;
import org.springframework.stereotype.Component;

@Component
public class PowerSupplyUtility {

    private static final int HDD_SSD_TDP = 25;
    private static final int CD_DVD_TDP = 30;
    private static final int BLU_RAY_TDP = 25;
    private static final int RAM_MODULE_TDP = 3;
    private static final int FAN_TDP = 3;

    public static PowerSupplyModel calculatePowerSupply(
            int cpuTdpValue, int videocardTdpValue, int hddSsdCount,
            int cdDvdCount, int bluRayCount, int ramModulesCount, int fansCount) {

        PowerSupplyModel powerSupplyModel = new PowerSupplyModel();

        powerSupplyModel.setMinimumPowerSupply(getMinimumPowerSupply(cpuTdpValue, videocardTdpValue, hddSsdCount,
                cdDvdCount, bluRayCount, ramModulesCount, fansCount));
        powerSupplyModel.setRecommendedPowerSupply(getRecommendedPowerSupply(powerSupplyModel.getMinimumPowerSupply()));

        return powerSupplyModel;
    }

    private static int getMinimumPowerSupply(int cpuTdpValue, int videocardTdpValue, int hddSsdCount, int cdDvdCount,
                                            int bluRayCount, int ramModulesCount, int fansCount) {

        int totalTdp = cpuTdpValue +
                videocardTdpValue +
                hddSsdCount * HDD_SSD_TDP +
                cdDvdCount * CD_DVD_TDP +
                bluRayCount * BLU_RAY_TDP +
                ramModulesCount * RAM_MODULE_TDP +
                fansCount * FAN_TDP;

        return totalTdp;
    }

    private static int getRecommendedPowerSupply(int minimumPowerSupply) {

        return (int)(minimumPowerSupply + minimumPowerSupply * 0.2);
    }
}
