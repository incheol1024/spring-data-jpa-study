package com.data.jpa;

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

    }
}
