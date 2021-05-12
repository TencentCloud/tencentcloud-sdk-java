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
    * 插件绑定到的对象类型:group/api
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
     * Get 插件绑定到的对象类型:group/api 
     * @return ScopeType 插件绑定到的对象类型:group/api
     */
    public String getScopeType() {
        return this.ScopeType;
    }

    /**
     * Set 插件绑定到的对象类型:group/api
     * @param ScopeType 插件绑定到的对象类型:group/api
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "ScopeType", this.ScopeType);
        this.setParamSimple(map, prefix + "ScopeValue", this.ScopeValue);

    }
}

