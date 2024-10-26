package io.github._3xhaust;

import lombok.Getter;

@Getter
public class Route  {
    String route;
    Page component;

    public Route(String route, Page  component) {
        this.route = route;
        this.component = component;
    }

    public String render() {
        return component.render();
    }
}
