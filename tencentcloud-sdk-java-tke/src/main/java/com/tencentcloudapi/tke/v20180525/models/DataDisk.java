/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataDisk extends AbstractModel{

    /**
    * 云盘类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 文件系统(ext3/ext4/xfs)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSystem")
    @Expose
    private String FileSystem;

    /**
    * 云盘大小(G）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 是否自动化格式盘并挂载
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoFormatAndMount")
    @Expose
    private Boolean AutoFormatAndMount;

    /**
    * 挂载目录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MountTarget")
    @Expose
    private String MountTarget;

    /**
     * Get 云盘类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskType 云盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 云盘类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskType 云盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 文件系统(ext3/ext4/xfs)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileSystem 文件系统(ext3/ext4/xfs)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileSystem() {
        return this.FileSystem;
    }

    /**
     * Set 文件系统(ext3/ext4/xfs)
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSystem 文件系统(ext3/ext4/xfs)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSystem(String FileSystem) {
        this.FileSystem = FileSystem;
    }

    /**
     * Get 云盘大小(G）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskSize 云盘大小(G）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 云盘大小(G）
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskSize 云盘大小(G）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 是否自动化格式盘并挂载
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoFormatAndMount 是否自动化格式盘并挂载
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAutoFormatAndMount() {
        return this.AutoFormatAndMount;
    }

    /**
     * Set 是否自动化格式盘并挂载
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoFormatAndMount 是否自动化格式盘并挂载
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoFormatAndMount(Boolean AutoFormatAndMount) {
        this.AutoFormatAndMount = AutoFormatAndMount;
    }

    /**
     * Get 挂载目录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MountTarget 挂载目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMountTarget() {
        return this.MountTarget;
    }

    /**
     * Set 挂载目录
注意：此字段可能返回 null，表示取不到有效值。
     * @param MountTarget 挂载目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMountTarget(String MountTarget) {
        this.MountTarget = MountTarget;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "FileSystem", this.FileSystem);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "AutoFormatAndMount", this.AutoFormatAndMount);
        this.setParamSimple(map, prefix + "MountTarget", this.MountTarget);

    }
}

