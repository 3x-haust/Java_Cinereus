package io.github._3xhaust;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Cinereus {
    List<Route> route;

    public Cinereus(Route ... route) {
        this.route = List.of(route);

        this.render();
        this.run();
    }

    public  void run() {
        for (Route page : route) {
            String content = page.render();
            String route = page.getRoute().replace('/', ' ').trim().isBlank()
                    ? "index" : page.getRoute().replace('/', ' ').trim();

        }
    }

    public void render() {
        for (Route page : route) {
            String content = page.render();
            String route = page.getRoute().replace('/', ' ').trim().isBlank()
                    ? "index"
                    :  page.getRoute().replace('/', ' ').trim();

            String htmlContent = "<!DOCTYPE html>\n<html>\n<head>\n<title>" + route + "</title>\n</head>\n<body>\n" + content + "\n</body>\n</html>";
            try (FileWriter writer = new FileWriter(route+ ".html")) {
                writer.write(htmlContent);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}