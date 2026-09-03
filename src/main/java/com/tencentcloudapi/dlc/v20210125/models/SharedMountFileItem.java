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

public class SharedMountFileItem extends AbstractModel {

    /**
    * <p>文件或目录名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>类型：file / directory</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>文件大小（字节，仅 Type=file 时有值）</p>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>最后修改时间（毫秒时间戳，仅 Type=file 时有值）</p>
    */
    @SerializedName("LastModified")
    @Expose
    private Long LastModified;

    /**
    * <p>相对 MountPath 的完整路径</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>Checkpoint 训练指标（仅 checkpoint 目录且 snapshot 存在时有值）</p>
    */
    @SerializedName("Metrics")
    @Expose
    private CheckpointMetrics Metrics;

    /**
     * Get <p>文件或目录名</p> 
     * @return Name <p>文件或目录名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>文件或目录名</p>
     * @param Name <p>文件或目录名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>类型：file / directory</p> 
     * @return Type <p>类型：file / directory</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>类型：file / directory</p>
     * @param Type <p>类型：file / directory</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>文件大小（字节，仅 Type=file 时有值）</p> 
     * @return Size <p>文件大小（字节，仅 Type=file 时有值）</p>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>文件大小（字节，仅 Type=file 时有值）</p>
     * @param Size <p>文件大小（字节，仅 Type=file 时有值）</p>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>最后修改时间（毫秒时间戳，仅 Type=file 时有值）</p> 
     * @return LastModified <p>最后修改时间（毫秒时间戳，仅 Type=file 时有值）</p>
     */
    public Long getLastModified() {
        return this.LastModified;
    }

    /**
     * Set <p>最后修改时间（毫秒时间戳，仅 Type=file 时有值）</p>
     * @param LastModified <p>最后修改时间（毫秒时间戳，仅 Type=file 时有值）</p>
     */
    public void setLastModified(Long LastModified) {
        this.LastModified = LastModified;
    }

    /**
     * Get <p>相对 MountPath 的完整路径</p> 
     * @return Path <p>相对 MountPath 的完整路径</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>相对 MountPath 的完整路径</p>
     * @param Path <p>相对 MountPath 的完整路径</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>Checkpoint 训练指标（仅 checkpoint 目录且 snapshot 存在时有值）</p> 
     * @return Metrics <p>Checkpoint 训练指标（仅 checkpoint 目录且 snapshot 存在时有值）</p>
     */
    public CheckpointMetrics getMetrics() {
        return this.Metrics;
    }

    /**
     * Set <p>Checkpoint 训练指标（仅 checkpoint 目录且 snapshot 存在时有值）</p>
     * @param Metrics <p>Checkpoint 训练指标（仅 checkpoint 目录且 snapshot 存在时有值）</p>
     */
    public void setMetrics(CheckpointMetrics Metrics) {
        this.Metrics = Metrics;
    }

    public SharedMountFileItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SharedMountFileItem(SharedMountFileItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.LastModified != null) {
            this.LastModified = new Long(source.LastModified);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Metrics != null) {
            this.Metrics = new CheckpointMetrics(source.Metrics);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "LastModified", this.LastModified);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamObj(map, prefix + "Metrics.", this.Metrics);

    }
}

