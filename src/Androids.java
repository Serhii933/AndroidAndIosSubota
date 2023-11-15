public class Androids implements Smartphones, LinuxOS {
    private String operatingSystem;

    public Androids(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void call(String phoneNumber) {
        System.out.println("Call " + phoneNumber + " from Android phone with " + operatingSystem);
    }

    @Override
    public void sms(String phoneNumber, String message) {
        System.out.println("Send SMS to " + phoneNumber + " from Android phone with " + operatingSystem + ": " + message);
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet on Android phone with " + operatingSystem);
    }

    @Override
    public void linuxOS() {
        System.out.println("Running Linux OS on Android phone");
    }
}
