package com.process.xboot.webserver;

/**
 * Simple interface that represents a fully configured web server (for example Tomcat, Jetty,
 * Netty). Allows the server to be {@link #start() started} and {@link #stop() stopped}.
 *
 * @author Phillip Webb
 * @author Dave Syer
 * @since 2.0.0
 */
public interface WebServer {

  /**
   * Starts the web server. Calling this method on an already started server has no effect.
   *
   * @throws WebServerException if the server cannot be started
   */
  void start() throws WebServerException;

  /**
   * Stops the web server. Calling this method on an already stopped server has no effect.
   *
   * @throws WebServerException if the server cannot be stopped
   */
  void stop() throws WebServerException;

  /**
   * Return the port this server is listening on.
   *
   * @return the port (or -1 if none)
   */
  int getPort();

}