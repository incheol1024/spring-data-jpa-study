package com.data.jpa.repository;

import com.data.jpa.entity.Account;
import com.data.jpa.entity.Study;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class AccountRepositoryTest {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    StudyRepository studyRepository;

    @Test
    void insertTest() {
        Account account = new Account();
        account.setName("miyoung");
        account.setNickName("kkamsi");
        Account save = accountRepository.save(account);
        System.out.println(save);
    }

    @Test
    void insertAccountAndStudy() {
        Account account = new Account();
        account.setName("incheol");
        account.setNickName("monkey");
        Account save = accountRepository.save(account);
        System.out.println(account);
        System.out.println(save);

        Study study = new Study();
        study.setName("spring");
        study.setSubject("data");
        study.setAccount(save);
        Study save1 = studyRepository.save(study);


    }

    @Test
    void findTest() {

        Optional<Account> byId1 = accountRepository.findById(1L);

        System.out.println("=========");

        Optional<Study> byId = studyRepository.findById(1L);

        System.out.println("=========");

        List<Study> all = studyRepository.findAll();

        System.out.println("=========");

        all.stream().forEach(study -> study.getAccount());
    }


    @Test
    void deleteAccount() {
        Account account = createAccount(1L);
        accountRepository.delete(account);
    }

    private Account createAccount(long id) {
        Account account = new Account();
        account.setId(id);
        return account;
    }


}