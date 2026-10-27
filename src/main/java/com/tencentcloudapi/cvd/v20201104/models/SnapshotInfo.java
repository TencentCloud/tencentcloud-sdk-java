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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotInfo extends AbstractModel {

    /**
    * <p>快照唯一ID</p>
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * <p>快照对应的云硬盘ID</p>
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * <p>快照状态，取值如下：<br>NORMAL：正常<br>CREATING：创建中<br>ROLLBACKING：回滚中<br>COPYING_FROM_REMOTE：跨地域复制中<br>CHECKING_COPIED：复制校验中<br>TORECYCLE：待回收。</p>
    */
    @SerializedName("SnapshotState")
    @Expose
    private String SnapshotState;

    /**
    * <p>创建此快照的云硬盘类型。取值范围：<br>SYSTEM_DISK：系统盘<br>DATA_DISK：数据盘。</p>
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * <p>快照创建的时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>快照到期时间。如果快照为永久保留，此字段为空。</p>
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * <p>快照创建进度百分比，快照创建成功后此字段恒为100。</p>
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
    * <p>是否为永久快照。取值范围：<br>true：永久快照<br>false：非永久快照。</p>
    */
    @SerializedName("IsPermanent")
    @Expose
    private Boolean IsPermanent;

    /**
    * <p>快照创建方式，取值:<br>ManualSnapshot：手动创建<br>AutoSnapshot：快照策略自动创建</p>
    */
    @SerializedName("CreateType")
    @Expose
    private String CreateType;

    /**
    * <p>上一次快照回滚完成时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastRollbackTime")
    @Expose
    private String LastRollbackTime;

    /**
    * <p>上一次快照回滚状态，取值：<br>成功：SUCCESS<br>失败：FAILED</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastRollbackState")
    @Expose
    private String LastRollbackState;

    /**
     * Get <p>快照唯一ID</p> 
     * @return SnapshotId <p>快照唯一ID</p>
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set <p>快照唯一ID</p>
     * @param SnapshotId <p>快照唯一ID</p>
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get <p>快照对应的云硬盘ID</p> 
     * @return DiskId <p>快照对应的云硬盘ID</p>
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set <p>快照对应的云硬盘ID</p>
     * @param DiskId <p>快照对应的云硬盘ID</p>
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get <p>快照状态，取值如下：<br>NORMAL：正常<br>CREATING：创建中<br>ROLLBACKING：回滚中<br>COPYING_FROM_REMOTE：跨地域复制中<br>CHECKING_COPIED：复制校验中<br>TORECYCLE：待回收。</p> 
     * @return SnapshotState <p>快照状态，取值如下：<br>NORMAL：正常<br>CREATING：创建中<br>ROLLBACKING：回滚中<br>COPYING_FROM_REMOTE：跨地域复制中<br>CHECKING_COPIED：复制校验中<br>TORECYCLE：待回收。</p>
     */
    public String getSnapshotState() {
        return this.SnapshotState;
    }

    /**
     * Set <p>快照状态，取值如下：<br>NORMAL：正常<br>CREATING：创建中<br>ROLLBACKING：回滚中<br>COPYING_FROM_REMOTE：跨地域复制中<br>CHECKING_COPIED：复制校验中<br>TORECYCLE：待回收。</p>
     * @param SnapshotState <p>快照状态，取值如下：<br>NORMAL：正常<br>CREATING：创建中<br>ROLLBACKING：回滚中<br>COPYING_FROM_REMOTE：跨地域复制中<br>CHECKING_COPIED：复制校验中<br>TORECYCLE：待回收。</p>
     */
    public void setSnapshotState(String SnapshotState) {
        this.SnapshotState = SnapshotState;
    }

    /**
     * Get <p>创建此快照的云硬盘类型。取值范围：<br>SYSTEM_DISK：系统盘<br>DATA_DISK：数据盘。</p> 
     * @return DiskUsage <p>创建此快照的云硬盘类型。取值范围：<br>SYSTEM_DISK：系统盘<br>DATA_DISK：数据盘。</p>
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set <p>创建此快照的云硬盘类型。取值范围：<br>SYSTEM_DISK：系统盘<br>DATA_DISK：数据盘。</p>
     * @param DiskUsage <p>创建此快照的云硬盘类型。取值范围：<br>SYSTEM_DISK：系统盘<br>DATA_DISK：数据盘。</p>
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get <p>快照创建的时间</p> 
     * @return CreateTime <p>快照创建的时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>快照创建的时间</p>
     * @param CreateTime <p>快照创建的时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>快照到期时间。如果快照为永久保留，此字段为空。</p> 
     * @return DeadlineTime <p>快照到期时间。如果快照为永久保留，此字段为空。</p>
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set <p>快照到期时间。如果快照为永久保留，此字段为空。</p>
     * @param DeadlineTime <p>快照到期时间。如果快照为永久保留，此字段为空。</p>
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get <p>快照创建进度百分比，快照创建成功后此字段恒为100。</p> 
     * @return Percent <p>快照创建进度百分比，快照创建成功后此字段恒为100。</p>
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set <p>快照创建进度百分比，快照创建成功后此字段恒为100。</p>
     * @param Percent <p>快照创建进度百分比，快照创建成功后此字段恒为100。</p>
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    /**
     * Get <p>是否为永久快照。取值范围：<br>true：永久快照<br>false：非永久快照。</p> 
     * @return IsPermanent <p>是否为永久快照。取值范围：<br>true：永久快照<br>false：非永久快照。</p>
     */
    public Boolean getIsPermanent() {
        return this.IsPermanent;
    }

    /**
     * Set <p>是否为永久快照。取值范围：<br>true：永久快照<br>false：非永久快照。</p>
     * @param IsPermanent <p>是否为永久快照。取值范围：<br>true：永久快照<br>false：非永久快照。</p>
     */
    public void setIsPermanent(Boolean IsPermanent) {
        this.IsPermanent = IsPermanent;
    }

    /**
     * Get <p>快照创建方式，取值:<br>ManualSnapshot：手动创建<br>AutoSnapshot：快照策略自动创建</p> 
     * @return CreateType <p>快照创建方式，取值:<br>ManualSnapshot：手动创建<br>AutoSnapshot：快照策略自动创建</p>
     */
    public String getCreateType() {
        return this.CreateType;
    }

    /**
     * Set <p>快照创建方式，取值:<br>ManualSnapshot：手动创建<br>AutoSnapshot：快照策略自动创建</p>
     * @param CreateType <p>快照创建方式，取值:<br>ManualSnapshot：手动创建<br>AutoSnapshot：快照策略自动创建</p>
     */
    public void setCreateType(String CreateType) {
        this.CreateType = CreateType;
    }

    /**
     * Get <p>上一次快照回滚完成时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastRollbackTime <p>上一次快照回滚完成时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastRollbackTime() {
        return this.LastRollbackTime;
    }

    /**
     * Set <p>上一次快照回滚完成时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastRollbackTime <p>上一次快照回滚完成时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastRollbackTime(String LastRollbackTime) {
        this.LastRollbackTime = LastRollbackTime;
    }

    /**
     * Get <p>上一次快照回滚状态，取值：<br>成功：SUCCESS<br>失败：FAILED</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastRollbackState <p>上一次快照回滚状态，取值：<br>成功：SUCCESS<br>失败：FAILED</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastRollbackState() {
        return this.LastRollbackState;
    }

    /**
     * Set <p>上一次快照回滚状态，取值：<br>成功：SUCCESS<br>失败：FAILED</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastRollbackState <p>上一次快照回滚状态，取值：<br>成功：SUCCESS<br>失败：FAILED</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastRollbackState(String LastRollbackState) {
        this.LastRollbackState = LastRollbackState;
    }

    public SnapshotInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotInfo(SnapshotInfo source) {
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.SnapshotState != null) {
            this.SnapshotState = new String(source.SnapshotState);
        }
        if (source.DiskUsage != null) {
            this.DiskUsage = new String(source.DiskUsage);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DeadlineTime != null) {
            this.DeadlineTime = new String(source.DeadlineTime);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
        if (source.IsPermanent != null) {
            this.IsPermanent = new Boolean(source.IsPermanent);
        }
        if (source.CreateType != null) {
            this.CreateType = new String(source.CreateType);
        }
        if (source.LastRollbackTime != null) {
            this.LastRollbackTime = new String(source.LastRollbackTime);
        }
        if (source.LastRollbackState != null) {
            this.LastRollbackState = new String(source.LastRollbackState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "SnapshotState", this.SnapshotState);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "IsPermanent", this.IsPermanent);
        this.setParamSimple(map, prefix + "CreateType", this.CreateType);
        this.setParamSimple(map, prefix + "LastRollbackTime", this.LastRollbackTime);
        this.setParamSimple(map, prefix + "LastRollbackState", this.LastRollbackState);

    }
}

