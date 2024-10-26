package io.github._3xhaust.components;

import io.github._3xhaust.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Div implements Component {
    List<String> components = new ArrayList<>();

    public Div (Component... components) {
        Arrays.stream(components).forEach(component -> this.components.add(component.render()));
    }

    @Override
    public String render() {
        return "<div>" + components.stream()
                .map(Object::toString)
                .reduce("", (acc, component) -> acc + component)
                + "</div>";
    }
}
