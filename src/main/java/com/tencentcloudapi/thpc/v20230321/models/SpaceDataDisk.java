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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpaceDataDisk extends AbstractModel {

    /**
    * 数据盘类型。数据盘类型限制详见[存储概述](https://cloud.tencent.com/document/product/213/4952)。取值范围：<br />
<li>
  LOCAL_BASIC：本地硬盘<br />
  <li>
    LOCAL_SSD：本地SSD硬盘<br />
    <li>
      LOCAL_NVME：本地NVME硬盘，与InstanceType强相关，不支持指定<br />
      <li>
        LOCAL_PRO：本地HDD硬盘，与InstanceType强相关，不支持指定<br />
        <li>
          CLOUD_BASIC：普通云硬盘<br />
          <li>
            CLOUD_PREMIUM：高性能云硬盘<br />
            <li>
              CLOUD_SSD：SSD云硬盘<br />
              <li>
                CLOUD_HSSD：增强型SSD云硬盘<br />
                <li>
                  CLOUD_TSSD：极速型SSD云硬盘<br />
                  <li>
                    CLOUD_BSSD：通用型SSD云硬盘<br /><br />默认取值：LOCAL_BASIC。<br /><br />该参数对`ResizeInstanceDisk`接口无效。
                  </li>
                </li>
              </li>
            </li>
          </li>
        </li>
      </li>
    </li>
  </li>
</li>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 数据盘
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * 数据盘大小，单位：GB。最小调整步长为10G，不同数据盘类型取值范围不同，具体限制详见：[存储概述](https://cloud.tencent.com/document/product/213/4952)。默认值为0，表示不购买数据盘。更多限制详见产品文档。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 数据盘是否随子机销毁。取值范围：
<li>TRUE：子机销毁时，销毁数据盘，只支持按小时后付费云盘</li>
<li>
  FALSE：子机销毁时，保留数据盘<br />
  默认取值：TRUE<br />
  该参数目前仅用于 `RunInstances` 接口。
</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeleteWithInstance")
    @Expose
    private Boolean DeleteWithInstance;

    /**
    * 数据盘快照ID。选择的数据盘快照大小需小于数据盘大小。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * 数据盘是加密。取值范围：
<li>true：加密</li>
<li>
  false：不加密<br />
  默认取值：false<br />
  该参数目前仅用于 `RunInstances` 接口。
</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Encrypt")
    @Expose
    private Boolean Encrypt;

    /**
    * 自定义CMK对应的ID，取值为UUID或者类似kms-abcd1234。用于加密云盘。

该参数目前仅用于 `CreateWorkspaces` 接口。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KmsKeyId")
    @Expose
    private String KmsKeyId;

    /**
    * 云硬盘性能，单位：MB/s
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThroughputPerformance")
    @Expose
    private Long ThroughputPerformance;

    /**
    * 突发性能

注：内测中。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BurstPerformance")
    @Expose
    private Boolean BurstPerformance;

    /**
     * Get 数据盘类型。数据盘类型限制详见[存储概述](https://cloud.tencent.com/document/product/213/4952)。取值范围：<br />
<li>
  LOCAL_BASIC：本地硬盘<br />
  <li>
    LOCAL_SSD：本地SSD硬盘<br />
    <li>
      LOCAL_NVME：本地NVME硬盘，与InstanceType强相关，不支持指定<br />
      <li>
        LOCAL_PRO：本地HDD硬盘，与InstanceType强相关，不支持指定<br />
        <li>
          CLOUD_BASIC：普通云硬盘<br />
          <li>
            CLOUD_PREMIUM：高性能云硬盘<br />
            <li>
              CLOUD_SSD：SSD云硬盘<br />
              <li>
                CLOUD_HSSD：增强型SSD云硬盘<br />
                <li>
                  CLOUD_TSSD：极速型SSD云硬盘<br />
                  <li>
                    CLOUD_BSSD：通用型SSD云硬盘<br /><br />默认取值：LOCAL_BASIC。<br /><br />该参数对`ResizeInstanceDisk`接口无效。
                  </li>
                </li>
              </li>
            </li>
          </li>
        </li>
      </li>
    </li>
  </li>
</li> 
     * @return DiskType 数据盘类型。数据盘类型限制详见[存储概述](https://cloud.tencent.com/document/product/213/4952)。取值范围：<br />
<li>
  LOCAL_BASIC：本地硬盘<br />
  <li>
    LOCAL_SSD：本地SSD硬盘<br />
    <li>
      LOCAL_NVME：本地NVME硬盘，与InstanceType强相关，不支持指定<br />
      <li>
        LOCAL_PRO：本地HDD硬盘，与InstanceType强相关，不支持指定<br />
        <li>
          CLOUD_BASIC：普通云硬盘<br />
          <li>
            CLOUD_PREMIUM：高性能云硬盘<br />
            <li>
              CLOUD_SSD：SSD云硬盘<br />
              <li>
                CLOUD_HSSD：增强型SSD云硬盘<br />
                <li>
                  CLOUD_TSSD：极速型SSD云硬盘<br />
                  <li>
                    CLOUD_BSSD：通用型SSD云硬盘<br /><br />默认取值：LOCAL_BASIC。<br /><br />该参数对`ResizeInstanceDisk`接口无效。
                  </li>
                </li>
              </li>
            </li>
          </li>
        </li>
      </li>
    </li>
  </li>
</li>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 数据盘类型。数据盘类型限制详见[存储概述](https://cloud.tencent.com/document/product/213/4952)。取值范围：<br />
<li>
  LOCAL_BASIC：本地硬盘<br />
  <li>
    LOCAL_SSD：本地SSD硬盘<br />
    <li>
      LOCAL_NVME：本地NVME硬盘，与InstanceType强相关，不支持指定<br />
      <li>
        LOCAL_PRO：本地HDD硬盘，与InstanceType强相关，不支持指定<br />
        <li>
          CLOUD_BASIC：普通云硬盘<br />
          <li>
            CLOUD_PREMIUM：高性能云硬盘<br />
            <li>
              CLOUD_SSD：SSD云硬盘<br />
              <li>
                CLOUD_HSSD：增强型SSD云硬盘<br />
                <li>
                  CLOUD_TSSD：极速型SSD云硬盘<br />
                  <li>
                    CLOUD_BSSD：通用型SSD云硬盘<br /><br />默认取值：LOCAL_BASIC。<br /><br />该参数对`ResizeInstanceDisk`接口无效。
                  </li>
                </li>
              </li>
            </li>
          </li>
        </li>
      </li>
    </li>
  </li>
</li>
     * @param DiskType 数据盘类型。数据盘类型限制详见[存储概述](https://cloud.tencent.com/document/product/213/4952)。取值范围：<br />
<li>
  LOCAL_BASIC：本地硬盘<br />
  <li>
    LOCAL_SSD：本地SSD硬盘<br />
    <li>
      LOCAL_NVME：本地NVME硬盘，与InstanceType强相关，不支持指定<br />
      <li>
        LOCAL_PRO：本地HDD硬盘，与InstanceType强相关，不支持指定<br />
        <li>
          CLOUD_BASIC：普通云硬盘<br />
          <li>
            CLOUD_PREMIUM：高性能云硬盘<br />
            <li>
              CLOUD_SSD：SSD云硬盘<br />
              <li>
                CLOUD_HSSD：增强型SSD云硬盘<br />
                <li>
                  CLOUD_TSSD：极速型SSD云硬盘<br />
                  <li>
                    CLOUD_BSSD：通用型SSD云硬盘<br /><br />默认取值：LOCAL_BASIC。<br /><br />该参数对`ResizeInstanceDisk`接口无效。
                  </li>
                </li>
              </li>
            </li>
          </li>
        </li>
      </li>
    </li>
  </li>
</li>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 数据盘
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskId 数据盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set 数据盘
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskId 数据盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get 数据盘大小，单位：GB。最小调整步长为10G，不同数据盘类型取值范围不同，具体限制详见：[存储概述](https://cloud.tencent.com/document/product/213/4952)。默认值为0，表示不购买数据盘。更多限制详见产品文档。 
     * @return DiskSize 数据盘大小，单位：GB。最小调整步长为10G，不同数据盘类型取值范围不同，具体限制详见：[存储概述](https://cloud.tencent.com/document/product/213/4952)。默认值为0，表示不购买数据盘。更多限制详见产品文档。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 数据盘大小，单位：GB。最小调整步长为10G，不同数据盘类型取值范围不同，具体限制详见：[存储概述](https://cloud.tencent.com/document/product/213/4952)。默认值为0，表示不购买数据盘。更多限制详见产品文档。
     * @param DiskSize 数据盘大小，单位：GB。最小调整步长为10G，不同数据盘类型取值范围不同，具体限制详见：[存储概述](https://cloud.tencent.com/document/product/213/4952)。默认值为0，表示不购买数据盘。更多限制详见产品文档。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 数据盘是否随子机销毁。取值范围：
<li>TRUE：子机销毁时，销毁数据盘，只支持按小时后付费云盘</li>
<li>
  FALSE：子机销毁时，保留数据盘<br />
  默认取值：TRUE<br />
  该参数目前仅用于 `RunInstances` 接口。
</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeleteWithInstance 数据盘是否随子机销毁。取值范围：
<li>TRUE：子机销毁时，销毁数据盘，只支持按小时后付费云盘</li>
<li>
  FALSE：子机销毁时，保留数据盘<br />
  默认取值：TRUE<br />
  该参数目前仅用于 `RunInstances` 接口。
</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDeleteWithInstance() {
        return this.DeleteWithInstance;
    }

    /**
     * Set 数据盘是否随子机销毁。取值范围：
<li>TRUE：子机销毁时，销毁数据盘，只支持按小时后付费云盘</li>
<li>
  FALSE：子机销毁时，保留数据盘<br />
  默认取值：TRUE<br />
  该参数目前仅用于 `RunInstances` 接口。
</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeleteWithInstance 数据盘是否随子机销毁。取值范围：
<li>TRUE：子机销毁时，销毁数据盘，只支持按小时后付费云盘</li>
<li>
  FALSE：子机销毁时，保留数据盘<br />
  默认取值：TRUE<br />
  该参数目前仅用于 `RunInstances` 接口。
</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeleteWithInstance(Boolean DeleteWithInstance) {
        this.DeleteWithInstance = DeleteWithInstance;
    }

    /**
     * Get 数据盘快照ID。选择的数据盘快照大小需小于数据盘大小。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotId 数据盘快照ID。选择的数据盘快照大小需小于数据盘大小。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set 数据盘快照ID。选择的数据盘快照大小需小于数据盘大小。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotId 数据盘快照ID。选择的数据盘快照大小需小于数据盘大小。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get 数据盘是加密。取值范围：
<li>true：加密</li>
<li>
  false：不加密<br />
  默认取值：false<br />
  该参数目前仅用于 `RunInstances` 接口。
</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Encrypt 数据盘是加密。取值范围：
<li>true：加密</li>
<li>
  false：不加密<br />
  默认取值：false<br />
  该参数目前仅用于 `RunInstances` 接口。
</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set 数据盘是加密。取值范围：
<li>true：加密</li>
<li>
  false：不加密<br />
  默认取值：false<br />
  该参数目前仅用于 `RunInstances` 接口。
</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Encrypt 数据盘是加密。取值范围：
<li>true：加密</li>
<li>
  false：不加密<br />
  默认取值：false<br />
  该参数目前仅用于 `RunInstances` 接口。
</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncrypt(Boolean Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get 自定义CMK对应的ID，取值为UUID或者类似kms-abcd1234。用于加密云盘。

该参数目前仅用于 `CreateWorkspaces` 接口。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KmsKeyId 自定义CMK对应的ID，取值为UUID或者类似kms-abcd1234。用于加密云盘。

该参数目前仅用于 `CreateWorkspaces` 接口。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKmsKeyId() {
        return this.KmsKeyId;
    }

    /**
     * Set 自定义CMK对应的ID，取值为UUID或者类似kms-abcd1234。用于加密云盘。

该参数目前仅用于 `CreateWorkspaces` 接口。
注意：此字段可能返回 null，表示取不到有效值。
     * @param KmsKeyId 自定义CMK对应的ID，取值为UUID或者类似kms-abcd1234。用于加密云盘。

该参数目前仅用于 `CreateWorkspaces` 接口。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKmsKeyId(String KmsKeyId) {
        this.KmsKeyId = KmsKeyId;
    }

    /**
     * Get 云硬盘性能，单位：MB/s
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThroughputPerformance 云硬盘性能，单位：MB/s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getThroughputPerformance() {
        return this.ThroughputPerformance;
    }

    /**
     * Set 云硬盘性能，单位：MB/s
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThroughputPerformance 云硬盘性能，单位：MB/s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThroughputPerformance(Long ThroughputPerformance) {
        this.ThroughputPerformance = ThroughputPerformance;
    }

    /**
     * Get 突发性能

注：内测中。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BurstPerformance 突发性能

注：内测中。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getBurstPerformance() {
        return this.BurstPerformance;
    }

    /**
     * Set 突发性能

注：内测中。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BurstPerformance 突发性能

注：内测中。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBurstPerformance(Boolean BurstPerformance) {
        this.BurstPerformance = BurstPerformance;
    }

    public SpaceDataDisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpaceDataDisk(SpaceDataDisk source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DeleteWithInstance != null) {
            this.DeleteWithInstance = new Boolean(source.DeleteWithInstance);
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.Encrypt != null) {
            this.Encrypt = new Boolean(source.Encrypt);
        }
        if (source.KmsKeyId != null) {
            this.KmsKeyId = new String(source.KmsKeyId);
        }
        if (source.ThroughputPerformance != null) {
            this.ThroughputPerformance = new Long(source.ThroughputPerformance);
        }
        if (source.BurstPerformance != null) {
            this.BurstPerformance = new Boolean(source.BurstPerformance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DeleteWithInstance", this.DeleteWithInstance);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamSimple(map, prefix + "KmsKeyId", this.KmsKeyId);
        this.setParamSimple(map, prefix + "ThroughputPerformance", this.ThroughputPerformance);
        this.setParamSimple(map, prefix + "BurstPerformance", this.BurstPerformance);

    }
}

