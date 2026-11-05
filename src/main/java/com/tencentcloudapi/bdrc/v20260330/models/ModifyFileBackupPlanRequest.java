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

public class ModifyFileBackupPlanRequest extends AbstractModel {

    /**
    * <p>备份计划ID，此参数必填。</p>
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * <p>备份策略ID</p>
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * <p>计划名称</p>
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * <p>备份路径列表，1~20 个</p>
    */
    @SerializedName("BackupPaths")
    @Expose
    private String [] BackupPaths;

    /**
    * <p>包含文件类型，0~20 个</p>
    */
    @SerializedName("IncludeFileTypes")
    @Expose
    private String [] IncludeFileTypes;

    /**
    * <p>排除文件路径列表，0~20 个</p>
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
    @SerializedName("BackupStorageId")
    @Expose
    private String BackupStorageId;

    /**
    * <p>计划状态，可选值：normal（正常）、paused（暂停）</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>是否备份对象ACL（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
    */
    @SerializedName("EnableObjectAcl")
    @Expose
    private Boolean EnableObjectAcl;

    /**
    * <p>是否备份对象标签（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
    */
    @SerializedName("EnableObjectTags")
    @Expose
    private Boolean EnableObjectTags;

    /**
     * Get <p>备份计划ID，此参数必填。</p> 
     * @return PlanId <p>备份计划ID，此参数必填。</p>
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set <p>备份计划ID，此参数必填。</p>
     * @param PlanId <p>备份计划ID，此参数必填。</p>
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get <p>备份策略ID</p> 
     * @return PolicyId <p>备份策略ID</p>
     * @deprecated
     */
    @Deprecated
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>备份策略ID</p>
     * @param PolicyId <p>备份策略ID</p>
     * @deprecated
     */
    @Deprecated
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
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
     * @return BackupPaths <p>备份路径列表，1~20 个</p>
     */
    public String [] getBackupPaths() {
        return this.BackupPaths;
    }

    /**
     * Set <p>备份路径列表，1~20 个</p>
     * @param BackupPaths <p>备份路径列表，1~20 个</p>
     */
    public void setBackupPaths(String [] BackupPaths) {
        this.BackupPaths = BackupPaths;
    }

    /**
     * Get <p>包含文件类型，0~20 个</p> 
     * @return IncludeFileTypes <p>包含文件类型，0~20 个</p>
     */
    public String [] getIncludeFileTypes() {
        return this.IncludeFileTypes;
    }

    /**
     * Set <p>包含文件类型，0~20 个</p>
     * @param IncludeFileTypes <p>包含文件类型，0~20 个</p>
     */
    public void setIncludeFileTypes(String [] IncludeFileTypes) {
        this.IncludeFileTypes = IncludeFileTypes;
    }

    /**
     * Get <p>排除文件路径列表，0~20 个</p> 
     * @return ExcludePatterns <p>排除文件路径列表，0~20 个</p>
     */
    public String [] getExcludePatterns() {
        return this.ExcludePatterns;
    }

    /**
     * Set <p>排除文件路径列表，0~20 个</p>
     * @param ExcludePatterns <p>排除文件路径列表，0~20 个</p>
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
     * @return BackupStorageId <p>备份库ID</p>
     * @deprecated
     */
    @Deprecated
    public String getBackupStorageId() {
        return this.BackupStorageId;
    }

    /**
     * Set <p>备份库ID</p>
     * @param BackupStorageId <p>备份库ID</p>
     * @deprecated
     */
    @Deprecated
    public void setBackupStorageId(String BackupStorageId) {
        this.BackupStorageId = BackupStorageId;
    }

    /**
     * Get <p>计划状态，可选值：normal（正常）、paused（暂停）</p> 
     * @return Status <p>计划状态，可选值：normal（正常）、paused（暂停）</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>计划状态，可选值：normal（正常）、paused（暂停）</p>
     * @param Status <p>计划状态，可选值：normal（正常）、paused（暂停）</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>是否备份对象ACL（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul> 
     * @return EnableObjectAcl <p>是否备份对象ACL（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     */
    public Boolean getEnableObjectAcl() {
        return this.EnableObjectAcl;
    }

    /**
     * Set <p>是否备份对象ACL（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     * @param EnableObjectAcl <p>是否备份对象ACL（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     */
    public void setEnableObjectAcl(Boolean EnableObjectAcl) {
        this.EnableObjectAcl = EnableObjectAcl;
    }

    /**
     * Get <p>是否备份对象标签（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul> 
     * @return EnableObjectTags <p>是否备份对象标签（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     */
    public Boolean getEnableObjectTags() {
        return this.EnableObjectTags;
    }

    /**
     * Set <p>是否备份对象标签（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     * @param EnableObjectTags <p>是否备份对象标签（仅COS备份支持）</p><p>枚举值：</p><ul><li>true： 是</li><li>false： 否</li></ul>
     */
    public void setEnableObjectTags(Boolean EnableObjectTags) {
        this.EnableObjectTags = EnableObjectTags;
    }

    public ModifyFileBackupPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFileBackupPlanRequest(ModifyFileBackupPlanRequest source) {
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
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
        if (source.BackupStorageId != null) {
            this.BackupStorageId = new String(source.BackupStorageId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.EnableObjectAcl != null) {
            this.EnableObjectAcl = new Boolean(source.EnableObjectAcl);
        }
        if (source.EnableObjectTags != null) {
            this.EnableObjectTags = new Boolean(source.EnableObjectTags);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamArraySimple(map, prefix + "BackupPaths.", this.BackupPaths);
        this.setParamArraySimple(map, prefix + "IncludeFileTypes.", this.IncludeFileTypes);
        this.setParamArraySimple(map, prefix + "ExcludePatterns.", this.ExcludePatterns);
        this.setParamSimple(map, prefix + "ExcludeSystemDirectories", this.ExcludeSystemDirectories);
        this.setParamSimple(map, prefix + "BackupStorageId", this.BackupStorageId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EnableObjectAcl", this.EnableObjectAcl);
        this.setParamSimple(map, prefix + "EnableObjectTags", this.EnableObjectTags);

    }
}

