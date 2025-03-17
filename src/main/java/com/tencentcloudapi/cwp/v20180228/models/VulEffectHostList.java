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

public class VulEffectHostList extends AbstractModel {

    /**
    * 事件id
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * 状态：0: 待处理 1:忽略  3:已修复  5:检测中 6:修复中 7: 回滚中 8:修复失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 最后检测时间
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * 危害等级：1-低危；2-中危；3-高危；4-严重
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 主机Quuid
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
    * 主机HostIp
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 主机别名
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * 主机标签
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 说明
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 版本信息：0-基础版 1-专业版 2-旗舰版 3-轻量版
    */
    @SerializedName("HostVersion")
    @Expose
    private Long HostVersion;

    /**
    * 是否能自动修复 0 :漏洞不可自动修复，  1：可自动修复， 2：客户端已离线， 3：主机不是旗舰版只能手动修复， 4：机型不允许 ，5：修复中 ，6：已修复， 7：检测中  9:修复失败，10:已忽略 11:漏洞只支持linux不支持Windows 12：漏洞只支持Windows不支持linux，13:修复失败但此时主机已离线，14:修复失败但此时主机不是旗舰版， 15:已手动修复
    */
    @SerializedName("IsSupportAutoFix")
    @Expose
    private Long IsSupportAutoFix;

    /**
    * 失败原因
    */
    @SerializedName("FixStatusMsg")
    @Expose
    private String FixStatusMsg;

    /**
    * 首次发现时间
    */
    @SerializedName("FirstDiscoveryTime")
    @Expose
    private String FirstDiscoveryTime;

    /**
    * 实例状态："PENDING"-创建中 "LAUNCH_FAILED"-创建失败 "RUNNING"-运行中 "STOPPED"-关机 "STARTING"-表示开机中 "STOPPING"-表示关机中 "REBOOTING"-重启中 "SHUTDOWN"-表示停止待销毁 "TERMINATING"-表示销毁中 "
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * 外网ip
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String PublicIpAddresses;

    /**
    * 云标签信息
    */
    @SerializedName("CloudTags")
    @Expose
    private Tags [] CloudTags;

    /**
    * 主机额外信息
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get 事件id 
     * @return EventId 事件id
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件id
     * @param EventId 事件id
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 状态：0: 待处理 1:忽略  3:已修复  5:检测中 6:修复中 7: 回滚中 8:修复失败 
     * @return Status 状态：0: 待处理 1:忽略  3:已修复  5:检测中 6:修复中 7: 回滚中 8:修复失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：0: 待处理 1:忽略  3:已修复  5:检测中 6:修复中 7: 回滚中 8:修复失败
     * @param Status 状态：0: 待处理 1:忽略  3:已修复  5:检测中 6:修复中 7: 回滚中 8:修复失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get 危害等级：1-低危；2-中危；3-高危；4-严重 
     * @return Level 危害等级：1-低危；2-中危；3-高危；4-严重
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 危害等级：1-低危；2-中危；3-高危；4-严重
     * @param Level 危害等级：1-低危；2-中危；3-高危；4-严重
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

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
     * Get 主机HostIp 
     * @return HostIp 主机HostIp
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 主机HostIp
     * @param HostIp 主机HostIp
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 主机别名 
     * @return AliasName 主机别名
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set 主机别名
     * @param AliasName 主机别名
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get 主机标签 
     * @return Tags 主机标签
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 主机标签
     * @param Tags 主机标签
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 说明 
     * @return Description 说明
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 说明
     * @param Description 说明
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 版本信息：0-基础版 1-专业版 2-旗舰版 3-轻量版 
     * @return HostVersion 版本信息：0-基础版 1-专业版 2-旗舰版 3-轻量版
     */
    public Long getHostVersion() {
        return this.HostVersion;
    }

    /**
     * Set 版本信息：0-基础版 1-专业版 2-旗舰版 3-轻量版
     * @param HostVersion 版本信息：0-基础版 1-专业版 2-旗舰版 3-轻量版
     */
    public void setHostVersion(Long HostVersion) {
        this.HostVersion = HostVersion;
    }

    /**
     * Get 是否能自动修复 0 :漏洞不可自动修复，  1：可自动修复， 2：客户端已离线， 3：主机不是旗舰版只能手动修复， 4：机型不允许 ，5：修复中 ，6：已修复， 7：检测中  9:修复失败，10:已忽略 11:漏洞只支持linux不支持Windows 12：漏洞只支持Windows不支持linux，13:修复失败但此时主机已离线，14:修复失败但此时主机不是旗舰版， 15:已手动修复 
     * @return IsSupportAutoFix 是否能自动修复 0 :漏洞不可自动修复，  1：可自动修复， 2：客户端已离线， 3：主机不是旗舰版只能手动修复， 4：机型不允许 ，5：修复中 ，6：已修复， 7：检测中  9:修复失败，10:已忽略 11:漏洞只支持linux不支持Windows 12：漏洞只支持Windows不支持linux，13:修复失败但此时主机已离线，14:修复失败但此时主机不是旗舰版， 15:已手动修复
     */
    public Long getIsSupportAutoFix() {
        return this.IsSupportAutoFix;
    }

