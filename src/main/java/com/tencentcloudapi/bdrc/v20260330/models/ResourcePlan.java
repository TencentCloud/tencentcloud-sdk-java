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

public class ResourcePlan extends AbstractModel {

    /**
    * 云服务器实例 ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 备份路径，[0,20]
    */
    @SerializedName("BackupPaths")
    @Expose
    private String [] BackupPaths;

    /**
    * 包含文件类型，[0,20]
    */
    @SerializedName("IncludeFileTypes")
    @Expose
    private String [] IncludeFileTypes;

    /**
    * 排除路径，[0,20]
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
    * 是否立即触发全量备份
    */
    @SerializedName("ExecuteImmediately")
    @Expose
    private Boolean ExecuteImmediately;

    /**
     * Get 云服务器实例 ID 
     * @return ResourceId 云服务器实例 ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 云服务器实例 ID
     * @param ResourceId 云服务器实例 ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 备份路径，[0,20] 
     * @return BackupPaths 备份路径，[0,20]
     */
    public String [] getBackupPaths() {
        return this.BackupPaths;
    }

    /**
     * Set 备份路径，[0,20]
     * @param BackupPaths 备份路径，[0,20]
     */
    public void setBackupPaths(String [] BackupPaths) {
        this.BackupPaths = BackupPaths;
    }

    /**
     * Get 包含文件类型，[0,20] 
     * @return IncludeFileTypes 包含文件类型，[0,20]
     */
    public String [] getIncludeFileTypes() {
        return this.IncludeFileTypes;
    }

    /**
     * Set 包含文件类型，[0,20]
     * @param IncludeFileTypes 包含文件类型，[0,20]
     */
    public void setIncludeFileTypes(String [] IncludeFileTypes) {
        this.IncludeFileTypes = IncludeFileTypes;
    }

    /**
     * Get 排除路径，[0,20] 
     * @return ExcludePatterns 排除路径，[0,20]
     */
    public String [] getExcludePatterns() {
        return this.ExcludePatterns;
    }

    /**
     * Set 排除路径，[0,20]
     * @param ExcludePatterns 排除路径，[0,20]
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
     * Get 是否立即触发全量备份 
     * @return ExecuteImmediately 是否立即触发全量备份
     */
    public Boolean getExecuteImmediately() {
        return this.ExecuteImmediately;
    }

    /**
     * Set 是否立即触发全量备份
     * @param ExecuteImmediately 是否立即触发全量备份
     */
    public void setExecuteImmediately(Boolean ExecuteImmediately) {
        this.ExecuteImmediately = ExecuteImmediately;
    }

    public ResourcePlan() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourcePlan(ResourcePlan source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
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
        if (source.ExecuteImmediately != null) {
            this.ExecuteImmediately = new Boolean(source.ExecuteImmediately);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamArraySimple(map, prefix + "BackupPaths.", this.BackupPaths);
        this.setParamArraySimple(map, prefix + "IncludeFileTypes.", this.IncludeFileTypes);
        this.setParamArraySimple(map, prefix + "ExcludePatterns.", this.ExcludePatterns);
        this.setParamSimple(map, prefix + "ExcludeSystemDirectories", this.ExcludeSystemDirectories);
        this.setParamSimple(map, prefix + "ExecuteImmediately", this.ExecuteImmediately);

    }
}

