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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PresetItem extends AbstractModel{

    /**
    * 预置位ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PresetId")
    @Expose
    private Long PresetId;

    /**
    * 预置位名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PresetName")
    @Expose
    private String PresetName;

    /**
    * 预置位状态 0:未设置预置位 1:已设置预置位 2:已设置预置位&看守位
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 预置位启用时的自动归位时间
    */
    @SerializedName("ResetTime")
    @Expose
    private Long ResetTime;

    /**
     * Get 预置位ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PresetId 预置位ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPresetId() {
        return this.PresetId;
    }

    /**
     * Set 预置位ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param PresetId 预置位ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPresetId(Long PresetId) {
        this.PresetId = PresetId;
    }

    /**
     * Get 预置位名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PresetName 预置位名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPresetName() {
        return this.PresetName;
    }

    /**
     * Set 预置位名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PresetName 预置位名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPresetName(String PresetName) {
        this.PresetName = PresetName;
    }

    /**
     * Get 预置位状态 0:未设置预置位 1:已设置预置位 2:已设置预置位&看守位 
     * @return Status 预置位状态 0:未设置预置位 1:已设置预置位 2:已设置预置位&看守位
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 预置位状态 0:未设置预置位 1:已设置预置位 2:已设置预置位&看守位
     * @param Status 预置位状态 0:未设置预置位 1:已设置预置位 2:已设置预置位&看守位
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 预置位启用时的自动归位时间 
     * @return ResetTime 预置位启用时的自动归位时间
     */
    public Long getResetTime() {
        return this.ResetTime;
    }

    /**
     * Set 预置位启用时的自动归位时间
     * @param ResetTime 预置位启用时的自动归位时间
     */
    public void setResetTime(Long ResetTime) {
        this.ResetTime = ResetTime;
    }

    public PresetItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PresetItem(PresetItem source) {
        if (source.PresetId != null) {
            this.PresetId = new Long(source.PresetId);
        }
        if (source.PresetName != null) {
            this.PresetName = new String(source.PresetName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ResetTime != null) {
            this.ResetTime = new Long(source.ResetTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PresetId", this.PresetId);
        this.setParamSimple(map, prefix + "PresetName", this.PresetName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ResetTime", this.ResetTime);

    }
}

