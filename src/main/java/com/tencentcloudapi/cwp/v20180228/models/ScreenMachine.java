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

public class ScreenMachine extends AbstractModel {

    /**
    * 主机名称。
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 主机系统。
    */
    @SerializedName("MachineOs")
    @Expose
    private String MachineOs;

    /**
    * 主机安全Uuid，若客户端长时间不在线将返回空字符。
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 大屏主机状态 0：未安装agent，1：离线状态，2:离线-风险，3：离线-严重
4：安装设备-正常，5：安装设备-正常 且是专业版或旗舰版，6：安装设备-风险（网络攻击事件>0） ，
 7：安装设备-风险（网络攻击事件>0 且是专业版或旗舰版，8：安装设备-严重（入侵检测事件>0），
9：安装设备-严重（入侵检测事件>0）且是专业版或旗舰版
    */
    @SerializedName("MachineStatus")
    @Expose
    private Long MachineStatus;

    /**
    * CVM或BM机器唯一Uuid。
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 漏洞数。
    */
    @SerializedName("VulNum")
    @Expose
    private Long VulNum;

    /**
    * 主机IP。
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 主机外网IP。
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * 基线风险数。
    */
    @SerializedName("BaselineNum")
    @Expose
    private Long BaselineNum;

    /**
    * 网络风险数。
    */
    @SerializedName("CyberAttackNum")
    @Expose
    private Long CyberAttackNum;

    /**
    * 风险状态。
<li>SAFE：安全</li>
<li>RISK：风险</li>
<li>UNKNOWN：未知</li>
    */
    @SerializedName("SecurityStatus")
    @Expose
    private String SecurityStatus;

    /**
    * 入侵事件数
    */
    @SerializedName("InvasionNum")
    @Expose
    private Long InvasionNum;

    /**
    * 机器所属专区类型 CVM 云服务器, BM 黑石, ECM 边缘计算, LH 轻量应用服务器 ,Other 混合云专区
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * cpu 负载状态
    */
    @SerializedName("CpuLoad")
    @Expose
    private String CpuLoad;

    /**
    * cpu 核数
    */
    @SerializedName("CpuSize")
    @Expose
    private Float CpuSize;

    /**
    * 硬盘使用率 %
    */
    @SerializedName("DiskLoad")
    @Expose
    private String DiskLoad;

    /**
    * 硬盘容量GB
    */
    @SerializedName("DiskSize")
    @Expose
    private Float DiskSize;

    /**
    * 内存负载率%
    */
    @SerializedName("MemLoad")
    @Expose
    private String MemLoad;

    /**
    * 内存容量 GB
    */
    @SerializedName("MemSize")
    @Expose
    private Float MemSize;

    /**
    * 内核版本
    */
    @SerializedName("CoreVersion")
    @Expose
    private String CoreVersion;

    /**
    * 附加信息
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get 主机名称。 
     * @return MachineName 主机名称。
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 主机名称。
     * @param MachineName 主机名称。
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 主机系统。 
     * @return MachineOs 主机系统。
     */
    public String getMachineOs() {
        return this.MachineOs;
    }

    /**
     * Set 主机系统。
     * @param MachineOs 主机系统。
     */
    public void setMachineOs(String MachineOs) {
        this.MachineOs = MachineOs;
    }

