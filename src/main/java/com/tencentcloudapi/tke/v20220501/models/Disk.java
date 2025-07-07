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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Disk extends AbstractModel {

    /**
    * 云盘类型
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 云盘大小(G）
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 是否自动化格式盘并挂载
    */
    @SerializedName("AutoFormatAndMount")
    @Expose
    private Boolean AutoFormatAndMount;

    /**
    * 文件系统
    */
    @SerializedName("FileSystem")
    @Expose
    private String FileSystem;

    /**
    * 挂载目录
    */
    @SerializedName("MountTarget")
    @Expose
    private String MountTarget;

    /**
    * 云盘ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
     * Get 云盘类型 
     * @return DiskType 云盘类型
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 云盘类型
     * @param DiskType 云盘类型
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 云盘大小(G） 
     * @return DiskSize 云盘大小(G）
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 云盘大小(G）
     * @param DiskSize 云盘大小(G）
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 是否自动化格式盘并挂载 
     * @return AutoFormatAndMount 是否自动化格式盘并挂载
     */
    public Boolean getAutoFormatAndMount() {
        return this.AutoFormatAndMount;
    }

    /**
     * Set 是否自动化格式盘并挂载
     * @param AutoFormatAndMount 是否自动化格式盘并挂载
     */
    public void setAutoFormatAndMount(Boolean AutoFormatAndMount) {
        this.AutoFormatAndMount = AutoFormatAndMount;
    }

    /**
     * Get 文件系统 
     * @return FileSystem 文件系统
     */
    public String getFileSystem() {
        return this.FileSystem;
    }

    /**
     * Set 文件系统
     * @param FileSystem 文件系统
     */
    public void setFileSystem(String FileSystem) {
        this.FileSystem = FileSystem;
    }

    /**
     * Get 挂载目录 
     * @return MountTarget 挂载目录
     */
    public String getMountTarget() {
        return this.MountTarget;
    }

    /**
     * Set 挂载目录
     * @param MountTarget 挂载目录
     */
    public void setMountTarget(String MountTarget) {
        this.MountTarget = MountTarget;
    }

    /**
     * Get 云盘ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskId 云盘ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set 云盘ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskId 云盘ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    public Disk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Disk(Disk source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.AutoFormatAndMount != null) {
            this.AutoFormatAndMount = new Boolean(source.AutoFormatAndMount);
        }
        if (source.FileSystem != null) {
            this.FileSystem = new String(source.FileSystem);
        }
        if (source.MountTarget != null) {
            this.MountTarget = new String(source.MountTarget);
        }
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "AutoFormatAndMount", this.AutoFormatAndMount);
        this.setParamSimple(map, prefix + "FileSystem", this.FileSystem);
        this.setParamSimple(map, prefix + "MountTarget", this.MountTarget);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);

    }
}

