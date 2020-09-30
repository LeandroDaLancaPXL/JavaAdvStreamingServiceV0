package be.pxl.ja.streamingservice.model;

import java.util.List;

public class Account {
    private String email;
    private String password;
    private PaymentInfo paymentInfo;
    private StreamingPlan streamingPlan;
    private List<Profile> profiles;

    public Account() {
        Profile profile1 = new Profile();
    }

    public Profile getFirstProfile() {
        return profiles.get(0);
    }

    public void addProfile(Profile profile) {

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public void setStreamingPlan(StreamingPlan streamingPlan) {
        this.streamingPlan = streamingPlan;
    }
}
