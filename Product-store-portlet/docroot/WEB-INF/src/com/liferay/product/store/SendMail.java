package com.liferay.product.store;

import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendMail {

    private String host = ""; // smtp������
    private String from = ""; // �����˵�ַ
    private String to = ""; // �ռ��˵�ַ
    private String affix = ""; // ������ַ
    private String affixName = ""; // ��������
    private String user = ""; // �û���
    private String pwd = ""; // ����
    private String subject = ""; // �ʼ�����

    public void setAddress(String from, String to, String subject) {
        this.from = from;
        this.to = to;
        this.subject = subject;
    }

    public void setAffix(String affix, String affixName) {
        this.affix = affix;
        this.affixName = affixName;
    }

    public void send(String host, String user, String pwd) {
        this.host = host;
        this.user = user;
        this.pwd = pwd;

        Properties props = new Properties();

        // ���÷����ʼ����ʼ�������������
        props.put("mail.smtp.host", host);
        // ��Ҫ������Ȩ��Ҳ�����л����������У�飬��������ͨ����֤
        props.put("mail.smtp.auth", "true");

        // �øո����úõ�props���󹹽�һ��session
        Session session = Session.getDefaultInstance(props);

        // ������������ڷ����ʼ��Ĺ�������console����ʾ������Ϣ��������ʹ
        // �ã�������ڿ���̨��console)�Ͽ��������ʼ��Ĺ��̣�
        session.setDebug(true);

        // ��sessionΪ����������Ϣ����
        MimeMessage message = new MimeMessage(session);
        try {
            // ���ط����˵�ַ
            message.setFrom(new InternetAddress(from));
            // �����ռ��˵�ַ
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            // ���ر���
            message.setSubject(subject);

            // ��multipart����������ʼ��ĸ����������ݣ������ı����ݺ͸���
            Multipart multipart = new MimeMultipart();

            // �����ʼ����ı�����
            BodyPart contentPart = new MimeBodyPart();
            contentPart.setText("�û�**����ʹ��**��Ʒ���뼰ʱ����");
            multipart.addBodyPart(contentPart);
            // ��multipart����ŵ�message��
            message.setContent(multipart);
            // �����ʼ�
            message.saveChanges();
            // �����ʼ�
            Transport transport = session.getTransport("smtp");
            // ���ӷ�����������
            transport.connect(host, user, pwd);
            // ���ʼ����ͳ�ȥ
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SendMail cn = new SendMail();
        // ���÷����˵�ַ���ռ��˵�ַ���ʼ�����
        cn.setAddress("pengfei.zhang@hand-china.com", "442728644@qq.com", "�����ʼ�");
        
        /**
         * ����smtp�������Լ�������ʺź�����
         * ��QQ ������Ϊ�����߲���ʹ ��ԭ������
         * 163 ������ԣ����Ǳ��뿪��  POP3/SMTP���� �� IMAP/SMTP����
         * ��Ϊ�������ڵ�������¼�����е�¼�������ʹ��163����Ȩ��
         */
        cn.send("smtp.163.com", "m15701610661@163.com", "gebilaowang123");

    }
}