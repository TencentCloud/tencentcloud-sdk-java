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

public class DescribeDevicesRequest extends AbstractModel {

    /**
    * 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
    */
    @SerializedName("DomainInstanceId")
    @Expose
    private String DomainInstanceId;

    /**
    * <p>过滤条件参数（字段含义请参考接口返回值）</p><ul><li>Mid, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Name, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Itime, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>UserName, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>MacAddr, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>UserId, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Ip, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Tags，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>LocalIpList，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>SerialNum，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Version，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>StrVersion，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>RtpStatus，类型String，支持操作：【eq，like，ilike】，<strong>不支持排序</strong></li><li>HostName，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>IoaUserName，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>GroupName，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>CriticalVulListCount，<strong>类型Int</strong>，支持操作：【eq】，<strong>不支持排序</strong></li><li>RiskCount，<strong>类型Int</strong>，支持操作：【eq】，<strong>不支持排序</strong></li><li>VulVersion，类型String，支持操作：【eq，like，ilike】，<strong>不支持排序</strong></li><li>Virusver，类型String，支持操作：【eq，like，ilike】，<strong>不支持排序</strong></li><li>SysRepver，类型String，支持操作：【eq，like，ilike】，<strong>不支持排序</strong></li><li>BaseBoardSn，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Os，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>ConnActiveTime，类型String，支持操作：【eq，like，ilike】，<strong>不支持排序</strong></li><li>FirewallStatus，<strong>类型Int</strong>，支持操作：【eq】，<strong>不支持排序</strong></li><li>DomainName，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>SysRepVersion，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>VirusVer，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Cpu，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Memory，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>HardDiskSize，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>AccountName，类型String，支持操作：【like.ilike】，支持排序</li><li>AccountGroupName，类型String，支持操作：【like.ilike】，支持排序</li></ul><p>分页参数</p><ul><li>PageNum 从1开始，小于等于0时使用默认参数</li><li>PageSize 最大值5000，最好不超过100</li></ul>
    */
    @SerializedName("Condition")
    @Expose
    private Condition Condition;

    /**
    * <p>【和GroupIds必须有一个填写】设备分组id（需要和OsType匹配），下面是私有化场景下默认id：<br>id-名称-操作系统<br>1    全网终端    Win<br>2    未分组终端    Win<br>30000000    服务器    Win<br>40000101    全网终端    Linux<br>40000102    未分组终端    Linux<br>40000103    服务器    Linux<br>40000201    全网终端    macOS<br>40000202    未分组终端    macOS<br>40000203    服务器    macOS<br>40000401    全网终端    Android<br>40000402    未分组终端    Android<br>40000501    全网终端    iOS<br>40000502    未分组终端    iOS</p><p>SaaS需要调用分组接口DescribeDeviceChildGroups获取对应分组id</p>
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * <p>系统类型（0: win，1：linux，2: mac，4：android，5：ios，-1：全系统（SaaS一体化版本） ； 不传默认为0）(只支持32位)，需要和GroupId或者GroupIds匹配</p>
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

    /**
    * <p>在线状态 （2表示在线，0或者1表示离线）</p>
    */
    @SerializedName("OnlineStatus")
    @Expose
    private Long OnlineStatus;

    /**
    * <p>过滤条件--兼容旧接口,参数同Condition</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>排序字段--兼容旧接口,参数同Condition</p>
    */
    @SerializedName("Sort")
    @Expose
    private Sort Sort;

    /**
    * <p>获取第几页--兼容旧接口,参数同Condition</p>
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * <p>每页获取数--兼容旧接口,参数同Condition</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>授权状态： 4基础授权 5高级授权</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>【和GroupId必须有一个填写】设备分组id列表（需要和OsType匹配）</p>
    */
    @SerializedName("GroupIds")
    @Expose
    private Long [] GroupIds;

    /**
     * Get 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。 
     * @return DomainInstanceId 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
     */
    public String getDomainInstanceId() {
        return this.DomainInstanceId;
    }

    /**
     * Set 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
     * @param DomainInstanceId 管理域实例ID，用于CAM管理域权限分配。若企业未进行管理域的划分，可直接传入根域"1"，此时表示针对当前企业的全部设备和账号进行接口CRUD，具体CRUD的影响范围限制于相应接口的入参。
     */
    public void setDomainInstanceId(String DomainInstanceId) {
        this.DomainInstanceId = DomainInstanceId;
    }

