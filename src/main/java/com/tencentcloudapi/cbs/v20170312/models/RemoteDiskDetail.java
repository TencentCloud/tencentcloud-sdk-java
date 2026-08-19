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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoteDiskDetail extends AbstractModel {

    /**
    * <p>单副本SSD硬盘的创建时间。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>单副本SSD硬盘到期时间。按小时后付费单副本SSD硬盘可能为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * <p>单副本SSD硬盘计费类型。</p><p>枚举值：</p><ul><li>PREPAID： 预付费</li><li>POSTPAID_BY_HOUR： 按小时后付费</li></ul>
    */
    @SerializedName("DiskChargeType")
    @Expose
    private String DiskChargeType;

    /**
    * <p>单副本SSD硬盘大小，单位为 GiB。</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>单副本SSD硬盘挂载的云服务器实例ID。未挂载时为空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>单副本SSD硬盘所在的位置。</p>
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * <p>单副本SSD硬盘ID。</p>
    */
    @SerializedName("RemoteDiskId")
    @Expose
    private String RemoteDiskId;

    /**
    * <p>单副本SSD硬盘名称。</p>
    */
    @SerializedName("RemoteDiskName")
    @Expose
    private String RemoteDiskName;

    /**
    * <p>单副本SSD硬盘状态。</p><p>枚举值：</p><ul><li>UNATTACHED： 未挂载</li><li>ATTACHED： 已挂载</li><li>TORECYCLE： 待回收</li></ul>
    */
    @SerializedName("RemoteDiskState")
    @Expose
    private String RemoteDiskState;

    /**
    * <p>单副本SSD硬盘类型。</p><p>枚举值：</p><ul><li>REMOTE_SSD： 单副本SSD硬盘</li><li>ELASTIC_REMOTE_SSD： 弹性单副本SSD硬盘</li></ul>
    */
    @SerializedName("RemoteDiskType")
    @Expose
    private String RemoteDiskType;

    /**
    * <p>自动续费标识。</p><p>枚举值：</p><ul><li>NOTIFY_AND_AUTO_RENEW： 通知过期且自动续费</li><li>NOTIFY_AND_MANUAL_RENEW： 通知过期不自动续费</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW： 不通知过期不自动续费</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
     * Get <p>单副本SSD硬盘的创建时间。</p> 
     * @return CreateTime <p>单副本SSD硬盘的创建时间。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>单副本SSD硬盘的创建时间。</p>
     * @param CreateTime <p>单副本SSD硬盘的创建时间。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>单副本SSD硬盘到期时间。按小时后付费单副本SSD硬盘可能为空。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeadlineTime <p>单副本SSD硬盘到期时间。按小时后付费单副本SSD硬盘可能为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set <p>单副本SSD硬盘到期时间。按小时后付费单副本SSD硬盘可能为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeadlineTime <p>单副本SSD硬盘到期时间。按小时后付费单副本SSD硬盘可能为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get <p>单副本SSD硬盘计费类型。</p><p>枚举值：</p><ul><li>PREPAID： 预付费</li><li>POSTPAID_BY_HOUR： 按小时后付费</li></ul> 
     * @return DiskChargeType <p>单副本SSD硬盘计费类型。</p><p>枚举值：</p><ul><li>PREPAID： 预付费</li><li>POSTPAID_BY_HOUR： 按小时后付费</li></ul>
     */
    public String getDiskChargeType() {
        return this.DiskChargeType;
    }

    /**
     * Set <p>单副本SSD硬盘计费类型。</p><p>枚举值：</p><ul><li>PREPAID： 预付费</li><li>POSTPAID_BY_HOUR： 按小时后付费</li></ul>
     * @param DiskChargeType <p>单副本SSD硬盘计费类型。</p><p>枚举值：</p><ul><li>PREPAID： 预付费</li><li>POSTPAID_BY_HOUR： 按小时后付费</li></ul>
     */
    public void setDiskChargeType(String DiskChargeType) {
        this.DiskChargeType = DiskChargeType;
    }

    /**
     * Get <p>单副本SSD硬盘大小，单位为 GiB。</p> 
     * @return DiskSize <p>单副本SSD硬盘大小，单位为 GiB。</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>单副本SSD硬盘大小，单位为 GiB。</p>
     * @param DiskSize <p>单副本SSD硬盘大小，单位为 GiB。</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>单副本SSD硬盘挂载的云服务器实例ID。未挂载时为空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId <p>单副本SSD硬盘挂载的云服务器实例ID。未挂载时为空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>单副本SSD硬盘挂载的云服务器实例ID。未挂载时为空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId <p>单副本SSD硬盘挂载的云服务器实例ID。未挂载时为空字符串。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>单副本SSD硬盘所在的位置。</p> 
     * @return Placement <p>单副本SSD硬盘所在的位置。</p>
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set <p>单副本SSD硬盘所在的位置。</p>
     * @param Placement <p>单副本SSD硬盘所在的位置。</p>
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get <p>单副本SSD硬盘ID。</p> 
     * @return RemoteDiskId <p>单副本SSD硬盘ID。</p>
     */
    public String getRemoteDiskId() {
        return this.RemoteDiskId;
    }

    /**
     * Set <p>单副本SSD硬盘ID。</p>
     * @param RemoteDiskId <p>单副本SSD硬盘ID。</p>
     */
    public void setRemoteDiskId(String RemoteDiskId) {
        this.RemoteDiskId = RemoteDiskId;
    }

    /**
     * Get <p>单副本SSD硬盘名称。</p> 
     * @return RemoteDiskName <p>单副本SSD硬盘名称。</p>
     */
    public String getRemoteDiskName() {
        return this.RemoteDiskName;
    }

    /**
     * Set <p>单副本SSD硬盘名称。</p>
     * @param RemoteDiskName <p>单副本SSD硬盘名称。</p>
     */
    public void setRemoteDiskName(String RemoteDiskName) {
        this.RemoteDiskName = RemoteDiskName;
    }

    /**
     * Get <p>单副本SSD硬盘状态。</p><p>枚举值：</p><ul><li>UNATTACHED： 未挂载</li><li>ATTACHED： 已挂载</li><li>TORECYCLE： 待回收</li></ul> 
     * @return RemoteDiskState <p>单副本SSD硬盘状态。</p><p>枚举值：</p><ul><li>UNATTACHED： 未挂载</li><li>ATTACHED： 已挂载</li><li>TORECYCLE： 待回收</li></ul>
     */
    public String getRemoteDiskState() {
        return this.RemoteDiskState;
    }

    /**
     * Set <p>单副本SSD硬盘状态。</p><p>枚举值：</p><ul><li>UNATTACHED： 未挂载</li><li>ATTACHED： 已挂载</li><li>TORECYCLE： 待回收</li></ul>
     * @param RemoteDiskState <p>单副本SSD硬盘状态。</p><p>枚举值：</p><ul><li>UNATTACHED： 未挂载</li><li>ATTACHED： 已挂载</li><li>TORECYCLE： 待回收</li></ul>
     */
    public void setRemoteDiskState(String RemoteDiskState) {
        this.RemoteDiskState = RemoteDiskState;
    }

    /**
     * Get <p>单副本SSD硬盘类型。</p><p>枚举值：</p><ul><li>REMOTE_SSD： 单副本SSD硬盘</li><li>ELASTIC_REMOTE_SSD： 弹性单副本SSD硬盘</li></ul> 
     * @return RemoteDiskType <p>单副本SSD硬盘类型。</p><p>枚举值：</p><ul><li>REMOTE_SSD： 单副本SSD硬盘</li><li>ELASTIC_REMOTE_SSD： 弹性单副本SSD硬盘</li></ul>
     */
    public String getRemoteDiskType() {
        return this.RemoteDiskType;
    }

    /**
     * Set <p>单副本SSD硬盘类型。</p><p>枚举值：</p><ul><li>REMOTE_SSD： 单副本SSD硬盘</li><li>ELASTIC_REMOTE_SSD： 弹性单副本SSD硬盘</li></ul>
     * @param RemoteDiskType <p>单副本SSD硬盘类型。</p><p>枚举值：</p><ul><li>REMOTE_SSD： 单副本SSD硬盘</li><li>ELASTIC_REMOTE_SSD： 弹性单副本SSD硬盘</li></ul>
     */
    public void setRemoteDiskType(String RemoteDiskType) {
        this.RemoteDiskType = RemoteDiskType;
    }

    /**
     * Get <p>自动续费标识。</p><p>枚举值：</p><ul><li>NOTIFY_AND_AUTO_RENEW： 通知过期且自动续费</li><li>NOTIFY_AND_MANUAL_RENEW： 通知过期不自动续费</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW： 不通知过期不自动续费</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewFlag <p>自动续费标识。</p><p>枚举值：</p><ul><li>NOTIFY_AND_AUTO_RENEW： 通知过期且自动续费</li><li>NOTIFY_AND_MANUAL_RENEW： 通知过期不自动续费</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW： 不通知过期不自动续费</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>自动续费标识。</p><p>枚举值：</p><ul><li>NOTIFY_AND_AUTO_RENEW： 通知过期且自动续费</li><li>NOTIFY_AND_MANUAL_RENEW： 通知过期不自动续费</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW： 不通知过期不自动续费</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewFlag <p>自动续费标识。</p><p>枚举值：</p><ul><li>NOTIFY_AND_AUTO_RENEW： 通知过期且自动续费</li><li>NOTIFY_AND_MANUAL_RENEW： 通知过期不自动续费</li><li>DISABLE_NOTIFY_AND_MANUAL_RENEW： 不通知过期不自动续费</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    public RemoteDiskDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoteDiskDetail(RemoteDiskDetail source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DeadlineTime != null) {
            this.DeadlineTime = new String(source.DeadlineTime);
        }
        if (source.DiskChargeType != null) {
            this.DiskChargeType = new String(source.DiskChargeType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.RemoteDiskId != null) {
            this.RemoteDiskId = new String(source.RemoteDiskId);
        }
        if (source.RemoteDiskName != null) {
            this.RemoteDiskName = new String(source.RemoteDiskName);
        }
        if (source.RemoteDiskState != null) {
            this.RemoteDiskState = new String(source.RemoteDiskState);
        }
        if (source.RemoteDiskType != null) {
            this.RemoteDiskType = new String(source.RemoteDiskType);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "DiskChargeType", this.DiskChargeType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "RemoteDiskId", this.RemoteDiskId);
        this.setParamSimple(map, prefix + "RemoteDiskName", this.RemoteDiskName);
        this.setParamSimple(map, prefix + "RemoteDiskState", this.RemoteDiskState);
        this.setParamSimple(map, prefix + "RemoteDiskType", this.RemoteDiskType);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

