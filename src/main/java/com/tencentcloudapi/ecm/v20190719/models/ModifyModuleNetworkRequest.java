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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyModuleNetworkRequest extends AbstractModel{

    /**
    * 模块Id
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * 默认出带宽上限
    */
    @SerializedName("DefaultBandwidth")
    @Expose
    private Long DefaultBandwidth;

    /**
    * 默认入带宽上限
    */
    @SerializedName("DefaultBandwidthIn")
    @Expose
    private Long DefaultBandwidthIn;

    /**
     * Get 模块Id 
     * @return ModuleId 模块Id
     */
    public String getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set 模块Id
     * @param ModuleId 模块Id
     */
    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get 默认出带宽上限 
     * @return DefaultBandwidth 默认出带宽上限
     */
    public Long getDefaultBandwidth() {
        return this.DefaultBandwidth;
    }

    /**
     * Set 默认出带宽上限
     * @param DefaultBandwidth 默认出带宽上限
     */
    public void setDefaultBandwidth(Long DefaultBandwidth) {
        this.DefaultBandwidth = DefaultBandwidth;
    }

    /**
     * Get 默认入带宽上限 
     * @return DefaultBandwidthIn 默认入带宽上限
     */
    public Long getDefaultBandwidthIn() {
        return this.DefaultBandwidthIn;
    }

    /**
     * Set 默认入带宽上限
     * @param DefaultBandwidthIn 默认入带宽上限
     */
    public void setDefaultBandwidthIn(Long DefaultBandwidthIn) {
        this.DefaultBandwidthIn = DefaultBandwidthIn;
    }

    public ModifyModuleNetworkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyModuleNetworkRequest(ModifyModuleNetworkRequest source) {
        if (source.ModuleId != null) {
            this.ModuleId = new String(source.ModuleId);
        }
        if (source.DefaultBandwidth != null) {
            this.DefaultBandwidth = new Long(source.DefaultBandwidth);
        }
        if (source.DefaultBandwidthIn != null) {
            this.DefaultBandwidthIn = new Long(source.DefaultBandwidthIn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamSimple(map, prefix + "DefaultBandwidth", this.DefaultBandwidth);
        this.setParamSimple(map, prefix + "DefaultBandwidthIn", this.DefaultBandwidthIn);

    }
}

