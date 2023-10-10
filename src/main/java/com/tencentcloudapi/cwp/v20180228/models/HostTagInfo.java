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

public class HostTagInfo extends AbstractModel{

    /**
    * 主机Quuid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 主机标签名数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagList")
    @Expose
    private String [] TagList;

    /**
    * 主机内网Ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 主机名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * 主机公网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * 主机uuid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 内核版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KernelVersion")
    @Expose
    private String KernelVersion;

    /**
    * 主机在线状态 ONLINE，OFFLINE
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * 防护版本 BASIC_VERSION 基础版, PRO_VERSION 专业版 Flagship 旗舰版
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProtectType")
    @Expose
    private String ProtectType;

    /**
    * 漏洞数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulNum")
    @Expose
    private Long VulNum;

    /**
    * 云标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CloudTags")
    @Expose
    private Tags [] CloudTags;

    /**
    * 主机instance ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
     * Get 主机Quuid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Quuid 主机Quuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机Quuid
注意：此字段可能返回 null，表示取不到有效值。
     * @param Quuid 主机Quuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 主机标签名数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagList 主机标签名数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 主机标签名数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagList 主机标签名数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagList(String [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get 主机内网Ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostIp 主机内网Ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 主机内网Ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostIp 主机内网Ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 主机名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AliasName 主机名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set 主机名
注意：此字段可能返回 null，表示取不到有效值。
     * @param AliasName 主机名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get 主机公网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachineWanIp 主机公网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set 主机公网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachineWanIp 主机公网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get 主机uuid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uuid 主机uuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机uuid
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uuid 主机uuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 内核版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KernelVersion 内核版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKernelVersion() {
        return this.KernelVersion;
    }

    /**
     * Set 内核版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param KernelVersion 内核版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKernelVersion(String KernelVersion) {
        this.KernelVersion = KernelVersion;
    }

    /**
     * Get 主机在线状态 ONLINE，OFFLINE
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachineStatus 主机在线状态 ONLINE，OFFLINE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set 主机在线状态 ONLINE，OFFLINE
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachineStatus 主机在线状态 ONLINE，OFFLINE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * Get 防护版本 BASIC_VERSION 基础版, PRO_VERSION 专业版 Flagship 旗舰版
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProtectType 防护版本 BASIC_VERSION 基础版, PRO_VERSION 专业版 Flagship 旗舰版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtectType() {
        return this.ProtectType;
    }

    /**
     * Set 防护版本 BASIC_VERSION 基础版, PRO_VERSION 专业版 Flagship 旗舰版
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProtectType 防护版本 BASIC_VERSION 基础版, PRO_VERSION 专业版 Flagship 旗舰版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtectType(String ProtectType) {
        this.ProtectType = ProtectType;
    }

    /**
     * Get 漏洞数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulNum 漏洞数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVulNum() {
        return this.VulNum;
    }

    /**
     * Set 漏洞数
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulNum 漏洞数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulNum(Long VulNum) {
        this.VulNum = VulNum;
    }

    /**
     * Get 云标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CloudTags 云标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tags [] getCloudTags() {
        return this.CloudTags;
    }

    /**
     * Set 云标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CloudTags 云标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCloudTags(Tags [] CloudTags) {
        this.CloudTags = CloudTags;
    }

    /**
     * Get 主机instance ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceID 主机instance ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 主机instance ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceID 主机instance ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    public HostTagInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostTagInfo(HostTagInfo source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.TagList != null) {
            this.TagList = new String[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new String(source.TagList[i]);
            }
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.KernelVersion != null) {
            this.KernelVersion = new String(source.KernelVersion);
        }
        if (source.MachineStatus != null) {
            this.MachineStatus = new String(source.MachineStatus);
        }
        if (source.ProtectType != null) {
            this.ProtectType = new String(source.ProtectType);
        }
        if (source.VulNum != null) {
            this.VulNum = new Long(source.VulNum);
        }
        if (source.CloudTags != null) {
            this.CloudTags = new Tags[source.CloudTags.length];
            for (int i = 0; i < source.CloudTags.length; i++) {
                this.CloudTags[i] = new Tags(source.CloudTags[i]);
            }
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamArraySimple(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "KernelVersion", this.KernelVersion);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
        this.setParamSimple(map, prefix + "ProtectType", this.ProtectType);
        this.setParamSimple(map, prefix + "VulNum", this.VulNum);
        this.setParamArrayObj(map, prefix + "CloudTags.", this.CloudTags);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);

    }
}

