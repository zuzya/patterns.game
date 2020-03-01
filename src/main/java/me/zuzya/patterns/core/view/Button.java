package me.zuzya.patterns.core.view;

import lombok.Data;
import me.zuzya.patterns.behavioral.command.Command;

@Data
public class Button {

    private String name;

    private Command command;

    public Button(String desc) {
        this.name = desc;
    }

}
