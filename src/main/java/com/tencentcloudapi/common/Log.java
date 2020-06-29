package com.tencentcloudapi.common;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

class Log implements Interceptor {
  private boolean debug;
  private Logger logger = null;
  
  public Log(String name) {
    this(name, false);
  }

  public Log(String name, boolean isDebug) {
    logger = Logger.getLogger(name);
    File file = new File("log4j.properties");
    if (!file.exists()) {
      this.debug = false;
      BasicConfigurator.configure();
      logger.warn("The configuration file of log4j does not exist, please refer to tencentcloud-sdk-java/log4j.properties for configuration.");
    } else {
      this.debug = isDebug;
      PropertyConfigurator.configure("log4j.properties");
    }
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
    this.debug(req);
    Response response = chain.proceed(request);
    String resp = ("recieve response, response url: " + response.request().urlString() + ", response headers: " + response.headers().toString() + ",response body information: " + response.body().toString());
    resp = resp.replaceAll("\n", ";");
    this.debug(resp);
    return response;
  }

}
