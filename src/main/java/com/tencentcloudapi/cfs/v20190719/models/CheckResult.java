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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckResult extends AbstractModel {

    /**
    * 生命周期管理策略ID
    */
    @SerializedName("LifecyclePolicyID")
    @Expose
    private String LifecyclePolicyID;

    /**
    * 文件系统ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 目录绝对路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 生命周期管理策略关联的管理规则列表
    */
    @SerializedName("LifecycleRules")
    @Expose
    private LifecycleRule [] LifecycleRules;

    /**
    * 目标路径
    */
    @SerializedName("TargetPath")
    @Expose
    private String TargetPath;

    /**
     * Get 生命周期管理策略ID 
     * @return LifecyclePolicyID 生命周期管理策略ID
     */
    public String getLifecyclePolicyID() {
        return this.LifecyclePolicyID;
    }

    /**
     * Set 生命周期管理策略ID
     * @param LifecyclePolicyID 生命周期管理策略ID
     */
    public void setLifecyclePolicyID(String LifecyclePolicyID) {
        this.LifecyclePolicyID = LifecyclePolicyID;
    }

    /**
     * Get 文件系统ID 
     * @return FileSystemId 文件系统ID
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统ID
     * @param FileSystemId 文件系统ID
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 目录绝对路径 
     * @return Path 目录绝对路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 目录绝对路径
     * @param Path 目录绝对路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 生命周期管理策略关联的管理规则列表 
     * @return LifecycleRules 生命周期管理策略关联的管理规则列表
     */
    public LifecycleRule [] getLifecycleRules() {
        return this.LifecycleRules;
    }

    /**
     * Set 生命周期管理策略关联的管理规则列表
     * @param LifecycleRules 生命周期管理策略关联的管理规则列表
     */
    public void setLifecycleRules(LifecycleRule [] LifecycleRules) {
        this.LifecycleRules = LifecycleRules;
    }

    /**
     * Get 目标路径 
     * @return TargetPath 目标路径
     */
    public String getTargetPath() {
        return this.TargetPath;
    }

    /**
     * Set 目标路径
     * @param TargetPath 目标路径
     */
    public void setTargetPath(String TargetPath) {
        this.TargetPath = TargetPath;
    }

    public CheckResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckResult(CheckResult source) {
        if (source.LifecyclePolicyID != null) {
            this.LifecyclePolicyID = new String(source.LifecyclePolicyID);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.LifecycleRules != null) {
            this.LifecycleRules = new LifecycleRule[source.LifecycleRules.length];
            for (int i = 0; i < source.LifecycleRules.length; i++) {
                this.LifecycleRules[i] = new LifecycleRule(source.LifecycleRules[i]);
            }
        }
        if (source.TargetPath != null) {
            this.TargetPath = new String(source.TargetPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifecyclePolicyID", this.LifecyclePolicyID);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamArrayObj(map, prefix + "LifecycleRules.", this.LifecycleRules);
        this.setParamSimple(map, prefix + "TargetPath", this.TargetPath);

    }
}

