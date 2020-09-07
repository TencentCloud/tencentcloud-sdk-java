package com.tencentcloudapi.common;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

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
    String req = ("send request, request url: " + request.urlString() + ". request headers information: " + request.headers().toString());
    req = req.replaceAll("\n", ";");
    this.info(req);
    Response response = chain.proceed(request);
    String resp = ("recieve response, response url: " + response.request().urlString() + ", response headers: " + response.headers().toString() + ",response body information: " + response.body().toString());
    resp = resp.replaceAll("\n", ";");
    this.info(resp);
    return response;
  }

}