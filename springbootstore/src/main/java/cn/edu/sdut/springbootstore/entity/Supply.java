package cn.edu.sdut.springbootstore.entity;

public class Supply {
    private int supid;
    private String supname, supaddress, suptel;

    public int getSupid() {
        return supid;
    }

    public void setSupid(int supid) {
        this.supid = supid;
    }

    public String getSupname() {
        return supname;
    }

    public void setSupname(String supname) {
        this.supname = supname;
    }

    public String getSupaddress() {
        return supaddress;
    }

    public void setSupaddress(String supaddress) {
        this.supaddress = supaddress;
    }

    public String getSuptel() {
        return suptel;
    }

    public void setSuptel(String suptel) {
        this.suptel = suptel;
    }

    @Override
    public String toString() {
        return "Supply{" +
                "supid=" + supid +
                ", supname='" + supname + '\'' +
                ", supaddress='" + supaddress + '\'' +
                ", suptel='" + suptel + '\'' +
                '}';
    }

    public Supply(int supid, String supname, String supaddress, String suptel) {
        this.supid = supid;
        this.supname = supname;
        this.supaddress = supaddress;
        this.suptel = suptel;
    }

    public Supply() {
    }
}
