package io.github._3xhaust.examples;

import io.github._3xhaust.Component;
import io.github._3xhaust.Page;
import io.github._3xhaust.components.Button;
import io.github._3xhaust.components.Div;

public class Home implements Page {
    Component component;
    public Home() {
        this.component =  new Div(
               new Button("Click me"),
               new Button("Click me", "submit")
        );
    }


    @Override
    public String render() {
        return component.render();
    }
}
