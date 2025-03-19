package io.github._3xhaust.example;

import io.github._3xhaust.dom.DiffResult;
import io.github._3xhaust.dom.VDomDiff;
import io.github._3xhaust.dom.VNode;

public class App {
    public static void main(String[] args) {
        VNode oldVDom = VNode.createElement("div",
                VNode.createElement("h1", "Hello, Virtual DOM!"),
                VNode.createElement("ul",
                        VNode.createElement("li", "Item 1"),
                        VNode.createElement("li", "Item 2")
                )
        );

        VNode newVDom = VNode.createElement("div",
                VNode.createElement("h1", "Hello, Updated VDOM!"),
                VNode.createElement("ul",
                        VNode.createElement("li", "Item 1"),
                        VNode.createElement("li", "Updated Item 2"),
                        VNode.createElement("li", "Item 3")
                )
        );

        DiffResult result = new DiffResult();
        VDomDiff.diff(oldVDom, newVDom, result, "root");
        result.apply();
    }
}
