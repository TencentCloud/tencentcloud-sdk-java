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

public class DetachPluginRequest extends AbstractModel{

    /**
    * 要解绑的API网关插件ID。
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * 要操作的服务ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 要操作API的环境。
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * 要解绑的API ID。
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
     * Get 要解绑的API网关插件ID。 
     * @return PluginId 要解绑的API网关插件ID。
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set 要解绑的API网关插件ID。
     * @param PluginId 要解绑的API网关插件ID。
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get 要操作的服务ID。 
     * @return ServiceId 要操作的服务ID。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 要操作的服务ID。
     * @param ServiceId 要操作的服务ID。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 要操作API的环境。 
     * @return EnvironmentName 要操作API的环境。
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set 要操作API的环境。
     * @param EnvironmentName 要操作API的环境。
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get 要解绑的API ID。 
     * @return ApiId 要解绑的API ID。
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set 要解绑的API ID。
     * @param ApiId 要解绑的API ID。
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    public DetachPluginRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetachPluginRequest(DetachPluginRequest source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);

    }
}

