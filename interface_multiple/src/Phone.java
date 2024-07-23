public interface Phone {
    void call(String phoneNumber);

    void hangup();

    void sendSMS(String phoneNumber, String text);

}
