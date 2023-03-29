public class App {
    public static void main(String[] args) {
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());
        System.out.println(person1.getCredit_limit());
        System.out.println(person1.getE_mail());
        VipCustomer person3 = new VipCustomer("sambeet", 42367.56, "sambeet@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getCredit_limit());
        System.out.println(person3.getE_mail());
        VipCustomer person4 = new VipCustomer("jijna");
        System.out.println(person4.getName());
        System.out.println(person4.getCredit_limit());
        System.out.println(person4.getE_mail());

    }
}
