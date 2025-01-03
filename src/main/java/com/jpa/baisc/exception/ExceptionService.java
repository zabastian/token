package com.jpa.baisc.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@Service
public class ExceptionService {
    //체크 예외 발생
//    public void throwCheckedException() throws Exception {
//        throw new Exception();
//        try {
//            throw new Exception() ;//무저건 해결을 해줘야한다.
//        } catch ( Exception e) {
//            log.info("예외처리입니다.");
//
//        }
//    }
//    @GetMapping("/unchecked")
//    public String uncheckedExceptionAPI() {
//        throw new RuntimeException();
//
//    }


    public void throwUncheckedException() {
        throw new RuntimeException();
    }
}
