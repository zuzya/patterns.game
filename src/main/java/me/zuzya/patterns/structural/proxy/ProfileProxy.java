package me.zuzya.patterns.structural.proxy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProfileProxy implements Secured{

    private Secured profile;

    @Override
    public String getSecuredInfo() {

        return profile.getSecuredInfo();
    }

}
