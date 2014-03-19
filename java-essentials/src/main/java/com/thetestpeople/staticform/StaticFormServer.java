package com.thetestpeople.staticform;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;

public class StaticFormServer {
	private final static Server SERVER = new Server(8080);

	public static void start() throws Exception {
		ResourceHandler resourceHandler = new ResourceHandler();
		resourceHandler.setDirectoriesListed(false);
		resourceHandler.setWelcomeFiles(new String[] { "index.html" });

		resourceHandler.setResourceBase("webroot/staticform");

		HandlerList handlers = new HandlerList();
		handlers.setHandlers(new Handler[] { resourceHandler,
				new DefaultHandler() });
		SERVER.setHandler(handlers);

		SERVER.start();
	}

	public static void stop() throws Exception {
		SERVER.stop();
	}

}
