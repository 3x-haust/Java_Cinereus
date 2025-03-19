package io.github._3xhaust.dom;

import java.util.ArrayList;
import java.util.List;

public class DiffResult {
    List<String> patches = new ArrayList<>();

    void addPatch(String patch) {
        patches.add(patch);
    }

    public void apply() {
        for (String patch : patches) {
            System.out.println(patch);
        }
    }
}
