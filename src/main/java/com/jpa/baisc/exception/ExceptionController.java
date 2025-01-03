package com.jpa.baisc.exception;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/exceptions")
@RequiredArgsConstructor
public class ExceptionController {
    private final ExceptionService exceptionService;
    //체크예외

//    @GetMapping("/checked")
//    public String checkedExceptionApi() {
//        try {
//            exceptionService.throwCheckedException();
//        } catch (Exception e) {
//            log.info("잘못된");
//        }
//        return "checkedException";
//    }
//    @GetMapping("/checked")
//    public String checkedExceptionApi() throws Exception {
//        throw new Exception();
//    }

    //언체크예외
    @GetMapping("/unchecked")
    public String uncheckedExceptionAPI() {
        exceptionService.throwUncheckedException();
        return "uncheckedException";
    }

}


