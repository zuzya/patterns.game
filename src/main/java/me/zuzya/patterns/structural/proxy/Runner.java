package me.zuzya.patterns.structural.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Runner {

    public static void main(String[] args) {

        Secured firstUserProfile = new Profile("secret info");
        Secured proxy = new ProfileProxy(firstUserProfile);

        log.info("user info: {}", proxy.getSecuredInfo());
    }
}
