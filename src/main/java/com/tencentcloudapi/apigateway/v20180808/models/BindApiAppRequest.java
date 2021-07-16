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

public class BindApiAppRequest extends AbstractModel{

    /**
    * 待绑定的应用唯一 ID 。
    */
    @SerializedName("ApiAppId")
    @Expose
    private String ApiAppId;

    /**
    * 待绑定的环境。
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * 待绑定的服务唯一 ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 待绑定的API唯一ID。
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
     * Get 待绑定的应用唯一 ID 。 
     * @return ApiAppId 待绑定的应用唯一 ID 。
     */
    public String getApiAppId() {
        return this.ApiAppId;
    }

    /**
     * Set 待绑定的应用唯一 ID 。
     * @param ApiAppId 待绑定的应用唯一 ID 。
     */
    public void setApiAppId(String ApiAppId) {
        this.ApiAppId = ApiAppId;
    }

    /**
     * Get 待绑定的环境。 
     * @return Environment 待绑定的环境。
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 待绑定的环境。
     * @param Environment 待绑定的环境。
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    /**
     * Get 待绑定的服务唯一 ID。 
     * @return ServiceId 待绑定的服务唯一 ID。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 待绑定的服务唯一 ID。
     * @param ServiceId 待绑定的服务唯一 ID。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 待绑定的API唯一ID。 
     * @return ApiId 待绑定的API唯一ID。
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set 待绑定的API唯一ID。
     * @param ApiId 待绑定的API唯一ID。
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    public BindApiAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindApiAppRequest(BindApiAppRequest source) {
        if (source.ApiAppId != null) {
            this.ApiAppId = new String(source.ApiAppId);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiAppId", this.ApiAppId);
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);

    }
}

