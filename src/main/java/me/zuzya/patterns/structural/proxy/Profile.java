package me.zuzya.patterns.structural.proxy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Profile implements Secured {

    private String profileInfo;

    @Override
    public String getSecuredInfo() {

        return profileInfo;
    }
}
