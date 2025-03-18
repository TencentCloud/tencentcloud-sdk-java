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

public class HostTagInfo extends AbstractModel {

    /**
    * 主机Quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 主机标签名数组
    */
    @SerializedName("TagList")
    @Expose
    private String [] TagList;

    /**
    * 主机内网Ip
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 主机名
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * 主机公网ip
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * 主机uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 内核版本号
    */
    @SerializedName("KernelVersion")
    @Expose
    private String KernelVersion;

    /**
    * 主机在线状态 ONLINE，OFFLINE
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * 防护版本 BASIC_VERSION 基础版, PRO_VERSION 专业版 Flagship 旗舰版
    */
    @SerializedName("ProtectType")
    @Expose
    private String ProtectType;

    /**
    * 漏洞数
    */
    @SerializedName("VulNum")
    @Expose
    private Long VulNum;

    /**
    * 云标签信息
    */
    @SerializedName("CloudTags")
    @Expose
    private Tags [] CloudTags;

    /**
    * 主机instance ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 主机类型
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * 可用区名称
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 可用区ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
     * Get 主机Quuid 
     * @return Quuid 主机Quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机Quuid
     * @param Quuid 主机Quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 主机标签名数组 
     * @return TagList 主机标签名数组
     */
    public String [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 主机标签名数组
     * @param TagList 主机标签名数组
     */
    public void setTagList(String [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get 主机内网Ip 
     * @return HostIp 主机内网Ip
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 主机内网Ip
     * @param HostIp 主机内网Ip
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 主机名 
     * @return AliasName 主机名
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set 主机名
     * @param AliasName 主机名
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get 主机公网ip 
     * @return MachineWanIp 主机公网ip
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set 主机公网ip
     * @param MachineWanIp 主机公网ip
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get 主机uuid 
     * @return Uuid 主机uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机uuid
     * @param Uuid 主机uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 内核版本号 
     * @return KernelVersion 内核版本号
     */
    public String getKernelVersion() {
        return this.KernelVersion;
    }

    /**
     * Set 内核版本号
     * @param KernelVersion 内核版本号
     */
    public void setKernelVersion(String KernelVersion) {
        this.KernelVersion = KernelVersion;
    }

    /**
     * Get 主机在线状态 ONLINE，OFFLINE 
     * @return MachineStatus 主机在线状态 ONLINE，OFFLINE
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set 主机在线状态 ONLINE，OFFLINE
     * @param MachineStatus 主机在线状态 ONLINE，OFFLINE
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * Get 防护版本 BASIC_VERSION 基础版, PRO_VERSION 专业版 Flagship 旗舰版 
     * @return ProtectType 防护版本 BASIC_VERSION 基础版, PRO_VERSION 专业版 Flagship 旗舰版
     */
    public String getProtectType() {
        return this.ProtectType;
    }

    /**
     * Set 防护版本 BASIC_VERSION 基础版, PRO_VERSION 专业版 Flagship 旗舰版
     * @param ProtectType 防护版本 BASIC_VERSION 基础版, PRO_VERSION 专业版 Flagship 旗舰版
     */
    public void setProtectType(String ProtectType) {
        this.ProtectType = ProtectType;
    }

    /**
     * Get 漏洞数 
     * @return VulNum 漏洞数
     */
    public Long getVulNum() {
        return this.VulNum;
    }

    /**
     * Set 漏洞数
     * @param VulNum 漏洞数
     */
    public void setVulNum(Long VulNum) {
        this.VulNum = VulNum;
    }

    /**
     * Get 云标签信息 
     * @return CloudTags 云标签信息
     */
    public Tags [] getCloudTags() {
        return this.CloudTags;
    }

    /**
     * Set 云标签信息
     * @param CloudTags 云标签信息
     */
    public void setCloudTags(Tags [] CloudTags) {
        this.CloudTags = CloudTags;
    }

    /**
     * Get 主机instance ID 
     * @return InstanceID 主机instance ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 主机instance ID
     * @param InstanceID 主机instance ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 主机类型 
     * @return MachineType 主机类型
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 主机类型
     * @param MachineType 主机类型
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get 可用区名称 
     * @return RegionName 可用区名称
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 可用区名称
     * @param RegionName 可用区名称
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 可用区ID 
     * @return RegionId 可用区ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 可用区ID
     * @param RegionId 可用区ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
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
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
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
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

