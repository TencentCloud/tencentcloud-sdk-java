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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataDisk extends AbstractModel{

    /**
    * 数据盘类型。数据盘类型限制详见[云硬盘类型](https://cloud.tencent.com/document/product/362/2353)。取值范围：<br><li>LOCAL_BASIC：本地硬盘<br><li>LOCAL_SSD：本地SSD硬盘<br><li>CLOUD_BASIC：普通云硬盘<br><li>CLOUD_PREMIUM：高性能云硬盘<br><li>CLOUD_SSD：SSD云硬盘<br><li>CLOUD_HSSD：增强型SSD云硬盘<br><li>CLOUD_TSSD：极速型SSD云硬盘<br><br>默认取值与系统盘类型（SystemDisk.DiskType）保持一致。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 数据盘大小，单位：GB。最小调整步长为10G，不同数据盘类型取值范围不同，具体限制详见：[CVM实例配置](https://cloud.tencent.com/document/product/213/2177)。默认值为0，表示不购买数据盘。更多限制详见产品文档。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 数据盘快照 ID，类似 `snap-l8psqwnt`。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * 数据盘是否随子机销毁。取值范围：<br><li>TRUE：子机销毁时，销毁数据盘，只支持按小时后付费云盘<br><li>FALSE：子机销毁时，保留数据盘
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeleteWithInstance")
    @Expose
    private Boolean DeleteWithInstance;

    /**
    * 数据盘是否加密。取值范围：<br><li>TRUE：加密<br><li>FALSE：不加密
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Encrypt")
    @Expose
    private Boolean Encrypt;

    /**
    * 云硬盘性能，单位：MB/s。使用此参数可给云硬盘购买额外的性能，功能介绍和类型限制详见：[增强型 SSD 云硬盘额外性能说明](https://cloud.tencent.com/document/product/362/51896#.E5.A2.9E.E5.BC.BA.E5.9E.8B-ssd-.E4.BA.91.E7.A1.AC.E7.9B.98.E9.A2.9D.E5.A4.96.E6.80.A7.E8.83.BD)。
当前仅支持极速型云盘（CLOUD_TSSD）和增强型SSD云硬盘（CLOUD_HSSD）且 需容量 > 460GB。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThroughputPerformance")
    @Expose
    private Long ThroughputPerformance;

    /**
     * Get 数据盘类型。数据盘类型限制详见[云硬盘类型](https://cloud.tencent.com/document/product/362/2353)。取值范围：<br><li>LOCAL_BASIC：本地硬盘<br><li>LOCAL_SSD：本地SSD硬盘<br><li>CLOUD_BASIC：普通云硬盘<br><li>CLOUD_PREMIUM：高性能云硬盘<br><li>CLOUD_SSD：SSD云硬盘<br><li>CLOUD_HSSD：增强型SSD云硬盘<br><li>CLOUD_TSSD：极速型SSD云硬盘<br><br>默认取值与系统盘类型（SystemDisk.DiskType）保持一致。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskType 数据盘类型。数据盘类型限制详见[云硬盘类型](https://cloud.tencent.com/document/product/362/2353)。取值范围：<br><li>LOCAL_BASIC：本地硬盘<br><li>LOCAL_SSD：本地SSD硬盘<br><li>CLOUD_BASIC：普通云硬盘<br><li>CLOUD_PREMIUM：高性能云硬盘<br><li>CLOUD_SSD：SSD云硬盘<br><li>CLOUD_HSSD：增强型SSD云硬盘<br><li>CLOUD_TSSD：极速型SSD云硬盘<br><br>默认取值与系统盘类型（SystemDisk.DiskType）保持一致。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 数据盘类型。数据盘类型限制详见[云硬盘类型](https://cloud.tencent.com/document/product/362/2353)。取值范围：<br><li>LOCAL_BASIC：本地硬盘<br><li>LOCAL_SSD：本地SSD硬盘<br><li>CLOUD_BASIC：普通云硬盘<br><li>CLOUD_PREMIUM：高性能云硬盘<br><li>CLOUD_SSD：SSD云硬盘<br><li>CLOUD_HSSD：增强型SSD云硬盘<br><li>CLOUD_TSSD：极速型SSD云硬盘<br><br>默认取值与系统盘类型（SystemDisk.DiskType）保持一致。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskType 数据盘类型。数据盘类型限制详见[云硬盘类型](https://cloud.tencent.com/document/product/362/2353)。取值范围：<br><li>LOCAL_BASIC：本地硬盘<br><li>LOCAL_SSD：本地SSD硬盘<br><li>CLOUD_BASIC：普通云硬盘<br><li>CLOUD_PREMIUM：高性能云硬盘<br><li>CLOUD_SSD：SSD云硬盘<br><li>CLOUD_HSSD：增强型SSD云硬盘<br><li>CLOUD_TSSD：极速型SSD云硬盘<br><br>默认取值与系统盘类型（SystemDisk.DiskType）保持一致。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 数据盘大小，单位：GB。最小调整步长为10G，不同数据盘类型取值范围不同，具体限制详见：[CVM实例配置](https://cloud.tencent.com/document/product/213/2177)。默认值为0，表示不购买数据盘。更多限制详见产品文档。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskSize 数据盘大小，单位：GB。最小调整步长为10G，不同数据盘类型取值范围不同，具体限制详见：[CVM实例配置](https://cloud.tencent.com/document/product/213/2177)。默认值为0，表示不购买数据盘。更多限制详见产品文档。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 数据盘大小，单位：GB。最小调整步长为10G，不同数据盘类型取值范围不同，具体限制详见：[CVM实例配置](https://cloud.tencent.com/document/product/213/2177)。默认值为0，表示不购买数据盘。更多限制详见产品文档。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskSize 数据盘大小，单位：GB。最小调整步长为10G，不同数据盘类型取值范围不同，具体限制详见：[CVM实例配置](https://cloud.tencent.com/document/product/213/2177)。默认值为0，表示不购买数据盘。更多限制详见产品文档。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 数据盘快照 ID，类似 `snap-l8psqwnt`。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotId 数据盘快照 ID，类似 `snap-l8psqwnt`。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set 数据盘快照 ID，类似 `snap-l8psqwnt`。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotId 数据盘快照 ID，类似 `snap-l8psqwnt`。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get 数据盘是否随子机销毁。取值范围：<br><li>TRUE：子机销毁时，销毁数据盘，只支持按小时后付费云盘<br><li>FALSE：子机销毁时，保留数据盘
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeleteWithInstance 数据盘是否随子机销毁。取值范围：<br><li>TRUE：子机销毁时，销毁数据盘，只支持按小时后付费云盘<br><li>FALSE：子机销毁时，保留数据盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDeleteWithInstance() {
        return this.DeleteWithInstance;
    }

    /**
     * Set 数据盘是否随子机销毁。取值范围：<br><li>TRUE：子机销毁时，销毁数据盘，只支持按小时后付费云盘<br><li>FALSE：子机销毁时，保留数据盘
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeleteWithInstance 数据盘是否随子机销毁。取值范围：<br><li>TRUE：子机销毁时，销毁数据盘，只支持按小时后付费云盘<br><li>FALSE：子机销毁时，保留数据盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeleteWithInstance(Boolean DeleteWithInstance) {
        this.DeleteWithInstance = DeleteWithInstance;
    }

    /**
     * Get 数据盘是否加密。取值范围：<br><li>TRUE：加密<br><li>FALSE：不加密
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Encrypt 数据盘是否加密。取值范围：<br><li>TRUE：加密<br><li>FALSE：不加密
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set 数据盘是否加密。取值范围：<br><li>TRUE：加密<br><li>FALSE：不加密
注意：此字段可能返回 null，表示取不到有效值。
     * @param Encrypt 数据盘是否加密。取值范围：<br><li>TRUE：加密<br><li>FALSE：不加密
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncrypt(Boolean Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get 云硬盘性能，单位：MB/s。使用此参数可给云硬盘购买额外的性能，功能介绍和类型限制详见：[增强型 SSD 云硬盘额外性能说明](https://cloud.tencent.com/document/product/362/51896#.E5.A2.9E.E5.BC.BA.E5.9E.8B-ssd-.E4.BA.91.E7.A1.AC.E7.9B.98.E9.A2.9D.E5.A4.96.E6.80.A7.E8.83.BD)。
当前仅支持极速型云盘（CLOUD_TSSD）和增强型SSD云硬盘（CLOUD_HSSD）且 需容量 > 460GB。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThroughputPerformance 云硬盘性能，单位：MB/s。使用此参数可给云硬盘购买额外的性能，功能介绍和类型限制详见：[增强型 SSD 云硬盘额外性能说明](https://cloud.tencent.com/document/product/362/51896#.E5.A2.9E.E5.BC.BA.E5.9E.8B-ssd-.E4.BA.91.E7.A1.AC.E7.9B.98.E9.A2.9D.E5.A4.96.E6.80.A7.E8.83.BD)。
当前仅支持极速型云盘（CLOUD_TSSD）和增强型SSD云硬盘（CLOUD_HSSD）且 需容量 > 460GB。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getThroughputPerformance() {
        return this.ThroughputPerformance;
    }

    /**
     * Set 云硬盘性能，单位：MB/s。使用此参数可给云硬盘购买额外的性能，功能介绍和类型限制详见：[增强型 SSD 云硬盘额外性能说明](https://cloud.tencent.com/document/product/362/51896#.E5.A2.9E.E5.BC.BA.E5.9E.8B-ssd-.E4.BA.91.E7.A1.AC.E7.9B.98.E9.A2.9D.E5.A4.96.E6.80.A7.E8.83.BD)。
当前仅支持极速型云盘（CLOUD_TSSD）和增强型SSD云硬盘（CLOUD_HSSD）且 需容量 > 460GB。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThroughputPerformance 云硬盘性能，单位：MB/s。使用此参数可给云硬盘购买额外的性能，功能介绍和类型限制详见：[增强型 SSD 云硬盘额外性能说明](https://cloud.tencent.com/document/product/362/51896#.E5.A2.9E.E5.BC.BA.E5.9E.8B-ssd-.E4.BA.91.E7.A1.AC.E7.9B.98.E9.A2.9D.E5.A4.96.E6.80.A7.E8.83.BD)。
当前仅支持极速型云盘（CLOUD_TSSD）和增强型SSD云硬盘（CLOUD_HSSD）且 需容量 > 460GB。
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
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.DeleteWithInstance != null) {
            this.DeleteWithInstance = new Boolean(source.DeleteWithInstance);
        }
        if (source.Encrypt != null) {
            this.Encrypt = new Boolean(source.Encrypt);
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
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "DeleteWithInstance", this.DeleteWithInstance);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamSimple(map, prefix + "ThroughputPerformance", this.ThroughputPerformance);

    }
}