    /**
     * Get <p>过滤条件参数（字段含义请参考接口返回值）</p><ul><li>Mid, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Name, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Itime, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>UserName, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>MacAddr, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>UserId, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Ip, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Tags，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>LocalIpList，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>SerialNum，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Version，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>StrVersion，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>RtpStatus，类型String，支持操作：【eq，like，ilike】，<strong>不支持排序</strong></li><li>HostName，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>IoaUserName，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>GroupName，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>CriticalVulListCount，<strong>类型Int</strong>，支持操作：【eq】，<strong>不支持排序</strong></li><li>RiskCount，<strong>类型Int</strong>，支持操作：【eq】，<strong>不支持排序</strong></li><li>VulVersion，类型String，支持操作：【eq，like，ilike】，<strong>不支持排序</strong></li><li>Virusver，类型String，支持操作：【eq，like，ilike】，<strong>不支持排序</strong></li><li>SysRepver，类型String，支持操作：【eq，like，ilike】，<strong>不支持排序</strong></li><li>BaseBoardSn，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Os，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>ConnActiveTime，类型String，支持操作：【eq，like，ilike】，<strong>不支持排序</strong></li><li>FirewallStatus，<strong>类型Int</strong>，支持操作：【eq】，<strong>不支持排序</strong></li><li>DomainName，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>SysRepVersion，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>VirusVer，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Cpu，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Memory，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>HardDiskSize，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>AccountName，类型String，支持操作：【like.ilike】，支持排序</li><li>AccountGroupName，类型String，支持操作：【like.ilike】，支持排序</li></ul><p>分页参数</p><ul><li>PageNum 从1开始，小于等于0时使用默认参数</li><li>PageSize 最大值5000，最好不超过100</li></ul> 
     * @return Condition <p>过滤条件参数（字段含义请参考接口返回值）</p><ul><li>Mid, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Name, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Itime, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>UserName, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>MacAddr, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>UserId, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Ip, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Tags，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>LocalIpList，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>SerialNum，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Version，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>StrVersion，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>RtpStatus，类型String，支持操作：【eq，like，ilike】，<strong>不支持排序</strong></li><li>HostName，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>IoaUserName，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>GroupName，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>CriticalVulListCount，<strong>类型Int</strong>，支持操作：【eq】，<strong>不支持排序</strong></li><li>RiskCount，<strong>类型Int</strong>，支持操作：【eq】，<strong>不支持排序</strong></li><li>VulVersion，类型String，支持操作：【eq，like，ilike】，<strong>不支持排序</strong></li><li>Virusver，类型String，支持操作：【eq，like，ilike】，<strong>不支持排序</strong></li><li>SysRepver，类型String，支持操作：【eq，like，ilike】，<strong>不支持排序</strong></li><li>BaseBoardSn，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Os，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>ConnActiveTime，类型String，支持操作：【eq，like，ilike】，<strong>不支持排序</strong></li><li>FirewallStatus，<strong>类型Int</strong>，支持操作：【eq】，<strong>不支持排序</strong></li><li>DomainName，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>SysRepVersion，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>VirusVer，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Cpu，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Memory，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>HardDiskSize，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>AccountName，类型String，支持操作：【like.ilike】，支持排序</li><li>AccountGroupName，类型String，支持操作：【like.ilike】，支持排序</li></ul><p>分页参数</p><ul><li>PageNum 从1开始，小于等于0时使用默认参数</li><li>PageSize 最大值5000，最好不超过100</li></ul>
     */
    public Condition getCondition() {
        return this.Condition;
    }

