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

public class Machine extends AbstractModel {

    /**
    * <p>主机名称。</p>
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * <p>主机系统。</p>
    */
    @SerializedName("MachineOs")
    @Expose
    private String MachineOs;

    /**
    * <p>主机状态。 <li>OFFLINE: 离线 </li> <li>ONLINE: 在线</li> <li>SHUTDOWN: 已关机</li> <li>UNINSTALLED: 未防护</li></p>
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * <p>ONLINE 防护中; OFFLINE 已离线;UNINStALLED 未安装</p>
    */
    @SerializedName("AgentStatus")
    @Expose
    private String AgentStatus;

    /**
    * <p>RUNNING 运行中; STOPED 已关机; EXPIRED 待回收</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * <p>主机安全Uuid，若客户端长时间不在线将返回空字符。</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * <p>CVM或BM机器唯一Uuid。</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * <p>漏洞数。</p>
    */
    @SerializedName("VulNum")
    @Expose
    private Long VulNum;

    /**
    * <p>主机IP。</p>
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * <p>是否是专业版。</p><li>true： 是</li><li>false：否</li>
    */
    @SerializedName("IsProVersion")
    @Expose
    private Boolean IsProVersion;

    /**
    * <p>主机外网IP。</p>
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * <p>主机状态。</p><li>POSTPAY: 表示后付费，即按量计费  </li><li>PREPAY: 表示预付费，即包年包月</li>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>木马数。</p>
    */
    @SerializedName("MalwareNum")
    @Expose
    private Long MalwareNum;

    /**
    * <p>标签信息</p>
    */
    @SerializedName("Tag")
    @Expose
    private MachineTag [] Tag;

    /**
    * <p>基线风险数。</p>
    */
    @SerializedName("BaselineNum")
    @Expose
    private Long BaselineNum;

    /**
    * <p>网络风险数。</p>
    */
    @SerializedName("CyberAttackNum")
    @Expose
    private Long CyberAttackNum;

    /**
    * <p>风险状态。</p><li>SAFE：安全</li><li>RISK：风险</li><li>UNKNOWN：未知</li>
    */
    @SerializedName("SecurityStatus")
    @Expose
    private String SecurityStatus;

    /**
    * <p>入侵事件数</p>
    */
    @SerializedName("InvasionNum")
    @Expose
    private Long InvasionNum;

    /**
    * <p>地域信息</p>
    */
    @SerializedName("RegionInfo")
    @Expose
    private RegionInfo RegionInfo;

    /**
    * <p>实例状态 TERMINATED_PRO_VERSION 已销毁</p>
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * <p>防篡改 授权状态 1 授权 0 未授权</p>
    */
    @SerializedName("LicenseStatus")
    @Expose
    private Long LicenseStatus;

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>是否有资产扫描接口，0无，1有</p>
    */
    @SerializedName("HasAssetScan")
    @Expose
    private Long HasAssetScan;

    /**
    * <p>机器所属专区类型 CVM 云服务器, BM 黑石, ECM 边缘计算, LH 轻量应用服务器 ,Other 混合云专区</p>
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * <p>内核版本</p>
    */
    @SerializedName("KernelVersion")
    @Expose
    private String KernelVersion;

    /**
    * <p>防护版本：BASIC_VERSION 基础版， PRO_VERSION 专业版，Flagship 旗舰版，GENERAL_DISCOUNT 轻量版</p>
    */
    @SerializedName("ProtectType")
    @Expose
    private String ProtectType;

    /**
    * <p>云标签信息</p>
    */
    @SerializedName("CloudTags")
    @Expose
    private Tags [] CloudTags;

    /**
    * <p>是否15天内新增的主机 0：非15天内新增的主机，1：15天内增加的主机</p>
    */
    @SerializedName("IsAddedOnTheFifteen")
    @Expose
    private Long IsAddedOnTheFifteen;

    /**
    * <p>主机ip列表</p>
    */
    @SerializedName("IpList")
    @Expose
    private String IpList;

    /**
    * <p>所属网络</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>附加信息</p>
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>备注信息</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>主机安全agent版本</p>
    */
    @SerializedName("AgentVersion")
    @Expose
    private String AgentVersion;

    /**
    * <p>机器对应APPID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>安全中心付费版本</p>
    */
    @SerializedName("CSIPProtectType")
    @Expose
    private String CSIPProtectType;

