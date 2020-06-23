package com.tencentcloudapi.common;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

class Log implements Interceptor {
  private boolean debug;
  private Logger logger = null;
  private static Log log = null;

  private Log() {
    this(false);
  }

  private Log(boolean isDebug) {
    File file = new File("log4j.properties");
    if (!file.exists()) {
      this.debug = false;
    } else {
      this.debug = isDebug;
    }
    logger = Logger.getLogger(this.getClass().getName());
    PropertyConfigurator.configure("log4j.properties");
    logger.setLevel(Level.ALL);
  }

  public static Log getLog(boolean isDebug) {
    if (log == null) {
      synchronized (Log.class) {
        if (log == null) {
          log = new Log(isDebug);
        }
      }
    }
    return log;
  }

  public static Log getLog() {
    if (log == null) {
      synchronized (Log.class) {
        if (log == null) {
          log = new Log(false);
        }
      }
    }
    return log;
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
      logger.info(str, t);
    }
  }

  @Override
  public Response intercept(Interceptor.Chain chain) throws IOException {
    Request request = chain.request();
    String req = ("send request, request url: " + request.urlString() + ". request headers information: " + request.headers().toString());
    req = req.replaceAll("\n", ";");
    getLog().debug(req);
    Response response = chain.proceed(request);
    String resp = ("recieve response, response url: " + response.request().urlString() + ", response headers: " + response.headers().toString() + ",response body information: " + response.body().toString());
    resp = resp.replaceAll("\n", ";");
    getLog().debug(resp);
    return response;
  }

}
