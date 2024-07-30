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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkloadGroupConfig extends AbstractModel {

    /**
    * 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkloadGroupName")
    @Expose
    private String WorkloadGroupName;

    /**
    * CPU权重
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuShare")
    @Expose
    private Long CpuShare;

    /**
    * 内存限制，所有资源组的内存限制值之和应该小于等于100
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemoryLimit")
    @Expose
    private Long MemoryLimit;

    /**
    * 是否允许超配分配
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableMemoryOverCommit")
    @Expose
    private Boolean EnableMemoryOverCommit;

    /**
    * cpu硬限制
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuHardLimit")
    @Expose
    private String CpuHardLimit;

    /**
     * Get 资源组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkloadGroupName 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkloadGroupName() {
        return this.WorkloadGroupName;
    }

    /**
     * Set 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkloadGroupName 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkloadGroupName(String WorkloadGroupName) {
        this.WorkloadGroupName = WorkloadGroupName;
    }

    /**
     * Get CPU权重
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuShare CPU权重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpuShare() {
        return this.CpuShare;
    }

    /**
     * Set CPU权重
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuShare CPU权重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuShare(Long CpuShare) {
        this.CpuShare = CpuShare;
    }

    /**
     * Get 内存限制，所有资源组的内存限制值之和应该小于等于100
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemoryLimit 内存限制，所有资源组的内存限制值之和应该小于等于100
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemoryLimit() {
        return this.MemoryLimit;
    }

    /**
     * Set 内存限制，所有资源组的内存限制值之和应该小于等于100
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemoryLimit 内存限制，所有资源组的内存限制值之和应该小于等于100
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemoryLimit(Long MemoryLimit) {
        this.MemoryLimit = MemoryLimit;
    }

    /**
     * Get 是否允许超配分配
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableMemoryOverCommit 是否允许超配分配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableMemoryOverCommit() {
        return this.EnableMemoryOverCommit;
    }

    /**
     * Set 是否允许超配分配
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableMemoryOverCommit 是否允许超配分配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableMemoryOverCommit(Boolean EnableMemoryOverCommit) {
        this.EnableMemoryOverCommit = EnableMemoryOverCommit;
    }

    /**
     * Get cpu硬限制
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuHardLimit cpu硬限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCpuHardLimit() {
        return this.CpuHardLimit;
    }

    /**
     * Set cpu硬限制
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuHardLimit cpu硬限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuHardLimit(String CpuHardLimit) {
        this.CpuHardLimit = CpuHardLimit;
    }

    public WorkloadGroupConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkloadGroupConfig(WorkloadGroupConfig source) {
        if (source.WorkloadGroupName != null) {
            this.WorkloadGroupName = new String(source.WorkloadGroupName);
        }
        if (source.CpuShare != null) {
            this.CpuShare = new Long(source.CpuShare);
        }
        if (source.MemoryLimit != null) {
            this.MemoryLimit = new Long(source.MemoryLimit);
        }
        if (source.EnableMemoryOverCommit != null) {
            this.EnableMemoryOverCommit = new Boolean(source.EnableMemoryOverCommit);
        }
        if (source.CpuHardLimit != null) {
            this.CpuHardLimit = new String(source.CpuHardLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkloadGroupName", this.WorkloadGroupName);
        this.setParamSimple(map, prefix + "CpuShare", this.CpuShare);
        this.setParamSimple(map, prefix + "MemoryLimit", this.MemoryLimit);
        this.setParamSimple(map, prefix + "EnableMemoryOverCommit", this.EnableMemoryOverCommit);
        this.setParamSimple(map, prefix + "CpuHardLimit", this.CpuHardLimit);

    }
}

