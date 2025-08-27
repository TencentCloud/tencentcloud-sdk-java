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
    * 过滤条件参数（字段含义请参考接口返回值）

- Mid, 类型String，支持操作：【eq，like，ilike】，支持排序
- Name, 类型String，支持操作：【eq，like，ilike】，支持排序
- Itime, 类型String，支持操作：【eq，like，ilike】，支持排序
- UserName, 类型String，支持操作：【eq，like，ilike】，支持排序
- MacAddr, 类型String，支持操作：【eq，like，ilike】，支持排序
- UserId, 类型String，支持操作：【eq，like，ilike】，支持排序
- Ip, 类型String，支持操作：【eq，like，ilike】，支持排序
- Tags，类型String，支持操作：【eq，like，ilike】，支持排序
- LocalIpList，类型String，支持操作：【eq，like，ilike】，支持排序
- SerialNum，类型String，支持操作：【eq，like，ilike】，支持排序
- Version，类型String，支持操作：【eq，like，ilike】，支持排序
- StrVersion，类型String，支持操作：【eq，like，ilike】，支持排序
- RtpStatus，类型String，支持操作：【eq，like，ilike】，**不支持排序**
- HostName，类型String，支持操作：【eq，like，ilike】，支持排序
- IoaUserName，类型String，支持操作：【eq，like，ilike】，支持排序
- GroupName，类型String，支持操作：【eq，like，ilike】，支持排序
- CriticalVulListCount，**类型Int**，支持操作：【eq】，**不支持排序**
- RiskCount，**类型Int**，支持操作：【eq】，**不支持排序**
- VulVersion，类型String，支持操作：【eq，like，ilike】，**不支持排序**
- Virusver，类型String，支持操作：【eq，like，ilike】，**不支持排序**
- SysRepver，类型String，支持操作：【eq，like，ilike】，**不支持排序**
- BaseBoardSn，类型String，支持操作：【eq，like，ilike】，支持排序
- Os，类型String，支持操作：【eq，like，ilike】，支持排序
- ConnActiveTime，类型String，支持操作：【eq，like，ilike】，**不支持排序**
- FirewallStatus，**类型Int**，支持操作：【eq】，**不支持排序**
- ProfileName，类型String，支持操作：【eq，like，ilike】，支持排序
- DomainName，类型String，支持操作：【eq，like，ilike】，支持排序
- SysRepVersion，类型String，支持操作：【eq，like，ilike】，支持排序
- VirusVer，类型String，支持操作：【eq，like，ilike】，支持排序
- Cpu，类型String，支持操作：【eq，like，ilike】，支持排序
- Memory，类型String，支持操作：【eq，like，ilike】，支持排序
- HardDiskSize，类型String，支持操作：【eq，like，ilike】，支持排序
- HardwareChangeCount，**类型Int**，支持操作：【eq】，支持排序
- AccountName，类型String，支持操作：【like.ilike】，支持排序
- AccountGroupName，类型String，支持操作：【like.ilike】，支持排序
- ScreenRecordingPermission，**类型Int**，支持操作：【eq】，支持排序
- DiskAccessPermission，**类型Int**，支持操作：【eq】，支持排序





