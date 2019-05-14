package com.xiongwei.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @Author: 熊伟
 * @Date: 2019/4/11 15:54
 * @why：
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailSendTest {

    @Autowired
    private JavaMailSenderImpl mailSender;

    @Test
    public void send() {
        //简单发送邮件
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("志祥大爷。。");
        message.setText("志祥傻叉。。。。");
        //给谁发送邮件
        message.setTo("313102983@qq.com");
        //设置谁发送的
        message.setFrom("1647855237@qq.com");
        mailSender.send(message);
    }


    @Test
    public void send2() throws Exception {
        //构建复杂邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        helper.setSubject("第二次用java发送邮件。。");
        //这里注意：需要传第二个参数为true，开启可以识别html文件
        helper.setText("<h1>希望第一次不要报错。。。。</h1>", true);
        //给谁发送邮件
        helper.setTo("13025062041@163.com");
        //设置谁发送的
        helper.setFrom("1647855237@qq.com");

        helper.addAttachment("bizhi.jpg", new File("D:\\improt\\bizhi.jpg"));
        helper.addAttachment("timg.jpg", new File("D:\\improt\\timg.jpg"));
        mailSender.send(mimeMessage);
    }


}
