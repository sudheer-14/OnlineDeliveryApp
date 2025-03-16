package com.utility;

import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaMailUtil {

    private static final Logger LOGGER = Logger.getLogger(JavaMailUtil.class.getName());

    private static Session getMailSession() {
        Properties properties = new Properties();
        String host = "smtp.gmail.com";
        properties.put("mail.smtp.host", host);
        properties.put("mail.transport.protocol", "smtp");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.port", "587");

        ResourceBundle rb = ResourceBundle.getBundle("application");
        String emailId = rb.getString("mailer.email");
        String passWord = rb.getString("mailer.password");

        return Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(emailId, passWord);
            }
        });
    }

    public static void sendMail(String recipientEmail, String subject, String htmlTextMessage) throws MessagingException {
        Session session = getMailSession();
        Message message = prepareMessage(session, recipientEmail, subject, htmlTextMessage);
        
        if (message != null) {
            Transport.send(message);
            System.out.println("Message Sent Successfully to " + recipientEmail);
        } else {
            throw new MessagingException("Failed to prepare email message.");
        }
    }

    private static Message prepareMessage(Session session, String recipientEmail, String subject, String htmlTextMessage) {
        try {
            ResourceBundle rb = ResourceBundle.getBundle("application");
            String senderEmail = rb.getString("mailer.email");

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));
            message.setSubject(subject);
            message.setContent(htmlTextMessage, "text/html");

            return message;
        } catch (Exception exception) {
            LOGGER.log(Level.SEVERE, "Error preparing email message", exception);
            return null;
        }
    }
}
