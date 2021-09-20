package utils;

import javax.mail.Folder;

public class EmailUtils {
    private Folder folder;

    public enum EmailFolder {
        INBOX("INBOX"),
        SPAM("SPAM");

        private String text;

        private EmailFolder(String text){
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }
}