分页参数
- PageNum 从1开始，小于等于0时使用默认参数
- PageSize 最大值5000，最好不超过100
    */
    @SerializedName("Condition")
    @Expose
    private Condition Condition;

    /**
    * 【和GroupIds必须有一个填写】设备分组id（需要和OsType匹配），下面是私有化场景下默认id：
id-名称-操作系统
1	全网终端	Win
2	未分组终端	Win
30000000	服务器	Win
40000101	全网终端	Linux
40000102	未分组终端	Linux
40000103	服务器	Linux
40000201	全网终端	macOS
40000202	未分组终端	macOS
40000203	服务器	macOS
40000401	全网终端	Android
40000402	未分组终端	Android
40000501	全网终端	iOS
40000502	未分组终端	iOS


SaaS需要调用分组接口DescribeDeviceChildGroups获取对应分组id
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 操作系统类型（0: win，1：linux，2: mac，4：android，5：ios   默认值0），需要和GroupId或者GroupIds匹配
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

    /**
    * 在线状态 （2表示在线，0或者1表示离线）
    */
    @SerializedName("OnlineStatus")
    @Expose
    private Long OnlineStatus;

    /**
    * 过滤条件--兼容旧接口,参数同Condition
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序字段--兼容旧接口,参数同Condition
    */
    @SerializedName("Sort")
    @Expose
    private Sort Sort;

    /**
    * 获取第几页--兼容旧接口,参数同Condition
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 每页获取数--兼容旧接口,参数同Condition
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 授权状态： 4基础授权 5高级授权
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 【和GroupId必须有一个填写】设备分组id列表（需要和OsType匹配）

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
     * Get 过滤条件参数（字段含义请参考接口返回值）

- Mid, 类型String，支持操作：【eq，like，ilike】，支持排序
- Name, 类型String，支持操作：【eq，like，ilike】，支持排序
- Itime, 类型String，支持操作：【eq，like，ilike】，支持排序
- UserName, 类型String，支持操作：【eq，like，ilike】，支持排序
- MacAddr, 类型String，支持操作：【eq，like，ilike】，支持排序
- UserId, 类型String，支持操作：【eq，like，ilike】，支持排序
- Ip, 类型String，支持操作：【eq，like，ilike】，支持排序
- Tags，类型String，支持操作：【eq，like，ilike】，支持排序
- LocalIpList，类型String，支持操作：【eq，like，ilike】，支持排序
- SerialNum，类型String，支持操作：【eq，like，ilike】，支持排序
- Version，类型String，支持操作：【eq，like，ilike】，支持排序
- StrVersion，类型String，支持操作：【eq，like，ilike】，支持排序
- RtpStatus，类型String，支持操作：【eq，like，ilike】，**不支持排序**
- HostName，类型String，支持操作：【eq，like，ilike】，支持排序
- IoaUserName，类型String，支持操作：【eq，like，ilike】，支持排序
- GroupName，类型String，支持操作：【eq，like，ilike】，支持排序
- CriticalVulListCount，**类型Int**，支持操作：【eq】，**不支持排序**
- RiskCount，**类型Int**，支持操作：【eq】，**不支持排序**
- VulVersion，类型String，支持操作：【eq，like，ilike】，**不支持排序**
- Virusver，类型String，支持操作：【eq，like，ilike】，**不支持排序**
- SysRepver，类型String，支持操作：【eq，like，ilike】，**不支持排序**
- BaseBoardSn，类型String，支持操作：【eq，like，ilike】，支持排序
- Os，类型String，支持操作：【eq，like，ilike】，支持排序
- ConnActiveTime，类型String，支持操作：【eq，like，ilike】，**不支持排序**
- FirewallStatus，**类型Int**，支持操作：【eq】，**不支持排序**
- ProfileName，类型String，支持操作：【eq，like，ilike】，支持排序
- DomainName，类型String，支持操作：【eq，like，ilike】，支持排序
- SysRepVersion，类型String，支持操作：【eq，like，ilike】，支持排序
- VirusVer，类型String，支持操作：【eq，like，ilike】，支持排序
- Cpu，类型String，支持操作：【eq，like，ilike】，支持排序
- Memory，类型String，支持操作：【eq，like，ilike】，支持排序
- HardDiskSize，类型String，支持操作：【eq，like，ilike】，支持排序
- HardwareChangeCount，**类型Int**，支持操作：【eq】，支持排序
- AccountName，类型String，支持操作：【like.ilike】，支持排序
- AccountGroupName，类型String，支持操作：【like.ilike】，支持排序
- ScreenRecordingPermission，**类型Int**，支持操作：【eq】，支持排序
- DiskAccessPermission，**类型Int**，支持操作：【eq】，支持排序





分页参数
- PageNum 从1开始，小于等于0时使用默认参数
- PageSize 最大值5000，最好不超过100 
     * @return Condition 过滤条件参数（字段含义请参考接口返回值）

- Mid, 类型String，支持操作：【eq，like，ilike】，支持排序
- Name, 类型String，支持操作：【eq，like，ilike】，支持排序
- Itime, 类型String，支持操作：【eq，like，ilike】，支持排序
- UserName, 类型String，支持操作：【eq，like，ilike】，支持排序
- MacAddr, 类型String，支持操作：【eq，like，ilike】，支持排序
- UserId, 类型String，支持操作：【eq，like，ilike】，支持排序
- Ip, 类型String，支持操作：【eq，like，ilike】，支持排序
- Tags，类型String，支持操作：【eq，like，ilike】，支持排序
- LocalIpList，类型String，支持操作：【eq，like，ilike】，支持排序
- SerialNum，类型String，支持操作：【eq，like，ilike】，支持排序
- Version，类型String，支持操作：【eq，like，ilike】，支持排序
- StrVersion，类型String，支持操作：【eq，like，ilike】，支持排序
- RtpStatus，类型String，支持操作：【eq，like，ilike】，**不支持排序**
- HostName，类型String，支持操作：【eq，like，ilike】，支持排序
- IoaUserName，类型String，支持操作：【eq，like，ilike】，支持排序
- GroupName，类型String，支持操作：【eq，like，ilike】，支持排序
- CriticalVulListCount，**类型Int**，支持操作：【eq】，**不支持排序**
- RiskCount，**类型Int**，支持操作：【eq】，**不支持排序**
- VulVersion，类型String，支持操作：【eq，like，ilike】，**不支持排序**
- Virusver，类型String，支持操作：【eq，like，ilike】，**不支持排序**
- SysRepver，类型String，支持操作：【eq，like，ilike】，**不支持排序**
- BaseBoardSn，类型String，支持操作：【eq，like，ilike】，支持排序
- Os，类型String，支持操作：【eq，like，ilike】，支持排序
- ConnActiveTime，类型String，支持操作：【eq，like，ilike】，**不支持排序**
- FirewallStatus，**类型Int**，支持操作：【eq】，**不支持排序**
- ProfileName，类型String，支持操作：【eq，like，ilike】，支持排序
- DomainName，类型String，支持操作：【eq，like，ilike】，支持排序
- SysRepVersion，类型String，支持操作：【eq，like，ilike】，支持排序
- VirusVer，类型String，支持操作：【eq，like，ilike】，支持排序
- Cpu，类型String，支持操作：【eq，like，ilike】，支持排序
- Memory，类型String，支持操作：【eq，like，ilike】，支持排序
- HardDiskSize，类型String，支持操作：【eq，like，ilike】，支持排序
- HardwareChangeCount，**类型Int**，支持操作：【eq】，支持排序
- AccountName，类型String，支持操作：【like.ilike】，支持排序
- AccountGroupName，类型String，支持操作：【like.ilike】，支持排序
- ScreenRecordingPermission，**类型Int**，支持操作：【eq】，支持排序
- DiskAccessPermission，**类型Int**，支持操作：【eq】，支持排序





分页参数
- PageNum 从1开始，小于等于0时使用默认参数
- PageSize 最大值5000，最好不超过100
     */
    public Condition getCondition() {
        return this.Condition;
    }

    /**
     * Set 过滤条件参数（字段含义请参考接口返回值）

- Mid, 类型String，支持操作：【eq，like，ilike】，支持排序
- Name, 类型String，支持操作：【eq，like，ilike】，支持排序
- Itime, 类型String，支持操作：【eq，like，ilike】，支持排序
- UserName, 类型String，支持操作：【eq，like，ilike】，支持排序
- MacAddr, 类型String，支持操作：【eq，like，ilike】，支持排序
- UserId, 类型String，支持操作：【eq，like，ilike】，支持排序
- Ip, 类型String，支持操作：【eq，like，ilike】，支持排序
- Tags，类型String，支持操作：【eq，like，ilike】，支持排序
- LocalIpList，类型String，支持操作：【eq，like，ilike】，支持排序
- SerialNum，类型String，支持操作：【eq，like，ilike】，支持排序
- Version，类型String，支持操作：【eq，like，ilike】，支持排序
- StrVersion，类型String，支持操作：【eq，like，ilike】，支持排序
- RtpStatus，类型String，支持操作：【eq，like，ilike】，**不支持排序**
- HostName，类型String，支持操作：【eq，like，ilike】，支持排序
- IoaUserName，类型String，支持操作：【eq，like，ilike】，支持排序
- GroupName，类型String，支持操作：【eq，like，ilike】，支持排序
- CriticalVulListCount，**类型Int**，支持操作：【eq】，**不支持排序**
- RiskCount，**类型Int**，支持操作：【eq】，**不支持排序**
- VulVersion，类型String，支持操作：【eq，like，ilike】，**不支持排序**
- Virusver，类型String，支持操作：【eq，like，ilike】，**不支持排序**
- SysRepver，类型String，支持操作：【eq，like，ilike】，**不支持排序**
- BaseBoardSn，类型String，支持操作：【eq，like，ilike】，支持排序
- Os，类型String，支持操作：【eq，like，ilike】，支持排序
- ConnActiveTime，类型String，支持操作：【eq，like，ilike】，**不支持排序**
- FirewallStatus，**类型Int**，支持操作：【eq】，**不支持排序**
- ProfileName，类型String，支持操作：【eq，like，ilike】，支持排序
- DomainName，类型String，支持操作：【eq，like，ilike】，支持排序
- SysRepVersion，类型String，支持操作：【eq，like，ilike】，支持排序
- VirusVer，类型String，支持操作：【eq，like，ilike】，支持排序
- Cpu，类型String，支持操作：【eq，like，ilike】，支持排序
- Memory，类型String，支持操作：【eq，like，ilike】，支持排序
- HardDiskSize，类型String，支持操作：【eq，like，ilike】，支持排序
- HardwareChangeCount，**类型Int**，支持操作：【eq】，支持排序
- AccountName，类型String，支持操作：【like.ilike】，支持排序
- AccountGroupName，类型String，支持操作：【like.ilike】，支持排序
- ScreenRecordingPermission，**类型Int**，支持操作：【eq】，支持排序
- DiskAccessPermission，**类型Int**，支持操作：【eq】，支持排序





分页参数
- PageNum 从1开始，小于等于0时使用默认参数
- PageSize 最大值5000，最好不超过100
     * @param Condition 过滤条件参数（字段含义请参考接口返回值）

- Mid, 类型String，支持操作：【eq，like，ilike】，支持排序
- Name, 类型String，支持操作：【eq，like，ilike】，支持排序
- Itime, 类型String，支持操作：【eq，like，ilike】，支持排序
- UserName, 类型String，支持操作：【eq，like，ilike】，支持排序
- MacAddr, 类型String，支持操作：【eq，like，ilike】，支持排序
- UserId, 类型String，支持操作：【eq，like，ilike】，支持排序
- Ip, 类型String，支持操作：【eq，like，ilike】，支持排序
- Tags，类型String，支持操作：【eq，like，ilike】，支持排序
- LocalIpList，类型String，支持操作：【eq，like，ilike】，支持排序
- SerialNum，类型String，支持操作：【eq，like，ilike】，支持排序
- Version，类型String，支持操作：【eq，like，ilike】，支持排序
- StrVersion，类型String，支持操作：【eq，like，ilike】，支持排序
- RtpStatus，类型String，支持操作：【eq，like，ilike】，**不支持排序**
- HostName，类型String，支持操作：【eq，like，ilike】，支持排序
- IoaUserName，类型String，支持操作：【eq，like，ilike】，支持排序
- GroupName，类型String，支持操作：【eq，like，ilike】，支持排序
- CriticalVulListCount，**类型Int**，支持操作：【eq】，**不支持排序**
- RiskCount，**类型Int**，支持操作：【eq】，**不支持排序**
- VulVersion，类型String，支持操作：【eq，like，ilike】，**不支持排序**
- Virusver，类型String，支持操作：【eq，like，ilike】，**不支持排序**
- SysRepver，类型String，支持操作：【eq，like，ilike】，**不支持排序**
- BaseBoardSn，类型String，支持操作：【eq，like，ilike】，支持排序
- Os，类型String，支持操作：【eq，like，ilike】，支持排序
- ConnActiveTime，类型String，支持操作：【eq，like，ilike】，**不支持排序**
- FirewallStatus，**类型Int**，支持操作：【eq】，**不支持排序**
- ProfileName，类型String，支持操作：【eq，like，ilike】，支持排序
- DomainName，类型String，支持操作：【eq，like，ilike】，支持排序
- SysRepVersion，类型String，支持操作：【eq，like，ilike】，支持排序
- VirusVer，类型String，支持操作：【eq，like，ilike】，支持排序
- Cpu，类型String，支持操作：【eq，like，ilike】，支持排序
- Memory，类型String，支持操作：【eq，like，ilike】，支持排序
- HardDiskSize，类型String，支持操作：【eq，like，ilike】，支持排序
- HardwareChangeCount，**类型Int**，支持操作：【eq】，支持排序
- AccountName，类型String，支持操作：【like.ilike】，支持排序
- AccountGroupName，类型String，支持操作：【like.ilike】，支持排序
- ScreenRecordingPermission，**类型Int**，支持操作：【eq】，支持排序
- DiskAccessPermission，**类型Int**，支持操作：【eq】，支持排序





分页参数
- PageNum 从1开始，小于等于0时使用默认参数
- PageSize 最大值5000，最好不超过100
     */
    public void setCondition(Condition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 【和GroupIds必须有一个填写】设备分组id（需要和OsType匹配），下面是私有化场景下默认id：
id-名称-操作系统
1	全网终端	Win
2	未分组终端	Win
30000000	服务器	Win
40000101	全网终端	Linux
40000102	未分组终端	Linux
40000103	服务器	Linux
40000201	全网终端	macOS
40000202	未分组终端	macOS
40000203	服务器	macOS
40000401	全网终端	Android
40000402	未分组终端	Android
40000501	全网终端	iOS
40000502	未分组终端	iOS


SaaS需要调用分组接口DescribeDeviceChildGroups获取对应分组id 
     * @return GroupId 【和GroupIds必须有一个填写】设备分组id（需要和OsType匹配），下面是私有化场景下默认id：
id-名称-操作系统
1	全网终端	Win
2	未分组终端	Win
30000000	服务器	Win
40000101	全网终端	Linux
40000102	未分组终端	Linux
40000103	服务器	Linux
40000201	全网终端	macOS
40000202	未分组终端	macOS
40000203	服务器	macOS
40000401	全网终端	Android
40000402	未分组终端	Android
40000501	全网终端	iOS
40000502	未分组终端	iOS


SaaS需要调用分组接口DescribeDeviceChildGroups获取对应分组id
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 【和GroupIds必须有一个填写】设备分组id（需要和OsType匹配），下面是私有化场景下默认id：
id-名称-操作系统
1	全网终端	Win
2	未分组终端	Win
30000000	服务器	Win
40000101	全网终端	Linux
40000102	未分组终端	Linux
40000103	服务器	Linux
40000201	全网终端	macOS
40000202	未分组终端	macOS
40000203	服务器	macOS
40000401	全网终端	Android
40000402	未分组终端	Android
40000501	全网终端	iOS
40000502	未分组终端	iOS


SaaS需要调用分组接口DescribeDeviceChildGroups获取对应分组id
     * @param GroupId 【和GroupIds必须有一个填写】设备分组id（需要和OsType匹配），下面是私有化场景下默认id：
id-名称-操作系统
1	全网终端	Win
2	未分组终端	Win
30000000	服务器	Win
40000101	全网终端	Linux
40000102	未分组终端	Linux
40000103	服务器	Linux
40000201	全网终端	macOS
40000202	未分组终端	macOS
40000203	服务器	macOS
40000401	全网终端	Android
40000402	未分组终端	Android
40000501	全网终端	iOS
40000502	未分组终端	iOS


SaaS需要调用分组接口DescribeDeviceChildGroups获取对应分组id
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 操作系统类型（0: win，1：linux，2: mac，4：android，5：ios   默认值0），需要和GroupId或者GroupIds匹配 
     * @return OsType 操作系统类型（0: win，1：linux，2: mac，4：android，5：ios   默认值0），需要和GroupId或者GroupIds匹配
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set 操作系统类型（0: win，1：linux，2: mac，4：android，5：ios   默认值0），需要和GroupId或者GroupIds匹配
     * @param OsType 操作系统类型（0: win，1：linux，2: mac，4：android，5：ios   默认值0），需要和GroupId或者GroupIds匹配
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
    }

    /**
     * Get 在线状态 （2表示在线，0或者1表示离线） 
     * @return OnlineStatus 在线状态 （2表示在线，0或者1表示离线）
     */
    public Long getOnlineStatus() {
        return this.OnlineStatus;
    }

    /**
     * Set 在线状态 （2表示在线，0或者1表示离线）
     * @param OnlineStatus 在线状态 （2表示在线，0或者1表示离线）
     */
    public void setOnlineStatus(Long OnlineStatus) {
        this.OnlineStatus = OnlineStatus;
    }

    /**
     * Get 过滤条件--兼容旧接口,参数同Condition 
     * @return Filters 过滤条件--兼容旧接口,参数同Condition
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件--兼容旧接口,参数同Condition
     * @param Filters 过滤条件--兼容旧接口,参数同Condition
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序字段--兼容旧接口,参数同Condition 
     * @return Sort 排序字段--兼容旧接口,参数同Condition
     */
    public Sort getSort() {
        return this.Sort;
    }

    /**
     * Set 排序字段--兼容旧接口,参数同Condition
     * @param Sort 排序字段--兼容旧接口,参数同Condition
     */
    public void setSort(Sort Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 获取第几页--兼容旧接口,参数同Condition 
     * @return PageNum 获取第几页--兼容旧接口,参数同Condition
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 获取第几页--兼容旧接口,参数同Condition
     * @param PageNum 获取第几页--兼容旧接口,参数同Condition
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 每页获取数--兼容旧接口,参数同Condition 
     * @return PageSize 每页获取数--兼容旧接口,参数同Condition
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页获取数--兼容旧接口,参数同Condition
     * @param PageSize 每页获取数--兼容旧接口,参数同Condition
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 授权状态： 4基础授权 5高级授权 
     * @return Status 授权状态： 4基础授权 5高级授权
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 授权状态： 4基础授权 5高级授权
     * @param Status 授权状态： 4基础授权 5高级授权
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 【和GroupId必须有一个填写】设备分组id列表（需要和OsType匹配）
 
     * @return GroupIds 【和GroupId必须有一个填写】设备分组id列表（需要和OsType匹配）

     */
    public Long [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 【和GroupId必须有一个填写】设备分组id列表（需要和OsType匹配）

     * @param GroupIds 【和GroupId必须有一个填写】设备分组id列表（需要和OsType匹配）

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

