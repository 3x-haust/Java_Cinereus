package io.github._3xhaust.dom;

import java.util.ArrayList;
import java.util.List;

public class VNode {
    String type;
    String text;
    List<VNode> children;

    public VNode(String type, String text, List<VNode> children) {
        this.type = type;
        this.text = text;
        this.children = children != null ? children : new ArrayList<>();
    }

    public static VNode createElement(String type, Object... children) {
        List<VNode> childNodes = new ArrayList<>();
        for (Object child : children) {
            if (child instanceof String) {
                childNodes.add(new VNode(null, (String) child, null));
            } else if (child instanceof VNode) {
                childNodes.add((VNode) child);
            }
        }
        return new VNode(type, null, childNodes);
    }

    @Override
    public String toString() {
        if (type == null) {
            return text;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(type).append(">");
        for (VNode child : children) {
            sb.append(child.toString());
        }
        sb.append("</").append(type).append(">");
        return sb.toString();
    }
}
