public class SmartphonesEngener {
    public static void main(String[] args) {
        Androids androidPhone = new Androids("Android OS");
       IPhones iPhone = new IPhones("iOS");

        androidPhone.call("+3648394715");
        androidPhone.sms("+3648394715", "Hello  Android!");
        androidPhone.internet();
        androidPhone.linuxOS();

        System.out.println();

        iPhone.call("+5636274387");
        iPhone.sms("+5636274387", "Hello  iPhone!");
        iPhone.internet();
        iPhone.IOS();
    }
}