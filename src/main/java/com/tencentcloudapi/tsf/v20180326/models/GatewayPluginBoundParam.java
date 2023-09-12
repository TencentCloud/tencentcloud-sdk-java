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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GatewayPluginBoundParam extends AbstractModel{

    /**
    * 插件id
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * 插件绑定到的对象类型:group/api/all
    */
    @SerializedName("ScopeType")
    @Expose
    private String ScopeType;

    /**
    * 插件绑定到的对象主键值，例如分组的ID/API的ID
    */
    @SerializedName("ScopeValue")
    @Expose
    private String ScopeValue;

    /**
    * 创建关联的服务id，关联envoy网关时使用
    */
    @SerializedName("MicroserviceId")
    @Expose
    private String MicroserviceId;

    /**
    * 网关id
    */
    @SerializedName("GatewayInstanceId")
    @Expose
    private String GatewayInstanceId;

    /**
     * Get 插件id 
     * @return PluginId 插件id
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set 插件id
     * @param PluginId 插件id
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get 插件绑定到的对象类型:group/api/all 
     * @return ScopeType 插件绑定到的对象类型:group/api/all
     */
    public String getScopeType() {
        return this.ScopeType;
    }

    /**
     * Set 插件绑定到的对象类型:group/api/all
     * @param ScopeType 插件绑定到的对象类型:group/api/all
     */
    public void setScopeType(String ScopeType) {
        this.ScopeType = ScopeType;
    }

    /**
     * Get 插件绑定到的对象主键值，例如分组的ID/API的ID 
     * @return ScopeValue 插件绑定到的对象主键值，例如分组的ID/API的ID
     */
    public String getScopeValue() {
        return this.ScopeValue;
    }

    /**
     * Set 插件绑定到的对象主键值，例如分组的ID/API的ID
     * @param ScopeValue 插件绑定到的对象主键值，例如分组的ID/API的ID
     */
    public void setScopeValue(String ScopeValue) {
        this.ScopeValue = ScopeValue;
    }

    /**
     * Get 创建关联的服务id，关联envoy网关时使用 
     * @return MicroserviceId 创建关联的服务id，关联envoy网关时使用
     */
    public String getMicroserviceId() {
        return this.MicroserviceId;
    }

    /**
     * Set 创建关联的服务id，关联envoy网关时使用
     * @param MicroserviceId 创建关联的服务id，关联envoy网关时使用
     */
    public void setMicroserviceId(String MicroserviceId) {
        this.MicroserviceId = MicroserviceId;
    }

    /**
     * Get 网关id 
     * @return GatewayInstanceId 网关id
     */
    public String getGatewayInstanceId() {
        return this.GatewayInstanceId;
    }

    /**
     * Set 网关id
     * @param GatewayInstanceId 网关id
     */
    public void setGatewayInstanceId(String GatewayInstanceId) {
        this.GatewayInstanceId = GatewayInstanceId;
    }

    public GatewayPluginBoundParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GatewayPluginBoundParam(GatewayPluginBoundParam source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.ScopeType != null) {
            this.ScopeType = new String(source.ScopeType);
        }
        if (source.ScopeValue != null) {
            this.ScopeValue = new String(source.ScopeValue);
        }
        if (source.MicroserviceId != null) {
            this.MicroserviceId = new String(source.MicroserviceId);
        }
        if (source.GatewayInstanceId != null) {
            this.GatewayInstanceId = new String(source.GatewayInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "ScopeType", this.ScopeType);
        this.setParamSimple(map, prefix + "ScopeValue", this.ScopeValue);
        this.setParamSimple(map, prefix + "MicroserviceId", this.MicroserviceId);
        this.setParamSimple(map, prefix + "GatewayInstanceId", this.GatewayInstanceId);

    }
}

