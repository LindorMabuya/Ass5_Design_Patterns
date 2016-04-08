package za.ac.cput.domain;

import java.util.List;

/**
 * Created by LILO on 2016/04/02.
 */
public class Hospital extends Provider {
    private String hospitalName;

    public Hospital(Builder builder, String hospitalName) {
        super(builder);
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
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
