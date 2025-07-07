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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EffectiveMachineInfo extends AbstractModel {

    /**
    * 机器名称
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 机器公网ip
    */
    @SerializedName("MachinePublicIp")
    @Expose
    private String MachinePublicIp;

    /**
    * 机器内网ip
    */
    @SerializedName("MachinePrivateIp")
    @Expose
    private String MachinePrivateIp;

    /**
    * 机器标签
    */
    @SerializedName("MachineTag")
    @Expose
    private MachineTag [] MachineTag;

    /**
    * 机器Quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 主机Uuid
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
    * 在线状态 OFFLINE，ONLINE
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * 授权订单对象
    */
    @SerializedName("LicenseOrder")
    @Expose
    private LicenseOrder LicenseOrder;

    /**
    * 漏洞数量
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
    * 机器instance ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
     * Get 机器名称 
     * @return MachineName 机器名称
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 机器名称
     * @param MachineName 机器名称
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 机器公网ip 
     * @return MachinePublicIp 机器公网ip
     */
    public String getMachinePublicIp() {
        return this.MachinePublicIp;
    }

    /**
     * Set 机器公网ip
     * @param MachinePublicIp 机器公网ip
     */
    public void setMachinePublicIp(String MachinePublicIp) {
        this.MachinePublicIp = MachinePublicIp;
    }

    /**
     * Get 机器内网ip 
     * @return MachinePrivateIp 机器内网ip
     */
    public String getMachinePrivateIp() {
        return this.MachinePrivateIp;
    }

    /**
     * Set 机器内网ip
     * @param MachinePrivateIp 机器内网ip
     */
    public void setMachinePrivateIp(String MachinePrivateIp) {
        this.MachinePrivateIp = MachinePrivateIp;
    }

    /**
     * Get 机器标签 
     * @return MachineTag 机器标签
     */
    public MachineTag [] getMachineTag() {
        return this.MachineTag;
    }

    /**
     * Set 机器标签
     * @param MachineTag 机器标签
     */
    public void setMachineTag(MachineTag [] MachineTag) {
        this.MachineTag = MachineTag;
    }

    /**
     * Get 机器Quuid 
     * @return Quuid 机器Quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 机器Quuid
     * @param Quuid 机器Quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 主机Uuid 
     * @return Uuid 主机Uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机Uuid
     * @param Uuid 主机Uuid
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
     * Get 在线状态 OFFLINE，ONLINE 
     * @return MachineStatus 在线状态 OFFLINE，ONLINE
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set 在线状态 OFFLINE，ONLINE
     * @param MachineStatus 在线状态 OFFLINE，ONLINE
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * Get 授权订单对象 
     * @return LicenseOrder 授权订单对象
     */
    public LicenseOrder getLicenseOrder() {
        return this.LicenseOrder;
    }

    /**
     * Set 授权订单对象
     * @param LicenseOrder 授权订单对象
     */
    public void setLicenseOrder(LicenseOrder LicenseOrder) {
        this.LicenseOrder = LicenseOrder;
    }

    /**
     * Get 漏洞数量 
     * @return VulNum 漏洞数量
     */
    public Long getVulNum() {
        return this.VulNum;
    }

    /**
     * Set 漏洞数量
     * @param VulNum 漏洞数量
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
     * Get 机器instance ID 
     * @return InstanceID 机器instance ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 机器instance ID
     * @param InstanceID 机器instance ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    public EffectiveMachineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EffectiveMachineInfo(EffectiveMachineInfo source) {
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachinePublicIp != null) {
            this.MachinePublicIp = new String(source.MachinePublicIp);
        }
        if (source.MachinePrivateIp != null) {
            this.MachinePrivateIp = new String(source.MachinePrivateIp);
        }
        if (source.MachineTag != null) {
            this.MachineTag = new MachineTag[source.MachineTag.length];
            for (int i = 0; i < source.MachineTag.length; i++) {
                this.MachineTag[i] = new MachineTag(source.MachineTag[i]);
            }
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
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
        if (source.LicenseOrder != null) {
            this.LicenseOrder = new LicenseOrder(source.LicenseOrder);
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
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachinePublicIp", this.MachinePublicIp);
        this.setParamSimple(map, prefix + "MachinePrivateIp", this.MachinePrivateIp);
        this.setParamArrayObj(map, prefix + "MachineTag.", this.MachineTag);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "KernelVersion", this.KernelVersion);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
        this.setParamObj(map, prefix + "LicenseOrder.", this.LicenseOrder);
        this.setParamSimple(map, prefix + "VulNum", this.VulNum);
        this.setParamArrayObj(map, prefix + "CloudTags.", this.CloudTags);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);

    }
}