    /**
     * Get <p>主机名称。</p> 
     * @return MachineName <p>主机名称。</p>
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set <p>主机名称。</p>
     * @param MachineName <p>主机名称。</p>
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get <p>主机系统。</p> 
     * @return MachineOs <p>主机系统。</p>
     */
    public String getMachineOs() {
        return this.MachineOs;
    }

    /**
     * Set <p>主机系统。</p>
     * @param MachineOs <p>主机系统。</p>
     */
    public void setMachineOs(String MachineOs) {
        this.MachineOs = MachineOs;
    }

    /**
     * Get <p>主机状态。 <li>OFFLINE: 离线 </li> <li>ONLINE: 在线</li> <li>SHUTDOWN: 已关机</li> <li>UNINSTALLED: 未防护</li></p> 
     * @return MachineStatus <p>主机状态。 <li>OFFLINE: 离线 </li> <li>ONLINE: 在线</li> <li>SHUTDOWN: 已关机</li> <li>UNINSTALLED: 未防护</li></p>
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set <p>主机状态。 <li>OFFLINE: 离线 </li> <li>ONLINE: 在线</li> <li>SHUTDOWN: 已关机</li> <li>UNINSTALLED: 未防护</li></p>
     * @param MachineStatus <p>主机状态。 <li>OFFLINE: 离线 </li> <li>ONLINE: 在线</li> <li>SHUTDOWN: 已关机</li> <li>UNINSTALLED: 未防护</li></p>
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * Get <p>ONLINE 防护中; OFFLINE 已离线;UNINStALLED 未安装</p> 
     * @return AgentStatus <p>ONLINE 防护中; OFFLINE 已离线;UNINStALLED 未安装</p>
     */
    public String getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set <p>ONLINE 防护中; OFFLINE 已离线;UNINStALLED 未安装</p>
     * @param AgentStatus <p>ONLINE 防护中; OFFLINE 已离线;UNINStALLED 未安装</p>
     */
    public void setAgentStatus(String AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get <p>RUNNING 运行中; STOPED 已关机; EXPIRED 待回收</p> 
     * @return InstanceStatus <p>RUNNING 运行中; STOPED 已关机; EXPIRED 待回收</p>
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>RUNNING 运行中; STOPED 已关机; EXPIRED 待回收</p>
     * @param InstanceStatus <p>RUNNING 运行中; STOPED 已关机; EXPIRED 待回收</p>
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>主机安全Uuid，若客户端长时间不在线将返回空字符。</p> 
     * @return Uuid <p>主机安全Uuid，若客户端长时间不在线将返回空字符。</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>主机安全Uuid，若客户端长时间不在线将返回空字符。</p>
     * @param Uuid <p>主机安全Uuid，若客户端长时间不在线将返回空字符。</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get <p>CVM或BM机器唯一Uuid。</p> 
     * @return Quuid <p>CVM或BM机器唯一Uuid。</p>
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>CVM或BM机器唯一Uuid。</p>
     * @param Quuid <p>CVM或BM机器唯一Uuid。</p>
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get <p>漏洞数。</p> 
     * @return VulNum <p>漏洞数。</p>
     */
    public Long getVulNum() {
        return this.VulNum;
    }

    /**
     * Set <p>漏洞数。</p>
     * @param VulNum <p>漏洞数。</p>
     */
    public void setVulNum(Long VulNum) {
        this.VulNum = VulNum;
    }

    /**
     * Get <p>主机IP。</p> 
     * @return MachineIp <p>主机IP。</p>
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set <p>主机IP。</p>
     * @param MachineIp <p>主机IP。</p>
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get <p>是否是专业版。</p><li>true： 是</li><li>false：否</li> 
     * @return IsProVersion <p>是否是专业版。</p><li>true： 是</li><li>false：否</li>
     */
    public Boolean getIsProVersion() {
        return this.IsProVersion;
    }

    /**
     * Set <p>是否是专业版。</p><li>true： 是</li><li>false：否</li>
     * @param IsProVersion <p>是否是专业版。</p><li>true： 是</li><li>false：否</li>
     */
    public void setIsProVersion(Boolean IsProVersion) {
        this.IsProVersion = IsProVersion;
    }

    /**
     * Get <p>主机外网IP。</p> 
     * @return MachineWanIp <p>主机外网IP。</p>
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set <p>主机外网IP。</p>
     * @param MachineWanIp <p>主机外网IP。</p>
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get <p>主机状态。</p><li>POSTPAY: 表示后付费，即按量计费  </li><li>PREPAY: 表示预付费，即包年包月</li> 
     * @return PayMode <p>主机状态。</p><li>POSTPAY: 表示后付费，即按量计费  </li><li>PREPAY: 表示预付费，即包年包月</li>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>主机状态。</p><li>POSTPAY: 表示后付费，即按量计费  </li><li>PREPAY: 表示预付费，即包年包月</li>
     * @param PayMode <p>主机状态。</p><li>POSTPAY: 表示后付费，即按量计费  </li><li>PREPAY: 表示预付费，即包年包月</li>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>木马数。</p> 
     * @return MalwareNum <p>木马数。</p>
     */
    public Long getMalwareNum() {
        return this.MalwareNum;
    }

    /**
     * Set <p>木马数。</p>
     * @param MalwareNum <p>木马数。</p>
     */
    public void setMalwareNum(Long MalwareNum) {
        this.MalwareNum = MalwareNum;
    }

    /**
     * Get <p>标签信息</p> 
     * @return Tag <p>标签信息</p>
     */
    public MachineTag [] getTag() {
        return this.Tag;
    }

    /**
     * Set <p>标签信息</p>
     * @param Tag <p>标签信息</p>
     */
    public void setTag(MachineTag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>基线风险数。</p> 
     * @return BaselineNum <p>基线风险数。</p>
     */
    public Long getBaselineNum() {
        return this.BaselineNum;
    }

    /**
     * Set <p>基线风险数。</p>
     * @param BaselineNum <p>基线风险数。</p>
     */
    public void setBaselineNum(Long BaselineNum) {
        this.BaselineNum = BaselineNum;
    }

    /**
     * Get <p>网络风险数。</p> 
     * @return CyberAttackNum <p>网络风险数。</p>
     */
    public Long getCyberAttackNum() {
        return this.CyberAttackNum;
    }

    /**
     * Set <p>网络风险数。</p>
     * @param CyberAttackNum <p>网络风险数。</p>
     */
    public void setCyberAttackNum(Long CyberAttackNum) {
        this.CyberAttackNum = CyberAttackNum;
    }

    /**
     * Get <p>风险状态。</p><li>SAFE：安全</li><li>RISK：风险</li><li>UNKNOWN：未知</li> 
     * @return SecurityStatus <p>风险状态。</p><li>SAFE：安全</li><li>RISK：风险</li><li>UNKNOWN：未知</li>
     */
    public String getSecurityStatus() {
        return this.SecurityStatus;
    }

    /**
     * Set <p>风险状态。</p><li>SAFE：安全</li><li>RISK：风险</li><li>UNKNOWN：未知</li>
     * @param SecurityStatus <p>风险状态。</p><li>SAFE：安全</li><li>RISK：风险</li><li>UNKNOWN：未知</li>
     */
    public void setSecurityStatus(String SecurityStatus) {
        this.SecurityStatus = SecurityStatus;
    }

    /**
     * Get <p>入侵事件数</p> 
     * @return InvasionNum <p>入侵事件数</p>
     */
    public Long getInvasionNum() {
        return this.InvasionNum;
    }

    /**
     * Set <p>入侵事件数</p>
     * @param InvasionNum <p>入侵事件数</p>
     */
    public void setInvasionNum(Long InvasionNum) {
        this.InvasionNum = InvasionNum;
    }

    /**
     * Get <p>地域信息</p> 
     * @return RegionInfo <p>地域信息</p>
     */
    public RegionInfo getRegionInfo() {
        return this.RegionInfo;
    }

    /**
     * Set <p>地域信息</p>
     * @param RegionInfo <p>地域信息</p>
     */
    public void setRegionInfo(RegionInfo RegionInfo) {
        this.RegionInfo = RegionInfo;
    }

    /**
     * Get <p>实例状态 TERMINATED_PRO_VERSION 已销毁</p> 
     * @return InstanceState <p>实例状态 TERMINATED_PRO_VERSION 已销毁</p>
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set <p>实例状态 TERMINATED_PRO_VERSION 已销毁</p>
     * @param InstanceState <p>实例状态 TERMINATED_PRO_VERSION 已销毁</p>
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get <p>防篡改 授权状态 1 授权 0 未授权</p> 
     * @return LicenseStatus <p>防篡改 授权状态 1 授权 0 未授权</p>
     */
    public Long getLicenseStatus() {
        return this.LicenseStatus;
    }

    /**
     * Set <p>防篡改 授权状态 1 授权 0 未授权</p>
     * @param LicenseStatus <p>防篡改 授权状态 1 授权 0 未授权</p>
     */
    public void setLicenseStatus(Long LicenseStatus) {
        this.LicenseStatus = LicenseStatus;
    }

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>是否有资产扫描接口，0无，1有</p> 
     * @return HasAssetScan <p>是否有资产扫描接口，0无，1有</p>
     */
    public Long getHasAssetScan() {
        return this.HasAssetScan;
    }

    /**
     * Set <p>是否有资产扫描接口，0无，1有</p>
     * @param HasAssetScan <p>是否有资产扫描接口，0无，1有</p>
     */
    public void setHasAssetScan(Long HasAssetScan) {
        this.HasAssetScan = HasAssetScan;
    }

    /**
     * Get <p>机器所属专区类型 CVM 云服务器, BM 黑石, ECM 边缘计算, LH 轻量应用服务器 ,Other 混合云专区</p> 
     * @return MachineType <p>机器所属专区类型 CVM 云服务器, BM 黑石, ECM 边缘计算, LH 轻量应用服务器 ,Other 混合云专区</p>
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set <p>机器所属专区类型 CVM 云服务器, BM 黑石, ECM 边缘计算, LH 轻量应用服务器 ,Other 混合云专区</p>
     * @param MachineType <p>机器所属专区类型 CVM 云服务器, BM 黑石, ECM 边缘计算, LH 轻量应用服务器 ,Other 混合云专区</p>
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get <p>内核版本</p> 
     * @return KernelVersion <p>内核版本</p>
     */
    public String getKernelVersion() {
        return this.KernelVersion;
    }

    /**
     * Set <p>内核版本</p>
     * @param KernelVersion <p>内核版本</p>
     */
    public void setKernelVersion(String KernelVersion) {
        this.KernelVersion = KernelVersion;
    }

    /**
     * Get <p>防护版本：BASIC_VERSION 基础版， PRO_VERSION 专业版，Flagship 旗舰版，GENERAL_DISCOUNT 轻量版</p> 
     * @return ProtectType <p>防护版本：BASIC_VERSION 基础版， PRO_VERSION 专业版，Flagship 旗舰版，GENERAL_DISCOUNT 轻量版</p>
     */
    public String getProtectType() {
        return this.ProtectType;
    }

    /**
     * Set <p>防护版本：BASIC_VERSION 基础版， PRO_VERSION 专业版，Flagship 旗舰版，GENERAL_DISCOUNT 轻量版</p>
     * @param ProtectType <p>防护版本：BASIC_VERSION 基础版， PRO_VERSION 专业版，Flagship 旗舰版，GENERAL_DISCOUNT 轻量版</p>
     */
    public void setProtectType(String ProtectType) {
        this.ProtectType = ProtectType;
    }

    /**
     * Get <p>云标签信息</p> 
     * @return CloudTags <p>云标签信息</p>
     */
    public Tags [] getCloudTags() {
        return this.CloudTags;
    }

    /**
     * Set <p>云标签信息</p>
     * @param CloudTags <p>云标签信息</p>
     */
    public void setCloudTags(Tags [] CloudTags) {
        this.CloudTags = CloudTags;
    }

    /**
     * Get <p>是否15天内新增的主机 0：非15天内新增的主机，1：15天内增加的主机</p> 
     * @return IsAddedOnTheFifteen <p>是否15天内新增的主机 0：非15天内新增的主机，1：15天内增加的主机</p>
     */
    public Long getIsAddedOnTheFifteen() {
        return this.IsAddedOnTheFifteen;
    }

    /**
     * Set <p>是否15天内新增的主机 0：非15天内新增的主机，1：15天内增加的主机</p>
     * @param IsAddedOnTheFifteen <p>是否15天内新增的主机 0：非15天内新增的主机，1：15天内增加的主机</p>
     */
    public void setIsAddedOnTheFifteen(Long IsAddedOnTheFifteen) {
        this.IsAddedOnTheFifteen = IsAddedOnTheFifteen;
    }

    /**
     * Get <p>主机ip列表</p> 
     * @return IpList <p>主机ip列表</p>
     */
    public String getIpList() {
        return this.IpList;
    }

    /**
     * Set <p>主机ip列表</p>
     * @param IpList <p>主机ip列表</p>
     */
    public void setIpList(String IpList) {
        this.IpList = IpList;
    }

    /**
     * Get <p>所属网络</p> 
     * @return VpcId <p>所属网络</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>所属网络</p>
     * @param VpcId <p>所属网络</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>附加信息</p> 
     * @return MachineExtraInfo <p>附加信息</p>
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set <p>附加信息</p>
     * @param MachineExtraInfo <p>附加信息</p>
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>备注信息</p> 
     * @return Remark <p>备注信息</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注信息</p>
     * @param Remark <p>备注信息</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>主机安全agent版本</p> 
     * @return AgentVersion <p>主机安全agent版本</p>
     */
    public String getAgentVersion() {
        return this.AgentVersion;
    }

    /**
     * Set <p>主机安全agent版本</p>
     * @param AgentVersion <p>主机安全agent版本</p>
     */
    public void setAgentVersion(String AgentVersion) {
        this.AgentVersion = AgentVersion;
    }

    /**
     * Get <p>机器对应APPID</p> 
     * @return AppId <p>机器对应APPID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>机器对应APPID</p>
     * @param AppId <p>机器对应APPID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>安全中心付费版本</p> 
     * @return CSIPProtectType <p>安全中心付费版本</p>
     */
    public String getCSIPProtectType() {
        return this.CSIPProtectType;
    }

    /**
     * Set <p>安全中心付费版本</p>
     * @param CSIPProtectType <p>安全中心付费版本</p>
     */
    public void setCSIPProtectType(String CSIPProtectType) {
        this.CSIPProtectType = CSIPProtectType;
    }

    public Machine() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Machine(Machine source) {
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachineOs != null) {
            this.MachineOs = new String(source.MachineOs);
        }
        if (source.MachineStatus != null) {
            this.MachineStatus = new String(source.MachineStatus);
        }
        if (source.AgentStatus != null) {
            this.AgentStatus = new String(source.AgentStatus);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
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
        if (source.IsProVersion != null) {
            this.IsProVersion = new Boolean(source.IsProVersion);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.MalwareNum != null) {
            this.MalwareNum = new Long(source.MalwareNum);
        }
        if (source.Tag != null) {
            this.Tag = new MachineTag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new MachineTag(source.Tag[i]);
            }
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
        if (source.RegionInfo != null) {
            this.RegionInfo = new RegionInfo(source.RegionInfo);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.LicenseStatus != null) {
            this.LicenseStatus = new Long(source.LicenseStatus);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.HasAssetScan != null) {
            this.HasAssetScan = new Long(source.HasAssetScan);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.KernelVersion != null) {
            this.KernelVersion = new String(source.KernelVersion);
        }
        if (source.ProtectType != null) {
            this.ProtectType = new String(source.ProtectType);
        }
        if (source.CloudTags != null) {
            this.CloudTags = new Tags[source.CloudTags.length];
            for (int i = 0; i < source.CloudTags.length; i++) {
                this.CloudTags[i] = new Tags(source.CloudTags[i]);
            }
        }
        if (source.IsAddedOnTheFifteen != null) {
            this.IsAddedOnTheFifteen = new Long(source.IsAddedOnTheFifteen);
        }
        if (source.IpList != null) {
            this.IpList = new String(source.IpList);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AgentVersion != null) {
            this.AgentVersion = new String(source.AgentVersion);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.CSIPProtectType != null) {
            this.CSIPProtectType = new String(source.CSIPProtectType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineOs", this.MachineOs);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
        this.setParamSimple(map, prefix + "AgentStatus", this.AgentStatus);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
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
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "LicenseStatus", this.LicenseStatus);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "HasAssetScan", this.HasAssetScan);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "KernelVersion", this.KernelVersion);
        this.setParamSimple(map, prefix + "ProtectType", this.ProtectType);
        this.setParamArrayObj(map, prefix + "CloudTags.", this.CloudTags);
        this.setParamSimple(map, prefix + "IsAddedOnTheFifteen", this.IsAddedOnTheFifteen);
        this.setParamSimple(map, prefix + "IpList", this.IpList);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AgentVersion", this.AgentVersion);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "CSIPProtectType", this.CSIPProtectType);

    }
}