    /**
     * Set 是否能自动修复 0 :漏洞不可自动修复，  1：可自动修复， 2：客户端已离线， 3：主机不是旗舰版只能手动修复， 4：机型不允许 ，5：修复中 ，6：已修复， 7：检测中  9:修复失败，10:已忽略 11:漏洞只支持linux不支持Windows 12：漏洞只支持Windows不支持linux，13:修复失败但此时主机已离线，14:修复失败但此时主机不是旗舰版， 15:已手动修复
     * @param IsSupportAutoFix 是否能自动修复 0 :漏洞不可自动修复，  1：可自动修复， 2：客户端已离线， 3：主机不是旗舰版只能手动修复， 4：机型不允许 ，5：修复中 ，6：已修复， 7：检测中  9:修复失败，10:已忽略 11:漏洞只支持linux不支持Windows 12：漏洞只支持Windows不支持linux，13:修复失败但此时主机已离线，14:修复失败但此时主机不是旗舰版， 15:已手动修复
     */
    public void setIsSupportAutoFix(Long IsSupportAutoFix) {
        this.IsSupportAutoFix = IsSupportAutoFix;
    }

    /**
     * Get 失败原因 
     * @return FixStatusMsg 失败原因
     */
    public String getFixStatusMsg() {
        return this.FixStatusMsg;
    }

    /**
     * Set 失败原因
     * @param FixStatusMsg 失败原因
     */
    public void setFixStatusMsg(String FixStatusMsg) {
        this.FixStatusMsg = FixStatusMsg;
    }

    /**
     * Get 首次发现时间 
     * @return FirstDiscoveryTime 首次发现时间
     */
    public String getFirstDiscoveryTime() {
        return this.FirstDiscoveryTime;
    }

    /**
     * Set 首次发现时间
     * @param FirstDiscoveryTime 首次发现时间
     */
    public void setFirstDiscoveryTime(String FirstDiscoveryTime) {
        this.FirstDiscoveryTime = FirstDiscoveryTime;
    }

    /**
     * Get 实例状态："PENDING"-创建中 "LAUNCH_FAILED"-创建失败 "RUNNING"-运行中 "STOPPED"-关机 "STARTING"-表示开机中 "STOPPING"-表示关机中 "REBOOTING"-重启中 "SHUTDOWN"-表示停止待销毁 "TERMINATING"-表示销毁中 " 
     * @return InstanceState 实例状态："PENDING"-创建中 "LAUNCH_FAILED"-创建失败 "RUNNING"-运行中 "STOPPED"-关机 "STARTING"-表示开机中 "STOPPING"-表示关机中 "REBOOTING"-重启中 "SHUTDOWN"-表示停止待销毁 "TERMINATING"-表示销毁中 "
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set 实例状态："PENDING"-创建中 "LAUNCH_FAILED"-创建失败 "RUNNING"-运行中 "STOPPED"-关机 "STARTING"-表示开机中 "STOPPING"-表示关机中 "REBOOTING"-重启中 "SHUTDOWN"-表示停止待销毁 "TERMINATING"-表示销毁中 "
     * @param InstanceState 实例状态："PENDING"-创建中 "LAUNCH_FAILED"-创建失败 "RUNNING"-运行中 "STOPPED"-关机 "STARTING"-表示开机中 "STOPPING"-表示关机中 "REBOOTING"-重启中 "SHUTDOWN"-表示停止待销毁 "TERMINATING"-表示销毁中 "
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get 外网ip 
     * @return PublicIpAddresses 外网ip
     */
    public String getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set 外网ip
     * @param PublicIpAddresses 外网ip
     */
    public void setPublicIpAddresses(String PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
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
     * Get 主机额外信息 
     * @return MachineExtraInfo 主机额外信息
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set 主机额外信息
     * @param MachineExtraInfo 主机额外信息
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    public VulEffectHostList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulEffectHostList(VulEffectHostList source) {
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.HostVersion != null) {
            this.HostVersion = new Long(source.HostVersion);
        }
        if (source.IsSupportAutoFix != null) {
            this.IsSupportAutoFix = new Long(source.IsSupportAutoFix);
        }
        if (source.FixStatusMsg != null) {
            this.FixStatusMsg = new String(source.FixStatusMsg);
        }
        if (source.FirstDiscoveryTime != null) {
            this.FirstDiscoveryTime = new String(source.FirstDiscoveryTime);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.PublicIpAddresses != null) {
            this.PublicIpAddresses = new String(source.PublicIpAddresses);
        }
        if (source.CloudTags != null) {
            this.CloudTags = new Tags[source.CloudTags.length];
            for (int i = 0; i < source.CloudTags.length; i++) {
                this.CloudTags[i] = new Tags(source.CloudTags[i]);
            }
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "HostVersion", this.HostVersion);
        this.setParamSimple(map, prefix + "IsSupportAutoFix", this.IsSupportAutoFix);
        this.setParamSimple(map, prefix + "FixStatusMsg", this.FixStatusMsg);
        this.setParamSimple(map, prefix + "FirstDiscoveryTime", this.FirstDiscoveryTime);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "PublicIpAddresses", this.PublicIpAddresses);
        this.setParamArrayObj(map, prefix + "CloudTags.", this.CloudTags);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

