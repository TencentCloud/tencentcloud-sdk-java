package com.tencentcloudapi.common;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;

class TCLog implements Interceptor {
    private boolean debug;
    private Log logger = null;

    public TCLog(String name) {
        this(name, false);
    }

    public TCLog(String name, boolean isDebug) {
        logger = LogFactory.getLog(name);
        this.debug = isDebug;
    }

    public void info(final String str) {
        if (debug) {
            logger.info(str);
        }
    }

    public void info(final String str, final Throwable t) {
        if (debug) {
            logger.info(str, t);
        }
    }

    public void debug(final String str) {
        if (debug) {
            logger.debug(str);
        }

    }

    public void debug(final String str, final Throwable t) {
        if (debug) {
            logger.debug(str, t);
        }
    }

    @Override
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        String req = ("send request, request url: " + request.url() + ". request headers information: " + request.headers().toString());
        req = req.replaceAll("\n", ";");
        this.info(req);
        Response response = chain.proceed(request);
        String resp = ("recieve response, response url: " + response.request().url() + ", response headers: " + response.headers().toString() + ",response body information: " + response.body().toString());
        resp = resp.replaceAll("\n", ";");
        this.info(resp);
        return response;
    }

}