    /**
     * Set <p>过滤条件参数（字段含义请参考接口返回值）</p><ul><li>Mid, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Name, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Itime, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>UserName, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>MacAddr, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>UserId, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Ip, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Tags，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>LocalIpList，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>SerialNum，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Version，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>StrVersion，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>RtpStatus，类型String，支持操作：【eq，like，ilike】，<strong>不支持排序</strong></li><li>HostName，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>IoaUserName，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>GroupName，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>CriticalVulListCount，<strong>类型Int</strong>，支持操作：【eq】，<strong>不支持排序</strong></li><li>RiskCount，<strong>类型Int</strong>，支持操作：【eq】，<strong>不支持排序</strong></li><li>VulVersion，类型String，支持操作：【eq，like，ilike】，<strong>不支持排序</strong></li><li>Virusver，类型String，支持操作：【eq，like，ilike】，<strong>不支持排序</strong></li><li>SysRepver，类型String，支持操作：【eq，like，ilike】，<strong>不支持排序</strong></li><li>BaseBoardSn，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Os，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>ConnActiveTime，类型String，支持操作：【eq，like，ilike】，<strong>不支持排序</strong></li><li>FirewallStatus，<strong>类型Int</strong>，支持操作：【eq】，<strong>不支持排序</strong></li><li>DomainName，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>SysRepVersion，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>VirusVer，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Cpu，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Memory，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>HardDiskSize，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>AccountName，类型String，支持操作：【like.ilike】，支持排序</li><li>AccountGroupName，类型String，支持操作：【like.ilike】，支持排序</li></ul><p>分页参数</p><ul><li>PageNum 从1开始，小于等于0时使用默认参数</li><li>PageSize 最大值5000，最好不超过100</li></ul>
     * @param Condition <p>过滤条件参数（字段含义请参考接口返回值）</p><ul><li>Mid, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Name, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Itime, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>UserName, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>MacAddr, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>UserId, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Ip, 类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Tags，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>LocalIpList，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>SerialNum，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Version，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>StrVersion，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>RtpStatus，类型String，支持操作：【eq，like，ilike】，<strong>不支持排序</strong></li><li>HostName，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>IoaUserName，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>GroupName，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>CriticalVulListCount，<strong>类型Int</strong>，支持操作：【eq】，<strong>不支持排序</strong></li><li>RiskCount，<strong>类型Int</strong>，支持操作：【eq】，<strong>不支持排序</strong></li><li>VulVersion，类型String，支持操作：【eq，like，ilike】，<strong>不支持排序</strong></li><li>Virusver，类型String，支持操作：【eq，like，ilike】，<strong>不支持排序</strong></li><li>SysRepver，类型String，支持操作：【eq，like，ilike】，<strong>不支持排序</strong></li><li>BaseBoardSn，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Os，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>ConnActiveTime，类型String，支持操作：【eq，like，ilike】，<strong>不支持排序</strong></li><li>FirewallStatus，<strong>类型Int</strong>，支持操作：【eq】，<strong>不支持排序</strong></li><li>DomainName，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>SysRepVersion，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>VirusVer，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Cpu，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>Memory，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>HardDiskSize，类型String，支持操作：【eq，like，ilike】，支持排序</li><li>AccountName，类型String，支持操作：【like.ilike】，支持排序</li><li>AccountGroupName，类型String，支持操作：【like.ilike】，支持排序</li></ul><p>分页参数</p><ul><li>PageNum 从1开始，小于等于0时使用默认参数</li><li>PageSize 最大值5000，最好不超过100</li></ul>
     */
    public void setCondition(Condition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>【和GroupIds必须有一个填写】设备分组id（需要和OsType匹配），下面是私有化场景下默认id：<br>id-名称-操作系统<br>1    全网终端    Win<br>2    未分组终端    Win<br>30000000    服务器    Win<br>40000101    全网终端    Linux<br>40000102    未分组终端    Linux<br>40000103    服务器    Linux<br>40000201    全网终端    macOS<br>40000202    未分组终端    macOS<br>40000203    服务器    macOS<br>40000401    全网终端    Android<br>40000402    未分组终端    Android<br>40000501    全网终端    iOS<br>40000502    未分组终端    iOS</p><p>SaaS需要调用分组接口DescribeDeviceChildGroups获取对应分组id</p> 
     * @return GroupId <p>【和GroupIds必须有一个填写】设备分组id（需要和OsType匹配），下面是私有化场景下默认id：<br>id-名称-操作系统<br>1    全网终端    Win<br>2    未分组终端    Win<br>30000000    服务器    Win<br>40000101    全网终端    Linux<br>40000102    未分组终端    Linux<br>40000103    服务器    Linux<br>40000201    全网终端    macOS<br>40000202    未分组终端    macOS<br>40000203    服务器    macOS<br>40000401    全网终端    Android<br>40000402    未分组终端    Android<br>40000501    全网终端    iOS<br>40000502    未分组终端    iOS</p><p>SaaS需要调用分组接口DescribeDeviceChildGroups获取对应分组id</p>
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>【和GroupIds必须有一个填写】设备分组id（需要和OsType匹配），下面是私有化场景下默认id：<br>id-名称-操作系统<br>1    全网终端    Win<br>2    未分组终端    Win<br>30000000    服务器    Win<br>40000101    全网终端    Linux<br>40000102    未分组终端    Linux<br>40000103    服务器    Linux<br>40000201    全网终端    macOS<br>40000202    未分组终端    macOS<br>40000203    服务器    macOS<br>40000401    全网终端    Android<br>40000402    未分组终端    Android<br>40000501    全网终端    iOS<br>40000502    未分组终端    iOS</p><p>SaaS需要调用分组接口DescribeDeviceChildGroups获取对应分组id</p>
     * @param GroupId <p>【和GroupIds必须有一个填写】设备分组id（需要和OsType匹配），下面是私有化场景下默认id：<br>id-名称-操作系统<br>1    全网终端    Win<br>2    未分组终端    Win<br>30000000    服务器    Win<br>40000101    全网终端    Linux<br>40000102    未分组终端    Linux<br>40000103    服务器    Linux<br>40000201    全网终端    macOS<br>40000202    未分组终端    macOS<br>40000203    服务器    macOS<br>40000401    全网终端    Android<br>40000402    未分组终端    Android<br>40000501    全网终端    iOS<br>40000502    未分组终端    iOS</p><p>SaaS需要调用分组接口DescribeDeviceChildGroups获取对应分组id</p>
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>系统类型（0: win，1：linux，2: mac，4：android，5：ios，-1：全系统（SaaS一体化版本） ； 不传默认为0）(只支持32位)，需要和GroupId或者GroupIds匹配</p> 
     * @return OsType <p>系统类型（0: win，1：linux，2: mac，4：android，5：ios，-1：全系统（SaaS一体化版本） ； 不传默认为0）(只支持32位)，需要和GroupId或者GroupIds匹配</p>
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set <p>系统类型（0: win，1：linux，2: mac，4：android，5：ios，-1：全系统（SaaS一体化版本） ； 不传默认为0）(只支持32位)，需要和GroupId或者GroupIds匹配</p>
     * @param OsType <p>系统类型（0: win，1：linux，2: mac，4：android，5：ios，-1：全系统（SaaS一体化版本） ； 不传默认为0）(只支持32位)，需要和GroupId或者GroupIds匹配</p>
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
    }

