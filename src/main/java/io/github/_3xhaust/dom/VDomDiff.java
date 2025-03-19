package io.github._3xhaust.dom;

import java.util.Objects;

public class VDomDiff {
    public static void diff(VNode oldNode, VNode newNode, DiffResult result, String path) {
        if (oldNode == null && newNode != null) {
            result.addPatch("ADD " + path + " => " + newNode);
            return;
        }
        if (newNode == null && oldNode != null) {
            result.addPatch("REMOVE " + path);
            return;
        }
        if (!Objects.equals(oldNode.type, newNode.type)) {
            result.addPatch("REPLACE " + path + " with " + newNode);
            return;
        }
        if (!Objects.equals(oldNode.text, newNode.text)) {
            result.addPatch("TEXT_CHANGE at " + path + " => " + newNode.text);
        }
        int maxLen = Math.max(oldNode.children.size(), newNode.children.size());
        for (int i = 0; i < maxLen; i++) {
            VNode oldChild = i < oldNode.children.size() ? oldNode.children.get(i) : null;
            VNode newChild = i < newNode.children.size() ? newNode.children.get(i) : null;
            diff(oldChild, newChild, result, path + "/child" + i);
        }
    }
}
