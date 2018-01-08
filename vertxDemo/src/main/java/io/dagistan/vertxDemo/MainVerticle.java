package io.dagistan.vertxDemo;

import io.vertx.core.AbstractVerticle;

public class MainVerticle extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        vertx.createHttpServer().requestHandler(req -> {
              req.response()
                .putHeader("content-type", "text/html")
                .end("Hello from Vert.x!");
            }).listen(8080);
        System.out.println("<h1>HTTP server started on port 8080</h1>");
    }
}
