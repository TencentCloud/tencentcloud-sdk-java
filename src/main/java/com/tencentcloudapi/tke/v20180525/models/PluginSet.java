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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PluginSet extends AbstractModel {

    /**
    * 指定需要额外启用的插件列表
    */
    @SerializedName("Enabled")
    @Expose
    private SchedulerPolicyPriority [] Enabled;

    /**
    * 指定需要禁用的默认插件列表
    */
    @SerializedName("Disabled")
    @Expose
    private SchedulerPolicyPriority [] Disabled;

    /**
     * Get 指定需要额外启用的插件列表 
     * @return Enabled 指定需要额外启用的插件列表
     */
    public SchedulerPolicyPriority [] getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 指定需要额外启用的插件列表
     * @param Enabled 指定需要额外启用的插件列表
     */
    public void setEnabled(SchedulerPolicyPriority [] Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 指定需要禁用的默认插件列表 
     * @return Disabled 指定需要禁用的默认插件列表
     */
    public SchedulerPolicyPriority [] getDisabled() {
        return this.Disabled;
    }

    /**
     * Set 指定需要禁用的默认插件列表
     * @param Disabled 指定需要禁用的默认插件列表
     */
    public void setDisabled(SchedulerPolicyPriority [] Disabled) {
        this.Disabled = Disabled;
    }

    public PluginSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PluginSet(PluginSet source) {
        if (source.Enabled != null) {
            this.Enabled = new SchedulerPolicyPriority[source.Enabled.length];
            for (int i = 0; i < source.Enabled.length; i++) {
                this.Enabled[i] = new SchedulerPolicyPriority(source.Enabled[i]);
            }
        }
        if (source.Disabled != null) {
            this.Disabled = new SchedulerPolicyPriority[source.Disabled.length];
            for (int i = 0; i < source.Disabled.length; i++) {
                this.Disabled[i] = new SchedulerPolicyPriority(source.Disabled[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Enabled.", this.Enabled);
        this.setParamArrayObj(map, prefix + "Disabled.", this.Disabled);

    }
}

