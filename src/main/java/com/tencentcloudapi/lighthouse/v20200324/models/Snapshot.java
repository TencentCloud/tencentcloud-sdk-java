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

public class Snapshot extends AbstractModel{

    /**
    * 快照 ID。
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * 创建此快照的磁盘类型。取值：<li>SYSTEM_DISK：系统盘</li>
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * 创建此快照的磁盘 ID。
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * 创建此快照的磁盘大小，单位 GB。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 快照名称，用户自定义的快照别名。
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * 快照的状态。取值范围：
<li>NORMAL：正常 </li>
<li>CREATING：创建中</li>
<li>ROLLBACKING：回滚中。</li>
    */
    @SerializedName("SnapshotState")
    @Expose
    private String SnapshotState;

    /**
    * 创建或回滚快照进度百分比，成功后此字段取值为 100。
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * 快照的最新操作，只有创建、回滚快照时记录。
取值如 CreateInstanceSnapshot，RollbackInstanceSnapshot。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestOperation")
    @Expose
    private String LatestOperation;

    /**
    * 快照的最新操作状态，只有创建、回滚快照时记录。
取值范围：
<li>SUCCESS：表示操作成功</li>
<li>OPERATING：表示操作执行中</li>
<li>FAILED：表示操作失败</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestOperationState")
    @Expose
    private String LatestOperationState;

    /**
    * 快照最新操作的唯一请求 ID，只有创建、回滚快照时记录。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestOperationRequestId")
    @Expose
    private String LatestOperationRequestId;

    /**
    * 快照的创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get 快照 ID。 
     * @return SnapshotId 快照 ID。
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set 快照 ID。
     * @param SnapshotId 快照 ID。
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get 创建此快照的磁盘类型。取值：<li>SYSTEM_DISK：系统盘</li> 
     * @return DiskUsage 创建此快照的磁盘类型。取值：<li>SYSTEM_DISK：系统盘</li>
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set 创建此快照的磁盘类型。取值：<li>SYSTEM_DISK：系统盘</li>
     * @param DiskUsage 创建此快照的磁盘类型。取值：<li>SYSTEM_DISK：系统盘</li>
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get 创建此快照的磁盘 ID。 
     * @return DiskId 创建此快照的磁盘 ID。
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set 创建此快照的磁盘 ID。
     * @param DiskId 创建此快照的磁盘 ID。
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get 创建此快照的磁盘大小，单位 GB。 
     * @return DiskSize 创建此快照的磁盘大小，单位 GB。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 创建此快照的磁盘大小，单位 GB。
     * @param DiskSize 创建此快照的磁盘大小，单位 GB。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 快照名称，用户自定义的快照别名。 
     * @return SnapshotName 快照名称，用户自定义的快照别名。
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set 快照名称，用户自定义的快照别名。
     * @param SnapshotName 快照名称，用户自定义的快照别名。
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get 快照的状态。取值范围：
<li>NORMAL：正常 </li>
<li>CREATING：创建中</li>
<li>ROLLBACKING：回滚中。</li> 
     * @return SnapshotState 快照的状态。取值范围：
<li>NORMAL：正常 </li>
<li>CREATING：创建中</li>
<li>ROLLBACKING：回滚中。</li>
     */
    public String getSnapshotState() {
        return this.SnapshotState;
    }

    /**
     * Set 快照的状态。取值范围：
<li>NORMAL：正常 </li>
<li>CREATING：创建中</li>
<li>ROLLBACKING：回滚中。</li>
     * @param SnapshotState 快照的状态。取值范围：
<li>NORMAL：正常 </li>
<li>CREATING：创建中</li>
<li>ROLLBACKING：回滚中。</li>
     */
    public void setSnapshotState(String SnapshotState) {
        this.SnapshotState = SnapshotState;
    }

    /**
     * Get 创建或回滚快照进度百分比，成功后此字段取值为 100。 
     * @return Percent 创建或回滚快照进度百分比，成功后此字段取值为 100。
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set 创建或回滚快照进度百分比，成功后此字段取值为 100。
     * @param Percent 创建或回滚快照进度百分比，成功后此字段取值为 100。
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get 快照的最新操作，只有创建、回滚快照时记录。
取值如 CreateInstanceSnapshot，RollbackInstanceSnapshot。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestOperation 快照的最新操作，只有创建、回滚快照时记录。
取值如 CreateInstanceSnapshot，RollbackInstanceSnapshot。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestOperation() {
        return this.LatestOperation;
    }

    /**
     * Set 快照的最新操作，只有创建、回滚快照时记录。
取值如 CreateInstanceSnapshot，RollbackInstanceSnapshot。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestOperation 快照的最新操作，只有创建、回滚快照时记录。
取值如 CreateInstanceSnapshot，RollbackInstanceSnapshot。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestOperation(String LatestOperation) {
        this.LatestOperation = LatestOperation;
    }

    /**
     * Get 快照的最新操作状态，只有创建、回滚快照时记录。
取值范围：
<li>SUCCESS：表示操作成功</li>
<li>OPERATING：表示操作执行中</li>
<li>FAILED：表示操作失败</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestOperationState 快照的最新操作状态，只有创建、回滚快照时记录。
取值范围：
<li>SUCCESS：表示操作成功</li>
<li>OPERATING：表示操作执行中</li>
<li>FAILED：表示操作失败</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestOperationState() {
        return this.LatestOperationState;
    }

    /**
     * Set 快照的最新操作状态，只有创建、回滚快照时记录。
取值范围：
<li>SUCCESS：表示操作成功</li>
<li>OPERATING：表示操作执行中</li>
<li>FAILED：表示操作失败</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestOperationState 快照的最新操作状态，只有创建、回滚快照时记录。
取值范围：
<li>SUCCESS：表示操作成功</li>
<li>OPERATING：表示操作执行中</li>
<li>FAILED：表示操作失败</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestOperationState(String LatestOperationState) {
        this.LatestOperationState = LatestOperationState;
    }

    /**
     * Get 快照最新操作的唯一请求 ID，只有创建、回滚快照时记录。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestOperationRequestId 快照最新操作的唯一请求 ID，只有创建、回滚快照时记录。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestOperationRequestId() {
        return this.LatestOperationRequestId;
    }

    /**
     * Set 快照最新操作的唯一请求 ID，只有创建、回滚快照时记录。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestOperationRequestId 快照最新操作的唯一请求 ID，只有创建、回滚快照时记录。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestOperationRequestId(String LatestOperationRequestId) {
        this.LatestOperationRequestId = LatestOperationRequestId;
    }

    /**
     * Get 快照的创建时间。 
     * @return CreatedTime 快照的创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 快照的创建时间。
     * @param CreatedTime 快照的创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public Snapshot() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Snapshot(Snapshot source) {
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
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
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.SnapshotState != null) {
            this.SnapshotState = new String(source.SnapshotState);
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
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "SnapshotState", this.SnapshotState);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "LatestOperation", this.LatestOperation);
        this.setParamSimple(map, prefix + "LatestOperationState", this.LatestOperationState);
        this.setParamSimple(map, prefix + "LatestOperationRequestId", this.LatestOperationRequestId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

