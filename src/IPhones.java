public class IPhones implements Smartphones, IOS {
    private String operatingSystem;

    public IPhones(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void call(String phoneNumber) {
        System.out.println("Call " + phoneNumber + " from iPhone with " + operatingSystem);
    }

    @Override
    public void sms(String phoneNumber, String message) {
        System.out.println("Send iMessage to " + phoneNumber + " from iPhone with " + operatingSystem + ": " + message);
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet on iPhone with " + operatingSystem);
    }

    @Override
    public void IOS() {
        System.out.println("Running iOS on iPhone");
    }
}