package io.github._3xhaust.examples;

import io.github._3xhaust.Cinereus;
import io.github._3xhaust.Route;

public class App {
    public static void main(String[] args) {
       new Cinereus(
               new Route("/", new Home())
       );
    }
}
