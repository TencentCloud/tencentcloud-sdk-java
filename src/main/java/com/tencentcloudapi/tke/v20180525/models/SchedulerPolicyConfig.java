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

public class SchedulerPolicyConfig extends AbstractModel {

    /**
    * 调度器名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerName")
    @Expose
    private String SchedulerName;

    /**
    * 调度器plugin配置参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PluginConfigs")
    @Expose
    private SchedulerPluginConfigs [] PluginConfigs;

    /**
    * 插件配置
    */
    @SerializedName("PluginSet")
    @Expose
    private PluginSet PluginSet;

    /**
     * Get 调度器名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulerName 调度器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchedulerName() {
        return this.SchedulerName;
    }

    /**
     * Set 调度器名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulerName 调度器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulerName(String SchedulerName) {
        this.SchedulerName = SchedulerName;
    }

    /**
     * Get 调度器plugin配置参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PluginConfigs 调度器plugin配置参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SchedulerPluginConfigs [] getPluginConfigs() {
        return this.PluginConfigs;
    }

    /**
     * Set 调度器plugin配置参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PluginConfigs 调度器plugin配置参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPluginConfigs(SchedulerPluginConfigs [] PluginConfigs) {
        this.PluginConfigs = PluginConfigs;
    }

    /**
     * Get 插件配置 
     * @return PluginSet 插件配置
     */
    public PluginSet getPluginSet() {
        return this.PluginSet;
    }

    /**
     * Set 插件配置
     * @param PluginSet 插件配置
     */
    public void setPluginSet(PluginSet PluginSet) {
        this.PluginSet = PluginSet;
    }

    public SchedulerPolicyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SchedulerPolicyConfig(SchedulerPolicyConfig source) {
        if (source.SchedulerName != null) {
            this.SchedulerName = new String(source.SchedulerName);
        }
        if (source.PluginConfigs != null) {
            this.PluginConfigs = new SchedulerPluginConfigs[source.PluginConfigs.length];
            for (int i = 0; i < source.PluginConfigs.length; i++) {
                this.PluginConfigs[i] = new SchedulerPluginConfigs(source.PluginConfigs[i]);
            }
        }
        if (source.PluginSet != null) {
            this.PluginSet = new PluginSet(source.PluginSet);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SchedulerName", this.SchedulerName);
        this.setParamArrayObj(map, prefix + "PluginConfigs.", this.PluginConfigs);
        this.setParamObj(map, prefix + "PluginSet.", this.PluginSet);

    }
}

