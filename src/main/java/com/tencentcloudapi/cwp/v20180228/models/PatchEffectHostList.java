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

public class PatchEffectHostList extends AbstractModel {

    /**
    * 版本信息：0-基础版 1-专业版 2-旗舰版 3-轻量版
    */
    @SerializedName("HostVersion")
    @Expose
    private Long HostVersion;

    /**
    * 实例状态: "PENDING"-创建中 "LAUNCH_FAILED"-创建失败 "RUNNING"-运行中 "STOPPED"-关机 "STARTING"-表示开机中 "STOPPING"-表示关机中 "REBOOTING"-重启中 "SHUTDOWN"-表示停止待销毁 "TERMINATING"-表示销毁中 
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * 首次扫描时间
    */
    @SerializedName("FirstScanTime")
    @Expose
    private String FirstScanTime;

    /**
    * 最近扫描时间
    */
    @SerializedName("LatestScanTime")
    @Expose
    private String LatestScanTime;

    /**
    * 修复状态：0-未进行修复；1-修复中；2-修复失败；3-修复成功；4-修复超时
    */
    @SerializedName("FixStatus")
    @Expose
    private Long FixStatus;

    /**
    * 主机基础信息
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * 主机安全Uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * CVM或BM机器唯一Uuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 事件id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 状态：0: 待处理 1:忽略  3:已修复  5:检测中 6:修复中 7: 回滚中 8:修复失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 修复时间
    */
    @SerializedName("LatestFixTime")
    @Expose
    private String LatestFixTime;

    /**
    * KB id
    */
    @SerializedName("KbId")
    @Expose
    private Long KbId;

    /**
    * 是否需要重启 0不需要，1需要
    */
    @SerializedName("RestartRequired")
    @Expose
    private Long RestartRequired;

    /**
    * 可用区ID	
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 机器类型信息
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * 修复任务是否创建了快照： 0-未创建，其他-已创建
    */
    @SerializedName("HasSnapshot")
    @Expose
    private Long HasSnapshot;

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
     * Get 实例状态: "PENDING"-创建中 "LAUNCH_FAILED"-创建失败 "RUNNING"-运行中 "STOPPED"-关机 "STARTING"-表示开机中 "STOPPING"-表示关机中 "REBOOTING"-重启中 "SHUTDOWN"-表示停止待销毁 "TERMINATING"-表示销毁中  
     * @return InstanceState 实例状态: "PENDING"-创建中 "LAUNCH_FAILED"-创建失败 "RUNNING"-运行中 "STOPPED"-关机 "STARTING"-表示开机中 "STOPPING"-表示关机中 "REBOOTING"-重启中 "SHUTDOWN"-表示停止待销毁 "TERMINATING"-表示销毁中 
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set 实例状态: "PENDING"-创建中 "LAUNCH_FAILED"-创建失败 "RUNNING"-运行中 "STOPPED"-关机 "STARTING"-表示开机中 "STOPPING"-表示关机中 "REBOOTING"-重启中 "SHUTDOWN"-表示停止待销毁 "TERMINATING"-表示销毁中 
     * @param InstanceState 实例状态: "PENDING"-创建中 "LAUNCH_FAILED"-创建失败 "RUNNING"-运行中 "STOPPED"-关机 "STARTING"-表示开机中 "STOPPING"-表示关机中 "REBOOTING"-重启中 "SHUTDOWN"-表示停止待销毁 "TERMINATING"-表示销毁中 
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get 首次扫描时间 
     * @return FirstScanTime 首次扫描时间
     */
    public String getFirstScanTime() {
        return this.FirstScanTime;
    }

    /**
     * Set 首次扫描时间
     * @param FirstScanTime 首次扫描时间
     */
    public void setFirstScanTime(String FirstScanTime) {
        this.FirstScanTime = FirstScanTime;
    }

    /**
     * Get 最近扫描时间 
     * @return LatestScanTime 最近扫描时间
     */
    public String getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set 最近扫描时间
     * @param LatestScanTime 最近扫描时间
     */
    public void setLatestScanTime(String LatestScanTime) {
        this.LatestScanTime = LatestScanTime;
    }

