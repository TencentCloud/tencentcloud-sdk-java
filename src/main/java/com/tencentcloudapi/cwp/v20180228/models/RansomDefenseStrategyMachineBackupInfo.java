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

public class RansomDefenseStrategyMachineBackupInfo extends AbstractModel {

    /**
    * 主机Uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 主机Quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 主机名称
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 主机实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 内网ip
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 外网ip
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * 云标签
    */
    @SerializedName("CloudTags")
    @Expose
    private Tag [] CloudTags;

    /**
    * 可用区信息
    */
    @SerializedName("RegionInfo")
    @Expose
    private RegionInfo RegionInfo;

    /**
    * 主机安全标签
    */
    @SerializedName("Tag")
    @Expose
    private MachineTag [] Tag;

    /**
    * 防护状态：0关闭，1开启
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 策略id，为0时未绑定策略
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * 硬盘信息，为空时所有硬盘生效：
;分割 diskId1|diskName1;diskId2|diskName2
    */
    @SerializedName("DiskInfo")
    @Expose
    private String DiskInfo;

    /**
    * 策略名称
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * 备份数量
    */
    @SerializedName("BackupCount")
    @Expose
    private Long BackupCount;

    /**
    * 最近一次备份状态：0备份中，1正常，2失败，9暂无备份
    */
    @SerializedName("LastBackupStatus")
    @Expose
    private Long LastBackupStatus;

    /**
    * 最近一次备份失败原因
    */
    @SerializedName("LastBackupMessage")
    @Expose
    private String LastBackupMessage;

    /**
    * 最近一次备份时间
    */
    @SerializedName("LastBackupTime")
    @Expose
    private String LastBackupTime;

    /**
    * 最近一次回滚进度百分比
    */
    @SerializedName("RollBackPercent")
    @Expose
    private Long RollBackPercent;

    /**
    * 最近一次回滚状态：0进行中，1成功，2失败
    */
    @SerializedName("RollBackStatus")
    @Expose
    private Long RollBackStatus;

    /**
    * 备份成功次数
    */
    @SerializedName("BackupSuccessCount")
    @Expose
    private Long BackupSuccessCount;

    /**
    * 版本信息：0-基础版 1-专业版 2-旗舰版 3-轻量版
    */
    @SerializedName("HostVersion")
    @Expose
    private Long HostVersion;

    /**
    * 机器所属专区类型 CVM 云服务器, BM 黑石, ECM 边缘计算, LH 轻量应用服务器 ,Other 混合云专区
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

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
     * Get 主机名称 
     * @return MachineName 主机名称
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 主机名称
     * @param MachineName 主机名称
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 主机实例id 
     * @return InstanceId 主机实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 主机实例id
     * @param InstanceId 主机实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 内网ip 
     * @return MachineIp 内网ip
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set 内网ip
     * @param MachineIp 内网ip
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get 外网ip 
     * @return MachineWanIp 外网ip
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set 外网ip
     * @param MachineWanIp 外网ip
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get 云标签 
     * @return CloudTags 云标签
     */
    public Tag [] getCloudTags() {
        return this.CloudTags;
    }

    /**
     * Set 云标签
     * @param CloudTags 云标签
     */
    public void setCloudTags(Tag [] CloudTags) {
        this.CloudTags = CloudTags;
    }

    /**
     * Get 可用区信息 
     * @return RegionInfo 可用区信息
     */
    public RegionInfo getRegionInfo() {
        return this.RegionInfo;
    }

    /**
     * Set 可用区信息
     * @param RegionInfo 可用区信息
     */
    public void setRegionInfo(RegionInfo RegionInfo) {
        this.RegionInfo = RegionInfo;
    }

    /**
     * Get 主机安全标签 
     * @return Tag 主机安全标签
     */
    public MachineTag [] getTag() {
        return this.Tag;
    }

