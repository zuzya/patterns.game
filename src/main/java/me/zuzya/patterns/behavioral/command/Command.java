package me.zuzya.patterns.behavioral.command;

import me.zuzya.patterns.core.engine.GameEngine;

public interface Command {

    void execute(GameEngine engine);
}
