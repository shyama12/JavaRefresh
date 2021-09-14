public class Main {

    public static void main(String[] args) {
        VipCustomer vip1 = new VipCustomer("Shyama", 123.123, "shyama12@hotmail.com");
        VipCustomer vip2 = new VipCustomer("Abc", 20.20);
        VipCustomer vip3 = new VipCustomer();

        System.out.println(vip1.getName());
        System.out.println(vip1.getCreditLimit());
        System.out.println(vip1.getEmailAddress());
        System.out.println(vip2.getName());
        System.out.println(vip2.getCreditLimit());
        System.out.println(vip2.getEmailAddress());
        System.out.println(vip3.getName());
        System.out.println(vip3.getCreditLimit());
        System.out.println(vip3.getEmailAddress());
    }
}
