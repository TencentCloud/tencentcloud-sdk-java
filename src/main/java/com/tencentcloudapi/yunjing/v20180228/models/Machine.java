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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Machine extends AbstractModel{

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
    * 主机状态。
<li>OFFLINE: 离线  </li>
<li>ONLINE: 在线</li>
<li>MACHINE_STOPPED: 已关机</li>
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * 云镜客户端唯一Uuid，若客户端长时间不在线将返回空字符。
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

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
    * 是否是专业版。
<li>true： 是</li>
<li>false：否</li>
    */
    @SerializedName("IsProVersion")
    @Expose
    private Boolean IsProVersion;

    /**
    * 主机外网IP。
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * 主机状态。
<li>POSTPAY: 表示后付费，即按量计费  </li>
<li>PREPAY: 表示预付费，即包年包月</li>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 木马数。
    */
    @SerializedName("MalwareNum")
    @Expose
    private Long MalwareNum;

    /**
    * 标签信息
    */
    @SerializedName("Tag")
    @Expose
    private MachineTag [] Tag;

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
    * 地域信息
    */
    @SerializedName("RegionInfo")
    @Expose
    private RegionInfo RegionInfo;

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
     * Get 主机状态。
<li>OFFLINE: 离线  </li>
<li>ONLINE: 在线</li>
<li>MACHINE_STOPPED: 已关机</li> 
     * @return MachineStatus 主机状态。
<li>OFFLINE: 离线  </li>
<li>ONLINE: 在线</li>
<li>MACHINE_STOPPED: 已关机</li>
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set 主机状态。
<li>OFFLINE: 离线  </li>
<li>ONLINE: 在线</li>
<li>MACHINE_STOPPED: 已关机</li>
     * @param MachineStatus 主机状态。
<li>OFFLINE: 离线  </li>
<li>ONLINE: 在线</li>
<li>MACHINE_STOPPED: 已关机</li>
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * Get 云镜客户端唯一Uuid，若客户端长时间不在线将返回空字符。 
     * @return Uuid 云镜客户端唯一Uuid，若客户端长时间不在线将返回空字符。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 云镜客户端唯一Uuid，若客户端长时间不在线将返回空字符。
     * @param Uuid 云镜客户端唯一Uuid，若客户端长时间不在线将返回空字符。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
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
     * Get 是否是专业版。
<li>true： 是</li>
<li>false：否</li> 
     * @return IsProVersion 是否是专业版。
<li>true： 是</li>
<li>false：否</li>
     */
    public Boolean getIsProVersion() {
        return this.IsProVersion;
    }

    /**
     * Set 是否是专业版。
<li>true： 是</li>
<li>false：否</li>
     * @param IsProVersion 是否是专业版。
<li>true： 是</li>
<li>false：否</li>
     */
    public void setIsProVersion(Boolean IsProVersion) {
        this.IsProVersion = IsProVersion;
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
     * Get 主机状态。
<li>POSTPAY: 表示后付费，即按量计费  </li>
<li>PREPAY: 表示预付费，即包年包月</li> 
     * @return PayMode 主机状态。
<li>POSTPAY: 表示后付费，即按量计费  </li>
<li>PREPAY: 表示预付费，即包年包月</li>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 主机状态。
<li>POSTPAY: 表示后付费，即按量计费  </li>
<li>PREPAY: 表示预付费，即包年包月</li>
     * @param PayMode 主机状态。
<li>POSTPAY: 表示后付费，即按量计费  </li>
<li>PREPAY: 表示预付费，即包年包月</li>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 木马数。 
     * @return MalwareNum 木马数。
     */
    public Long getMalwareNum() {
        return this.MalwareNum;
    }

    /**
     * Set 木马数。
     * @param MalwareNum 木马数。
     */
    public void setMalwareNum(Long MalwareNum) {
        this.MalwareNum = MalwareNum;
    }

    /**
     * Get 标签信息 
     * @return Tag 标签信息
     */
    public MachineTag [] getTag() {
        return this.Tag;
    }

    /**
     * Set 标签信息
     * @param Tag 标签信息
     */
    public void setTag(MachineTag [] Tag) {
        this.Tag = Tag;
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
     * Get 地域信息 
     * @return RegionInfo 地域信息
     */
    public RegionInfo getRegionInfo() {
        return this.RegionInfo;
    }

    /**
     * Set 地域信息
     * @param RegionInfo 地域信息
     */
    public void setRegionInfo(RegionInfo RegionInfo) {
        this.RegionInfo = RegionInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineOs", this.MachineOs);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "VulNum", this.VulNum);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "IsProVersion", this.IsProVersion);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "MalwareNum", this.MalwareNum);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "BaselineNum", this.BaselineNum);
        this.setParamSimple(map, prefix + "CyberAttackNum", this.CyberAttackNum);
        this.setParamSimple(map, prefix + "SecurityStatus", this.SecurityStatus);
        this.setParamSimple(map, prefix + "InvasionNum", this.InvasionNum);
        this.setParamObj(map, prefix + "RegionInfo.", this.RegionInfo);

    }
}

