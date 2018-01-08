package io.dagistan.vertxDemo;

import io.vertx.core.AbstractVerticle;

public class MainVerticle extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        vertx.createHttpServer().requestHandler(req -> {
              req.response()
                .putHeader("content-type", "text/html")
                .end("<h1>Hello from Vert.x!</h1>");
            }).listen(8080);
        System.out.println("HTTP server started on port 8080");
    }
}
