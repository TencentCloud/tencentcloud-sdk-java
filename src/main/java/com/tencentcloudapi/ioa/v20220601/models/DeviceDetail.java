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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceDetail extends AbstractModel {

    /**
    * 设备ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 设备唯一标识码，在ioa中每个设备有唯一标识码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mid")
    @Expose
    private String Mid;

    /**
    * 终端名（设备名）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 设备所在分组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * OS平台，0：Windows 、1： Linux、 2：macOS 、4： Android、 5: iOS。默认是0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

    /**
    * 设备IP地址（出口IP）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 在线状态，2：在线、0或者1:离线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OnlineStatus")
    @Expose
    private Long OnlineStatus;

    /**
    * 客户端版本号-大整数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 客户端版本号-点分字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrVersion")
    @Expose
    private String StrVersion;

    /**
    * 首次在线时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Itime")
    @Expose
    private String Itime;

    /**
    * 最后一次在线时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnActiveTime")
    @Expose
    private String ConnActiveTime;

    /**
    * 设备是否加锁 ，1：锁定 0或者2：未锁定。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Locked")
    @Expose
    private Long Locked;

    /**
    * 设备本地IP列表, 包括IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalIpList")
    @Expose
    private String LocalIpList;

    /**
    * 宿主机id（需要宿主机也安装iOA才能显示）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostId")
    @Expose
    private Long HostId;

    /**
    * 设备所属分组名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 设备所属分组路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupNamePath")
    @Expose
    private String GroupNamePath;

    /**
    * 未修复高危漏洞数(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CriticalVulListCount")
    @Expose
    private Long CriticalVulListCount;

    /**
    * 设备名，和Name相同
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComputerName")
    @Expose
    private String ComputerName;

    /**
    * 登录域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * MAC地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MacAddr")
    @Expose
    private String MacAddr;

    /**
    * 漏洞数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulCount")
    @Expose
    private Long VulCount;

    /**
    * 病毒风险数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * 病毒库版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirusVer")
    @Expose
    private String VirusVer;

    /**
    * 漏洞库版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulVersion")
    @Expose
    private String VulVersion;

    /**
    * 系统修复引擎版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SysRepVersion")
    @Expose
    private String SysRepVersion;

    /**
    * 高危补丁列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulCriticalList")
    @Expose
    private String [] VulCriticalList;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
    * 终端用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 防火墙状态，不等于0表示开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirewallStatus")
    @Expose
    private Long FirewallStatus;

    /**
    * SN序列号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SerialNum")
    @Expose
    private String SerialNum;

    /**
    * 设备管控策略版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceStrategyVer")
    @Expose
    private String DeviceStrategyVer;

    /**
    * NGN策略版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NGNStrategyVer")
    @Expose
    private String NGNStrategyVer;

    /**
    * 最近登录账户的账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IOAUserName")
    @Expose
    private String IOAUserName;

    /**
    * 设备管控新策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceNewStrategyVer")
    @Expose
    private String DeviceNewStrategyVer;

    /**
    * NGN策略新版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NGNNewStrategyVer")
    @Expose
    private String NGNNewStrategyVer;

    /**
    * 宿主机名称（需要宿主机也安装iOA才能显示）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 主板序列号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BaseBoardSn")
    @Expose
    private String BaseBoardSn;

    /**
    * 绑定账户名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountUsers")
    @Expose
    private String AccountUsers;

    /**
    * 身份策略版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdentityStrategyVer")
    @Expose
    private String IdentityStrategyVer;

    /**
    * 身份策略新版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdentityNewStrategyVer")
    @Expose
    private String IdentityNewStrategyVer;

    /**
    * 最近登录账号部门
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountGroupName")
    @Expose
    private String AccountGroupName;

    /**
    * 最近登录账户的姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 账号组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountGroupId")
    @Expose
    private Long AccountGroupId;

    /**
     * Get 设备ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 设备唯一标识码，在ioa中每个设备有唯一标识码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mid 设备唯一标识码，在ioa中每个设备有唯一标识码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMid() {
        return this.Mid;
    }

    /**
     * Set 设备唯一标识码，在ioa中每个设备有唯一标识码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mid 设备唯一标识码，在ioa中每个设备有唯一标识码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMid(String Mid) {
        this.Mid = Mid;
    }

    /**
     * Get 终端名（设备名）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 终端名（设备名）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 终端名（设备名）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 终端名（设备名）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 设备所在分组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 设备所在分组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 设备所在分组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 设备所在分组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get OS平台，0：Windows 、1： Linux、 2：macOS 、4： Android、 5: iOS。默认是0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OsType OS平台，0：Windows 、1： Linux、 2：macOS 、4： Android、 5: iOS。默认是0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set OS平台，0：Windows 、1： Linux、 2：macOS 、4： Android、 5: iOS。默认是0
注意：此字段可能返回 null，表示取不到有效值。
     * @param OsType OS平台，0：Windows 、1： Linux、 2：macOS 、4： Android、 5: iOS。默认是0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
    }

    /**
     * Get 设备IP地址（出口IP）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ip 设备IP地址（出口IP）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 设备IP地址（出口IP）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ip 设备IP地址（出口IP）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 在线状态，2：在线、0或者1:离线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OnlineStatus 在线状态，2：在线、0或者1:离线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOnlineStatus() {
        return this.OnlineStatus;
    }

    /**
     * Set 在线状态，2：在线、0或者1:离线
注意：此字段可能返回 null，表示取不到有效值。
     * @param OnlineStatus 在线状态，2：在线、0或者1:离线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOnlineStatus(Long OnlineStatus) {
        this.OnlineStatus = OnlineStatus;
    }

    /**
     * Get 客户端版本号-大整数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 客户端版本号-大整数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 客户端版本号-大整数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 客户端版本号-大整数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 客户端版本号-点分字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrVersion 客户端版本号-点分字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStrVersion() {
        return this.StrVersion;
    }

    /**
     * Set 客户端版本号-点分字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrVersion 客户端版本号-点分字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrVersion(String StrVersion) {
        this.StrVersion = StrVersion;
    }

    /**
     * Get 首次在线时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Itime 首次在线时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getItime() {
        return this.Itime;
    }

    /**
     * Set 首次在线时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Itime 首次在线时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItime(String Itime) {
        this.Itime = Itime;
    }

    /**
     * Get 最后一次在线时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnActiveTime 最后一次在线时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConnActiveTime() {
        return this.ConnActiveTime;
    }

    /**
     * Set 最后一次在线时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnActiveTime 最后一次在线时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnActiveTime(String ConnActiveTime) {
        this.ConnActiveTime = ConnActiveTime;
    }

    /**
     * Get 设备是否加锁 ，1：锁定 0或者2：未锁定。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Locked 设备是否加锁 ，1：锁定 0或者2：未锁定。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLocked() {
        return this.Locked;
    }

    /**
     * Set 设备是否加锁 ，1：锁定 0或者2：未锁定。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Locked 设备是否加锁 ，1：锁定 0或者2：未锁定。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocked(Long Locked) {
        this.Locked = Locked;
    }

    /**
     * Get 设备本地IP列表, 包括IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalIpList 设备本地IP列表, 包括IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocalIpList() {
        return this.LocalIpList;
    }

    /**
     * Set 设备本地IP列表, 包括IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalIpList 设备本地IP列表, 包括IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalIpList(String LocalIpList) {
        this.LocalIpList = LocalIpList;
    }

    /**
     * Get 宿主机id（需要宿主机也安装iOA才能显示）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostId 宿主机id（需要宿主机也安装iOA才能显示）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHostId() {
        return this.HostId;
    }

    /**
     * Set 宿主机id（需要宿主机也安装iOA才能显示）
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostId 宿主机id（需要宿主机也安装iOA才能显示）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostId(Long HostId) {
        this.HostId = HostId;
    }

    /**
     * Get 设备所属分组名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName 设备所属分组名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 设备所属分组名
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 设备所属分组名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 设备所属分组路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupNamePath 设备所属分组路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupNamePath() {
        return this.GroupNamePath;
    }

    /**
     * Set 设备所属分组路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupNamePath 设备所属分组路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupNamePath(String GroupNamePath) {
        this.GroupNamePath = GroupNamePath;
    }

    /**
     * Get 未修复高危漏洞数(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CriticalVulListCount 未修复高危漏洞数(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCriticalVulListCount() {
        return this.CriticalVulListCount;
    }

    /**
     * Set 未修复高危漏洞数(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     * @param CriticalVulListCount 未修复高危漏洞数(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCriticalVulListCount(Long CriticalVulListCount) {
        this.CriticalVulListCount = CriticalVulListCount;
    }

    /**
     * Get 设备名，和Name相同
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComputerName 设备名，和Name相同
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComputerName() {
        return this.ComputerName;
    }

    /**
     * Set 设备名，和Name相同
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComputerName 设备名，和Name相同
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComputerName(String ComputerName) {
        this.ComputerName = ComputerName;
    }

    /**
     * Get 登录域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainName 登录域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 登录域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainName 登录域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get MAC地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MacAddr MAC地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMacAddr() {
        return this.MacAddr;
    }

    /**
     * Set MAC地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param MacAddr MAC地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMacAddr(String MacAddr) {
        this.MacAddr = MacAddr;
    }

    /**
     * Get 漏洞数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulCount 漏洞数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVulCount() {
        return this.VulCount;
    }

    /**
     * Set 漏洞数
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulCount 漏洞数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulCount(Long VulCount) {
        this.VulCount = VulCount;
    }

    /**
     * Get 病毒风险数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskCount 病毒风险数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set 病毒风险数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskCount 病毒风险数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get 病毒库版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirusVer 病毒库版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirusVer() {
        return this.VirusVer;
    }

    /**
     * Set 病毒库版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirusVer 病毒库版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirusVer(String VirusVer) {
        this.VirusVer = VirusVer;
    }

    /**
     * Get 漏洞库版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulVersion 漏洞库版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVulVersion() {
        return this.VulVersion;
    }

    /**
     * Set 漏洞库版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulVersion 漏洞库版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulVersion(String VulVersion) {
        this.VulVersion = VulVersion;
    }

    /**
     * Get 系统修复引擎版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SysRepVersion 系统修复引擎版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSysRepVersion() {
        return this.SysRepVersion;
    }

    /**
     * Set 系统修复引擎版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param SysRepVersion 系统修复引擎版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSysRepVersion(String SysRepVersion) {
        this.SysRepVersion = SysRepVersion;
    }

    /**
     * Get 高危补丁列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulCriticalList 高危补丁列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getVulCriticalList() {
        return this.VulCriticalList;
    }

    /**
     * Set 高危补丁列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulCriticalList 高危补丁列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulCriticalList(String [] VulCriticalList) {
        this.VulCriticalList = VulCriticalList;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 终端用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 终端用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 终端用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 终端用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 防火墙状态，不等于0表示开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirewallStatus 防火墙状态，不等于0表示开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFirewallStatus() {
        return this.FirewallStatus;
    }

    /**
     * Set 防火墙状态，不等于0表示开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirewallStatus 防火墙状态，不等于0表示开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirewallStatus(Long FirewallStatus) {
        this.FirewallStatus = FirewallStatus;
    }

    /**
     * Get SN序列号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SerialNum SN序列号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSerialNum() {
        return this.SerialNum;
    }

    /**
     * Set SN序列号
注意：此字段可能返回 null，表示取不到有效值。
     * @param SerialNum SN序列号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSerialNum(String SerialNum) {
        this.SerialNum = SerialNum;
    }

    /**
     * Get 设备管控策略版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceStrategyVer 设备管控策略版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceStrategyVer() {
        return this.DeviceStrategyVer;
    }

    /**
     * Set 设备管控策略版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceStrategyVer 设备管控策略版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceStrategyVer(String DeviceStrategyVer) {
        this.DeviceStrategyVer = DeviceStrategyVer;
    }

    /**
     * Get NGN策略版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NGNStrategyVer NGN策略版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNGNStrategyVer() {
        return this.NGNStrategyVer;
    }

    /**
     * Set NGN策略版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param NGNStrategyVer NGN策略版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNGNStrategyVer(String NGNStrategyVer) {
        this.NGNStrategyVer = NGNStrategyVer;
    }

    /**
     * Get 最近登录账户的账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IOAUserName 最近登录账户的账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIOAUserName() {
        return this.IOAUserName;
    }

    /**
     * Set 最近登录账户的账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param IOAUserName 最近登录账户的账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIOAUserName(String IOAUserName) {
        this.IOAUserName = IOAUserName;
    }

    /**
     * Get 设备管控新策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceNewStrategyVer 设备管控新策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceNewStrategyVer() {
        return this.DeviceNewStrategyVer;
    }

    /**
     * Set 设备管控新策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceNewStrategyVer 设备管控新策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceNewStrategyVer(String DeviceNewStrategyVer) {
        this.DeviceNewStrategyVer = DeviceNewStrategyVer;
    }

    /**
     * Get NGN策略新版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NGNNewStrategyVer NGN策略新版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNGNNewStrategyVer() {
        return this.NGNNewStrategyVer;
    }

    /**
     * Set NGN策略新版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param NGNNewStrategyVer NGN策略新版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNGNNewStrategyVer(String NGNNewStrategyVer) {
        this.NGNNewStrategyVer = NGNNewStrategyVer;
    }

    /**
     * Get 宿主机名称（需要宿主机也安装iOA才能显示）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostName 宿主机名称（需要宿主机也安装iOA才能显示）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 宿主机名称（需要宿主机也安装iOA才能显示）
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostName 宿主机名称（需要宿主机也安装iOA才能显示）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 主板序列号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BaseBoardSn 主板序列号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBaseBoardSn() {
        return this.BaseBoardSn;
    }

    /**
     * Set 主板序列号
注意：此字段可能返回 null，表示取不到有效值。
     * @param BaseBoardSn 主板序列号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBaseBoardSn(String BaseBoardSn) {
        this.BaseBoardSn = BaseBoardSn;
    }

    /**
     * Get 绑定账户名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountUsers 绑定账户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountUsers() {
        return this.AccountUsers;
    }

    /**
     * Set 绑定账户名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountUsers 绑定账户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountUsers(String AccountUsers) {
        this.AccountUsers = AccountUsers;
    }

    /**
     * Get 身份策略版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdentityStrategyVer 身份策略版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdentityStrategyVer() {
        return this.IdentityStrategyVer;
    }

    /**
     * Set 身份策略版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdentityStrategyVer 身份策略版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdentityStrategyVer(String IdentityStrategyVer) {
        this.IdentityStrategyVer = IdentityStrategyVer;
    }

    /**
     * Get 身份策略新版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdentityNewStrategyVer 身份策略新版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdentityNewStrategyVer() {
        return this.IdentityNewStrategyVer;
    }

    /**
     * Set 身份策略新版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdentityNewStrategyVer 身份策略新版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdentityNewStrategyVer(String IdentityNewStrategyVer) {
        this.IdentityNewStrategyVer = IdentityNewStrategyVer;
    }

    /**
     * Get 最近登录账号部门
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountGroupName 最近登录账号部门
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountGroupName() {
        return this.AccountGroupName;
    }

    /**
     * Set 最近登录账号部门
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountGroupName 最近登录账号部门
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountGroupName(String AccountGroupName) {
        this.AccountGroupName = AccountGroupName;
    }

    /**
     * Get 最近登录账户的姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountName 最近登录账户的姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 最近登录账户的姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountName 最近登录账户的姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 账号组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountGroupId 账号组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set 账号组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountGroupId 账号组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountGroupId(Long AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    public DeviceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceDetail(DeviceDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Mid != null) {
            this.Mid = new String(source.Mid);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.OsType != null) {
            this.OsType = new Long(source.OsType);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.OnlineStatus != null) {
            this.OnlineStatus = new Long(source.OnlineStatus);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.StrVersion != null) {
            this.StrVersion = new String(source.StrVersion);
        }
        if (source.Itime != null) {
            this.Itime = new String(source.Itime);
        }
        if (source.ConnActiveTime != null) {
            this.ConnActiveTime = new String(source.ConnActiveTime);
        }
        if (source.Locked != null) {
            this.Locked = new Long(source.Locked);
        }
        if (source.LocalIpList != null) {
            this.LocalIpList = new String(source.LocalIpList);
        }
        if (source.HostId != null) {
            this.HostId = new Long(source.HostId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupNamePath != null) {
            this.GroupNamePath = new String(source.GroupNamePath);
        }
        if (source.CriticalVulListCount != null) {
            this.CriticalVulListCount = new Long(source.CriticalVulListCount);
        }
        if (source.ComputerName != null) {
            this.ComputerName = new String(source.ComputerName);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.MacAddr != null) {
            this.MacAddr = new String(source.MacAddr);
        }
        if (source.VulCount != null) {
            this.VulCount = new Long(source.VulCount);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.VirusVer != null) {
            this.VirusVer = new String(source.VirusVer);
        }
        if (source.VulVersion != null) {
            this.VulVersion = new String(source.VulVersion);
        }
        if (source.SysRepVersion != null) {
            this.SysRepVersion = new String(source.SysRepVersion);
        }
        if (source.VulCriticalList != null) {
            this.VulCriticalList = new String[source.VulCriticalList.length];
            for (int i = 0; i < source.VulCriticalList.length; i++) {
                this.VulCriticalList[i] = new String(source.VulCriticalList[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new String(source.Tags);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.FirewallStatus != null) {
            this.FirewallStatus = new Long(source.FirewallStatus);
        }
        if (source.SerialNum != null) {
            this.SerialNum = new String(source.SerialNum);
        }
        if (source.DeviceStrategyVer != null) {
            this.DeviceStrategyVer = new String(source.DeviceStrategyVer);
        }
        if (source.NGNStrategyVer != null) {
            this.NGNStrategyVer = new String(source.NGNStrategyVer);
        }
        if (source.IOAUserName != null) {
            this.IOAUserName = new String(source.IOAUserName);
        }
        if (source.DeviceNewStrategyVer != null) {
            this.DeviceNewStrategyVer = new String(source.DeviceNewStrategyVer);
        }
        if (source.NGNNewStrategyVer != null) {
            this.NGNNewStrategyVer = new String(source.NGNNewStrategyVer);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.BaseBoardSn != null) {
            this.BaseBoardSn = new String(source.BaseBoardSn);
        }
        if (source.AccountUsers != null) {
            this.AccountUsers = new String(source.AccountUsers);
        }
        if (source.IdentityStrategyVer != null) {
            this.IdentityStrategyVer = new String(source.IdentityStrategyVer);
        }
        if (source.IdentityNewStrategyVer != null) {
            this.IdentityNewStrategyVer = new String(source.IdentityNewStrategyVer);
        }
        if (source.AccountGroupName != null) {
            this.AccountGroupName = new String(source.AccountGroupName);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new Long(source.AccountGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Mid", this.Mid);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "OnlineStatus", this.OnlineStatus);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "StrVersion", this.StrVersion);
        this.setParamSimple(map, prefix + "Itime", this.Itime);
        this.setParamSimple(map, prefix + "ConnActiveTime", this.ConnActiveTime);
        this.setParamSimple(map, prefix + "Locked", this.Locked);
        this.setParamSimple(map, prefix + "LocalIpList", this.LocalIpList);
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupNamePath", this.GroupNamePath);
        this.setParamSimple(map, prefix + "CriticalVulListCount", this.CriticalVulListCount);
        this.setParamSimple(map, prefix + "ComputerName", this.ComputerName);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "MacAddr", this.MacAddr);
        this.setParamSimple(map, prefix + "VulCount", this.VulCount);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "VirusVer", this.VirusVer);
        this.setParamSimple(map, prefix + "VulVersion", this.VulVersion);
        this.setParamSimple(map, prefix + "SysRepVersion", this.SysRepVersion);
        this.setParamArraySimple(map, prefix + "VulCriticalList.", this.VulCriticalList);
        this.setParamSimple(map, prefix + "Tags", this.Tags);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "FirewallStatus", this.FirewallStatus);
        this.setParamSimple(map, prefix + "SerialNum", this.SerialNum);
        this.setParamSimple(map, prefix + "DeviceStrategyVer", this.DeviceStrategyVer);
        this.setParamSimple(map, prefix + "NGNStrategyVer", this.NGNStrategyVer);
        this.setParamSimple(map, prefix + "IOAUserName", this.IOAUserName);
        this.setParamSimple(map, prefix + "DeviceNewStrategyVer", this.DeviceNewStrategyVer);
        this.setParamSimple(map, prefix + "NGNNewStrategyVer", this.NGNNewStrategyVer);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "BaseBoardSn", this.BaseBoardSn);
        this.setParamSimple(map, prefix + "AccountUsers", this.AccountUsers);
        this.setParamSimple(map, prefix + "IdentityStrategyVer", this.IdentityStrategyVer);
        this.setParamSimple(map, prefix + "IdentityNewStrategyVer", this.IdentityNewStrategyVer);
        this.setParamSimple(map, prefix + "AccountGroupName", this.AccountGroupName);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);

    }
}

