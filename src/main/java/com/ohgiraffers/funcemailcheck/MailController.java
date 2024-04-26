package com.ohgiraffers.funcemailcheck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/mail")
public class MailController {

    @Autowired
    private MailService mailService;

    private USERDTO userdto;

    @PostMapping("/send")
    public MailTO sendTestMail(@RequestParam String email,
                               @RequestParam String password) {
        MailTO mailTO = new MailTO();

        mailTO.setAddress(email);
        mailTO.setTitle("회원 인증 코드입니다 !");
        int randomNumber = (int) (Math.random() * 1000000); // 100만 이하의 랜덤 숫자 생성
        while (randomNumber < 100000) { // 6자리 숫자가 아니면 다시 생성
            randomNumber = (int) (Math.random() * 1000000);
        }
        mailTO.setMessage("인증코드는 " + randomNumber + "입니다!" );

        String check = String.valueOf(randomNumber);
        mailService.sendMail(mailTO);

        userdto = new USERDTO(email,password,check,"1");
        mailService.regist(userdto);


        return mailTO;
    }
}