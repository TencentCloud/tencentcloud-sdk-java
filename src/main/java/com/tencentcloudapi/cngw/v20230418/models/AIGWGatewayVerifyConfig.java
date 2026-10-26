/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWGatewayVerifyConfig extends AbstractModel {

    /**
    * <p>是否开启网关验签</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>网关验签类型</p><p>枚举值：</p><ul><li>OAuth： OAuth2</li></ul>
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
    * <p>OAuth2验签配置</p>
    */
    @SerializedName("OAuthConfig")
    @Expose
    private AIGWGatewayVerifyOAuthConfig OAuthConfig;

    /**
     * Get <p>是否开启网关验签</p> 
     * @return Enable <p>是否开启网关验签</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>是否开启网关验签</p>
     * @param Enable <p>是否开启网关验签</p>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>网关验签类型</p><p>枚举值：</p><ul><li>OAuth： OAuth2</li></ul> 
     * @return VerifyType <p>网关验签类型</p><p>枚举值：</p><ul><li>OAuth： OAuth2</li></ul>
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set <p>网关验签类型</p><p>枚举值：</p><ul><li>OAuth： OAuth2</li></ul>
     * @param VerifyType <p>网关验签类型</p><p>枚举值：</p><ul><li>OAuth： OAuth2</li></ul>
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    /**
     * Get <p>OAuth2验签配置</p> 
     * @return OAuthConfig <p>OAuth2验签配置</p>
     */
    public AIGWGatewayVerifyOAuthConfig getOAuthConfig() {
        return this.OAuthConfig;
    }

    /**
     * Set <p>OAuth2验签配置</p>
     * @param OAuthConfig <p>OAuth2验签配置</p>
     */
    public void setOAuthConfig(AIGWGatewayVerifyOAuthConfig OAuthConfig) {
        this.OAuthConfig = OAuthConfig;
    }

    public AIGWGatewayVerifyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWGatewayVerifyConfig(AIGWGatewayVerifyConfig source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.VerifyType != null) {
            this.VerifyType = new String(source.VerifyType);
        }
        if (source.OAuthConfig != null) {
            this.OAuthConfig = new AIGWGatewayVerifyOAuthConfig(source.OAuthConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);
        this.setParamObj(map, prefix + "OAuthConfig.", this.OAuthConfig);

    }
}

