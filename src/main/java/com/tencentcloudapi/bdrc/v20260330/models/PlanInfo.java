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
    * 备份计划ID
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 计划关联的实例ID
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * 计划名称
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * 备份路径列表，1~20 个
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupPaths")
    @Expose
    private String [] BackupPaths;

    /**
    * 包含文件类型，0~20 个
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncludeFileTypes")
    @Expose
    private String [] IncludeFileTypes;

    /**
    * 排除文件路径列表，0~20 个
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExcludePatterns")
    @Expose
    private String [] ExcludePatterns;

    /**
    * 是否排除系统目录
    */
    @SerializedName("ExcludeSystemDirectories")
    @Expose
    private Boolean ExcludeSystemDirectories;

    /**
    * 备份库ID
    */
    @SerializedName("VaultId")
    @Expose
    private String VaultId;

    /**
    * 备份计划状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 策略ID
    */
    @SerializedName("AspId")
    @Expose
    private String AspId;

    /**
    * 策略名称
    */
    @SerializedName("AspName")
    @Expose
    private String AspName;

    /**
    * 策略详情
    */
    @SerializedName("AspPolicy")
    @Expose
    private AspInfo AspPolicy;

    /**
    * 最近一次执行时间
    */
    @SerializedName("LastExecuteTime")
    @Expose
    private String LastExecuteTime;

    /**
    * 下次触发时间
    */
    @SerializedName("NextTriggerTime")
    @Expose
    private String NextTriggerTime;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 最近一次执行错误信息
    */
    @SerializedName("LastTriggerError")
    @Expose
    private String LastTriggerError;

    /**
    * 备份数量
    */
    @SerializedName("BackupCount")
    @Expose
    private Long BackupCount;

    /**
    * 流控信息
    */
    @SerializedName("FlowControlSettings")
    @Expose
    private FlowControlRule [] FlowControlSettings;

    /**
     * Get 备份计划ID 
     * @return PlanId 备份计划ID
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 备份计划ID
     * @param PlanId 备份计划ID
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get 计划关联的实例ID 
     * @return ResourceIds 计划关联的实例ID
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 计划关联的实例ID
     * @param ResourceIds 计划关联的实例ID
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get 计划名称 
     * @return PlanName 计划名称
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set 计划名称
     * @param PlanName 计划名称
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get 备份路径列表，1~20 个
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupPaths 备份路径列表，1~20 个
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBackupPaths() {
        return this.BackupPaths;
    }

    /**
     * Set 备份路径列表，1~20 个
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupPaths 备份路径列表，1~20 个
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupPaths(String [] BackupPaths) {
        this.BackupPaths = BackupPaths;
    }

    /**
     * Get 包含文件类型，0~20 个
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncludeFileTypes 包含文件类型，0~20 个
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIncludeFileTypes() {
        return this.IncludeFileTypes;
    }

    /**
     * Set 包含文件类型，0~20 个
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncludeFileTypes 包含文件类型，0~20 个
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncludeFileTypes(String [] IncludeFileTypes) {
        this.IncludeFileTypes = IncludeFileTypes;
    }

    /**
     * Get 排除文件路径列表，0~20 个
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExcludePatterns 排除文件路径列表，0~20 个
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getExcludePatterns() {
        return this.ExcludePatterns;
    }

    /**
     * Set 排除文件路径列表，0~20 个
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExcludePatterns 排除文件路径列表，0~20 个
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExcludePatterns(String [] ExcludePatterns) {
        this.ExcludePatterns = ExcludePatterns;
    }

    /**
     * Get 是否排除系统目录 
     * @return ExcludeSystemDirectories 是否排除系统目录
     */
    public Boolean getExcludeSystemDirectories() {
        return this.ExcludeSystemDirectories;
    }

    /**
     * Set 是否排除系统目录
     * @param ExcludeSystemDirectories 是否排除系统目录
     */
    public void setExcludeSystemDirectories(Boolean ExcludeSystemDirectories) {
        this.ExcludeSystemDirectories = ExcludeSystemDirectories;
    }

    /**
     * Get 备份库ID 
     * @return VaultId 备份库ID
     */
    public String getVaultId() {
        return this.VaultId;
    }

    /**
     * Set 备份库ID
     * @param VaultId 备份库ID
     */
    public void setVaultId(String VaultId) {
        this.VaultId = VaultId;
    }

    /**
     * Get 备份计划状态 
     * @return Status 备份计划状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 备份计划状态
     * @param Status 备份计划状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 策略ID 
     * @return AspId 策略ID
     */
    public String getAspId() {
        return this.AspId;
    }

    /**
     * Set 策略ID
     * @param AspId 策略ID
     */
    public void setAspId(String AspId) {
        this.AspId = AspId;
    }

    /**
     * Get 策略名称 
     * @return AspName 策略名称
     */
    public String getAspName() {
        return this.AspName;
    }

    /**
     * Set 策略名称
     * @param AspName 策略名称
     */
    public void setAspName(String AspName) {
        this.AspName = AspName;
    }

    /**
     * Get 策略详情 
     * @return AspPolicy 策略详情
     */
    public AspInfo getAspPolicy() {
        return this.AspPolicy;
    }

    /**
     * Set 策略详情
     * @param AspPolicy 策略详情
     */
    public void setAspPolicy(AspInfo AspPolicy) {
        this.AspPolicy = AspPolicy;
    }

    /**
     * Get 最近一次执行时间 
     * @return LastExecuteTime 最近一次执行时间
     */
    public String getLastExecuteTime() {
        return this.LastExecuteTime;
    }

    /**
     * Set 最近一次执行时间
     * @param LastExecuteTime 最近一次执行时间
     */
    public void setLastExecuteTime(String LastExecuteTime) {
        this.LastExecuteTime = LastExecuteTime;
    }

    /**
     * Get 下次触发时间 
     * @return NextTriggerTime 下次触发时间
     */
    public String getNextTriggerTime() {
        return this.NextTriggerTime;
    }

    /**
     * Set 下次触发时间
     * @param NextTriggerTime 下次触发时间
     */
    public void setNextTriggerTime(String NextTriggerTime) {
        this.NextTriggerTime = NextTriggerTime;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 最近一次执行错误信息 
     * @return LastTriggerError 最近一次执行错误信息
     */
    public String getLastTriggerError() {
        return this.LastTriggerError;
    }

    /**
     * Set 最近一次执行错误信息
     * @param LastTriggerError 最近一次执行错误信息
     */
    public void setLastTriggerError(String LastTriggerError) {
        this.LastTriggerError = LastTriggerError;
    }

    /**
     * Get 备份数量 
     * @return BackupCount 备份数量
     */
    public Long getBackupCount() {
        return this.BackupCount;
    }

    /**
     * Set 备份数量
     * @param BackupCount 备份数量
     */
    public void setBackupCount(Long BackupCount) {
        this.BackupCount = BackupCount;
    }

    /**
     * Get 流控信息 
     * @return FlowControlSettings 流控信息
     */
    public FlowControlRule [] getFlowControlSettings() {
        return this.FlowControlSettings;
    }

    /**
     * Set 流控信息
     * @param FlowControlSettings 流控信息
     */
    public void setFlowControlSettings(FlowControlRule [] FlowControlSettings) {
        this.FlowControlSettings = FlowControlSettings;
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

    }
}

