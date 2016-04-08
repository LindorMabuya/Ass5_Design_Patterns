package za.ac.cput.domain;

import java.util.List;

/**
 * Created by LILO on 2016/04/02.
 */
public class ThirdParty extends Provider {

    public ThirdParty(Builder builder) {
        super(builder);
    }

    @Override
    public List<DemographicInfo> getDemographicInfoList() {
        return super.getDemographicInfoList();
    }

    @Override
    public Payer getPayer() {
        return super.getPayer();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
