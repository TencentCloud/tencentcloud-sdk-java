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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigGroupWorkModeInfo extends AbstractModel {

    /**
    * 配置组类型，可选项如下：<li>l7_acceleration: 七层加速配置组；</li><li>edge_functions: 边缘函数配置组。</li>
    */
    @SerializedName("ConfigGroupType")
    @Expose
    private String ConfigGroupType;

    /**
    * 工作模式，可选项如下：<li>immediate_effect: 即时生效模式；</li><li>version_control: 版本管理模式。</li>
    */
    @SerializedName("WorkMode")
    @Expose
    private String WorkMode;

    /**
     * Get 配置组类型，可选项如下：<li>l7_acceleration: 七层加速配置组；</li><li>edge_functions: 边缘函数配置组。</li> 
     * @return ConfigGroupType 配置组类型，可选项如下：<li>l7_acceleration: 七层加速配置组；</li><li>edge_functions: 边缘函数配置组。</li>
     */
    public String getConfigGroupType() {
        return this.ConfigGroupType;
    }

    /**
     * Set 配置组类型，可选项如下：<li>l7_acceleration: 七层加速配置组；</li><li>edge_functions: 边缘函数配置组。</li>
     * @param ConfigGroupType 配置组类型，可选项如下：<li>l7_acceleration: 七层加速配置组；</li><li>edge_functions: 边缘函数配置组。</li>
     */
    public void setConfigGroupType(String ConfigGroupType) {
        this.ConfigGroupType = ConfigGroupType;
    }

    /**
     * Get 工作模式，可选项如下：<li>immediate_effect: 即时生效模式；</li><li>version_control: 版本管理模式。</li> 
     * @return WorkMode 工作模式，可选项如下：<li>immediate_effect: 即时生效模式；</li><li>version_control: 版本管理模式。</li>
     */
    public String getWorkMode() {
        return this.WorkMode;
    }

    /**
     * Set 工作模式，可选项如下：<li>immediate_effect: 即时生效模式；</li><li>version_control: 版本管理模式。</li>
     * @param WorkMode 工作模式，可选项如下：<li>immediate_effect: 即时生效模式；</li><li>version_control: 版本管理模式。</li>
     */
    public void setWorkMode(String WorkMode) {
        this.WorkMode = WorkMode;
    }

    public ConfigGroupWorkModeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigGroupWorkModeInfo(ConfigGroupWorkModeInfo source) {
        if (source.ConfigGroupType != null) {
            this.ConfigGroupType = new String(source.ConfigGroupType);
        }
        if (source.WorkMode != null) {
            this.WorkMode = new String(source.WorkMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigGroupType", this.ConfigGroupType);
        this.setParamSimple(map, prefix + "WorkMode", this.WorkMode);

    }
}

