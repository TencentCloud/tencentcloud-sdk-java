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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceDetail extends AbstractModel {

    /**
    * <p>设备ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>设备唯一标识码，在ioa中每个设备有唯一标识码</p>
    */
    @SerializedName("Mid")
    @Expose
    private String Mid;

    /**
    * <p>终端名（设备名）</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>设备所在分组ID</p>
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * <p>OS平台，0：Windows 、1： Linux、 2：macOS 、4： Android、 5: iOS。默认是0</p>
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

    /**
    * <p>设备IP地址（出口IP）</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>在线状态，2：在线、0或者1:离线</p>
    */
    @SerializedName("OnlineStatus")
    @Expose
    private Long OnlineStatus;

    /**
    * <p>客户端版本号-大整数</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>客户端版本号-点分字符串</p>
    */
    @SerializedName("StrVersion")
    @Expose
    private String StrVersion;

    /**
    * <p>首次在线时间</p>
    */
    @SerializedName("Itime")
    @Expose
    private String Itime;

    /**
    * <p>最后一次在线时间</p>
    */
    @SerializedName("ConnActiveTime")
    @Expose
    private String ConnActiveTime;

    /**
    * <p>设备是否加锁 ，1：锁定 0或者2：未锁定。</p>
    */
    @SerializedName("Locked")
    @Expose
    private Long Locked;

    /**
    * <p>设备本地IP列表, 包括IP</p>
    */
    @SerializedName("LocalIpList")
    @Expose
    private String LocalIpList;

    /**
    * <p>宿主机id（需要宿主机也安装iOA才能显示）</p>
    */
    @SerializedName("HostId")
    @Expose
    private Long HostId;

    /**
    * <p>设备所属分组名</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>设备所属分组路径</p>
    */
    @SerializedName("GroupNamePath")
    @Expose
    private String GroupNamePath;

    /**
    * <p>未修复高危漏洞数(只支持32位)</p>
    */
    @SerializedName("CriticalVulListCount")
    @Expose
    private Long CriticalVulListCount;

    /**
    * <p>操作系统名称</p>
    */
    @SerializedName("Os")
    @Expose
    private String Os;

    /**
    * <p>操作系统位数</p>
    */
    @SerializedName("OsBits")
    @Expose
    private Long OsBits;

    /**
    * <p>操作系统版本</p>
    */
    @SerializedName("OsVersion")
    @Expose
    private String OsVersion;

    /**
    * <p>操作系统语言</p>
    */
    @SerializedName("OsLanguage")
    @Expose
    private String OsLanguage;

    /**
    * <p>操作系统安装时间</p>
    */
    @SerializedName("OsInstallDate")
    @Expose
    private String OsInstallDate;

    /**
    * <p>设备名，和Name相同</p>
    */
    @SerializedName("ComputerName")
    @Expose
    private String ComputerName;

    /**
    * <p>登录域名</p>
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * <p>MAC地址</p>
    */
    @SerializedName("MacAddr")
    @Expose
    private String MacAddr;

    /**
    * <p>漏洞数</p>
    */
    @SerializedName("VulCount")
    @Expose
    private Long VulCount;

    /**
    * <p>病毒风险数</p>
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * <p>病毒库版本</p>
    */
    @SerializedName("VirusVer")
    @Expose
    private String VirusVer;

    /**
    * <p>漏洞库版本</p>
    */
    @SerializedName("VulVersion")
    @Expose
    private String VulVersion;

    /**
    * <p>系统修复引擎版本</p>
    */
    @SerializedName("SysRepVersion")
    @Expose
    private String SysRepVersion;

    /**
    * <p>高危补丁列表</p>
    */
    @SerializedName("VulCriticalList")
    @Expose
    private String [] VulCriticalList;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
    * <p>终端用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>防火墙状态，不等于0表示开启</p>
    */
    @SerializedName("FirewallStatus")
    @Expose
    private Long FirewallStatus;

    /**
    * <p>SN序列号</p>
    */
    @SerializedName("SerialNum")
    @Expose
    private String SerialNum;

    /**
    * <p>设备管控策略版本</p>
    */
    @SerializedName("DeviceStrategyVer")
    @Expose
    private String DeviceStrategyVer;

    /**
    * <p>NGN策略版本</p>
    */
    @SerializedName("NGNStrategyVer")
    @Expose
    private String NGNStrategyVer;

    /**
    * <p>最近登录账户的账号(账号系统用户账号)</p>
    */
    @SerializedName("IOAUserName")
    @Expose
    private String IOAUserName;

    /**
    * <p>设备管控新策略</p>
    */
    @SerializedName("DeviceNewStrategyVer")
    @Expose
    private String DeviceNewStrategyVer;

    /**
    * <p>NGN策略新版本</p>
    */
    @SerializedName("NGNNewStrategyVer")
    @Expose
    private String NGNNewStrategyVer;

    /**
    * <p>宿主机名称（需要宿主机也安装iOA才能显示）</p>
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * <p>主板序列号</p>
    */
    @SerializedName("BaseBoardSn")
    @Expose
    private String BaseBoardSn;

    /**
    * <p>绑定账户名称</p>
    */
    @SerializedName("AccountUsers")
    @Expose
    private String AccountUsers;

    /**
    * <p>身份策略版本</p>
    */
    @SerializedName("IdentityStrategyVer")
    @Expose
    private String IdentityStrategyVer;

    /**
    * <p>身份策略新版本</p>
    */
    @SerializedName("IdentityNewStrategyVer")
    @Expose
    private String IdentityNewStrategyVer;

    /**
    * <p>最近登录账号部门</p>
    */
    @SerializedName("AccountGroupName")
    @Expose
    private String AccountGroupName;

    /**
    * <p>最近登录账户的姓名(账号系统用户姓名)</p>
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * <p>账号组id</p>
    */
    @SerializedName("AccountGroupId")
    @Expose
    private Long AccountGroupId;

    /**
    * <p>是否开启录屏权限，仅macOS， 0： 未开启 、1： 开启</p>
    */
    @SerializedName("ScreenRecordingPermission")
    @Expose
    private Long ScreenRecordingPermission;

    /**
    * <p>是否开启磁盘访问权限，仅macOS， 0： 未开启、 1： 开启</p>
    */
    @SerializedName("DiskAccessPermission")
    @Expose
    private Long DiskAccessPermission;

    /**
    * <p>终端备注名</p>
    */
    @SerializedName("RemarkName")
    @Expose
    private String RemarkName;

    /**
     * Get <p>设备ID</p> 
     * @return Id <p>设备ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>设备ID</p>
     * @param Id <p>设备ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>设备唯一标识码，在ioa中每个设备有唯一标识码</p> 
     * @return Mid <p>设备唯一标识码，在ioa中每个设备有唯一标识码</p>
     */
    public String getMid() {
        return this.Mid;
    }

    /**
     * Set <p>设备唯一标识码，在ioa中每个设备有唯一标识码</p>
     * @param Mid <p>设备唯一标识码，在ioa中每个设备有唯一标识码</p>
     */
    public void setMid(String Mid) {
        this.Mid = Mid;
    }

    /**
     * Get <p>终端名（设备名）</p> 
     * @return Name <p>终端名（设备名）</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>终端名（设备名）</p>
     * @param Name <p>终端名（设备名）</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>设备所在分组ID</p> 
     * @return GroupId <p>设备所在分组ID</p>
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>设备所在分组ID</p>
     * @param GroupId <p>设备所在分组ID</p>
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>OS平台，0：Windows 、1： Linux、 2：macOS 、4： Android、 5: iOS。默认是0</p> 
     * @return OsType <p>OS平台，0：Windows 、1： Linux、 2：macOS 、4： Android、 5: iOS。默认是0</p>
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set <p>OS平台，0：Windows 、1： Linux、 2：macOS 、4： Android、 5: iOS。默认是0</p>
     * @param OsType <p>OS平台，0：Windows 、1： Linux、 2：macOS 、4： Android、 5: iOS。默认是0</p>
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
    }

    /**
     * Get <p>设备IP地址（出口IP）</p> 
     * @return Ip <p>设备IP地址（出口IP）</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>设备IP地址（出口IP）</p>
     * @param Ip <p>设备IP地址（出口IP）</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>在线状态，2：在线、0或者1:离线</p> 
     * @return OnlineStatus <p>在线状态，2：在线、0或者1:离线</p>
     */
    public Long getOnlineStatus() {
        return this.OnlineStatus;
    }

    /**
     * Set <p>在线状态，2：在线、0或者1:离线</p>
     * @param OnlineStatus <p>在线状态，2：在线、0或者1:离线</p>
     */
    public void setOnlineStatus(Long OnlineStatus) {
        this.OnlineStatus = OnlineStatus;
    }

    /**
     * Get <p>客户端版本号-大整数</p> 
     * @return Version <p>客户端版本号-大整数</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>客户端版本号-大整数</p>
     * @param Version <p>客户端版本号-大整数</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>客户端版本号-点分字符串</p> 
     * @return StrVersion <p>客户端版本号-点分字符串</p>
     */
    public String getStrVersion() {
        return this.StrVersion;
    }

    /**
     * Set <p>客户端版本号-点分字符串</p>
     * @param StrVersion <p>客户端版本号-点分字符串</p>
     */
    public void setStrVersion(String StrVersion) {
        this.StrVersion = StrVersion;
    }

    /**
     * Get <p>首次在线时间</p> 
     * @return Itime <p>首次在线时间</p>
     */
    public String getItime() {
        return this.Itime;
    }

    /**
     * Set <p>首次在线时间</p>
     * @param Itime <p>首次在线时间</p>
     */
    public void setItime(String Itime) {
        this.Itime = Itime;
    }

    /**
     * Get <p>最后一次在线时间</p> 
     * @return ConnActiveTime <p>最后一次在线时间</p>
     */
    public String getConnActiveTime() {
        return this.ConnActiveTime;
    }

    /**
     * Set <p>最后一次在线时间</p>
     * @param ConnActiveTime <p>最后一次在线时间</p>
     */
    public void setConnActiveTime(String ConnActiveTime) {
        this.ConnActiveTime = ConnActiveTime;
    }

    /**
     * Get <p>设备是否加锁 ，1：锁定 0或者2：未锁定。</p> 
     * @return Locked <p>设备是否加锁 ，1：锁定 0或者2：未锁定。</p>
     */
    public Long getLocked() {
        return this.Locked;
    }

    /**
     * Set <p>设备是否加锁 ，1：锁定 0或者2：未锁定。</p>
     * @param Locked <p>设备是否加锁 ，1：锁定 0或者2：未锁定。</p>
     */
    public void setLocked(Long Locked) {
        this.Locked = Locked;
    }

    /**
     * Get <p>设备本地IP列表, 包括IP</p> 
     * @return LocalIpList <p>设备本地IP列表, 包括IP</p>
     */
    public String getLocalIpList() {
        return this.LocalIpList;
    }

    /**
     * Set <p>设备本地IP列表, 包括IP</p>
     * @param LocalIpList <p>设备本地IP列表, 包括IP</p>
     */
    public void setLocalIpList(String LocalIpList) {
        this.LocalIpList = LocalIpList;
    }

    /**
     * Get <p>宿主机id（需要宿主机也安装iOA才能显示）</p> 
     * @return HostId <p>宿主机id（需要宿主机也安装iOA才能显示）</p>
     */
    public Long getHostId() {
        return this.HostId;
    }

    /**
     * Set <p>宿主机id（需要宿主机也安装iOA才能显示）</p>
     * @param HostId <p>宿主机id（需要宿主机也安装iOA才能显示）</p>
     */
    public void setHostId(Long HostId) {
        this.HostId = HostId;
    }

    /**
     * Get <p>设备所属分组名</p> 
     * @return GroupName <p>设备所属分组名</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>设备所属分组名</p>
     * @param GroupName <p>设备所属分组名</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>设备所属分组路径</p> 
     * @return GroupNamePath <p>设备所属分组路径</p>
     */
    public String getGroupNamePath() {
        return this.GroupNamePath;
    }

    /**
     * Set <p>设备所属分组路径</p>
     * @param GroupNamePath <p>设备所属分组路径</p>
     */
    public void setGroupNamePath(String GroupNamePath) {
        this.GroupNamePath = GroupNamePath;
    }

    /**
     * Get <p>未修复高危漏洞数(只支持32位)</p> 
     * @return CriticalVulListCount <p>未修复高危漏洞数(只支持32位)</p>
     */
    public Long getCriticalVulListCount() {
        return this.CriticalVulListCount;
    }

    /**
     * Set <p>未修复高危漏洞数(只支持32位)</p>
     * @param CriticalVulListCount <p>未修复高危漏洞数(只支持32位)</p>
     */
    public void setCriticalVulListCount(Long CriticalVulListCount) {
        this.CriticalVulListCount = CriticalVulListCount;
    }

    /**
     * Get <p>操作系统名称</p> 
     * @return Os <p>操作系统名称</p>
     */
    public String getOs() {
        return this.Os;
    }

    /**
     * Set <p>操作系统名称</p>
     * @param Os <p>操作系统名称</p>
     */
    public void setOs(String Os) {
        this.Os = Os;
    }

    /**
     * Get <p>操作系统位数</p> 
     * @return OsBits <p>操作系统位数</p>
     */
    public Long getOsBits() {
        return this.OsBits;
    }

    /**
     * Set <p>操作系统位数</p>
     * @param OsBits <p>操作系统位数</p>
     */
    public void setOsBits(Long OsBits) {
        this.OsBits = OsBits;
    }

    /**
     * Get <p>操作系统版本</p> 
     * @return OsVersion <p>操作系统版本</p>
     */
    public String getOsVersion() {
        return this.OsVersion;
    }

    /**
     * Set <p>操作系统版本</p>
     * @param OsVersion <p>操作系统版本</p>
     */
    public void setOsVersion(String OsVersion) {
        this.OsVersion = OsVersion;
    }

    /**
     * Get <p>操作系统语言</p> 
     * @return OsLanguage <p>操作系统语言</p>
     */
    public String getOsLanguage() {
        return this.OsLanguage;
    }

    /**
     * Set <p>操作系统语言</p>
     * @param OsLanguage <p>操作系统语言</p>
     */
    public void setOsLanguage(String OsLanguage) {
        this.OsLanguage = OsLanguage;
    }

    /**
     * Get <p>操作系统安装时间</p> 
     * @return OsInstallDate <p>操作系统安装时间</p>
     */
    public String getOsInstallDate() {
        return this.OsInstallDate;
    }

    /**
     * Set <p>操作系统安装时间</p>
     * @param OsInstallDate <p>操作系统安装时间</p>
     */
    public void setOsInstallDate(String OsInstallDate) {
        this.OsInstallDate = OsInstallDate;
    }

    /**
     * Get <p>设备名，和Name相同</p> 
     * @return ComputerName <p>设备名，和Name相同</p>
     */
    public String getComputerName() {
        return this.ComputerName;
    }

    /**
     * Set <p>设备名，和Name相同</p>
     * @param ComputerName <p>设备名，和Name相同</p>
     */
    public void setComputerName(String ComputerName) {
        this.ComputerName = ComputerName;
    }

    /**
     * Get <p>登录域名</p> 
     * @return DomainName <p>登录域名</p>
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set <p>登录域名</p>
     * @param DomainName <p>登录域名</p>
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get <p>MAC地址</p> 
     * @return MacAddr <p>MAC地址</p>
     */
    public String getMacAddr() {
        return this.MacAddr;
    }

    /**
     * Set <p>MAC地址</p>
     * @param MacAddr <p>MAC地址</p>
     */
    public void setMacAddr(String MacAddr) {
        this.MacAddr = MacAddr;
    }

    /**
     * Get <p>漏洞数</p> 
     * @return VulCount <p>漏洞数</p>
     */
    public Long getVulCount() {
        return this.VulCount;
    }

    /**
     * Set <p>漏洞数</p>
     * @param VulCount <p>漏洞数</p>
     */
    public void setVulCount(Long VulCount) {
        this.VulCount = VulCount;
    }

    /**
     * Get <p>病毒风险数</p> 
     * @return RiskCount <p>病毒风险数</p>
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set <p>病毒风险数</p>
     * @param RiskCount <p>病毒风险数</p>
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get <p>病毒库版本</p> 
     * @return VirusVer <p>病毒库版本</p>
     */
    public String getVirusVer() {
        return this.VirusVer;
    }

    /**
     * Set <p>病毒库版本</p>
     * @param VirusVer <p>病毒库版本</p>
     */
    public void setVirusVer(String VirusVer) {
        this.VirusVer = VirusVer;
    }

    /**
     * Get <p>漏洞库版本</p> 
     * @return VulVersion <p>漏洞库版本</p>
     */
    public String getVulVersion() {
        return this.VulVersion;
    }

    /**
     * Set <p>漏洞库版本</p>
     * @param VulVersion <p>漏洞库版本</p>
     */
    public void setVulVersion(String VulVersion) {
        this.VulVersion = VulVersion;
    }

    /**
     * Get <p>系统修复引擎版本</p> 
     * @return SysRepVersion <p>系统修复引擎版本</p>
     */
    public String getSysRepVersion() {
        return this.SysRepVersion;
    }

    /**
     * Set <p>系统修复引擎版本</p>
     * @param SysRepVersion <p>系统修复引擎版本</p>
     */
    public void setSysRepVersion(String SysRepVersion) {
        this.SysRepVersion = SysRepVersion;
    }

    /**
     * Get <p>高危补丁列表</p> 
     * @return VulCriticalList <p>高危补丁列表</p>
     */
    public String [] getVulCriticalList() {
        return this.VulCriticalList;
    }

    /**
     * Set <p>高危补丁列表</p>
     * @param VulCriticalList <p>高危补丁列表</p>
     */
    public void setVulCriticalList(String [] VulCriticalList) {
        this.VulCriticalList = VulCriticalList;
    }

    /**
     * Get <p>标签</p> 
     * @return Tags <p>标签</p>
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
     * @param Tags <p>标签</p>
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>终端用户名</p> 
     * @return UserName <p>终端用户名</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>终端用户名</p>
     * @param UserName <p>终端用户名</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>防火墙状态，不等于0表示开启</p> 
     * @return FirewallStatus <p>防火墙状态，不等于0表示开启</p>
     */
    public Long getFirewallStatus() {
        return this.FirewallStatus;
    }

    /**
     * Set <p>防火墙状态，不等于0表示开启</p>
     * @param FirewallStatus <p>防火墙状态，不等于0表示开启</p>
     */
    public void setFirewallStatus(Long FirewallStatus) {
        this.FirewallStatus = FirewallStatus;
    }

    /**
     * Get <p>SN序列号</p> 
     * @return SerialNum <p>SN序列号</p>
     */
    public String getSerialNum() {
        return this.SerialNum;
    }

    /**
     * Set <p>SN序列号</p>
     * @param SerialNum <p>SN序列号</p>
     */
    public void setSerialNum(String SerialNum) {
        this.SerialNum = SerialNum;
    }

    /**
     * Get <p>设备管控策略版本</p> 
     * @return DeviceStrategyVer <p>设备管控策略版本</p>
     */
    public String getDeviceStrategyVer() {
        return this.DeviceStrategyVer;
    }

    /**
     * Set <p>设备管控策略版本</p>
     * @param DeviceStrategyVer <p>设备管控策略版本</p>
     */
    public void setDeviceStrategyVer(String DeviceStrategyVer) {
        this.DeviceStrategyVer = DeviceStrategyVer;
    }

    /**
     * Get <p>NGN策略版本</p> 
     * @return NGNStrategyVer <p>NGN策略版本</p>
     */
    public String getNGNStrategyVer() {
        return this.NGNStrategyVer;
    }

    /**
     * Set <p>NGN策略版本</p>
     * @param NGNStrategyVer <p>NGN策略版本</p>
     */
    public void setNGNStrategyVer(String NGNStrategyVer) {
        this.NGNStrategyVer = NGNStrategyVer;
    }

    /**
     * Get <p>最近登录账户的账号(账号系统用户账号)</p> 
     * @return IOAUserName <p>最近登录账户的账号(账号系统用户账号)</p>
     */
    public String getIOAUserName() {
        return this.IOAUserName;
    }

    /**
     * Set <p>最近登录账户的账号(账号系统用户账号)</p>
     * @param IOAUserName <p>最近登录账户的账号(账号系统用户账号)</p>
     */
    public void setIOAUserName(String IOAUserName) {
        this.IOAUserName = IOAUserName;
    }

    /**
     * Get <p>设备管控新策略</p> 
     * @return DeviceNewStrategyVer <p>设备管控新策略</p>
     */
    public String getDeviceNewStrategyVer() {
        return this.DeviceNewStrategyVer;
    }

    /**
     * Set <p>设备管控新策略</p>
     * @param DeviceNewStrategyVer <p>设备管控新策略</p>
     */
    public void setDeviceNewStrategyVer(String DeviceNewStrategyVer) {
        this.DeviceNewStrategyVer = DeviceNewStrategyVer;
    }

    /**
     * Get <p>NGN策略新版本</p> 
     * @return NGNNewStrategyVer <p>NGN策略新版本</p>
     */
    public String getNGNNewStrategyVer() {
        return this.NGNNewStrategyVer;
    }

    /**
     * Set <p>NGN策略新版本</p>
     * @param NGNNewStrategyVer <p>NGN策略新版本</p>
     */
    public void setNGNNewStrategyVer(String NGNNewStrategyVer) {
        this.NGNNewStrategyVer = NGNNewStrategyVer;
    }

    /**
     * Get <p>宿主机名称（需要宿主机也安装iOA才能显示）</p> 
     * @return HostName <p>宿主机名称（需要宿主机也安装iOA才能显示）</p>
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set <p>宿主机名称（需要宿主机也安装iOA才能显示）</p>
     * @param HostName <p>宿主机名称（需要宿主机也安装iOA才能显示）</p>
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get <p>主板序列号</p> 
     * @return BaseBoardSn <p>主板序列号</p>
     */
    public String getBaseBoardSn() {
        return this.BaseBoardSn;
    }

    /**
     * Set <p>主板序列号</p>
     * @param BaseBoardSn <p>主板序列号</p>
     */
    public void setBaseBoardSn(String BaseBoardSn) {
        this.BaseBoardSn = BaseBoardSn;
    }

    /**
     * Get <p>绑定账户名称</p> 
     * @return AccountUsers <p>绑定账户名称</p>
     */
    public String getAccountUsers() {
        return this.AccountUsers;
    }

    /**
     * Set <p>绑定账户名称</p>
     * @param AccountUsers <p>绑定账户名称</p>
     */
    public void setAccountUsers(String AccountUsers) {
        this.AccountUsers = AccountUsers;
    }

    /**
     * Get <p>身份策略版本</p> 
     * @return IdentityStrategyVer <p>身份策略版本</p>
     */
    public String getIdentityStrategyVer() {
        return this.IdentityStrategyVer;
    }

    /**
     * Set <p>身份策略版本</p>
     * @param IdentityStrategyVer <p>身份策略版本</p>
     */
    public void setIdentityStrategyVer(String IdentityStrategyVer) {
        this.IdentityStrategyVer = IdentityStrategyVer;
    }

    /**
     * Get <p>身份策略新版本</p> 
     * @return IdentityNewStrategyVer <p>身份策略新版本</p>
     */
    public String getIdentityNewStrategyVer() {
        return this.IdentityNewStrategyVer;
    }

    /**
     * Set <p>身份策略新版本</p>
     * @param IdentityNewStrategyVer <p>身份策略新版本</p>
     */
    public void setIdentityNewStrategyVer(String IdentityNewStrategyVer) {
        this.IdentityNewStrategyVer = IdentityNewStrategyVer;
    }

    /**
     * Get <p>最近登录账号部门</p> 
     * @return AccountGroupName <p>最近登录账号部门</p>
     */
    public String getAccountGroupName() {
        return this.AccountGroupName;
    }

    /**
     * Set <p>最近登录账号部门</p>
     * @param AccountGroupName <p>最近登录账号部门</p>
     */
    public void setAccountGroupName(String AccountGroupName) {
        this.AccountGroupName = AccountGroupName;
    }

    /**
     * Get <p>最近登录账户的姓名(账号系统用户姓名)</p> 
     * @return AccountName <p>最近登录账户的姓名(账号系统用户姓名)</p>
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set <p>最近登录账户的姓名(账号系统用户姓名)</p>
     * @param AccountName <p>最近登录账户的姓名(账号系统用户姓名)</p>
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get <p>账号组id</p> 
     * @return AccountGroupId <p>账号组id</p>
     */
    public Long getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set <p>账号组id</p>
     * @param AccountGroupId <p>账号组id</p>
     */
    public void setAccountGroupId(Long AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get <p>是否开启录屏权限，仅macOS， 0： 未开启 、1： 开启</p> 
     * @return ScreenRecordingPermission <p>是否开启录屏权限，仅macOS， 0： 未开启 、1： 开启</p>
     */
    public Long getScreenRecordingPermission() {
        return this.ScreenRecordingPermission;
    }

    /**
     * Set <p>是否开启录屏权限，仅macOS， 0： 未开启 、1： 开启</p>
     * @param ScreenRecordingPermission <p>是否开启录屏权限，仅macOS， 0： 未开启 、1： 开启</p>
     */
    public void setScreenRecordingPermission(Long ScreenRecordingPermission) {
        this.ScreenRecordingPermission = ScreenRecordingPermission;
    }

    /**
     * Get <p>是否开启磁盘访问权限，仅macOS， 0： 未开启、 1： 开启</p> 
     * @return DiskAccessPermission <p>是否开启磁盘访问权限，仅macOS， 0： 未开启、 1： 开启</p>
     */
    public Long getDiskAccessPermission() {
        return this.DiskAccessPermission;
    }

    /**
     * Set <p>是否开启磁盘访问权限，仅macOS， 0： 未开启、 1： 开启</p>
     * @param DiskAccessPermission <p>是否开启磁盘访问权限，仅macOS， 0： 未开启、 1： 开启</p>
     */
    public void setDiskAccessPermission(Long DiskAccessPermission) {
        this.DiskAccessPermission = DiskAccessPermission;
    }

    /**
     * Get <p>终端备注名</p> 
     * @return RemarkName <p>终端备注名</p>
     */
    public String getRemarkName() {
        return this.RemarkName;
    }

    /**
     * Set <p>终端备注名</p>
     * @param RemarkName <p>终端备注名</p>
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
        if (source.Os != null) {
            this.Os = new String(source.Os);
        }
        if (source.OsBits != null) {
            this.OsBits = new Long(source.OsBits);
        }
        if (source.OsVersion != null) {
            this.OsVersion = new String(source.OsVersion);
        }
        if (source.OsLanguage != null) {
            this.OsLanguage = new String(source.OsLanguage);
        }
        if (source.OsInstallDate != null) {
            this.OsInstallDate = new String(source.OsInstallDate);
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
        if (source.ScreenRecordingPermission != null) {
            this.ScreenRecordingPermission = new Long(source.ScreenRecordingPermission);
        }
        if (source.DiskAccessPermission != null) {
            this.DiskAccessPermission = new Long(source.DiskAccessPermission);
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
        this.setParamSimple(map, prefix + "Os", this.Os);
        this.setParamSimple(map, prefix + "OsBits", this.OsBits);
        this.setParamSimple(map, prefix + "OsVersion", this.OsVersion);
        this.setParamSimple(map, prefix + "OsLanguage", this.OsLanguage);
        this.setParamSimple(map, prefix + "OsInstallDate", this.OsInstallDate);
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
        this.setParamSimple(map, prefix + "ScreenRecordingPermission", this.ScreenRecordingPermission);
        this.setParamSimple(map, prefix + "DiskAccessPermission", this.DiskAccessPermission);
        this.setParamSimple(map, prefix + "RemarkName", this.RemarkName);

    }
}

