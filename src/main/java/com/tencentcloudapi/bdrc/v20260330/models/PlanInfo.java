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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlanInfo extends AbstractModel {

    /**
    * <p>备份计划ID</p>
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * <p>计划关联的实例ID</p>
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * <p>计划名称</p>
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * <p>备份路径列表，1~20 个</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupPaths")
    @Expose
    private String [] BackupPaths;

    /**
    * <p>包含文件类型，0~20 个</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncludeFileTypes")
    @Expose
    private String [] IncludeFileTypes;

    /**
    * <p>排除文件路径列表，0~20 个</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExcludePatterns")
    @Expose
    private String [] ExcludePatterns;

    /**
    * <p>是否排除系统目录</p>
    */
    @SerializedName("ExcludeSystemDirectories")
    @Expose
    private Boolean ExcludeSystemDirectories;

    /**
    * <p>备份库ID</p>
    */
    @SerializedName("VaultId")
    @Expose
    private String VaultId;

    /**
    * <p>备份计划状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>策略ID</p>
    */
    @SerializedName("AspId")
    @Expose
    private String AspId;

    /**
    * <p>策略名称</p>
    */
    @SerializedName("AspName")
    @Expose
    private String AspName;

    /**
    * <p>策略详情</p>
    */
    @SerializedName("AspPolicy")
    @Expose
    private AspInfo AspPolicy;

    /**
    * <p>最近一次执行时间</p>
    */
    @SerializedName("LastExecuteTime")
    @Expose
    private String LastExecuteTime;

    /**
    * <p>下次触发时间</p>
    */
    @SerializedName("NextTriggerTime")
    @Expose
    private String NextTriggerTime;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>最近一次执行错误信息</p>
    */
    @SerializedName("LastTriggerError")
    @Expose
    private String LastTriggerError;

    /**
    * <p>备份数量</p>
    */
    @SerializedName("BackupCount")
    @Expose
    private Long BackupCount;

    /**
    * <p>流控信息</p>
    */
    @SerializedName("FlowControlSettings")
    @Expose
    private FlowControlRule [] FlowControlSettings;

    /**
    * <p>是否备份对象ACL（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableObjectAcl")
    @Expose
    private Boolean EnableObjectAcl;

    /**
    * <p>是否备份对象标签（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableObjectTags")
    @Expose
    private Boolean EnableObjectTags;

    /**
    * <p>产品存储类型。CFS 资源返回文件系统存储类型；非 CFS 资源无存储类型，返回资源类型标识。</p><p>枚举值：</p><ul><li>SD： 文件系统通用标准型存储</li><li>HP： 文件系统通用性能性存储</li><li>TB： 文件系统Turbo标准型存储</li><li>TP： 文件系统Turbo性能型存储</li><li>THP： 文件系统Turbo吞吐型存储</li><li>CVM_AGENT： CVM 资源（非 CFS 资源时返回）</li><li>COS_AGENT： COS 资源（非 CFS 资源时返回）</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
     * Get <p>备份计划ID</p> 
     * @return PlanId <p>备份计划ID</p>
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set <p>备份计划ID</p>
     * @param PlanId <p>备份计划ID</p>
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get <p>计划关联的实例ID</p> 
     * @return ResourceIds <p>计划关联的实例ID</p>
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set <p>计划关联的实例ID</p>
     * @param ResourceIds <p>计划关联的实例ID</p>
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get <p>计划名称</p> 
     * @return PlanName <p>计划名称</p>
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set <p>计划名称</p>
     * @param PlanName <p>计划名称</p>
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get <p>备份路径列表，1~20 个</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupPaths <p>备份路径列表，1~20 个</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBackupPaths() {
        return this.BackupPaths;
    }

    /**
     * Set <p>备份路径列表，1~20 个</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupPaths <p>备份路径列表，1~20 个</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupPaths(String [] BackupPaths) {
        this.BackupPaths = BackupPaths;
    }

    /**
     * Get <p>包含文件类型，0~20 个</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncludeFileTypes <p>包含文件类型，0~20 个</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIncludeFileTypes() {
        return this.IncludeFileTypes;
    }

    /**
     * Set <p>包含文件类型，0~20 个</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncludeFileTypes <p>包含文件类型，0~20 个</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncludeFileTypes(String [] IncludeFileTypes) {
        this.IncludeFileTypes = IncludeFileTypes;
    }

    /**
     * Get <p>排除文件路径列表，0~20 个</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExcludePatterns <p>排除文件路径列表，0~20 个</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getExcludePatterns() {
        return this.ExcludePatterns;
    }

    /**
     * Set <p>排除文件路径列表，0~20 个</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExcludePatterns <p>排除文件路径列表，0~20 个</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExcludePatterns(String [] ExcludePatterns) {
        this.ExcludePatterns = ExcludePatterns;
    }

    /**
     * Get <p>是否排除系统目录</p> 
     * @return ExcludeSystemDirectories <p>是否排除系统目录</p>
     */
    public Boolean getExcludeSystemDirectories() {
        return this.ExcludeSystemDirectories;
    }

    /**
     * Set <p>是否排除系统目录</p>
     * @param ExcludeSystemDirectories <p>是否排除系统目录</p>
     */
    public void setExcludeSystemDirectories(Boolean ExcludeSystemDirectories) {
        this.ExcludeSystemDirectories = ExcludeSystemDirectories;
    }

    /**
     * Get <p>备份库ID</p> 
     * @return VaultId <p>备份库ID</p>
     */
    public String getVaultId() {
        return this.VaultId;
    }

    /**
     * Set <p>备份库ID</p>
     * @param VaultId <p>备份库ID</p>
     */
    public void setVaultId(String VaultId) {
        this.VaultId = VaultId;
    }

    /**
     * Get <p>备份计划状态</p> 
     * @return Status <p>备份计划状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>备份计划状态</p>
     * @param Status <p>备份计划状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>策略ID</p> 
     * @return AspId <p>策略ID</p>
     */
    public String getAspId() {
        return this.AspId;
    }

    /**
     * Set <p>策略ID</p>
     * @param AspId <p>策略ID</p>
     */
    public void setAspId(String AspId) {
        this.AspId = AspId;
    }

    /**
     * Get <p>策略名称</p> 
     * @return AspName <p>策略名称</p>
     */
    public String getAspName() {
        return this.AspName;
    }

    /**
     * Set <p>策略名称</p>
     * @param AspName <p>策略名称</p>
     */
    public void setAspName(String AspName) {
        this.AspName = AspName;
    }

    /**
     * Get <p>策略详情</p> 
     * @return AspPolicy <p>策略详情</p>
     */
    public AspInfo getAspPolicy() {
        return this.AspPolicy;
    }

    /**
     * Set <p>策略详情</p>
     * @param AspPolicy <p>策略详情</p>
     */
    public void setAspPolicy(AspInfo AspPolicy) {
        this.AspPolicy = AspPolicy;
    }

    /**
     * Get <p>最近一次执行时间</p> 
     * @return LastExecuteTime <p>最近一次执行时间</p>
     */
    public String getLastExecuteTime() {
        return this.LastExecuteTime;
    }

    /**
     * Set <p>最近一次执行时间</p>
     * @param LastExecuteTime <p>最近一次执行时间</p>
     */
    public void setLastExecuteTime(String LastExecuteTime) {
        this.LastExecuteTime = LastExecuteTime;
    }

    /**
     * Get <p>下次触发时间</p> 
     * @return NextTriggerTime <p>下次触发时间</p>
     */
    public String getNextTriggerTime() {
        return this.NextTriggerTime;
    }

    /**
     * Set <p>下次触发时间</p>
     * @param NextTriggerTime <p>下次触发时间</p>
     */
    public void setNextTriggerTime(String NextTriggerTime) {
        this.NextTriggerTime = NextTriggerTime;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreatedTime <p>创建时间</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreatedTime <p>创建时间</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>最近一次执行错误信息</p> 
     * @return LastTriggerError <p>最近一次执行错误信息</p>
     */
    public String getLastTriggerError() {
        return this.LastTriggerError;
    }

    /**
     * Set <p>最近一次执行错误信息</p>
     * @param LastTriggerError <p>最近一次执行错误信息</p>
     */
    public void setLastTriggerError(String LastTriggerError) {
        this.LastTriggerError = LastTriggerError;
    }

    /**
     * Get <p>备份数量</p> 
     * @return BackupCount <p>备份数量</p>
     */
    public Long getBackupCount() {
        return this.BackupCount;
    }

    /**
     * Set <p>备份数量</p>
     * @param BackupCount <p>备份数量</p>
     */
    public void setBackupCount(Long BackupCount) {
        this.BackupCount = BackupCount;
    }

    /**
     * Get <p>流控信息</p> 
     * @return FlowControlSettings <p>流控信息</p>
     */
    public FlowControlRule [] getFlowControlSettings() {
        return this.FlowControlSettings;
    }

    /**
     * Set <p>流控信息</p>
     * @param FlowControlSettings <p>流控信息</p>
     */
    public void setFlowControlSettings(FlowControlRule [] FlowControlSettings) {
        this.FlowControlSettings = FlowControlSettings;
    }

    /**
     * Get <p>是否备份对象ACL（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableObjectAcl <p>是否备份对象ACL（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableObjectAcl() {
        return this.EnableObjectAcl;
    }

    /**
     * Set <p>是否备份对象ACL（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableObjectAcl <p>是否备份对象ACL（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableObjectAcl(Boolean EnableObjectAcl) {
        this.EnableObjectAcl = EnableObjectAcl;
    }

    /**
     * Get <p>是否备份对象标签（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableObjectTags <p>是否备份对象标签（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableObjectTags() {
        return this.EnableObjectTags;
    }

    /**
     * Set <p>是否备份对象标签（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableObjectTags <p>是否备份对象标签（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableObjectTags(Boolean EnableObjectTags) {
        this.EnableObjectTags = EnableObjectTags;
    }

    /**
     * Get <p>产品存储类型。CFS 资源返回文件系统存储类型；非 CFS 资源无存储类型，返回资源类型标识。</p><p>枚举值：</p><ul><li>SD： 文件系统通用标准型存储</li><li>HP： 文件系统通用性能性存储</li><li>TB： 文件系统Turbo标准型存储</li><li>TP： 文件系统Turbo性能型存储</li><li>THP： 文件系统Turbo吞吐型存储</li><li>CVM_AGENT： CVM 资源（非 CFS 资源时返回）</li><li>COS_AGENT： COS 资源（非 CFS 资源时返回）</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductType <p>产品存储类型。CFS 资源返回文件系统存储类型；非 CFS 资源无存储类型，返回资源类型标识。</p><p>枚举值：</p><ul><li>SD： 文件系统通用标准型存储</li><li>HP： 文件系统通用性能性存储</li><li>TB： 文件系统Turbo标准型存储</li><li>TP： 文件系统Turbo性能型存储</li><li>THP： 文件系统Turbo吞吐型存储</li><li>CVM_AGENT： CVM 资源（非 CFS 资源时返回）</li><li>COS_AGENT： COS 资源（非 CFS 资源时返回）</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set <p>产品存储类型。CFS 资源返回文件系统存储类型；非 CFS 资源无存储类型，返回资源类型标识。</p><p>枚举值：</p><ul><li>SD： 文件系统通用标准型存储</li><li>HP： 文件系统通用性能性存储</li><li>TB： 文件系统Turbo标准型存储</li><li>TP： 文件系统Turbo性能型存储</li><li>THP： 文件系统Turbo吞吐型存储</li><li>CVM_AGENT： CVM 资源（非 CFS 资源时返回）</li><li>COS_AGENT： COS 资源（非 CFS 资源时返回）</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductType <p>产品存储类型。CFS 资源返回文件系统存储类型；非 CFS 资源无存储类型，返回资源类型标识。</p><p>枚举值：</p><ul><li>SD： 文件系统通用标准型存储</li><li>HP： 文件系统通用性能性存储</li><li>TB： 文件系统Turbo标准型存储</li><li>TP： 文件系统Turbo性能型存储</li><li>THP： 文件系统Turbo吞吐型存储</li><li>CVM_AGENT： CVM 资源（非 CFS 资源时返回）</li><li>COS_AGENT： COS 资源（非 CFS 资源时返回）</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    public PlanInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlanInfo(PlanInfo source) {
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
        if (source.PlanName != null) {
            this.PlanName = new String(source.PlanName);
        }
        if (source.BackupPaths != null) {
            this.BackupPaths = new String[source.BackupPaths.length];
            for (int i = 0; i < source.BackupPaths.length; i++) {
                this.BackupPaths[i] = new String(source.BackupPaths[i]);
            }
        }
        if (source.IncludeFileTypes != null) {
            this.IncludeFileTypes = new String[source.IncludeFileTypes.length];
            for (int i = 0; i < source.IncludeFileTypes.length; i++) {
                this.IncludeFileTypes[i] = new String(source.IncludeFileTypes[i]);
            }
        }
        if (source.ExcludePatterns != null) {
            this.ExcludePatterns = new String[source.ExcludePatterns.length];
            for (int i = 0; i < source.ExcludePatterns.length; i++) {
                this.ExcludePatterns[i] = new String(source.ExcludePatterns[i]);
            }
        }
        if (source.ExcludeSystemDirectories != null) {
            this.ExcludeSystemDirectories = new Boolean(source.ExcludeSystemDirectories);
        }
        if (source.VaultId != null) {
            this.VaultId = new String(source.VaultId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AspId != null) {
            this.AspId = new String(source.AspId);
        }
        if (source.AspName != null) {
            this.AspName = new String(source.AspName);
        }
        if (source.AspPolicy != null) {
            this.AspPolicy = new AspInfo(source.AspPolicy);
        }
        if (source.LastExecuteTime != null) {
            this.LastExecuteTime = new String(source.LastExecuteTime);
        }
        if (source.NextTriggerTime != null) {
            this.NextTriggerTime = new String(source.NextTriggerTime);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.LastTriggerError != null) {
            this.LastTriggerError = new String(source.LastTriggerError);
        }
        if (source.BackupCount != null) {
            this.BackupCount = new Long(source.BackupCount);
        }
        if (source.FlowControlSettings != null) {
            this.FlowControlSettings = new FlowControlRule[source.FlowControlSettings.length];
            for (int i = 0; i < source.FlowControlSettings.length; i++) {
                this.FlowControlSettings[i] = new FlowControlRule(source.FlowControlSettings[i]);
            }
        }
        if (source.EnableObjectAcl != null) {
            this.EnableObjectAcl = new Boolean(source.EnableObjectAcl);
        }
        if (source.EnableObjectTags != null) {
            this.EnableObjectTags = new Boolean(source.EnableObjectTags);
        }
        if (source.ProductType != null) {
            this.ProductType = new String(source.ProductType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamArraySimple(map, prefix + "BackupPaths.", this.BackupPaths);
        this.setParamArraySimple(map, prefix + "IncludeFileTypes.", this.IncludeFileTypes);
        this.setParamArraySimple(map, prefix + "ExcludePatterns.", this.ExcludePatterns);
        this.setParamSimple(map, prefix + "ExcludeSystemDirectories", this.ExcludeSystemDirectories);
        this.setParamSimple(map, prefix + "VaultId", this.VaultId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AspId", this.AspId);
        this.setParamSimple(map, prefix + "AspName", this.AspName);
        this.setParamObj(map, prefix + "AspPolicy.", this.AspPolicy);
        this.setParamSimple(map, prefix + "LastExecuteTime", this.LastExecuteTime);
        this.setParamSimple(map, prefix + "NextTriggerTime", this.NextTriggerTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "LastTriggerError", this.LastTriggerError);
        this.setParamSimple(map, prefix + "BackupCount", this.BackupCount);
        this.setParamArrayObj(map, prefix + "FlowControlSettings.", this.FlowControlSettings);
        this.setParamSimple(map, prefix + "EnableObjectAcl", this.EnableObjectAcl);
        this.setParamSimple(map, prefix + "EnableObjectTags", this.EnableObjectTags);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);

    }
}

