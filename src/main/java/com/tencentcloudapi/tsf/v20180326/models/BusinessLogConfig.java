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

public class BusinessLogConfig extends AbstractModel{

    /**
    * 配置项ID
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 配置项名称
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * 配置项日志路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigPath")
    @Expose
    private String ConfigPath;

    /**
    * 配置项描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigDesc")
    @Expose
    private String ConfigDesc;

    /**
    * 配置项标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigTags")
    @Expose
    private String ConfigTags;

    /**
    * 配置项对应的ES管道
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigPipeline")
    @Expose
    private String ConfigPipeline;

    /**
    * 配置项创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigCreateTime")
    @Expose
    private String ConfigCreateTime;

    /**
    * 配置项更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigUpdateTime")
    @Expose
    private String ConfigUpdateTime;

    /**
    * 配置项解析规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigSchema")
    @Expose
    private BusinessLogConfigSchema ConfigSchema;

    /**
    * 配置项关联部署组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigAssociatedGroups")
    @Expose
    private BusinesLogConfigAssociatedGroup [] ConfigAssociatedGroups;

    /**
     * Get 配置项ID 
     * @return ConfigId 配置项ID
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 配置项ID
     * @param ConfigId 配置项ID
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get 配置项名称 
     * @return ConfigName 配置项名称
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set 配置项名称
     * @param ConfigName 配置项名称
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get 配置项日志路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigPath 配置项日志路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigPath() {
        return this.ConfigPath;
    }

    /**
     * Set 配置项日志路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigPath 配置项日志路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigPath(String ConfigPath) {
        this.ConfigPath = ConfigPath;
    }

    /**
     * Get 配置项描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigDesc 配置项描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigDesc() {
        return this.ConfigDesc;
    }

    /**
     * Set 配置项描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigDesc 配置项描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigDesc(String ConfigDesc) {
        this.ConfigDesc = ConfigDesc;
    }

    /**
     * Get 配置项标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigTags 配置项标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigTags() {
        return this.ConfigTags;
    }

    /**
     * Set 配置项标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigTags 配置项标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigTags(String ConfigTags) {
        this.ConfigTags = ConfigTags;
    }

    /**
     * Get 配置项对应的ES管道
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigPipeline 配置项对应的ES管道
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigPipeline() {
        return this.ConfigPipeline;
    }

    /**
     * Set 配置项对应的ES管道
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigPipeline 配置项对应的ES管道
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigPipeline(String ConfigPipeline) {
        this.ConfigPipeline = ConfigPipeline;
    }

    /**
     * Get 配置项创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigCreateTime 配置项创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigCreateTime() {
        return this.ConfigCreateTime;
    }

    /**
     * Set 配置项创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigCreateTime 配置项创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigCreateTime(String ConfigCreateTime) {
        this.ConfigCreateTime = ConfigCreateTime;
    }

    /**
     * Get 配置项更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigUpdateTime 配置项更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigUpdateTime() {
        return this.ConfigUpdateTime;
    }

    /**
     * Set 配置项更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigUpdateTime 配置项更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigUpdateTime(String ConfigUpdateTime) {
        this.ConfigUpdateTime = ConfigUpdateTime;
    }

    /**
     * Get 配置项解析规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigSchema 配置项解析规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BusinessLogConfigSchema getConfigSchema() {
        return this.ConfigSchema;
    }

    /**
     * Set 配置项解析规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigSchema 配置项解析规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigSchema(BusinessLogConfigSchema ConfigSchema) {
        this.ConfigSchema = ConfigSchema;
    }

    /**
     * Get 配置项关联部署组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigAssociatedGroups 配置项关联部署组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BusinesLogConfigAssociatedGroup [] getConfigAssociatedGroups() {
        return this.ConfigAssociatedGroups;
    }

    /**
     * Set 配置项关联部署组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigAssociatedGroups 配置项关联部署组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigAssociatedGroups(BusinesLogConfigAssociatedGroup [] ConfigAssociatedGroups) {
        this.ConfigAssociatedGroups = ConfigAssociatedGroups;
    }

    public BusinessLogConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BusinessLogConfig(BusinessLogConfig source) {
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
        if (source.ConfigPath != null) {
            this.ConfigPath = new String(source.ConfigPath);
        }
        if (source.ConfigDesc != null) {
            this.ConfigDesc = new String(source.ConfigDesc);
        }
        if (source.ConfigTags != null) {
            this.ConfigTags = new String(source.ConfigTags);
        }
        if (source.ConfigPipeline != null) {
            this.ConfigPipeline = new String(source.ConfigPipeline);
        }
        if (source.ConfigCreateTime != null) {
            this.ConfigCreateTime = new String(source.ConfigCreateTime);
        }
        if (source.ConfigUpdateTime != null) {
            this.ConfigUpdateTime = new String(source.ConfigUpdateTime);
        }
        if (source.ConfigSchema != null) {
            this.ConfigSchema = new BusinessLogConfigSchema(source.ConfigSchema);
        }
        if (source.ConfigAssociatedGroups != null) {
            this.ConfigAssociatedGroups = new BusinesLogConfigAssociatedGroup[source.ConfigAssociatedGroups.length];
            for (int i = 0; i < source.ConfigAssociatedGroups.length; i++) {
                this.ConfigAssociatedGroups[i] = new BusinesLogConfigAssociatedGroup(source.ConfigAssociatedGroups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamSimple(map, prefix + "ConfigPath", this.ConfigPath);
        this.setParamSimple(map, prefix + "ConfigDesc", this.ConfigDesc);
        this.setParamSimple(map, prefix + "ConfigTags", this.ConfigTags);
        this.setParamSimple(map, prefix + "ConfigPipeline", this.ConfigPipeline);
        this.setParamSimple(map, prefix + "ConfigCreateTime", this.ConfigCreateTime);
        this.setParamSimple(map, prefix + "ConfigUpdateTime", this.ConfigUpdateTime);
        this.setParamObj(map, prefix + "ConfigSchema.", this.ConfigSchema);
        this.setParamArrayObj(map, prefix + "ConfigAssociatedGroups.", this.ConfigAssociatedGroups);

    }
}

