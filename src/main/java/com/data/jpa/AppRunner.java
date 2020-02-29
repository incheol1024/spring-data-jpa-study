package com.data.jpa;

import com.data.jpa.domain.Account;
import com.data.jpa.domain.Study;
import com.data.jpa.repository.AccountRepository;
import com.data.jpa.repository.StudyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {


    @Autowired
    AccountRepository accountRepository;


    @Autowired
    StudyRepository studyRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account account = new Account();
        account.setName("incheol");
        account.setAge(30);


        Study study = new Study();
        study.setName("spring data jpa");
//        study.setAccount(account);

        account.getStudies().add(study);

        Account save = accountRepository.save(account);
        Study save1 = studyRepository.save(study);

        System.out.println(save.toString());
        System.out.println(save1);
        System.out.println("===========");
        accountRepository.findById(save.getId());
        System.out.println("============");
        accountRepository.findById(save.getId());
        System.out.println("============");
    }
}
