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
        iPhone.iOS();


        Smartphones androidWithOS = new Androids("Android with OS");
        Smartphones iPhoneWithOS = new IPhones("iPhone with OS");


        System.out.println("Android with OS:");
        androidWithOS.call("111-333-5555");
        androidWithOS.sms("111-333-5555", "Hello  Android with OS!");
        androidWithOS.internet();

        System.out.println();

        System.out.println("iPhone with OS:");
        iPhoneWithOS.call("222-444-7777");
        iPhoneWithOS.sms("222-444-7777", "Hello  iPhone with OS!");
        iPhoneWithOS.internet();

        System.out.println();


        LinuxOS androidLinux = new Androids("Android Linux OS");
        IOS IPhoneiOS = new IPhones("iOS");


        System.out.println("Android with Linux OS:");
        androidLinux.linuxOS();

        System.out.println();

        System.out.println("iPhone with iOS:");
        IPhoneiOS.iOS();

        System.out.println();

        Smartphones androidSmart = new Androids("Another Android");
        Smartphones iphoneSmart = new IPhones("Another iPhone");


        System.out.println("Another Android Smartphones:");
        androidSmart.call("123-456-7890");
        androidSmart.sms("123-456-7890", "Hello  Another Android Smartphones");
        androidSmart.internet();

        System.out.println();

        System.out.println("Another iPhone Smartphones:");
        iphoneSmart.call("321-555-0000");
        iphoneSmart.sms("321-555-0000", "Hello  Another iPhone Smartphones");
        iphoneSmart.internet();
    }
}

