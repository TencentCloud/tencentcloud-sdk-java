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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallInfo extends AbstractModel {

    /**
    * 服务ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 服务调用地址
    */
    @SerializedName("PublicEndpoint")
    @Expose
    private String PublicEndpoint;

    /**
    * 服务调用的API_KEY
    */
    @SerializedName("ApiKey")
    @Expose
    private String ApiKey;

    /**
    * 内网调用地址
    */
    @SerializedName("VpcEndpoint")
    @Expose
    private String VpcEndpoint;

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
     * Get 服务调用地址 
     * @return PublicEndpoint 服务调用地址
     */
    public String getPublicEndpoint() {
        return this.PublicEndpoint;
    }

    /**
     * Set 服务调用地址
     * @param PublicEndpoint 服务调用地址
     */
    public void setPublicEndpoint(String PublicEndpoint) {
        this.PublicEndpoint = PublicEndpoint;
    }

    /**
     * Get 服务调用的API_KEY 
     * @return ApiKey 服务调用的API_KEY
     */
    public String getApiKey() {
        return this.ApiKey;
    }

    /**
     * Set 服务调用的API_KEY
     * @param ApiKey 服务调用的API_KEY
     */
    public void setApiKey(String ApiKey) {
        this.ApiKey = ApiKey;
    }

    /**
     * Get 内网调用地址 
     * @return VpcEndpoint 内网调用地址
     */
    public String getVpcEndpoint() {
        return this.VpcEndpoint;
    }

    /**
     * Set 内网调用地址
     * @param VpcEndpoint 内网调用地址
     */
    public void setVpcEndpoint(String VpcEndpoint) {
        this.VpcEndpoint = VpcEndpoint;
    }

    public CallInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallInfo(CallInfo source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.PublicEndpoint != null) {
            this.PublicEndpoint = new String(source.PublicEndpoint);
        }
        if (source.ApiKey != null) {
            this.ApiKey = new String(source.ApiKey);
        }
        if (source.VpcEndpoint != null) {
            this.VpcEndpoint = new String(source.VpcEndpoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "PublicEndpoint", this.PublicEndpoint);
        this.setParamSimple(map, prefix + "ApiKey", this.ApiKey);
        this.setParamSimple(map, prefix + "VpcEndpoint", this.VpcEndpoint);

    }
}