    /**
     * Get 主机安全Uuid，若客户端长时间不在线将返回空字符。 
     * @return Uuid 主机安全Uuid，若客户端长时间不在线将返回空字符。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机安全Uuid，若客户端长时间不在线将返回空字符。
     * @param Uuid 主机安全Uuid，若客户端长时间不在线将返回空字符。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 大屏主机状态 0：未安装agent，1：离线状态，2:离线-风险，3：离线-严重
4：安装设备-正常，5：安装设备-正常 且是专业版或旗舰版，6：安装设备-风险（网络攻击事件>0） ，
 7：安装设备-风险（网络攻击事件>0 且是专业版或旗舰版，8：安装设备-严重（入侵检测事件>0），
9：安装设备-严重（入侵检测事件>0）且是专业版或旗舰版 
     * @return MachineStatus 大屏主机状态 0：未安装agent，1：离线状态，2:离线-风险，3：离线-严重
4：安装设备-正常，5：安装设备-正常 且是专业版或旗舰版，6：安装设备-风险（网络攻击事件>0） ，
 7：安装设备-风险（网络攻击事件>0 且是专业版或旗舰版，8：安装设备-严重（入侵检测事件>0），
9：安装设备-严重（入侵检测事件>0）且是专业版或旗舰版
     */
    public Long getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set 大屏主机状态 0：未安装agent，1：离线状态，2:离线-风险，3：离线-严重
4：安装设备-正常，5：安装设备-正常 且是专业版或旗舰版，6：安装设备-风险（网络攻击事件>0） ，
 7：安装设备-风险（网络攻击事件>0 且是专业版或旗舰版，8：安装设备-严重（入侵检测事件>0），
9：安装设备-严重（入侵检测事件>0）且是专业版或旗舰版
     * @param MachineStatus 大屏主机状态 0：未安装agent，1：离线状态，2:离线-风险，3：离线-严重
4：安装设备-正常，5：安装设备-正常 且是专业版或旗舰版，6：安装设备-风险（网络攻击事件>0） ，
 7：安装设备-风险（网络攻击事件>0 且是专业版或旗舰版，8：安装设备-严重（入侵检测事件>0），
9：安装设备-严重（入侵检测事件>0）且是专业版或旗舰版
     */
    public void setMachineStatus(Long MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * Get CVM或BM机器唯一Uuid。 
     * @return Quuid CVM或BM机器唯一Uuid。
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set CVM或BM机器唯一Uuid。
     * @param Quuid CVM或BM机器唯一Uuid。
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 漏洞数。 
     * @return VulNum 漏洞数。
     */
    public Long getVulNum() {
        return this.VulNum;
    }

    /**
     * Set 漏洞数。
     * @param VulNum 漏洞数。
     */
    public void setVulNum(Long VulNum) {
        this.VulNum = VulNum;
    }

    /**
     * Get 主机IP。 
     * @return MachineIp 主机IP。
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set 主机IP。
     * @param MachineIp 主机IP。
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get 主机外网IP。 
     * @return MachineWanIp 主机外网IP。
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set 主机外网IP。
     * @param MachineWanIp 主机外网IP。
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get 基线风险数。 
     * @return BaselineNum 基线风险数。
     */
    public Long getBaselineNum() {
        return this.BaselineNum;
    }

    /**
     * Set 基线风险数。
     * @param BaselineNum 基线风险数。
     */
    public void setBaselineNum(Long BaselineNum) {
        this.BaselineNum = BaselineNum;
    }

    /**
     * Get 网络风险数。 
     * @return CyberAttackNum 网络风险数。
     */
    public Long getCyberAttackNum() {
        return this.CyberAttackNum;
    }

    /**
     * Set 网络风险数。
     * @param CyberAttackNum 网络风险数。
     */
    public void setCyberAttackNum(Long CyberAttackNum) {
        this.CyberAttackNum = CyberAttackNum;
    }

    /**
     * Get 风险状态。
<li>SAFE：安全</li>
<li>RISK：风险</li>
<li>UNKNOWN：未知</li> 
     * @return SecurityStatus 风险状态。
<li>SAFE：安全</li>
<li>RISK：风险</li>
<li>UNKNOWN：未知</li>
     */
    public String getSecurityStatus() {
        return this.SecurityStatus;
    }

    /**
     * Set 风险状态。
<li>SAFE：安全</li>
<li>RISK：风险</li>
<li>UNKNOWN：未知</li>
     * @param SecurityStatus 风险状态。
<li>SAFE：安全</li>
<li>RISK：风险</li>
<li>UNKNOWN：未知</li>
     */
    public void setSecurityStatus(String SecurityStatus) {
        this.SecurityStatus = SecurityStatus;
    }

    /**
     * Get 入侵事件数 
     * @return InvasionNum 入侵事件数
     */
    public Long getInvasionNum() {
        return this.InvasionNum;
    }

    /**
     * Set 入侵事件数
     * @param InvasionNum 入侵事件数
     */
    public void setInvasionNum(Long InvasionNum) {
        this.InvasionNum = InvasionNum;
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

    /**
     * Get cpu 负载状态 
     * @return CpuLoad cpu 负载状态
     */
    public String getCpuLoad() {
        return this.CpuLoad;
    }

    /**
     * Set cpu 负载状态
     * @param CpuLoad cpu 负载状态
     */
    public void setCpuLoad(String CpuLoad) {
        this.CpuLoad = CpuLoad;
    }

    /**
     * Get cpu 核数 
     * @return CpuSize cpu 核数
     */
    public Float getCpuSize() {
        return this.CpuSize;
    }

    /**
     * Set cpu 核数
     * @param CpuSize cpu 核数
     */
    public void setCpuSize(Float CpuSize) {
        this.CpuSize = CpuSize;
    }

    /**
     * Get 硬盘使用率 % 
     * @return DiskLoad 硬盘使用率 %
     */
    public String getDiskLoad() {
        return this.DiskLoad;
    }

    /**
     * Set 硬盘使用率 %
     * @param DiskLoad 硬盘使用率 %
     */
    public void setDiskLoad(String DiskLoad) {
        this.DiskLoad = DiskLoad;
    }

    /**
     * Get 硬盘容量GB 
     * @return DiskSize 硬盘容量GB
     */
    public Float getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 硬盘容量GB
     * @param DiskSize 硬盘容量GB
     */
    public void setDiskSize(Float DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 内存负载率% 
     * @return MemLoad 内存负载率%
     */
    public String getMemLoad() {
        return this.MemLoad;
    }

    /**
     * Set 内存负载率%
     * @param MemLoad 内存负载率%
     */
    public void setMemLoad(String MemLoad) {
        this.MemLoad = MemLoad;
    }

    /**
     * Get 内存容量 GB 
     * @return MemSize 内存容量 GB
     */
    public Float getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 内存容量 GB
     * @param MemSize 内存容量 GB
     */
    public void setMemSize(Float MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 内核版本 
     * @return CoreVersion 内核版本
     */
    public String getCoreVersion() {
        return this.CoreVersion;
    }

    /**
     * Set 内核版本
     * @param CoreVersion 内核版本
     */
    public void setCoreVersion(String CoreVersion) {
        this.CoreVersion = CoreVersion;
    }

    /**
     * Get 附加信息 
     * @return MachineExtraInfo 附加信息
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set 附加信息
     * @param MachineExtraInfo 附加信息
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    public ScreenMachine() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenMachine(ScreenMachine source) {
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachineOs != null) {
            this.MachineOs = new String(source.MachineOs);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.MachineStatus != null) {
            this.MachineStatus = new Long(source.MachineStatus);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.VulNum != null) {
            this.VulNum = new Long(source.VulNum);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.BaselineNum != null) {
            this.BaselineNum = new Long(source.BaselineNum);
        }
        if (source.CyberAttackNum != null) {
            this.CyberAttackNum = new Long(source.CyberAttackNum);
        }
        if (source.SecurityStatus != null) {
            this.SecurityStatus = new String(source.SecurityStatus);
        }
        if (source.InvasionNum != null) {
            this.InvasionNum = new Long(source.InvasionNum);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.CpuLoad != null) {
            this.CpuLoad = new String(source.CpuLoad);
        }
        if (source.CpuSize != null) {
            this.CpuSize = new Float(source.CpuSize);
        }
        if (source.DiskLoad != null) {
            this.DiskLoad = new String(source.DiskLoad);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Float(source.DiskSize);
        }
        if (source.MemLoad != null) {
            this.MemLoad = new String(source.MemLoad);
        }
        if (source.MemSize != null) {
            this.MemSize = new Float(source.MemSize);
        }
        if (source.CoreVersion != null) {
            this.CoreVersion = new String(source.CoreVersion);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineOs", this.MachineOs);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "VulNum", this.VulNum);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "BaselineNum", this.BaselineNum);
        this.setParamSimple(map, prefix + "CyberAttackNum", this.CyberAttackNum);
        this.setParamSimple(map, prefix + "SecurityStatus", this.SecurityStatus);
        this.setParamSimple(map, prefix + "InvasionNum", this.InvasionNum);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "CpuLoad", this.CpuLoad);
        this.setParamSimple(map, prefix + "CpuSize", this.CpuSize);
        this.setParamSimple(map, prefix + "DiskLoad", this.DiskLoad);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "MemLoad", this.MemLoad);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "CoreVersion", this.CoreVersion);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

