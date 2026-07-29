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

public class DescribeDeviceHardwareInfoItem extends AbstractModel {

    /**
    * <p>设备ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>设备唯一标识符</p>
    */
    @SerializedName("Mid")
    @Expose
    private String Mid;

    /**
    * <p>OS平台 0 Windows 1 Linux 2 macOS 4 Android 5 iOS</p>
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

    /**
    * <p>终端名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>终端用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>授权状态（ 4未授权 5已授权）</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>设备所属分组ID</p>
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

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
    * <p>最近登录账户的姓名</p>
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * <p>出口IP</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>MAC地址</p>
    */
    @SerializedName("MacAddr")
    @Expose
    private String MacAddr;

    /**
    * <p>CPU品牌型号</p>
    */
    @SerializedName("Cpu")
    @Expose
    private String Cpu;

    /**
    * <p>内存信息</p>
    */
    @SerializedName("Memory")
    @Expose
    private String Memory;

    /**
    * <p>硬盘信息</p>
    */
    @SerializedName("HardDiskSize")
    @Expose
    private String HardDiskSize;

    /**
    * <p>显示器品牌型号</p>
    */
    @SerializedName("Monitor")
    @Expose
    private String Monitor;

    /**
    * <p>终端备注名</p>
    */
    @SerializedName("RemarkName")
    @Expose
    private String RemarkName;

    /**
    * <p>BiosUUID（启动盘标识符）</p>
    */
    @SerializedName("BiosUuid")
    @Expose
    private String BiosUuid;

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
     * Get <p>设备唯一标识符</p> 
     * @return Mid <p>设备唯一标识符</p>
     */
    public String getMid() {
        return this.Mid;
    }

    /**
     * Set <p>设备唯一标识符</p>
     * @param Mid <p>设备唯一标识符</p>
     */
    public void setMid(String Mid) {
        this.Mid = Mid;
    }

    /**
     * Get <p>OS平台 0 Windows 1 Linux 2 macOS 4 Android 5 iOS</p> 
     * @return OsType <p>OS平台 0 Windows 1 Linux 2 macOS 4 Android 5 iOS</p>
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set <p>OS平台 0 Windows 1 Linux 2 macOS 4 Android 5 iOS</p>
     * @param OsType <p>OS平台 0 Windows 1 Linux 2 macOS 4 Android 5 iOS</p>
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
    }

    /**
     * Get <p>终端名</p> 
     * @return Name <p>终端名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>终端名</p>
     * @param Name <p>终端名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get <p>授权状态（ 4未授权 5已授权）</p> 
     * @return Status <p>授权状态（ 4未授权 5已授权）</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>授权状态（ 4未授权 5已授权）</p>
     * @param Status <p>授权状态（ 4未授权 5已授权）</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>设备所属分组ID</p> 
     * @return GroupId <p>设备所属分组ID</p>
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>设备所属分组ID</p>
     * @param GroupId <p>设备所属分组ID</p>
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
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
     * Get <p>最近登录账户的姓名</p> 
     * @return AccountName <p>最近登录账户的姓名</p>
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set <p>最近登录账户的姓名</p>
     * @param AccountName <p>最近登录账户的姓名</p>
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get <p>出口IP</p> 
     * @return Ip <p>出口IP</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>出口IP</p>
     * @param Ip <p>出口IP</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
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
     * Get <p>CPU品牌型号</p> 
     * @return Cpu <p>CPU品牌型号</p>
     */
    public String getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>CPU品牌型号</p>
     * @param Cpu <p>CPU品牌型号</p>
     */
    public void setCpu(String Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>内存信息</p> 
     * @return Memory <p>内存信息</p>
     */
    public String getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>内存信息</p>
     * @param Memory <p>内存信息</p>
     */
    public void setMemory(String Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>硬盘信息</p> 
     * @return HardDiskSize <p>硬盘信息</p>
     */
    public String getHardDiskSize() {
        return this.HardDiskSize;
    }

    /**
     * Set <p>硬盘信息</p>
     * @param HardDiskSize <p>硬盘信息</p>
     */
    public void setHardDiskSize(String HardDiskSize) {
        this.HardDiskSize = HardDiskSize;
    }

    /**
     * Get <p>显示器品牌型号</p> 
     * @return Monitor <p>显示器品牌型号</p>
     */
    public String getMonitor() {
        return this.Monitor;
    }

    /**
     * Set <p>显示器品牌型号</p>
     * @param Monitor <p>显示器品牌型号</p>
     */
    public void setMonitor(String Monitor) {
        this.Monitor = Monitor;
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

    /**
     * Get <p>BiosUUID（启动盘标识符）</p> 
     * @return BiosUuid <p>BiosUUID（启动盘标识符）</p>
     */
    public String getBiosUuid() {
        return this.BiosUuid;
    }

    /**
     * Set <p>BiosUUID（启动盘标识符）</p>
     * @param BiosUuid <p>BiosUUID（启动盘标识符）</p>
     */
    public void setBiosUuid(String BiosUuid) {
        this.BiosUuid = BiosUuid;
    }

    public DescribeDeviceHardwareInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceHardwareInfoItem(DescribeDeviceHardwareInfoItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Mid != null) {
            this.Mid = new String(source.Mid);
        }
        if (source.OsType != null) {
            this.OsType = new Long(source.OsType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupNamePath != null) {
            this.GroupNamePath = new String(source.GroupNamePath);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.MacAddr != null) {
            this.MacAddr = new String(source.MacAddr);
        }
        if (source.Cpu != null) {
            this.Cpu = new String(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new String(source.Memory);
        }
        if (source.HardDiskSize != null) {
            this.HardDiskSize = new String(source.HardDiskSize);
        }
        if (source.Monitor != null) {
            this.Monitor = new String(source.Monitor);
        }
        if (source.RemarkName != null) {
            this.RemarkName = new String(source.RemarkName);
        }
        if (source.BiosUuid != null) {
            this.BiosUuid = new String(source.BiosUuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Mid", this.Mid);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupNamePath", this.GroupNamePath);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "MacAddr", this.MacAddr);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "HardDiskSize", this.HardDiskSize);
        this.setParamSimple(map, prefix + "Monitor", this.Monitor);
        this.setParamSimple(map, prefix + "RemarkName", this.RemarkName);
        this.setParamSimple(map, prefix + "BiosUuid", this.BiosUuid);

    }
}