    /**
     * Get <p>在线状态 （2表示在线，0或者1表示离线）</p> 
     * @return OnlineStatus <p>在线状态 （2表示在线，0或者1表示离线）</p>
     */
    public Long getOnlineStatus() {
        return this.OnlineStatus;
    }

    /**
     * Set <p>在线状态 （2表示在线，0或者1表示离线）</p>
     * @param OnlineStatus <p>在线状态 （2表示在线，0或者1表示离线）</p>
     */
    public void setOnlineStatus(Long OnlineStatus) {
        this.OnlineStatus = OnlineStatus;
    }

    /**
     * Get <p>过滤条件--兼容旧接口,参数同Condition</p> 
     * @return Filters <p>过滤条件--兼容旧接口,参数同Condition</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件--兼容旧接口,参数同Condition</p>
     * @param Filters <p>过滤条件--兼容旧接口,参数同Condition</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>排序字段--兼容旧接口,参数同Condition</p> 
     * @return Sort <p>排序字段--兼容旧接口,参数同Condition</p>
     */
    public Sort getSort() {
        return this.Sort;
    }

    /**
     * Set <p>排序字段--兼容旧接口,参数同Condition</p>
     * @param Sort <p>排序字段--兼容旧接口,参数同Condition</p>
     */
    public void setSort(Sort Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <p>获取第几页--兼容旧接口,参数同Condition</p> 
     * @return PageNum <p>获取第几页--兼容旧接口,参数同Condition</p>
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set <p>获取第几页--兼容旧接口,参数同Condition</p>
     * @param PageNum <p>获取第几页--兼容旧接口,参数同Condition</p>
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get <p>每页获取数--兼容旧接口,参数同Condition</p> 
     * @return PageSize <p>每页获取数--兼容旧接口,参数同Condition</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页获取数--兼容旧接口,参数同Condition</p>
     * @param PageSize <p>每页获取数--兼容旧接口,参数同Condition</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>授权状态： 4基础授权 5高级授权</p> 
     * @return Status <p>授权状态： 4基础授权 5高级授权</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>授权状态： 4基础授权 5高级授权</p>
     * @param Status <p>授权状态： 4基础授权 5高级授权</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>【和GroupId必须有一个填写】设备分组id列表（需要和OsType匹配）</p> 
     * @return GroupIds <p>【和GroupId必须有一个填写】设备分组id列表（需要和OsType匹配）</p>
     */
    public Long [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set <p>【和GroupId必须有一个填写】设备分组id列表（需要和OsType匹配）</p>
     * @param GroupIds <p>【和GroupId必须有一个填写】设备分组id列表（需要和OsType匹配）</p>
     */
    public void setGroupIds(Long [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    public DescribeDevicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDevicesRequest(DescribeDevicesRequest source) {
        if (source.DomainInstanceId != null) {
            this.DomainInstanceId = new String(source.DomainInstanceId);
        }
        if (source.Condition != null) {
            this.Condition = new Condition(source.Condition);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.OsType != null) {
            this.OsType = new Long(source.OsType);
        }
        if (source.OnlineStatus != null) {
            this.OnlineStatus = new Long(source.OnlineStatus);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Sort != null) {
            this.Sort = new Sort(source.Sort);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.GroupIds != null) {
            this.GroupIds = new Long[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new Long(source.GroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainInstanceId", this.DomainInstanceId);
        this.setParamObj(map, prefix + "Condition.", this.Condition);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "OnlineStatus", this.OnlineStatus);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);

    }
}

