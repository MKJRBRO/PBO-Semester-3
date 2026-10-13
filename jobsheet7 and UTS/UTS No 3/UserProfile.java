public class UserProfile {
    private int userId;
    private String password;
    private String name;
    private int age;
    private String emailId;
    private String doc;

    public UserProfile(int userId, String password, String name, int age, String emailId) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
    }

    public int getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return emailId;
    }

    public String getDoc() {
        return doc;
    }

    public void editProfile() {
        this.name = Main.readLine("New name  : ");
        this.age = Main.readInt("New age   : ");
        this.emailId = Main.readLine("New email : ");
        System.out.println("Profile updated");
    }

    public static boolean isValidDocument(String fileName) {
        if (fileName == null) {
            return false;
        }
        String lower = fileName.toLowerCase();
        return lower.endsWith(".jpg") || lower.endsWith(".png") || lower.endsWith(".pdf");
    }

    public boolean setDoc(String doc) {
        if (!isValidDocument(doc)) {
            return false;
        }
        this.doc = doc;
        return true;
    }

    public void showDocuments() {
        if (doc == null) {
            System.out.println("No documents uploaded");
        } else {
            System.out.println("Document : " + doc);
        }
    }
}