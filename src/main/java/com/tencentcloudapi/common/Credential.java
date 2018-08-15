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

package com.tencentcloudapi.common;

/**
 * 认证相关信息类
 */
public class Credential {
	
	/**
	 * secretId,在控制台申请
	 */
	private String secretId;
	
	/**
	 * secretKey,在控制台申请
	 */
	private String secretKey;
	
	/**
	 * token
	 */
	private String token;
	
	/**
	 * @param secretId 在控制台申请
	 * @param secretKey 在控制台申请
	 */
	public Credential(String secretId, String secretKey) {
		this(secretId, secretKey, "");
	}
	
	/**
	 * @param secretId 在控制台申请
	 * @param secretKey 在控制台申请
	 * @param token
	 */
	public Credential(String secretId, String secretKey, String token) {
		this.secretId = secretId;
		this.secretKey = secretKey;
		this.token = token;
	}
	
	/**
	 * 设置secretId
	 * @param secretId
	 */
	public void setSecretId(String secretId) {
		this.secretId = secretId;
	}
	
	/**
	 * 设置secretKey
	 * @param secretKey
	 */
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
	
	/**
	 * 设置token
	 * @param token
	 */
	public void setToken(String token) {
		this.token = token;
	}
	
	/**
	 * 获取secretId
	 * @return secretId
	 */
	public String getSecretId() {
		return this.secretId;
	}
	
	/**
	 * 获取secretKey
	 * @return secretKey
	 */
	public String getSecretKey() {
		return this.secretKey;
	}
	
	/**
	 * 获取token
	 * @return token
	 */
	public String getToken() {
		return this.token;
	}
	
}
