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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataDisk extends AbstractModel {

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
    * 挂载设备名或分区名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskPartition")
    @Expose
    private String DiskPartition;

    /**
    * 挂载目录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MountTarget")
    @Expose
    private String MountTarget;

    /**
    * 传入该参数用于创建加密云盘，取值固定为ENCRYPT
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Encrypt")
    @Expose
    private String Encrypt;

    /**
    * 购买加密盘时自定义密钥，当传入该参数时, Encrypt入参不为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * 快照ID，如果传入则根据此快照创建云硬盘，快照类型必须为数据盘快照
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * 云硬盘性能，单位：MB/s。使用此参数可给云硬盘购买额外的性能
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThroughputPerformance")
    @Expose
    private Long ThroughputPerformance;

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
     * Get 挂载设备名或分区名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskPartition 挂载设备名或分区名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskPartition() {
        return this.DiskPartition;
    }

    /**
     * Set 挂载设备名或分区名
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskPartition 挂载设备名或分区名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskPartition(String DiskPartition) {
        this.DiskPartition = DiskPartition;
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
     * Get 传入该参数用于创建加密云盘，取值固定为ENCRYPT
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Encrypt 传入该参数用于创建加密云盘，取值固定为ENCRYPT
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set 传入该参数用于创建加密云盘，取值固定为ENCRYPT
注意：此字段可能返回 null，表示取不到有效值。
     * @param Encrypt 传入该参数用于创建加密云盘，取值固定为ENCRYPT
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncrypt(String Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get 购买加密盘时自定义密钥，当传入该参数时, Encrypt入参不为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KmsKeyId 购买加密盘时自定义密钥，当传入该参数时, Encrypt入参不为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set 购买加密盘时自定义密钥，当传入该参数时, Encrypt入参不为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param KmsKeyId 购买加密盘时自定义密钥，当传入该参数时, Encrypt入参不为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get 快照ID，如果传入则根据此快照创建云硬盘，快照类型必须为数据盘快照
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotId 快照ID，如果传入则根据此快照创建云硬盘，快照类型必须为数据盘快照
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set 快照ID，如果传入则根据此快照创建云硬盘，快照类型必须为数据盘快照
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotId 快照ID，如果传入则根据此快照创建云硬盘，快照类型必须为数据盘快照
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get 云硬盘性能，单位：MB/s。使用此参数可给云硬盘购买额外的性能
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThroughputPerformance 云硬盘性能，单位：MB/s。使用此参数可给云硬盘购买额外的性能
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getThroughputPerformance() {
        return this.ThroughputPerformance;
    }

    /**
     * Set 云硬盘性能，单位：MB/s。使用此参数可给云硬盘购买额外的性能
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThroughputPerformance 云硬盘性能，单位：MB/s。使用此参数可给云硬盘购买额外的性能
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThroughputPerformance(Long ThroughputPerformance) {
        this.ThroughputPerformance = ThroughputPerformance;
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
        if (source.DiskPartition != null) {
            this.DiskPartition = new String(source.DiskPartition);
        }
        if (source.MountTarget != null) {
            this.MountTarget = new String(source.MountTarget);
        }
        if (source.Encrypt != null) {
            this.Encrypt = new String(source.Encrypt);
        }
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.ThroughputPerformance != null) {
            this.ThroughputPerformance = new Long(source.ThroughputPerformance);
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
        this.setParamSimple(map, prefix + "DiskPartition", this.DiskPartition);
        this.setParamSimple(map, prefix + "MountTarget", this.MountTarget);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "ThroughputPerformance", this.ThroughputPerformance);

    }
}

