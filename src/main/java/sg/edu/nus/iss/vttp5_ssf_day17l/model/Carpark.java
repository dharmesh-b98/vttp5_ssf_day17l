package sg.edu.nus.iss.vttp5_ssf_day17l.model;

public class Carpark {
    private Integer id;
    private String address;
    private String region;
    private String weekdayRate1;
    private String weekdayRate2;
    private String saturdayRate;
    private String sundayPublicHolRate;

    public Carpark(Integer id, String address, String region, String weekdayRate1, String weekdayRate2,
            String saturdayRate, String sundayPublicHolRate) {
        this.id = id;
        this.address = address;
        this.region = region;
        this.weekdayRate1 = weekdayRate1;
        this.weekdayRate2 = weekdayRate2;
        this.saturdayRate = saturdayRate;
        this.sundayPublicHolRate = sundayPublicHolRate;
    }

    public Carpark() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getWeekdayRate1() {
        return weekdayRate1;
    }

    public void setWeekdayRate1(String weekdayRate1) {
        this.weekdayRate1 = weekdayRate1;
    }

    public String getWeekdayRate2() {
        return weekdayRate2;
    }

    public void setWeekdayRate2(String weekdayRate2) {
        this.weekdayRate2 = weekdayRate2;
    }

    public String getSaturdayRate() {
        return saturdayRate;
    }

    public void setSaturdayRate(String saturdayRate) {
        this.saturdayRate = saturdayRate;
    }

    public String getSundayPublicHolRate() {
        return sundayPublicHolRate;
    }

    public void setSundayPublicHolRate(String sundayPublicHolRate) {
        this.sundayPublicHolRate = sundayPublicHolRate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((region == null) ? 0 : region.hashCode());
        result = prime * result + ((weekdayRate1 == null) ? 0 : weekdayRate1.hashCode());
        result = prime * result + ((weekdayRate2 == null) ? 0 : weekdayRate2.hashCode());
        result = prime * result + ((saturdayRate == null) ? 0 : saturdayRate.hashCode());
        result = prime * result + ((sundayPublicHolRate == null) ? 0 : sundayPublicHolRate.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Carpark other = (Carpark) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (region == null) {
            if (other.region != null)
                return false;
        } else if (!region.equals(other.region))
            return false;
        if (weekdayRate1 == null) {
            if (other.weekdayRate1 != null)
                return false;
        } else if (!weekdayRate1.equals(other.weekdayRate1))
            return false;
        if (weekdayRate2 == null) {
            if (other.weekdayRate2 != null)
                return false;
        } else if (!weekdayRate2.equals(other.weekdayRate2))
            return false;
        if (saturdayRate == null) {
            if (other.saturdayRate != null)
                return false;
        } else if (!saturdayRate.equals(other.saturdayRate))
            return false;
        if (sundayPublicHolRate == null) {
            if (other.sundayPublicHolRate != null)
                return false;
        } else if (!sundayPublicHolRate.equals(other.sundayPublicHolRate))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return id + "," + address + "," + region + "," + weekdayRate1 + "," + weekdayRate2 + "," + saturdayRate + "," + sundayPublicHolRate;
    }

    
    

}
