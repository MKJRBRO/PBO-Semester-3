public class Customer extends User {
    private boolean verificationStatus = false;

    public Customer(int userId, String password, String name, int age, String emailId) {
        super(userId, password, name, age, emailId);
    }

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public void applyVerification(String doc) {
        if (getProfile().setDoc(doc)) {
            System.out.println("Document " + doc + " submitted. Waiting for admin verification");
        } else {
            System.out.println("Invalid document. Allowed formats: .jpg, .png, .pdf");
        }
    }

    void setVerificationStatus(boolean verificationStatus) {
        this.verificationStatus = verificationStatus;
    }
}