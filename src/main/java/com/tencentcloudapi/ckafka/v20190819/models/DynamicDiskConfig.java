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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DynamicDiskConfig extends AbstractModel{

    /**
    * 动态硬盘扩容配置开关（0: 关闭，1: 开启）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 每次磁盘动态扩容大小百分比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepForwardPercentage")
    @Expose
    private Long StepForwardPercentage;

    /**
    * 磁盘配额百分比触发条件，即消息达到此值触发硬盘自动扩容事件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskQuotaPercentage")
    @Expose
    private Long DiskQuotaPercentage;

    /**
    * 最大扩容硬盘大小，以 GB 为单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxDiskSpace")
    @Expose
    private Long MaxDiskSpace;

    /**
     * Get 动态硬盘扩容配置开关（0: 关闭，1: 开启）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enable 动态硬盘扩容配置开关（0: 关闭，1: 开启）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 动态硬盘扩容配置开关（0: 关闭，1: 开启）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enable 动态硬盘扩容配置开关（0: 关闭，1: 开启）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 每次磁盘动态扩容大小百分比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepForwardPercentage 每次磁盘动态扩容大小百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStepForwardPercentage() {
        return this.StepForwardPercentage;
    }

    /**
     * Set 每次磁盘动态扩容大小百分比
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepForwardPercentage 每次磁盘动态扩容大小百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepForwardPercentage(Long StepForwardPercentage) {
        this.StepForwardPercentage = StepForwardPercentage;
    }

    /**
     * Get 磁盘配额百分比触发条件，即消息达到此值触发硬盘自动扩容事件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskQuotaPercentage 磁盘配额百分比触发条件，即消息达到此值触发硬盘自动扩容事件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskQuotaPercentage() {
        return this.DiskQuotaPercentage;
    }

    /**
     * Set 磁盘配额百分比触发条件，即消息达到此值触发硬盘自动扩容事件
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskQuotaPercentage 磁盘配额百分比触发条件，即消息达到此值触发硬盘自动扩容事件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskQuotaPercentage(Long DiskQuotaPercentage) {
        this.DiskQuotaPercentage = DiskQuotaPercentage;
    }

    /**
     * Get 最大扩容硬盘大小，以 GB 为单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxDiskSpace 最大扩容硬盘大小，以 GB 为单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxDiskSpace() {
        return this.MaxDiskSpace;
    }

    /**
     * Set 最大扩容硬盘大小，以 GB 为单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxDiskSpace 最大扩容硬盘大小，以 GB 为单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxDiskSpace(Long MaxDiskSpace) {
        this.MaxDiskSpace = MaxDiskSpace;
    }

    public DynamicDiskConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DynamicDiskConfig(DynamicDiskConfig source) {
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.StepForwardPercentage != null) {
            this.StepForwardPercentage = new Long(source.StepForwardPercentage);
        }
        if (source.DiskQuotaPercentage != null) {
            this.DiskQuotaPercentage = new Long(source.DiskQuotaPercentage);
        }
        if (source.MaxDiskSpace != null) {
            this.MaxDiskSpace = new Long(source.MaxDiskSpace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "StepForwardPercentage", this.StepForwardPercentage);
        this.setParamSimple(map, prefix + "DiskQuotaPercentage", this.DiskQuotaPercentage);
        this.setParamSimple(map, prefix + "MaxDiskSpace", this.MaxDiskSpace);

    }
}

