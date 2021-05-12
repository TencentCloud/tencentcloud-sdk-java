/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyApiIncrementRequest extends AbstractModel{

    /**
    * 服务ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 接口ID
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * 需要修改的API auth类型(可选择OAUTH-授权API)
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * oauth接口需要修改的公钥值
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * oauth接口重定向地址
    */
    @SerializedName("LoginRedirectUrl")
    @Expose
    private String LoginRedirectUrl;

    /**
     * Get 服务ID 
     * @return ServiceId 服务ID
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务ID
     * @param ServiceId 服务ID
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 接口ID 
     * @return ApiId 接口ID
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set 接口ID
     * @param ApiId 接口ID
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get 需要修改的API auth类型(可选择OAUTH-授权API) 
     * @return BusinessType 需要修改的API auth类型(可选择OAUTH-授权API)
     */
    public String getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set 需要修改的API auth类型(可选择OAUTH-授权API)
     * @param BusinessType 需要修改的API auth类型(可选择OAUTH-授权API)
     */
    public void setBusinessType(String BusinessType) {
        this.BusinessType = BusinessType;
    }

    /**
     * Get oauth接口需要修改的公钥值 
     * @return PublicKey oauth接口需要修改的公钥值
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set oauth接口需要修改的公钥值
     * @param PublicKey oauth接口需要修改的公钥值
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get oauth接口重定向地址 
     * @return LoginRedirectUrl oauth接口重定向地址
     */
    public String getLoginRedirectUrl() {
        return this.LoginRedirectUrl;
    }

    /**
     * Set oauth接口重定向地址
     * @param LoginRedirectUrl oauth接口重定向地址
     */
    public void setLoginRedirectUrl(String LoginRedirectUrl) {
        this.LoginRedirectUrl = LoginRedirectUrl;
    }

    public ModifyApiIncrementRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApiIncrementRequest(ModifyApiIncrementRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.BusinessType != null) {
            this.BusinessType = new String(source.BusinessType);
        }
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
        if (source.LoginRedirectUrl != null) {
            this.LoginRedirectUrl = new String(source.LoginRedirectUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "BusinessType", this.BusinessType);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "LoginRedirectUrl", this.LoginRedirectUrl);

    }
}

