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
    * 挂载设备名或分区名，当且仅当添加已有节点时需要
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskPartition")
    @Expose
    private String DiskPartition;

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
     * Get 挂载设备名或分区名，当且仅当添加已有节点时需要
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskPartition 挂载设备名或分区名，当且仅当添加已有节点时需要
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskPartition() {
        return this.DiskPartition;
    }

    /**
     * Set 挂载设备名或分区名，当且仅当添加已有节点时需要
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskPartition 挂载设备名或分区名，当且仅当添加已有节点时需要
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskPartition(String DiskPartition) {
        this.DiskPartition = DiskPartition;
    }

    public DataDisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataDisk(DataDisk source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.FileSystem != null) {
            this.FileSystem = new String(source.FileSystem);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.AutoFormatAndMount != null) {
            this.AutoFormatAndMount = new Boolean(source.AutoFormatAndMount);
        }
        if (source.MountTarget != null) {
            this.MountTarget = new String(source.MountTarget);
        }
        if (source.DiskPartition != null) {
            this.DiskPartition = new String(source.DiskPartition);
        }
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
        this.setParamSimple(map, prefix + "DiskPartition", this.DiskPartition);

    }
}

