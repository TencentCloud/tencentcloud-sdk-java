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
    * <p>云服务器实例 ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>备份路径，[0,20]</p>
    */
    @SerializedName("BackupPaths")
    @Expose
    private String [] BackupPaths;

    /**
    * <p>包含文件类型，[0,20]</p>
    */
    @SerializedName("IncludeFileTypes")
    @Expose
    private String [] IncludeFileTypes;

    /**
    * <p>排除路径，[0,20]</p>
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
    * <p>是否立即触发全量备份</p>
    */
    @SerializedName("ExecuteImmediately")
    @Expose
    private Boolean ExecuteImmediately;

    /**
    * <p>cos备份是否备份ACL</p>
    */
    @SerializedName("EnableObjectAcl")
    @Expose
    private Boolean EnableObjectAcl;

    /**
    * <p>cos备份是否备份tag</p>
    */
    @SerializedName("EnableObjectTags")
    @Expose
    private Boolean EnableObjectTags;

    /**
     * Get <p>云服务器实例 ID</p> 
     * @return ResourceId <p>云服务器实例 ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>云服务器实例 ID</p>
     * @param ResourceId <p>云服务器实例 ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>备份路径，[0,20]</p> 
     * @return BackupPaths <p>备份路径，[0,20]</p>
     */
    public String [] getBackupPaths() {
        return this.BackupPaths;
    }

    /**
     * Set <p>备份路径，[0,20]</p>
     * @param BackupPaths <p>备份路径，[0,20]</p>
     */
    public void setBackupPaths(String [] BackupPaths) {
        this.BackupPaths = BackupPaths;
    }

    /**
     * Get <p>包含文件类型，[0,20]</p> 
     * @return IncludeFileTypes <p>包含文件类型，[0,20]</p>
     */
    public String [] getIncludeFileTypes() {
        return this.IncludeFileTypes;
    }

    /**
     * Set <p>包含文件类型，[0,20]</p>
     * @param IncludeFileTypes <p>包含文件类型，[0,20]</p>
     */
    public void setIncludeFileTypes(String [] IncludeFileTypes) {
        this.IncludeFileTypes = IncludeFileTypes;
    }

    /**
     * Get <p>排除路径，[0,20]</p> 
     * @return ExcludePatterns <p>排除路径，[0,20]</p>
     */
    public String [] getExcludePatterns() {
        return this.ExcludePatterns;
    }

    /**
     * Set <p>排除路径，[0,20]</p>
     * @param ExcludePatterns <p>排除路径，[0,20]</p>
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
     * Get <p>是否立即触发全量备份</p> 
     * @return ExecuteImmediately <p>是否立即触发全量备份</p>
     */
    public Boolean getExecuteImmediately() {
        return this.ExecuteImmediately;
    }

    /**
     * Set <p>是否立即触发全量备份</p>
     * @param ExecuteImmediately <p>是否立即触发全量备份</p>
     */
    public void setExecuteImmediately(Boolean ExecuteImmediately) {
        this.ExecuteImmediately = ExecuteImmediately;
    }

    /**
     * Get <p>cos备份是否备份ACL</p> 
     * @return EnableObjectAcl <p>cos备份是否备份ACL</p>
     */
    public Boolean getEnableObjectAcl() {
        return this.EnableObjectAcl;
    }

    /**
     * Set <p>cos备份是否备份ACL</p>
     * @param EnableObjectAcl <p>cos备份是否备份ACL</p>
     */
    public void setEnableObjectAcl(Boolean EnableObjectAcl) {
        this.EnableObjectAcl = EnableObjectAcl;
    }

    /**
     * Get <p>cos备份是否备份tag</p> 
     * @return EnableObjectTags <p>cos备份是否备份tag</p>
     */
    public Boolean getEnableObjectTags() {
        return this.EnableObjectTags;
    }

    /**
     * Set <p>cos备份是否备份tag</p>
     * @param EnableObjectTags <p>cos备份是否备份tag</p>
     */
    public void setEnableObjectTags(Boolean EnableObjectTags) {
        this.EnableObjectTags = EnableObjectTags;
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
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamArraySimple(map, prefix + "BackupPaths.", this.BackupPaths);
        this.setParamArraySimple(map, prefix + "IncludeFileTypes.", this.IncludeFileTypes);
        this.setParamArraySimple(map, prefix + "ExcludePatterns.", this.ExcludePatterns);
        this.setParamSimple(map, prefix + "ExcludeSystemDirectories", this.ExcludeSystemDirectories);
        this.setParamSimple(map, prefix + "ExecuteImmediately", this.ExecuteImmediately);
        this.setParamSimple(map, prefix + "EnableObjectAcl", this.EnableObjectAcl);
        this.setParamSimple(map, prefix + "EnableObjectTags", this.EnableObjectTags);

    }
}

