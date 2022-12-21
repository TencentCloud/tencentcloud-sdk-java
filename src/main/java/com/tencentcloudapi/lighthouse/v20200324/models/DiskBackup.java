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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskBackup extends AbstractModel{

    /**
    * 云硬盘备份点ID。
    */
    @SerializedName("DiskBackupId")
    @Expose
    private String DiskBackupId;

    /**
    * 创建此云硬盘备份点的云硬盘类型。取值：<li>DATA_DISK：数据盘</li>
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * 创建此云硬盘备份点的云硬盘 ID。
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * 创建此云硬盘备份点的云硬盘大小，单位 GB。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 云硬盘备份点名称，用户自定义的云硬盘备份点别名。
    */
    @SerializedName("DiskBackupName")
    @Expose
    private String DiskBackupName;

    /**
    * 云硬盘备份点的状态。取值范围：
<li>NORMAL：正常。 </li>
<li>CREATING：创建中。</li>
<li>ROLLBACKING：回滚中。</li>
<li>DELETING：删除中。</li>
    */
    @SerializedName("DiskBackupState")
    @Expose
    private String DiskBackupState;

    /**
    * 创建或回滚云硬盘备份点进度百分比，成功后此字段取值为 100。
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * 上一次操作
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestOperation")
    @Expose
    private String LatestOperation;

    /**
    * 上一次操作状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestOperationState")
    @Expose
    private String LatestOperationState;

    /**
    * 上一次请求ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestOperationRequestId")
    @Expose
    private String LatestOperationRequestId;

    /**
    * 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get 云硬盘备份点ID。 
     * @return DiskBackupId 云硬盘备份点ID。
     */
    public String getDiskBackupId() {
        return this.DiskBackupId;
    }

    /**
     * Set 云硬盘备份点ID。
     * @param DiskBackupId 云硬盘备份点ID。
     */
    public void setDiskBackupId(String DiskBackupId) {
        this.DiskBackupId = DiskBackupId;
    }

    /**
     * Get 创建此云硬盘备份点的云硬盘类型。取值：<li>DATA_DISK：数据盘</li> 
     * @return DiskUsage 创建此云硬盘备份点的云硬盘类型。取值：<li>DATA_DISK：数据盘</li>
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set 创建此云硬盘备份点的云硬盘类型。取值：<li>DATA_DISK：数据盘</li>
     * @param DiskUsage 创建此云硬盘备份点的云硬盘类型。取值：<li>DATA_DISK：数据盘</li>
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get 创建此云硬盘备份点的云硬盘 ID。 
     * @return DiskId 创建此云硬盘备份点的云硬盘 ID。
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set 创建此云硬盘备份点的云硬盘 ID。
     * @param DiskId 创建此云硬盘备份点的云硬盘 ID。
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get 创建此云硬盘备份点的云硬盘大小，单位 GB。 
     * @return DiskSize 创建此云硬盘备份点的云硬盘大小，单位 GB。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 创建此云硬盘备份点的云硬盘大小，单位 GB。
     * @param DiskSize 创建此云硬盘备份点的云硬盘大小，单位 GB。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 云硬盘备份点名称，用户自定义的云硬盘备份点别名。 
     * @return DiskBackupName 云硬盘备份点名称，用户自定义的云硬盘备份点别名。
     */
    public String getDiskBackupName() {
        return this.DiskBackupName;
    }

    /**
     * Set 云硬盘备份点名称，用户自定义的云硬盘备份点别名。
     * @param DiskBackupName 云硬盘备份点名称，用户自定义的云硬盘备份点别名。
     */
    public void setDiskBackupName(String DiskBackupName) {
        this.DiskBackupName = DiskBackupName;
    }

    /**
     * Get 云硬盘备份点的状态。取值范围：
<li>NORMAL：正常。 </li>
<li>CREATING：创建中。</li>
<li>ROLLBACKING：回滚中。</li>
<li>DELETING：删除中。</li> 
     * @return DiskBackupState 云硬盘备份点的状态。取值范围：
<li>NORMAL：正常。 </li>
<li>CREATING：创建中。</li>
<li>ROLLBACKING：回滚中。</li>
<li>DELETING：删除中。</li>
     */
    public String getDiskBackupState() {
        return this.DiskBackupState;
    }

    /**
     * Set 云硬盘备份点的状态。取值范围：
<li>NORMAL：正常。 </li>
<li>CREATING：创建中。</li>
<li>ROLLBACKING：回滚中。</li>
<li>DELETING：删除中。</li>
     * @param DiskBackupState 云硬盘备份点的状态。取值范围：
<li>NORMAL：正常。 </li>
<li>CREATING：创建中。</li>
<li>ROLLBACKING：回滚中。</li>
<li>DELETING：删除中。</li>
     */
    public void setDiskBackupState(String DiskBackupState) {
        this.DiskBackupState = DiskBackupState;
    }

    /**
     * Get 创建或回滚云硬盘备份点进度百分比，成功后此字段取值为 100。 
     * @return Percent 创建或回滚云硬盘备份点进度百分比，成功后此字段取值为 100。
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set 创建或回滚云硬盘备份点进度百分比，成功后此字段取值为 100。
     * @param Percent 创建或回滚云硬盘备份点进度百分比，成功后此字段取值为 100。
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get 上一次操作
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestOperation 上一次操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestOperation() {
        return this.LatestOperation;
    }

    /**
     * Set 上一次操作
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestOperation 上一次操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestOperation(String LatestOperation) {
        this.LatestOperation = LatestOperation;
    }

    /**
     * Get 上一次操作状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestOperationState 上一次操作状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestOperationState() {
        return this.LatestOperationState;
    }

    /**
     * Set 上一次操作状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestOperationState 上一次操作状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestOperationState(String LatestOperationState) {
        this.LatestOperationState = LatestOperationState;
    }

    /**
     * Get 上一次请求ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestOperationRequestId 上一次请求ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestOperationRequestId() {
        return this.LatestOperationRequestId;
    }

    /**
     * Set 上一次请求ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestOperationRequestId 上一次请求ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestOperationRequestId(String LatestOperationRequestId) {
        this.LatestOperationRequestId = LatestOperationRequestId;
    }

    /**
     * Get 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。 
     * @return CreatedTime 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
     * @param CreatedTime 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
格式为： YYYY-MM-DDThh:mm:ssZ。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public DiskBackup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskBackup(DiskBackup source) {
        if (source.DiskBackupId != null) {
            this.DiskBackupId = new String(source.DiskBackupId);
        }
        if (source.DiskUsage != null) {
            this.DiskUsage = new String(source.DiskUsage);
        }
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskBackupName != null) {
            this.DiskBackupName = new String(source.DiskBackupName);
        }
        if (source.DiskBackupState != null) {
            this.DiskBackupState = new String(source.DiskBackupState);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.LatestOperation != null) {
            this.LatestOperation = new String(source.LatestOperation);
        }
        if (source.LatestOperationState != null) {
            this.LatestOperationState = new String(source.LatestOperationState);
        }
        if (source.LatestOperationRequestId != null) {
            this.LatestOperationRequestId = new String(source.LatestOperationRequestId);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskBackupId", this.DiskBackupId);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskBackupName", this.DiskBackupName);
        this.setParamSimple(map, prefix + "DiskBackupState", this.DiskBackupState);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "LatestOperation", this.LatestOperation);
        this.setParamSimple(map, prefix + "LatestOperationState", this.LatestOperationState);
        this.setParamSimple(map, prefix + "LatestOperationRequestId", this.LatestOperationRequestId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