    /**
     * Get 修复状态：0-未进行修复；1-修复中；2-修复失败；3-修复成功；4-修复超时 
     * @return FixStatus 修复状态：0-未进行修复；1-修复中；2-修复失败；3-修复成功；4-修复超时
     */
    public Long getFixStatus() {
        return this.FixStatus;
    }

    /**
     * Set 修复状态：0-未进行修复；1-修复中；2-修复失败；3-修复成功；4-修复超时
     * @param FixStatus 修复状态：0-未进行修复；1-修复中；2-修复失败；3-修复成功；4-修复超时
     */
    public void setFixStatus(Long FixStatus) {
        this.FixStatus = FixStatus;
    }

    /**
     * Get 主机基础信息 
     * @return MachineExtraInfo 主机基础信息
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set 主机基础信息
     * @param MachineExtraInfo 主机基础信息
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get 主机安全Uuid 
     * @return Uuid 主机安全Uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机安全Uuid
     * @param Uuid 主机安全Uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get CVM或BM机器唯一Uuid 
     * @return Quuid CVM或BM机器唯一Uuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set CVM或BM机器唯一Uuid
     * @param Quuid CVM或BM机器唯一Uuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 事件id 
     * @return Id 事件id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 事件id
     * @param Id 事件id
     */
    public void setId(Long Id) {
        this.Id = Id;
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
     * Get 修复时间 
     * @return LatestFixTime 修复时间
     */
    public String getLatestFixTime() {
        return this.LatestFixTime;
    }

    /**
     * Set 修复时间
     * @param LatestFixTime 修复时间
     */
    public void setLatestFixTime(String LatestFixTime) {
        this.LatestFixTime = LatestFixTime;
    }

    /**
     * Get KB id 
     * @return KbId KB id
     */
    public Long getKbId() {
        return this.KbId;
    }

    /**
     * Set KB id
     * @param KbId KB id
     */
    public void setKbId(Long KbId) {
        this.KbId = KbId;
    }

    /**
     * Get 是否需要重启 0不需要，1需要 
     * @return RestartRequired 是否需要重启 0不需要，1需要
     */
    public Long getRestartRequired() {
        return this.RestartRequired;
    }

    /**
     * Set 是否需要重启 0不需要，1需要
     * @param RestartRequired 是否需要重启 0不需要，1需要
     */
    public void setRestartRequired(Long RestartRequired) {
        this.RestartRequired = RestartRequired;
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

    /**
     * Get 机器类型信息 
     * @return MachineType 机器类型信息
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 机器类型信息
     * @param MachineType 机器类型信息
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get 修复任务是否创建了快照： 0-未创建，其他-已创建 
     * @return HasSnapshot 修复任务是否创建了快照： 0-未创建，其他-已创建
     */
    public Long getHasSnapshot() {
        return this.HasSnapshot;
    }

    /**
     * Set 修复任务是否创建了快照： 0-未创建，其他-已创建
     * @param HasSnapshot 修复任务是否创建了快照： 0-未创建，其他-已创建
     */
    public void setHasSnapshot(Long HasSnapshot) {
        this.HasSnapshot = HasSnapshot;
    }

    public PatchEffectHostList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PatchEffectHostList(PatchEffectHostList source) {
        if (source.HostVersion != null) {
            this.HostVersion = new Long(source.HostVersion);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.FirstScanTime != null) {
            this.FirstScanTime = new String(source.FirstScanTime);
        }
        if (source.LatestScanTime != null) {
            this.LatestScanTime = new String(source.LatestScanTime);
        }
        if (source.FixStatus != null) {
            this.FixStatus = new Long(source.FixStatus);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.LatestFixTime != null) {
            this.LatestFixTime = new String(source.LatestFixTime);
        }
        if (source.KbId != null) {
            this.KbId = new Long(source.KbId);
        }
        if (source.RestartRequired != null) {
            this.RestartRequired = new Long(source.RestartRequired);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.HasSnapshot != null) {
            this.HasSnapshot = new Long(source.HasSnapshot);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostVersion", this.HostVersion);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "FirstScanTime", this.FirstScanTime);
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);
        this.setParamSimple(map, prefix + "FixStatus", this.FixStatus);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LatestFixTime", this.LatestFixTime);
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "RestartRequired", this.RestartRequired);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "HasSnapshot", this.HasSnapshot);

    }
}

