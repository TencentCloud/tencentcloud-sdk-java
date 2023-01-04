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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineHostDetect extends AbstractModel{

    /**
    * 主机Id
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * 内网Ip
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 主机名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 外网Ip
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * 0:未通过 1:忽略 3:通过 5:检测中
    */
    @SerializedName("DetectStatus")
    @Expose
    private Long DetectStatus;

    /**
    * 检测通过数
    */
    @SerializedName("PassedItemCount")
    @Expose
    private Long PassedItemCount;

    /**
    * 关联检测项数
    */
    @SerializedName("ItemCount")
    @Expose
    private Long ItemCount;

    /**
    * 检测未通过数
    */
    @SerializedName("NotPassedItemCount")
    @Expose
    private Long NotPassedItemCount;

    /**
    * 首次检测时间
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * 最后检测时间
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * 主机安全UUID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 主机额外信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get 主机Id 
     * @return HostId 主机Id
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set 主机Id
     * @param HostId 主机Id
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    /**
     * Get 内网Ip 
     * @return HostIp 内网Ip
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 内网Ip
     * @param HostIp 内网Ip
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 主机名称 
     * @return HostName 主机名称
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 主机名称
     * @param HostName 主机名称
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 外网Ip 
     * @return WanIp 外网Ip
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set 外网Ip
     * @param WanIp 外网Ip
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get 0:未通过 1:忽略 3:通过 5:检测中 
     * @return DetectStatus 0:未通过 1:忽略 3:通过 5:检测中
     */
    public Long getDetectStatus() {
        return this.DetectStatus;
    }

    /**
     * Set 0:未通过 1:忽略 3:通过 5:检测中
     * @param DetectStatus 0:未通过 1:忽略 3:通过 5:检测中
     */
    public void setDetectStatus(Long DetectStatus) {
        this.DetectStatus = DetectStatus;
    }

    /**
     * Get 检测通过数 
     * @return PassedItemCount 检测通过数
     */
    public Long getPassedItemCount() {
        return this.PassedItemCount;
    }

    /**
     * Set 检测通过数
     * @param PassedItemCount 检测通过数
     */
    public void setPassedItemCount(Long PassedItemCount) {
        this.PassedItemCount = PassedItemCount;
    }

    /**
     * Get 关联检测项数 
     * @return ItemCount 关联检测项数
     */
    public Long getItemCount() {
        return this.ItemCount;
    }

    /**
     * Set 关联检测项数
     * @param ItemCount 关联检测项数
     */
    public void setItemCount(Long ItemCount) {
        this.ItemCount = ItemCount;
    }

    /**
     * Get 检测未通过数 
     * @return NotPassedItemCount 检测未通过数
     */
    public Long getNotPassedItemCount() {
        return this.NotPassedItemCount;
    }

    /**
     * Set 检测未通过数
     * @param NotPassedItemCount 检测未通过数
     */
    public void setNotPassedItemCount(Long NotPassedItemCount) {
        this.NotPassedItemCount = NotPassedItemCount;
    }

    /**
     * Get 首次检测时间 
     * @return FirstTime 首次检测时间
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set 首次检测时间
     * @param FirstTime 首次检测时间
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get 最后检测时间 
     * @return LastTime 最后检测时间
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set 最后检测时间
     * @param LastTime 最后检测时间
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get 主机安全UUID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uuid 主机安全UUID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机安全UUID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uuid 主机安全UUID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 主机额外信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachineExtraInfo 主机额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set 主机额外信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachineExtraInfo 主机额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    public BaselineHostDetect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineHostDetect(BaselineHostDetect source) {
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.WanIp != null) {
            this.WanIp = new String(source.WanIp);
        }
        if (source.DetectStatus != null) {
            this.DetectStatus = new Long(source.DetectStatus);
        }
        if (source.PassedItemCount != null) {
            this.PassedItemCount = new Long(source.PassedItemCount);
        }
        if (source.ItemCount != null) {
            this.ItemCount = new Long(source.ItemCount);
        }
        if (source.NotPassedItemCount != null) {
            this.NotPassedItemCount = new Long(source.NotPassedItemCount);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamSimple(map, prefix + "DetectStatus", this.DetectStatus);
        this.setParamSimple(map, prefix + "PassedItemCount", this.PassedItemCount);
        this.setParamSimple(map, prefix + "ItemCount", this.ItemCount);
        this.setParamSimple(map, prefix + "NotPassedItemCount", this.NotPassedItemCount);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

