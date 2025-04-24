package com.tencentcloudapi.common;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;

/**
 * TCLog is a custom interceptor for logging HTTP requests and responses using OkHttp.
 * It can log information such as request URL, headers, and response body.
 */
class TCLog implements Interceptor {

    // Flag to enable or disable debugging
    private boolean debug;

    // Logger instance to log messages
    private Log logger = null;

    /**
     * Constructor to initialize the TCLog with a logger name and optional debug flag.
     *
     * @param name The name to be used for logging.
     */
    public TCLog(String name) {
        this(name, false);
    }

    /**
     * Constructor to initialize the TCLog with a logger name and a debug flag.
     *
     * @param name    The name to be used for logging.
     * @param isDebug Boolean flag to enable debug-level logging.
     */
    public TCLog(String name, boolean isDebug) {
        logger = LogFactory.getLog(name);
        this.debug = isDebug;
    }

    /**
     * Logs an informational message if debugging is enabled.
     *
     * @param str The message to be logged.
     */
    public void info(final String str) {
        if (debug) {
            logger.info(str);
        }
    }

    /**
     * Logs an informational message with an exception stack trace if debugging is enabled.
     *
     * @param str The message to be logged.
     * @param t   The exception to log with the message.
     */
    public void info(final String str, final Throwable t) {
        if (debug) {
            logger.info(str, t);
        }
    }

    /**
     * Logs a debug-level message if debugging is enabled.
     *
     * @param str The message to be logged.
     */
    public void debug(final String str) {
        if (debug) {
            logger.debug(str);
        }
    }

    /**
     * Logs a debug-level message with an exception stack trace if debugging is enabled.
     *
     * @param str The message to be logged.
     * @param t   The exception to log with the message.
     */
    public void debug(final String str, final Throwable t) {
        if (debug) {
            logger.debug(str, t);
        }
    }

    /**
     * Intercepts HTTP requests and responses to log detailed information about them.
     *
     * @param chain The OkHttp chain of request/response.
     * @return The response after proceeding with the request.
     * @throws IOException If an I/O error occurs while processing the request or response.
     */
    @Override
    public Response intercept(Interceptor.Chain chain) throws IOException {
        // Get the request being sent
        Request request = chain.request();
        String req =
                ("send request, request url: " + request.url() + ". request headers information: " + request.headers().toString());
        req = req.replaceAll("\n", ";");
        this.info(req);

        // Proceed with the request and get the response
        Response response = chain.proceed(request);
        String resp =
                ("recieve response, response url: " + response.request().url() + ", response headers: " + response.headers().toString() + ",response body information: " + response.body().toString());
        resp = resp.replaceAll("\n", ";");
        this.info(resp);

        return response;
    }
}
