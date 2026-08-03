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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PersistentWorkDir extends AbstractModel {

    /**
    * <p>是否启用持久化工作目录；为空或 false 时沿用 emptyDir 行为</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>持久化存储类型：COS / CFS</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>COS Bucket 名称（Type=COS 时必填）</p>
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * <p>CFS 文件系统 ID（Type=CFS 时必填）</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>Bucket / 文件系统下的子路径，必须以 &#39;/&#39; 开头且不含 &#39;..&#39;</p>
    */
    @SerializedName("VolumeSubPath")
    @Expose
    private String VolumeSubPath;

    /**
     * Get <p>是否启用持久化工作目录；为空或 false 时沿用 emptyDir 行为</p> 
     * @return Enabled <p>是否启用持久化工作目录；为空或 false 时沿用 emptyDir 行为</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否启用持久化工作目录；为空或 false 时沿用 emptyDir 行为</p>
     * @param Enabled <p>是否启用持久化工作目录；为空或 false 时沿用 emptyDir 行为</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>持久化存储类型：COS / CFS</p> 
     * @return Type <p>持久化存储类型：COS / CFS</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>持久化存储类型：COS / CFS</p>
     * @param Type <p>持久化存储类型：COS / CFS</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>COS Bucket 名称（Type=COS 时必填）</p> 
     * @return Bucket <p>COS Bucket 名称（Type=COS 时必填）</p>
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set <p>COS Bucket 名称（Type=COS 时必填）</p>
     * @param Bucket <p>COS Bucket 名称（Type=COS 时必填）</p>
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get <p>CFS 文件系统 ID（Type=CFS 时必填）</p> 
     * @return FileSystemId <p>CFS 文件系统 ID（Type=CFS 时必填）</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>CFS 文件系统 ID（Type=CFS 时必填）</p>
     * @param FileSystemId <p>CFS 文件系统 ID（Type=CFS 时必填）</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>Bucket / 文件系统下的子路径，必须以 &#39;/&#39; 开头且不含 &#39;..&#39;</p> 
     * @return VolumeSubPath <p>Bucket / 文件系统下的子路径，必须以 &#39;/&#39; 开头且不含 &#39;..&#39;</p>
     */
    public String getVolumeSubPath() {
        return this.VolumeSubPath;
    }

    /**
     * Set <p>Bucket / 文件系统下的子路径，必须以 &#39;/&#39; 开头且不含 &#39;..&#39;</p>
     * @param VolumeSubPath <p>Bucket / 文件系统下的子路径，必须以 &#39;/&#39; 开头且不含 &#39;..&#39;</p>
     */
    public void setVolumeSubPath(String VolumeSubPath) {
        this.VolumeSubPath = VolumeSubPath;
    }

    public PersistentWorkDir() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PersistentWorkDir(PersistentWorkDir source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.VolumeSubPath != null) {
            this.VolumeSubPath = new String(source.VolumeSubPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "VolumeSubPath", this.VolumeSubPath);

    }
}

