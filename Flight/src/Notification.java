public class Notification {
    private int notificationId;
    Date createdOn;
    String content;

    boolean send() {
        return false;
    }
}

class EmailNotification extends Notification {

}

class SmsNotification extends Notification {
}
