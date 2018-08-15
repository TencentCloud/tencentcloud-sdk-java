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

package com.tencentcloudapi.common.profile;

/**
 * http选项类
 */
public class HttpProfile {
	
	/**
	 * https协议
	 */
	public static final String REQ_HTTPS = "https://";
	
	/**
	 * http协议
	 */
	public static final String REQ_HTTP = "http://";
	
	/**
	 * post请求
	 */
    public static final String REQ_POST = "POST";
    
    /**
     * get请求
     */
    public static final String REQ_GET = "GET";
    
    /**
     * 时间单位，1分钟   60s
     */
    public static final int TM_MINUTE = 60;
	
    /**
     * 请求方法
     */
	private String reqMethod;
	
	/**
	 * 请求域名
	 */
	private String endpoint;
	
	/**
	 * 请求协议
	 */
	private String protocol;
	
	/**
	 * 读超时时间
	 */
	private int readTimeout;
	
	/**
	 * 写超时时间
	 */
	private int writeTimeout;
	
	/**
	 * 连接超时时间
	 */
	private int connTimeout;
	
	
	public HttpProfile() {
		this.reqMethod = HttpProfile.REQ_POST;
		this.endpoint = null;
		this.protocol = HttpProfile.REQ_HTTPS;
		this.readTimeout = 0;
		this.writeTimeout = 0;
		this.connTimeout = HttpProfile.TM_MINUTE;
	}
	
	/**
	 * 设置请求方法
	 * @param reqMethod 请求方法
	 */
	public void setReqMethod(String reqMethod) {
		this.reqMethod = reqMethod;
	}
	
	/**
	 * 设置请求域名
	 * @param endpoint 域名(xx.[region.]tencentcloudapi.com)
	 */
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	
	/**
	 * 设置读超时时间
	 * @param readTimeout 读超时时间
	 */
	public void setReadTimeout(int readTimeout) {
		this.readTimeout = readTimeout;
	}
	
	/**
	 * 设置写超时时间
	 * @param writeTimeout 写超时时间
	 */
	public void setWriteTimeout(int writeTimeout) {
		this.writeTimeout = writeTimeout;
	}
	
	/**
	 * 设置连接超时时间
	 * @param connTimeout 连接超时时间
	 */
	public void setConnTimeout(int connTimeout) {
		this.connTimeout = connTimeout;
	}
	
	/**
	 * 设置请求协议
	 * @param protocol 请求协议（https:// http://）
	 */
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	
	/**
	 * 获取请求方法
	 * @return reqMethod
	 */
	public String getReqMethod() {
		return this.reqMethod;
	}
	
	/**
	 * 获取请求域名
	 * @return endpoint
	 */
	public String getEndpoint() {
		return this.endpoint;
	}
	
	/**
	 * 获取读超时时间
	 * @return readTimeout
	 */
	public int getReadTimeout() {
		return this.readTimeout;
	}
	
	/**
	 * 获取写超时时间
	 * @return writeTimeout
	 */
	public int getWriteTimeout() {
		return this.writeTimeout;
	}
	
	/**
	 * 获取连接超时时间
	 * @return connTimeout
	 */
	public int getConnTimeout() {
		return this.connTimeout;
	}
	
	/**
	 * 获取请求协议
	 * @return protocol
	 */
	public String getProtocol() {
		return this.protocol;
	}
}
