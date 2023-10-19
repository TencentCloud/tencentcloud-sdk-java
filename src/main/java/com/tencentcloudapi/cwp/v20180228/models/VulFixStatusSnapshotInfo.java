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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulFixStatusSnapshotInfo extends AbstractModel {

    /**
    * cvm id
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 主机名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 主机ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 快照名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * 快照创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 快照id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * 记录唯一id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 快照状态 0-初始状态1-快照创建成功；2-快照创建失败；
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 快照创建失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
     * Get cvm id 
     * @return Quuid cvm id
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set cvm id
     * @param Quuid cvm id
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 主机名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostName 主机名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 主机名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostName 主机名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 主机ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostIp 主机ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 主机ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostIp 主机ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 快照名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotName 快照名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set 快照名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotName 快照名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get 快照创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 快照创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 快照创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 快照创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 快照id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotId 快照id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set 快照id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotId 快照id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get 记录唯一id 
     * @return Id 记录唯一id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 记录唯一id
     * @param Id 记录唯一id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 快照状态 0-初始状态1-快照创建成功；2-快照创建失败； 
     * @return Status 快照状态 0-初始状态1-快照创建成功；2-快照创建失败；
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 快照状态 0-初始状态1-快照创建成功；2-快照创建失败；
     * @param Status 快照状态 0-初始状态1-快照创建成功；2-快照创建失败；
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 快照创建失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailReason 快照创建失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set 快照创建失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailReason 快照创建失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    public VulFixStatusSnapshotInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulFixStatusSnapshotInfo(VulFixStatusSnapshotInfo source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);

    }
}

