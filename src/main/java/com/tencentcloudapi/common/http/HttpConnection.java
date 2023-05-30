/*
 * Copyright (c) 2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.tencentcloudapi.common.http;

import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Authenticator;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.RequestBody;

import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.net.Proxy;;

public class HttpConnection {

  private OkHttpClient client;

  // https://stackoverflow.com/questions/31423154/performance-of-a-singleton-instance-okhttpclient
  // https://github.com/square/okhttp/issues/3372
  // Creating dispatcher and connectionPool is expensive.
  // Share them between OkHttpClients by singleton's Builder.
  private static final OkHttpClient clientSingleton = new OkHttpClient();

  public HttpConnection(Integer connTimeout, Integer readTimeout, Integer writeTimeout) {
    this.client = clientSingleton.newBuilder()
            .connectTimeout(connTimeout, TimeUnit.SECONDS)
            .readTimeout(readTimeout, TimeUnit.SECONDS)
            .writeTimeout(writeTimeout, TimeUnit.SECONDS)
            .build();
  }

  public void addInterceptors(Interceptor interceptor) {
    this.client = this.client.newBuilder().addInterceptor(interceptor).build();
  }

  public void setProxy(Proxy proxy) {
    this.client = this.client.newBuilder().proxy(proxy).build();
  }

  public void setProxyAuthenticator(Authenticator authenticator) {
    this.client = this.client.newBuilder().proxyAuthenticator(authenticator).build();
  }

  @Deprecated
  public void setSSLSocketFactory(SSLSocketFactory sslSocketFactory){
    this.client = this.client.newBuilder().sslSocketFactory(sslSocketFactory).build();
  }

  public void setSSLSocketFactory(SSLSocketFactory sslSocketFactory, X509TrustManager trustManager){
    this.client = this.client.newBuilder().sslSocketFactory(sslSocketFactory, trustManager).build();
  }

  public Response doRequest(Request request) throws TencentCloudSDKException {
    Response response = null;
    try {
      response = this.client.newCall(request).execute();
    } catch (IOException e) {
      throw new TencentCloudSDKException(e.getClass().getName() + "-" + e.getMessage());
    }
    return response;
  }

  public Response getRequest(String url) throws TencentCloudSDKException {
    Request request = null;
    try {
      request = new Request.Builder().url(url).get().build();
    } catch (IllegalArgumentException e) {
      throw new TencentCloudSDKException(e.getClass().getName() + "-" + e.getMessage());
    }

    return this.doRequest(request);
  }

  public Response getRequest(String url, Headers headers) throws TencentCloudSDKException {
    Request request = null;
    try {
      request = new Request.Builder().url(url).headers(headers).get().build();
    } catch (IllegalArgumentException e) {
      throw new TencentCloudSDKException(e.getClass().getName() + "-" + e.getMessage());
    }

    return this.doRequest(request);
  }

  public Response postRequest(String url, String body) throws TencentCloudSDKException {
    MediaType contentType = MediaType.parse("application/x-www-form-urlencoded");
    Request request = null;
    try {
      request = new Request.Builder().url(url).post(RequestBody.create(contentType, body)).build();
    } catch (IllegalArgumentException e) {
      throw new TencentCloudSDKException(e.getClass().getName() + "-" + e.getMessage());
    }

    return this.doRequest(request);
  }

  public Response postRequest(String url, String body, Headers headers)
      throws TencentCloudSDKException {
    MediaType contentType = MediaType.parse(headers.get("Content-Type"));
    Request request = null;
    try {
      request =
          new Request.Builder()
              .url(url)
              .post(RequestBody.create(contentType, body))
              .headers(headers)
              .build();
    } catch (IllegalArgumentException e) {
      throw new TencentCloudSDKException(e.getClass().getName() + "-" + e.getMessage());
    }

    return this.doRequest(request);
  }

  public Response postRequest(String url, byte[] body, Headers headers)
      throws TencentCloudSDKException {
    MediaType contentType = MediaType.parse(headers.get("Content-Type"));
    Request request = null;
    try {
      request =
          new Request.Builder()
              .url(url)
              .post(RequestBody.create(contentType, body))
              .headers(headers)
              .build();
    } catch (IllegalArgumentException e) {
      throw new TencentCloudSDKException(e.getClass().getName() + "-" + e.getMessage());
    }

    return this.doRequest(request);
  }
}