    /**
     * Set 主机安全标签
     * @param Tag 主机安全标签
     */
    public void setTag(MachineTag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 防护状态：0关闭，1开启 
     * @return Status 防护状态：0关闭，1开启
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 防护状态：0关闭，1开启
     * @param Status 防护状态：0关闭，1开启
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 策略id，为0时未绑定策略 
     * @return StrategyId 策略id，为0时未绑定策略
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 策略id，为0时未绑定策略
     * @param StrategyId 策略id，为0时未绑定策略
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get 硬盘信息，为空时所有硬盘生效：
;分割 diskId1|diskName1;diskId2|diskName2 
     * @return DiskInfo 硬盘信息，为空时所有硬盘生效：
;分割 diskId1|diskName1;diskId2|diskName2
     */
    public String getDiskInfo() {
        return this.DiskInfo;
    }

    /**
     * Set 硬盘信息，为空时所有硬盘生效：
;分割 diskId1|diskName1;diskId2|diskName2
     * @param DiskInfo 硬盘信息，为空时所有硬盘生效：
;分割 diskId1|diskName1;diskId2|diskName2
     */
    public void setDiskInfo(String DiskInfo) {
        this.DiskInfo = DiskInfo;
    }

    /**
     * Get 策略名称 
     * @return StrategyName 策略名称
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set 策略名称
     * @param StrategyName 策略名称
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get 备份数量 
     * @return BackupCount 备份数量
     */
    public Long getBackupCount() {
        return this.BackupCount;
    }

    /**
     * Set 备份数量
     * @param BackupCount 备份数量
     */
    public void setBackupCount(Long BackupCount) {
        this.BackupCount = BackupCount;
    }

    /**
     * Get 最近一次备份状态：0备份中，1正常，2失败，9暂无备份 
     * @return LastBackupStatus 最近一次备份状态：0备份中，1正常，2失败，9暂无备份
     */
    public Long getLastBackupStatus() {
        return this.LastBackupStatus;
    }

    /**
     * Set 最近一次备份状态：0备份中，1正常，2失败，9暂无备份
     * @param LastBackupStatus 最近一次备份状态：0备份中，1正常，2失败，9暂无备份
     */
    public void setLastBackupStatus(Long LastBackupStatus) {
        this.LastBackupStatus = LastBackupStatus;
    }

    /**
     * Get 最近一次备份失败原因 
     * @return LastBackupMessage 最近一次备份失败原因
     */
    public String getLastBackupMessage() {
        return this.LastBackupMessage;
    }

    /**
     * Set 最近一次备份失败原因
     * @param LastBackupMessage 最近一次备份失败原因
     */
    public void setLastBackupMessage(String LastBackupMessage) {
        this.LastBackupMessage = LastBackupMessage;
    }

    /**
     * Get 最近一次备份时间 
     * @return LastBackupTime 最近一次备份时间
     */
    public String getLastBackupTime() {
        return this.LastBackupTime;
    }

    /**
     * Set 最近一次备份时间
     * @param LastBackupTime 最近一次备份时间
     */
    public void setLastBackupTime(String LastBackupTime) {
        this.LastBackupTime = LastBackupTime;
    }

    /**
     * Get 最近一次回滚进度百分比 
     * @return RollBackPercent 最近一次回滚进度百分比
     */
    public Long getRollBackPercent() {
        return this.RollBackPercent;
    }

    /**
     * Set 最近一次回滚进度百分比
     * @param RollBackPercent 最近一次回滚进度百分比
     */
    public void setRollBackPercent(Long RollBackPercent) {
        this.RollBackPercent = RollBackPercent;
    }

    /**
     * Get 最近一次回滚状态：0进行中，1成功，2失败 
     * @return RollBackStatus 最近一次回滚状态：0进行中，1成功，2失败
     */
    public Long getRollBackStatus() {
        return this.RollBackStatus;
    }

    /**
     * Set 最近一次回滚状态：0进行中，1成功，2失败
     * @param RollBackStatus 最近一次回滚状态：0进行中，1成功，2失败
     */
    public void setRollBackStatus(Long RollBackStatus) {
        this.RollBackStatus = RollBackStatus;
    }

    /**
     * Get 备份成功次数 
     * @return BackupSuccessCount 备份成功次数
     */
    public Long getBackupSuccessCount() {
        return this.BackupSuccessCount;
    }

    /**
     * Set 备份成功次数
     * @param BackupSuccessCount 备份成功次数
     */
    public void setBackupSuccessCount(Long BackupSuccessCount) {
        this.BackupSuccessCount = BackupSuccessCount;
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
     * Get 机器所属专区类型 CVM 云服务器, BM 黑石, ECM 边缘计算, LH 轻量应用服务器 ,Other 混合云专区 
     * @return MachineType 机器所属专区类型 CVM 云服务器, BM 黑石, ECM 边缘计算, LH 轻量应用服务器 ,Other 混合云专区
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 机器所属专区类型 CVM 云服务器, BM 黑石, ECM 边缘计算, LH 轻量应用服务器 ,Other 混合云专区
     * @param MachineType 机器所属专区类型 CVM 云服务器, BM 黑石, ECM 边缘计算, LH 轻量应用服务器 ,Other 混合云专区
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    public RansomDefenseStrategyMachineBackupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RansomDefenseStrategyMachineBackupInfo(RansomDefenseStrategyMachineBackupInfo source) {
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.CloudTags != null) {
            this.CloudTags = new Tag[source.CloudTags.length];
            for (int i = 0; i < source.CloudTags.length; i++) {
                this.CloudTags[i] = new Tag(source.CloudTags[i]);
            }
        }
        if (source.RegionInfo != null) {
            this.RegionInfo = new RegionInfo(source.RegionInfo);
        }
        if (source.Tag != null) {
            this.Tag = new MachineTag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new MachineTag(source.Tag[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.DiskInfo != null) {
            this.DiskInfo = new String(source.DiskInfo);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.BackupCount != null) {
            this.BackupCount = new Long(source.BackupCount);
        }
        if (source.LastBackupStatus != null) {
            this.LastBackupStatus = new Long(source.LastBackupStatus);
        }
        if (source.LastBackupMessage != null) {
            this.LastBackupMessage = new String(source.LastBackupMessage);
        }
        if (source.LastBackupTime != null) {
            this.LastBackupTime = new String(source.LastBackupTime);
        }
        if (source.RollBackPercent != null) {
            this.RollBackPercent = new Long(source.RollBackPercent);
        }
        if (source.RollBackStatus != null) {
            this.RollBackStatus = new Long(source.RollBackStatus);
        }
        if (source.BackupSuccessCount != null) {
            this.BackupSuccessCount = new Long(source.BackupSuccessCount);
        }
        if (source.HostVersion != null) {
            this.HostVersion = new Long(source.HostVersion);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamArrayObj(map, prefix + "CloudTags.", this.CloudTags);
        this.setParamObj(map, prefix + "RegionInfo.", this.RegionInfo);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "DiskInfo", this.DiskInfo);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "BackupCount", this.BackupCount);
        this.setParamSimple(map, prefix + "LastBackupStatus", this.LastBackupStatus);
        this.setParamSimple(map, prefix + "LastBackupMessage", this.LastBackupMessage);
        this.setParamSimple(map, prefix + "LastBackupTime", this.LastBackupTime);
        this.setParamSimple(map, prefix + "RollBackPercent", this.RollBackPercent);
        this.setParamSimple(map, prefix + "RollBackStatus", this.RollBackStatus);
        this.setParamSimple(map, prefix + "BackupSuccessCount", this.BackupSuccessCount);
        this.setParamSimple(map, prefix + "HostVersion", this.HostVersion);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);

    }
}

