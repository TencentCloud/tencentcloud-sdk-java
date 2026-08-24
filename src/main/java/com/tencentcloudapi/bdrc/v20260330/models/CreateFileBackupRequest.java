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

public class CreateFileBackupRequest extends AbstractModel {

    /**
    * 资源ID列表
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 计划ID
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 备份路径列表，1~20 个
    */
    @SerializedName("BackupPaths")
    @Expose
    private String [] BackupPaths;

    /**
    * 包含文件类型，0~20 个
    */
    @SerializedName("IncludeFileTypes")
    @Expose
    private String [] IncludeFileTypes;

    /**
    * 排除文件路径列表，0~20 个
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
    @SerializedName("BackupStorageId")
    @Expose
    private String BackupStorageId;

    /**
    * 备份到期时间
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
    * 备份名称
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
     * Get 资源ID列表 
     * @return ResourceId 资源ID列表
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID列表
     * @param ResourceId 资源ID列表
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 计划ID 
     * @return PlanId 计划ID
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 计划ID
     * @param PlanId 计划ID
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get 备份路径列表，1~20 个 
     * @return BackupPaths 备份路径列表，1~20 个
     */
    public String [] getBackupPaths() {
        return this.BackupPaths;
    }

    /**
     * Set 备份路径列表，1~20 个
     * @param BackupPaths 备份路径列表，1~20 个
     */
    public void setBackupPaths(String [] BackupPaths) {
        this.BackupPaths = BackupPaths;
    }

    /**
     * Get 包含文件类型，0~20 个 
     * @return IncludeFileTypes 包含文件类型，0~20 个
     */
    public String [] getIncludeFileTypes() {
        return this.IncludeFileTypes;
    }

    /**
     * Set 包含文件类型，0~20 个
     * @param IncludeFileTypes 包含文件类型，0~20 个
     */
    public void setIncludeFileTypes(String [] IncludeFileTypes) {
        this.IncludeFileTypes = IncludeFileTypes;
    }

    /**
     * Get 排除文件路径列表，0~20 个 
     * @return ExcludePatterns 排除文件路径列表，0~20 个
     */
    public String [] getExcludePatterns() {
        return this.ExcludePatterns;
    }

    /**
     * Set 排除文件路径列表，0~20 个
     * @param ExcludePatterns 排除文件路径列表，0~20 个
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
     * @return BackupStorageId 备份库ID
     */
    public String getBackupStorageId() {
        return this.BackupStorageId;
    }

    /**
     * Set 备份库ID
     * @param BackupStorageId 备份库ID
     */
    public void setBackupStorageId(String BackupStorageId) {
        this.BackupStorageId = BackupStorageId;
    }

    /**
     * Get 备份到期时间 
     * @return Deadline 备份到期时间
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 备份到期时间
     * @param Deadline 备份到期时间
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 备份名称 
     * @return BackupName 备份名称
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set 备份名称
     * @param BackupName 备份名称
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    public CreateFileBackupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFileBackupRequest(CreateFileBackupRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
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
        if (source.Deadline != null) {
            this.Deadline = new String(source.Deadline);
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamArraySimple(map, prefix + "BackupPaths.", this.BackupPaths);
        this.setParamArraySimple(map, prefix + "IncludeFileTypes.", this.IncludeFileTypes);
        this.setParamArraySimple(map, prefix + "ExcludePatterns.", this.ExcludePatterns);
        this.setParamSimple(map, prefix + "ExcludeSystemDirectories", this.ExcludeSystemDirectories);
        this.setParamSimple(map, prefix + "BackupStorageId", this.BackupStorageId);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);

    }
}

