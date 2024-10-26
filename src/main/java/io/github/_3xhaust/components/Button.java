package io.github._3xhaust.components;

import io.github._3xhaust.Component;

public class Button implements Component {
    String text;
    String type = "";

    public Button(String text) {
        this.text = text;
    }

    public Button(String text, String type) {
        this.text = text;
        this.type = type;
    }

    @Override
    public String render() {
        return "<button type='" + this.type + "'>" + this.text + "</button>";
    }
}
