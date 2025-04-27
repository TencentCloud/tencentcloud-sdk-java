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
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 设备唯一标识码，在ioa中每个设备有唯一标识码
    */
    @SerializedName("Mid")
    @Expose
    private String Mid;

    /**
    * 终端名（设备名）
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 设备所在分组ID
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * OS平台，0：Windows 、1： Linux、 2：macOS 、4： Android、 5: iOS。默认是0
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

    /**
    * 设备IP地址（出口IP）
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 在线状态，2：在线、0或者1:离线
    */
    @SerializedName("OnlineStatus")
    @Expose
    private Long OnlineStatus;

    /**
    * 客户端版本号-大整数
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 客户端版本号-点分字符串
    */
    @SerializedName("StrVersion")
    @Expose
    private String StrVersion;

    /**
    * 首次在线时间
    */
    @SerializedName("Itime")
    @Expose
    private String Itime;

    /**
    * 最后一次在线时间
    */
    @SerializedName("ConnActiveTime")
    @Expose
    private String ConnActiveTime;

    /**
    * 设备是否加锁 ，1：锁定 0或者2：未锁定。
    */
    @SerializedName("Locked")
    @Expose
    private Long Locked;

    /**
    * 设备本地IP列表, 包括IP
    */
    @SerializedName("LocalIpList")
    @Expose
    private String LocalIpList;

    /**
    * 宿主机id（需要宿主机也安装iOA才能显示）
    */
    @SerializedName("HostId")
    @Expose
    private Long HostId;

    /**
    * 设备所属分组名
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 设备所属分组路径
    */
    @SerializedName("GroupNamePath")
    @Expose
    private String GroupNamePath;

    /**
    * 未修复高危漏洞数(只支持32位)
    */
    @SerializedName("CriticalVulListCount")
    @Expose
    private Long CriticalVulListCount;

    /**
    * 设备名，和Name相同
    */
    @SerializedName("ComputerName")
    @Expose
    private String ComputerName;

    /**
    * 登录域名
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * MAC地址
    */
    @SerializedName("MacAddr")
    @Expose
    private String MacAddr;

    /**
    * 漏洞数
    */
    @SerializedName("VulCount")
    @Expose
    private Long VulCount;

    /**
    * 病毒风险数
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * 病毒库版本
    */
    @SerializedName("VirusVer")
    @Expose
    private String VirusVer;

    /**
    * 漏洞库版本
    */
    @SerializedName("VulVersion")
    @Expose
    private String VulVersion;

    /**
    * 系统修复引擎版本
    */
    @SerializedName("SysRepVersion")
    @Expose
    private String SysRepVersion;

    /**
    * 高危补丁列表
    */
    @SerializedName("VulCriticalList")
    @Expose
    private String [] VulCriticalList;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
    * 终端用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 防火墙状态，不等于0表示开启
    */
    @SerializedName("FirewallStatus")
    @Expose
    private Long FirewallStatus;

    /**
    * SN序列号
    */
    @SerializedName("SerialNum")
    @Expose
    private String SerialNum;

    /**
    * 设备管控策略版本
    */
    @SerializedName("DeviceStrategyVer")
    @Expose
    private String DeviceStrategyVer;

    /**
    * NGN策略版本
    */
    @SerializedName("NGNStrategyVer")
    @Expose
    private String NGNStrategyVer;

    /**
    * 最近登录账户的账号(账号系统用户账号)
    */
    @SerializedName("IOAUserName")
    @Expose
    private String IOAUserName;

    /**
    * 设备管控新策略
    */
    @SerializedName("DeviceNewStrategyVer")
    @Expose
    private String DeviceNewStrategyVer;

    /**
    * NGN策略新版本
    */
    @SerializedName("NGNNewStrategyVer")
    @Expose
    private String NGNNewStrategyVer;

    /**
    * 宿主机名称（需要宿主机也安装iOA才能显示）
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 主板序列号
    */
    @SerializedName("BaseBoardSn")
    @Expose
    private String BaseBoardSn;

    /**
    * 绑定账户名称
    */
    @SerializedName("AccountUsers")
    @Expose
    private String AccountUsers;

    /**
    * 身份策略版本
    */
    @SerializedName("IdentityStrategyVer")
    @Expose
    private String IdentityStrategyVer;

    /**
    * 身份策略新版本
    */
    @SerializedName("IdentityNewStrategyVer")
    @Expose
    private String IdentityNewStrategyVer;

    /**
    * 最近登录账号部门
    */
    @SerializedName("AccountGroupName")
    @Expose
    private String AccountGroupName;

    /**
    * 最近登录账户的姓名(账号系统用户姓名)
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 账号组id
    */
    @SerializedName("AccountGroupId")
    @Expose
    private Long AccountGroupId;

    /**
    * 终端备注名
    */
    @SerializedName("RemarkName")
    @Expose
    private String RemarkName;

    /**
     * Get 设备ID 
     * @return Id 设备ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 设备ID
     * @param Id 设备ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 设备唯一标识码，在ioa中每个设备有唯一标识码 
     * @return Mid 设备唯一标识码，在ioa中每个设备有唯一标识码
     */
    public String getMid() {
        return this.Mid;
    }

    /**
     * Set 设备唯一标识码，在ioa中每个设备有唯一标识码
     * @param Mid 设备唯一标识码，在ioa中每个设备有唯一标识码
     */
    public void setMid(String Mid) {
        this.Mid = Mid;
    }

    /**
     * Get 终端名（设备名） 
     * @return Name 终端名（设备名）
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 终端名（设备名）
     * @param Name 终端名（设备名）
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 设备所在分组ID 
     * @return GroupId 设备所在分组ID
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 设备所在分组ID
     * @param GroupId 设备所在分组ID
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get OS平台，0：Windows 、1： Linux、 2：macOS 、4： Android、 5: iOS。默认是0 
     * @return OsType OS平台，0：Windows 、1： Linux、 2：macOS 、4： Android、 5: iOS。默认是0
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set OS平台，0：Windows 、1： Linux、 2：macOS 、4： Android、 5: iOS。默认是0
     * @param OsType OS平台，0：Windows 、1： Linux、 2：macOS 、4： Android、 5: iOS。默认是0
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
    }

    /**
     * Get 设备IP地址（出口IP） 
     * @return Ip 设备IP地址（出口IP）
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 设备IP地址（出口IP）
     * @param Ip 设备IP地址（出口IP）
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 在线状态，2：在线、0或者1:离线 
     * @return OnlineStatus 在线状态，2：在线、0或者1:离线
     */
    public Long getOnlineStatus() {
        return this.OnlineStatus;
    }

    /**
     * Set 在线状态，2：在线、0或者1:离线
     * @param OnlineStatus 在线状态，2：在线、0或者1:离线
     */
    public void setOnlineStatus(Long OnlineStatus) {
        this.OnlineStatus = OnlineStatus;
    }

    /**
     * Get 客户端版本号-大整数 
     * @return Version 客户端版本号-大整数
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 客户端版本号-大整数
     * @param Version 客户端版本号-大整数
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 客户端版本号-点分字符串 
     * @return StrVersion 客户端版本号-点分字符串
     */
    public String getStrVersion() {
        return this.StrVersion;
    }

    /**
     * Set 客户端版本号-点分字符串
     * @param StrVersion 客户端版本号-点分字符串
     */
    public void setStrVersion(String StrVersion) {
        this.StrVersion = StrVersion;
    }

    /**
     * Get 首次在线时间 
     * @return Itime 首次在线时间
     */
    public String getItime() {
        return this.Itime;
    }

    /**
     * Set 首次在线时间
     * @param Itime 首次在线时间
     */
    public void setItime(String Itime) {
        this.Itime = Itime;
    }

    /**
     * Get 最后一次在线时间 
     * @return ConnActiveTime 最后一次在线时间
     */
    public String getConnActiveTime() {
        return this.ConnActiveTime;
    }

    /**
     * Set 最后一次在线时间
     * @param ConnActiveTime 最后一次在线时间
     */
    public void setConnActiveTime(String ConnActiveTime) {
        this.ConnActiveTime = ConnActiveTime;
    }

    /**
     * Get 设备是否加锁 ，1：锁定 0或者2：未锁定。 
     * @return Locked 设备是否加锁 ，1：锁定 0或者2：未锁定。
     */
    public Long getLocked() {
        return this.Locked;
    }

    /**
     * Set 设备是否加锁 ，1：锁定 0或者2：未锁定。
     * @param Locked 设备是否加锁 ，1：锁定 0或者2：未锁定。
     */
    public void setLocked(Long Locked) {
        this.Locked = Locked;
    }

    /**
     * Get 设备本地IP列表, 包括IP 
     * @return LocalIpList 设备本地IP列表, 包括IP
     */
    public String getLocalIpList() {
        return this.LocalIpList;
    }

    /**
     * Set 设备本地IP列表, 包括IP
     * @param LocalIpList 设备本地IP列表, 包括IP
     */
    public void setLocalIpList(String LocalIpList) {
        this.LocalIpList = LocalIpList;
    }

    /**
     * Get 宿主机id（需要宿主机也安装iOA才能显示） 
     * @return HostId 宿主机id（需要宿主机也安装iOA才能显示）
     */
    public Long getHostId() {
        return this.HostId;
    }

    /**
     * Set 宿主机id（需要宿主机也安装iOA才能显示）
     * @param HostId 宿主机id（需要宿主机也安装iOA才能显示）
     */
    public void setHostId(Long HostId) {
        this.HostId = HostId;
    }

    /**
     * Get 设备所属分组名 
     * @return GroupName 设备所属分组名
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 设备所属分组名
     * @param GroupName 设备所属分组名
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 设备所属分组路径 
     * @return GroupNamePath 设备所属分组路径
     */
    public String getGroupNamePath() {
        return this.GroupNamePath;
    }

    /**
     * Set 设备所属分组路径
     * @param GroupNamePath 设备所属分组路径
     */
    public void setGroupNamePath(String GroupNamePath) {
        this.GroupNamePath = GroupNamePath;
    }

    /**
     * Get 未修复高危漏洞数(只支持32位) 
     * @return CriticalVulListCount 未修复高危漏洞数(只支持32位)
     */
    public Long getCriticalVulListCount() {
        return this.CriticalVulListCount;
    }

    /**
     * Set 未修复高危漏洞数(只支持32位)
     * @param CriticalVulListCount 未修复高危漏洞数(只支持32位)
     */
    public void setCriticalVulListCount(Long CriticalVulListCount) {
        this.CriticalVulListCount = CriticalVulListCount;
    }

    /**
     * Get 设备名，和Name相同 
     * @return ComputerName 设备名，和Name相同
     */
    public String getComputerName() {
        return this.ComputerName;
    }

    /**
     * Set 设备名，和Name相同
     * @param ComputerName 设备名，和Name相同
     */
    public void setComputerName(String ComputerName) {
        this.ComputerName = ComputerName;
    }

    /**
     * Get 登录域名 
     * @return DomainName 登录域名
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 登录域名
     * @param DomainName 登录域名
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get MAC地址 
     * @return MacAddr MAC地址
     */
    public String getMacAddr() {
        return this.MacAddr;
    }

    /**
     * Set MAC地址
     * @param MacAddr MAC地址
     */
    public void setMacAddr(String MacAddr) {
        this.MacAddr = MacAddr;
    }

    /**
     * Get 漏洞数 
     * @return VulCount 漏洞数
     */
    public Long getVulCount() {
        return this.VulCount;
    }

    /**
     * Set 漏洞数
     * @param VulCount 漏洞数
     */
    public void setVulCount(Long VulCount) {
        this.VulCount = VulCount;
    }

    /**
     * Get 病毒风险数 
     * @return RiskCount 病毒风险数
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set 病毒风险数
     * @param RiskCount 病毒风险数
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get 病毒库版本 
     * @return VirusVer 病毒库版本
     */
    public String getVirusVer() {
        return this.VirusVer;
    }

    /**
     * Set 病毒库版本
     * @param VirusVer 病毒库版本
     */
    public void setVirusVer(String VirusVer) {
        this.VirusVer = VirusVer;
    }

    /**
     * Get 漏洞库版本 
     * @return VulVersion 漏洞库版本
     */
    public String getVulVersion() {
        return this.VulVersion;
    }

    /**
     * Set 漏洞库版本
     * @param VulVersion 漏洞库版本
     */
    public void setVulVersion(String VulVersion) {
        this.VulVersion = VulVersion;
    }

    /**
     * Get 系统修复引擎版本 
     * @return SysRepVersion 系统修复引擎版本
     */
    public String getSysRepVersion() {
        return this.SysRepVersion;
    }

    /**
     * Set 系统修复引擎版本
     * @param SysRepVersion 系统修复引擎版本
     */
    public void setSysRepVersion(String SysRepVersion) {
        this.SysRepVersion = SysRepVersion;
    }

    /**
     * Get 高危补丁列表 
     * @return VulCriticalList 高危补丁列表
     */
    public String [] getVulCriticalList() {
        return this.VulCriticalList;
    }

    /**
     * Set 高危补丁列表
     * @param VulCriticalList 高危补丁列表
     */
    public void setVulCriticalList(String [] VulCriticalList) {
        this.VulCriticalList = VulCriticalList;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 终端用户名 
     * @return UserName 终端用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 终端用户名
     * @param UserName 终端用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 防火墙状态，不等于0表示开启 
     * @return FirewallStatus 防火墙状态，不等于0表示开启
     */
    public Long getFirewallStatus() {
        return this.FirewallStatus;
    }

    /**
     * Set 防火墙状态，不等于0表示开启
     * @param FirewallStatus 防火墙状态，不等于0表示开启
     */
    public void setFirewallStatus(Long FirewallStatus) {
        this.FirewallStatus = FirewallStatus;
    }

    /**
     * Get SN序列号 
     * @return SerialNum SN序列号
     */
    public String getSerialNum() {
        return this.SerialNum;
    }

    /**
     * Set SN序列号
     * @param SerialNum SN序列号
     */
    public void setSerialNum(String SerialNum) {
        this.SerialNum = SerialNum;
    }

    /**
     * Get 设备管控策略版本 
     * @return DeviceStrategyVer 设备管控策略版本
     */
    public String getDeviceStrategyVer() {
        return this.DeviceStrategyVer;
    }

    /**
     * Set 设备管控策略版本
     * @param DeviceStrategyVer 设备管控策略版本
     */
    public void setDeviceStrategyVer(String DeviceStrategyVer) {
        this.DeviceStrategyVer = DeviceStrategyVer;
    }

    /**
     * Get NGN策略版本 
     * @return NGNStrategyVer NGN策略版本
     */
    public String getNGNStrategyVer() {
        return this.NGNStrategyVer;
    }

    /**
     * Set NGN策略版本
     * @param NGNStrategyVer NGN策略版本
     */
    public void setNGNStrategyVer(String NGNStrategyVer) {
        this.NGNStrategyVer = NGNStrategyVer;
    }

    /**
     * Get 最近登录账户的账号(账号系统用户账号) 
     * @return IOAUserName 最近登录账户的账号(账号系统用户账号)
     */
    public String getIOAUserName() {
        return this.IOAUserName;
    }

    /**
     * Set 最近登录账户的账号(账号系统用户账号)
     * @param IOAUserName 最近登录账户的账号(账号系统用户账号)
     */
    public void setIOAUserName(String IOAUserName) {
        this.IOAUserName = IOAUserName;
    }

    /**
     * Get 设备管控新策略 
     * @return DeviceNewStrategyVer 设备管控新策略
     */
    public String getDeviceNewStrategyVer() {
        return this.DeviceNewStrategyVer;
    }

    /**
     * Set 设备管控新策略
     * @param DeviceNewStrategyVer 设备管控新策略
     */
    public void setDeviceNewStrategyVer(String DeviceNewStrategyVer) {
        this.DeviceNewStrategyVer = DeviceNewStrategyVer;
    }

    /**
     * Get NGN策略新版本 
     * @return NGNNewStrategyVer NGN策略新版本
     */
    public String getNGNNewStrategyVer() {
        return this.NGNNewStrategyVer;
    }

    /**
     * Set NGN策略新版本
     * @param NGNNewStrategyVer NGN策略新版本
     */
    public void setNGNNewStrategyVer(String NGNNewStrategyVer) {
        this.NGNNewStrategyVer = NGNNewStrategyVer;
    }

    /**
     * Get 宿主机名称（需要宿主机也安装iOA才能显示） 
     * @return HostName 宿主机名称（需要宿主机也安装iOA才能显示）
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 宿主机名称（需要宿主机也安装iOA才能显示）
     * @param HostName 宿主机名称（需要宿主机也安装iOA才能显示）
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 主板序列号 
     * @return BaseBoardSn 主板序列号
     */
    public String getBaseBoardSn() {
        return this.BaseBoardSn;
    }

    /**
     * Set 主板序列号
     * @param BaseBoardSn 主板序列号
     */
    public void setBaseBoardSn(String BaseBoardSn) {
        this.BaseBoardSn = BaseBoardSn;
    }

    /**
     * Get 绑定账户名称 
     * @return AccountUsers 绑定账户名称
     */
    public String getAccountUsers() {
        return this.AccountUsers;
    }

    /**
     * Set 绑定账户名称
     * @param AccountUsers 绑定账户名称
     */
    public void setAccountUsers(String AccountUsers) {
        this.AccountUsers = AccountUsers;
    }

    /**
     * Get 身份策略版本 
     * @return IdentityStrategyVer 身份策略版本
     */
    public String getIdentityStrategyVer() {
        return this.IdentityStrategyVer;
    }

    /**
     * Set 身份策略版本
     * @param IdentityStrategyVer 身份策略版本
     */
    public void setIdentityStrategyVer(String IdentityStrategyVer) {
        this.IdentityStrategyVer = IdentityStrategyVer;
    }

    /**
     * Get 身份策略新版本 
     * @return IdentityNewStrategyVer 身份策略新版本
     */
    public String getIdentityNewStrategyVer() {
        return this.IdentityNewStrategyVer;
    }

    /**
     * Set 身份策略新版本
     * @param IdentityNewStrategyVer 身份策略新版本
     */
    public void setIdentityNewStrategyVer(String IdentityNewStrategyVer) {
        this.IdentityNewStrategyVer = IdentityNewStrategyVer;
    }

    /**
     * Get 最近登录账号部门 
     * @return AccountGroupName 最近登录账号部门
     */
    public String getAccountGroupName() {
        return this.AccountGroupName;
    }

    /**
     * Set 最近登录账号部门
     * @param AccountGroupName 最近登录账号部门
     */
    public void setAccountGroupName(String AccountGroupName) {
        this.AccountGroupName = AccountGroupName;
    }

    /**
     * Get 最近登录账户的姓名(账号系统用户姓名) 
     * @return AccountName 最近登录账户的姓名(账号系统用户姓名)
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 最近登录账户的姓名(账号系统用户姓名)
     * @param AccountName 最近登录账户的姓名(账号系统用户姓名)
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 账号组id 
     * @return AccountGroupId 账号组id
     */
    public Long getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set 账号组id
     * @param AccountGroupId 账号组id
     */
    public void setAccountGroupId(Long AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get 终端备注名 
     * @return RemarkName 终端备注名
     */
    public String getRemarkName() {
        return this.RemarkName;
    }

    /**
     * Set 终端备注名
     * @param RemarkName 终端备注名
     */
    public void setRemarkName(String RemarkName) {
        this.RemarkName = RemarkName;
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
        if (source.RemarkName != null) {
            this.RemarkName = new String(source.RemarkName);
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
        this.setParamSimple(map, prefix + "RemarkName", this.RemarkName);

    }
}

