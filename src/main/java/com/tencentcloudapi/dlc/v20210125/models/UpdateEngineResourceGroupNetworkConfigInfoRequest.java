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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateEngineResourceGroupNetworkConfigInfoRequest extends AbstractModel {

    /**
    * 引擎资源组ID
    */
    @SerializedName("EngineResourceGroupId")
    @Expose
    private String EngineResourceGroupId;

    /**
    * 是否立即重启资源组生效，0--立即生效，1--只保持不重启生效
    */
    @SerializedName("IsEffectiveNow")
    @Expose
    private Long IsEffectiveNow;

    /**
    * 资源组绑定的网络配置名称集合
    */
    @SerializedName("NetworkConfigNames")
    @Expose
    private String [] NetworkConfigNames;

    /**
     * Get 引擎资源组ID 
     * @return EngineResourceGroupId 引擎资源组ID
     */
    public String getEngineResourceGroupId() {
        return this.EngineResourceGroupId;
    }

    /**
     * Set 引擎资源组ID
     * @param EngineResourceGroupId 引擎资源组ID
     */
    public void setEngineResourceGroupId(String EngineResourceGroupId) {
        this.EngineResourceGroupId = EngineResourceGroupId;
    }

    /**
     * Get 是否立即重启资源组生效，0--立即生效，1--只保持不重启生效 
     * @return IsEffectiveNow 是否立即重启资源组生效，0--立即生效，1--只保持不重启生效
     */
    public Long getIsEffectiveNow() {
        return this.IsEffectiveNow;
    }

    /**
     * Set 是否立即重启资源组生效，0--立即生效，1--只保持不重启生效
     * @param IsEffectiveNow 是否立即重启资源组生效，0--立即生效，1--只保持不重启生效
     */
    public void setIsEffectiveNow(Long IsEffectiveNow) {
        this.IsEffectiveNow = IsEffectiveNow;
    }

    /**
     * Get 资源组绑定的网络配置名称集合 
     * @return NetworkConfigNames 资源组绑定的网络配置名称集合
     */
    public String [] getNetworkConfigNames() {
        return this.NetworkConfigNames;
    }

    /**
     * Set 资源组绑定的网络配置名称集合
     * @param NetworkConfigNames 资源组绑定的网络配置名称集合
     */
    public void setNetworkConfigNames(String [] NetworkConfigNames) {
        this.NetworkConfigNames = NetworkConfigNames;
    }

    public UpdateEngineResourceGroupNetworkConfigInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateEngineResourceGroupNetworkConfigInfoRequest(UpdateEngineResourceGroupNetworkConfigInfoRequest source) {
        if (source.EngineResourceGroupId != null) {
            this.EngineResourceGroupId = new String(source.EngineResourceGroupId);
        }
        if (source.IsEffectiveNow != null) {
            this.IsEffectiveNow = new Long(source.IsEffectiveNow);
        }
        if (source.NetworkConfigNames != null) {
            this.NetworkConfigNames = new String[source.NetworkConfigNames.length];
            for (int i = 0; i < source.NetworkConfigNames.length; i++) {
                this.NetworkConfigNames[i] = new String(source.NetworkConfigNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineResourceGroupId", this.EngineResourceGroupId);
        this.setParamSimple(map, prefix + "IsEffectiveNow", this.IsEffectiveNow);
        this.setParamArraySimple(map, prefix + "NetworkConfigNames.", this.NetworkConfigNames);

    }
}

