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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CapacityGlobalConfig extends AbstractModel {

    /**
    * 是否开启了标签调度
    */
    @SerializedName("EnableLabel")
    @Expose
    private Boolean EnableLabel;

    /**
    * 如果开启了标签调度，标签信息存放的路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelDir")
    @Expose
    private String LabelDir;

    /**
    * 是否覆盖用户指定队列，为true表示覆盖。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueMappingOverride")
    @Expose
    private Boolean QueueMappingOverride;

    /**
    * 高级设置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultSettings")
    @Expose
    private DefaultSetting [] DefaultSettings;

    /**
     * Get 是否开启了标签调度 
     * @return EnableLabel 是否开启了标签调度
     */
    public Boolean getEnableLabel() {
        return this.EnableLabel;
    }

    /**
     * Set 是否开启了标签调度
     * @param EnableLabel 是否开启了标签调度
     */
    public void setEnableLabel(Boolean EnableLabel) {
        this.EnableLabel = EnableLabel;
    }

    /**
     * Get 如果开启了标签调度，标签信息存放的路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelDir 如果开启了标签调度，标签信息存放的路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabelDir() {
        return this.LabelDir;
    }

    /**
     * Set 如果开启了标签调度，标签信息存放的路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelDir 如果开启了标签调度，标签信息存放的路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelDir(String LabelDir) {
        this.LabelDir = LabelDir;
    }

    /**
     * Get 是否覆盖用户指定队列，为true表示覆盖。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueMappingOverride 是否覆盖用户指定队列，为true表示覆盖。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getQueueMappingOverride() {
        return this.QueueMappingOverride;
    }

    /**
     * Set 是否覆盖用户指定队列，为true表示覆盖。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueMappingOverride 是否覆盖用户指定队列，为true表示覆盖。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueMappingOverride(Boolean QueueMappingOverride) {
        this.QueueMappingOverride = QueueMappingOverride;
    }

    /**
     * Get 高级设置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultSettings 高级设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DefaultSetting [] getDefaultSettings() {
        return this.DefaultSettings;
    }

    /**
     * Set 高级设置
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultSettings 高级设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultSettings(DefaultSetting [] DefaultSettings) {
        this.DefaultSettings = DefaultSettings;
    }

    public CapacityGlobalConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CapacityGlobalConfig(CapacityGlobalConfig source) {
        if (source.EnableLabel != null) {
            this.EnableLabel = new Boolean(source.EnableLabel);
        }
        if (source.LabelDir != null) {
            this.LabelDir = new String(source.LabelDir);
        }
        if (source.QueueMappingOverride != null) {
            this.QueueMappingOverride = new Boolean(source.QueueMappingOverride);
        }
        if (source.DefaultSettings != null) {
            this.DefaultSettings = new DefaultSetting[source.DefaultSettings.length];
            for (int i = 0; i < source.DefaultSettings.length; i++) {
                this.DefaultSettings[i] = new DefaultSetting(source.DefaultSettings[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableLabel", this.EnableLabel);
        this.setParamSimple(map, prefix + "LabelDir", this.LabelDir);
        this.setParamSimple(map, prefix + "QueueMappingOverride", this.QueueMappingOverride);
        this.setParamArrayObj(map, prefix + "DefaultSettings.", this.DefaultSettings);

    }
}

