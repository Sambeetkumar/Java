public class VipCustomer {
    private String Name;
    private double credit_limit;
    private String e_mail;
    public VipCustomer(String Name,double credit_limit,String e_mail)
    {
        this.Name = Name;
        this.credit_limit = credit_limit;
        this.e_mail = e_mail;
    }

    public VipCustomer(String name) {
        this(name,3456.88,"unknown@gmail.com");
    }
    public VipCustomer()
    {
       Name = "sam";
       credit_limit = 40000;
       e_mail = "jijnahota18@gmail.com";
    }
    public String getName() {
        return Name;
    }

    public double getCredit_limit() {
        return credit_limit;
    }

    public String getE_mail() { return e_mail; }
}
