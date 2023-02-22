package com.walletapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController {

    @GetMapping
    public String greet(){
        return "Hello welcome to wallet app.";
    }

}
