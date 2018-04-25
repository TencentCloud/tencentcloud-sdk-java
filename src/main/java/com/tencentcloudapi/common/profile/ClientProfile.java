/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
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
 * client选项类
 * @author Administrator
 *
 */
public class ClientProfile {
	
	/**
	 * HmacSHA1签名方法
	 */
    public static final String SIGN_SHA1 = "HmacSHA1";
    
    /**
     * HmacSHA256签名方法
     */
    public static final String SIGN_SHA256 = "HmacSHA256";
    
    /**
     * http相关选项，请参考HttpProfile
     */
	private HttpProfile httpProfile;
	
	/**
	 * 签名方法
	 */
	private String signMethod;
	
	/**
	 * @param signMethod  签名方法
	 * @param httpProfile HttpProfile实例
	 */
	public ClientProfile(String signMethod, HttpProfile httpProfile) {
		this.signMethod = signMethod;
		this.httpProfile = httpProfile;
	}
	
	public ClientProfile(String signMethod) {
		this(signMethod, new HttpProfile());
	}
	
	public ClientProfile() {
		this(ClientProfile.SIGN_SHA256, new HttpProfile());
	}
	
	/**
	 * 设置签名方法
	 * @param signMethod (HmacSHA1 HmacSHA256)
	 */
	public void setSignMethod(String signMethod) {
		this.signMethod = signMethod;
	}
	
	/**
	 * 设置http选项
	 * @param httpProfile 参考HttpProfile
	 */
	public void setHttpProfile(HttpProfile httpProfile) {
		this.httpProfile = httpProfile;
	}
	
	/**
	 * 获取签名方法
	 * @return
	 */
	public String getSignMethod() {
		return this.signMethod;
	}
	
	/**
	 * 获取HttpProfile实例
	 * @return
	 */
	public HttpProfile getHttpProfile() {
		return this.httpProfile;
	}
}
