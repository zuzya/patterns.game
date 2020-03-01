package me.zuzya.patterns.core.view;

import me.zuzya.patterns.behavioral.command.BanHeroCommand;
import me.zuzya.patterns.behavioral.command.PickHeroCommand;
import me.zuzya.patterns.behavioral.command.ShowDescriptionCommand;
import me.zuzya.patterns.core.engine.GameEngine;

public class View {

    private GameEngine engine;

    private Button descButton;

    private Button banHeroButton;

    private Button pickHeroButton;

    public View() {

        this.engine = new GameEngine();
        descButton = new Button("show desc");
        descButton.setCommand(new ShowDescriptionCommand());

        banHeroButton = new Button("ban hero");
        banHeroButton.setCommand(new BanHeroCommand());

        pickHeroButton = new Button("pick hero");
        pickHeroButton.setCommand(new PickHeroCommand());
    }

    public void onClick(Button button) {

        button.getCommand().execute(engine);
    }
}
