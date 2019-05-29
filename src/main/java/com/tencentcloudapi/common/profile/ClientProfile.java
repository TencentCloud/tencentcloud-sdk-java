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
     * Signature Version 3
     */
    public static final String SIGN_TC3_256 = "TC3-HMAC-SHA256";
    
    /**
     * http相关选项，请参考HttpProfile
     */
	private HttpProfile httpProfile;
	
	/**
	 * 签名方法
	 */
	private String signMethod;
	
	/**
	 * If payload is NOT involved in signing process, true means will ignore payload,
	 * default is false.
	 */
	private boolean unsignedPayload;
	
	/**
	 * @param signMethod  签名方法
	 * @param httpProfile HttpProfile实例
	 */
    public ClientProfile(String signMethod, HttpProfile httpProfile) {
        if (signMethod == null || signMethod.isEmpty()) {
            signMethod = SIGN_TC3_256;
        }
        this.signMethod = signMethod;
        this.httpProfile = httpProfile;
        this.unsignedPayload = false;
    }

    public ClientProfile(String signMethod) {
        this(signMethod, new HttpProfile());
    }
	
	public ClientProfile() {
		this(ClientProfile.SIGN_TC3_256, new HttpProfile());
	}
	
	/**
	 * 设置签名方法
	 * @param signMethod
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
	 * @return 签名方法
	 */
	public String getSignMethod() {
		return this.signMethod;
	}
	
	/**
	 * 获取HttpProfile实例
	 * @return HttpProfile实例
	 */
	public HttpProfile getHttpProfile() {
		return this.httpProfile;
	}
	
	/**
	 * Set the flag of whether payload should be ignored.
	 * Only has effect when request method is POST.
	 * @param flag
	 */
	public void setUnsignedPayload(boolean flag) {
	    this.unsignedPayload = flag;
	}

	/**
	 * Get the flag of whether payload is ignored.
	 * @return
	 */
	public boolean isUnsignedPayload() {
	    return this.unsignedPayload;
	}
}
